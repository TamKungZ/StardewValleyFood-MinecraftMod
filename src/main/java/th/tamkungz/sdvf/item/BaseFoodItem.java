package th.tamkungz.sdvf.item;
import th.tamkungz.sdvf.init.SdvfModTabs;
import th.tamkungz.sdvf.SdvfMod;

import net.minecraft.block.BlockState;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.client.util.ITooltipFlag;
import java.util.List;

public class BaseFoodItem extends Item {
    private final String tooltipText;
    private final boolean executeProcedure;

    public BaseFoodItem(int nutrition, float saturation, String tooltip, boolean executeProcedure) {
        super(new Item.Properties()
            .tab(SdvfModTabs.STARDEW_VALLEY_FOOD)
            .stacksTo(64)
            .rarity(Rarity.COMMON)
            .food(new Food.Builder()
                .nutrition(nutrition)
                .saturationMod(saturation)
                .build()
            ));
        this.tooltipText = tooltip;
        this.executeProcedure = executeProcedure;
    }

    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) { // Change to ITooltipFlag
        super.appendHoverText(stack, world, tooltip, flag);
        tooltip.add(new TranslationTextComponent(tooltipText));
    }
}