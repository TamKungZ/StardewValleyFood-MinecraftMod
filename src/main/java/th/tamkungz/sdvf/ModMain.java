package th.tamkungz.sdvf;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(ModMain.MODID)
public class ModMain {
    public static final String MODID = "sdvf";
    private static final Logger LOGGER = LoggerFactory.getLogger(ModMain.class);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS = DeferredRegister.create(Registries.ITEM, MODID);

    // Register the CreativeModeTab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SDVF_TAB = CREATIVE_MODE_TABS.register("sdvf_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.sdvf_tab"))
            .icon(() -> FoodListRegistrar.getItemStackById("fried_egg"))
            .displayItems((parameters, output) -> {
                for (DeferredHolder<Item, BaseFood> holder : FoodListRegistrar.ITEM_HOLDERS) {
                    ModMain.LOGGER.info("Adding item to Creative Tab: " + holder.getId()); //
                    output.accept(holder.get());
                }
            })
            .build());

    public ModMain(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("sdvf is initializing...");
        FoodListRegistrar.register();
        // Register the DeferredRegister to the mod event bus
        CREATIVE_MODE_TABS.register(modEventBus);
        ITEMS.register(modEventBus);

        // Call FoodListRegistrar to register food items
        //FoodListRegistrar.register();
    }
}