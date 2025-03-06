package th.tamkungz.sdvf.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import th.tamkungz.sdvf.SdvfMod;

public class SdvfModTabs {
    public static final ItemGroup STARDEW_VALLEY_FOOD = FabricItemGroup.builder()
        .displayName(Text.translatable("item_group.sdvf.stardew_valley_food"))
        .icon(() -> new ItemStack(SdvfModItems.FOOD_ITEMS.get("baked_fish")))
        .entries((displayContext, entries) -> {
            SdvfMod.LOGGER.debug("Adding food items to item group...");
            SdvfModItems.FOOD_ITEMS.values().forEach(entries::add);
        })
        .build();

    public static void initialize() {
        SdvfMod.LOGGER.debug("Registering item group...");
        Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(SdvfMod.MODID, "stardew_valley_food"),
            STARDEW_VALLEY_FOOD
        );
        SdvfMod.LOGGER.debug("Item group registered.");
    }
}