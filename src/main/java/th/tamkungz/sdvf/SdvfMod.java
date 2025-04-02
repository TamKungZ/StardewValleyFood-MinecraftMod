package th.tamkungz.sdvf;

import th.tamkungz.sdvf.init.SdvfModVillagerProfessions;
import th.tamkungz.sdvf.init.SdvfModTabs;
import th.tamkungz.sdvf.init.SdvfModItems;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.network.simple.SimpleChannel;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.util.ResourceLocation;
import net.minecraft.network.*;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("sdvf")
public class SdvfMod {
	public static final Logger LOGGER = LogManager.getLogger(SdvfMod.class);
	public static final String MODID = "sdvf";

    public SdvfMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SdvfModItems.REGISTRY.register(bus);
        SdvfModVillagerProfessions.PROFESSIONS.register(bus);
        SdvfModVillagerProfessions.POI_TYPES.register(bus);
    }
}
