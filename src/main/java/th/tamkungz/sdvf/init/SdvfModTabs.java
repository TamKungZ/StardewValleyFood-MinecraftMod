package th.tamkungz.sdvf.init;

import th.tamkungz.sdvf.SdvfMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class SdvfModTabs {
    public static final ItemGroup STARDEW_VALLEY_FOOD = new ItemGroup("stardew_valley_food") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SdvfModItems.FOOD_ITEMS.get("baked_fish").get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> items) { // Use fillItemList() for 1.16.5
            SdvfModItems.FOOD_ITEMS.values().forEach(item -> items.add(new ItemStack(item.get())));
        }
    };
}