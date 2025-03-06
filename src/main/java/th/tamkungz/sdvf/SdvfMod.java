package th.tamkungz.sdvf;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import th.tamkungz.sdvf.command.DebugCommand;
import th.tamkungz.sdvf.init.SdvfModItems;
import th.tamkungz.sdvf.init.SdvfModTabs;
import th.tamkungz.sdvf.init.SdvfModTrades;
import th.tamkungz.sdvf.init.villager.SdvfModVillagerProfessions;
import th.tamkungz.sdvf.init.villager.datagen.ModPoiTagProvider;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SdvfMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("sdvf");
    public static final String MODID = "sdvf";

    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void onInitialize() {
        LOGGER.debug("Initializing SDVF Mod...");
        initializeRegistries();
        registerServerTickHandler();
        registerCommands();
        LOGGER.info("SDVF Mod initialized!");
    }

    private void initializeRegistries() {
        LOGGER.debug("Initializing registries...");
        SdvfModItems.initialize();
        SdvfModTabs.initialize();
        // Remove these lines:
        // SdvfModVillagerProfessions.initialize();
        // ModPoiTagProvider.initialize();
        SdvfModTrades.initialize();
        LOGGER.debug("Registries initialized.");
    }

    private void registerServerTickHandler() {
        LOGGER.debug("Registering server tick handler...");
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            if (!server.isStopped()) {
                LOGGER.debug("Handling server tick...");
                handleTick();
            }
        });
        LOGGER.debug("Server tick handler registered.");
    }

    private void registerCommands() {
        LOGGER.debug("Registering commands...");
        CommandRegistrationCallback.EVENT.register((dispatcher, registry, environment) -> {
            DebugCommand.register(dispatcher);
        });
        LOGGER.debug("Commands registered.");
    }

    public static void queueServerWork(int tick, Runnable action) {
        LOGGER.debug("Queueing server work for {} ticks later...", tick);
        workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
    }

    private static void handleTick() {
        LOGGER.debug("Processing work queue...");
        List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
        workQueue.forEach(work -> {
            work.setValue(work.getValue() - 1);
            if (work.getValue() == 0) {
                LOGGER.debug("Executing queued action...");
                actions.add(work);
            }
        });
        actions.forEach(e -> e.getKey().run());
        workQueue.removeAll(actions);
        LOGGER.debug("Work queue processed.");
    }
}