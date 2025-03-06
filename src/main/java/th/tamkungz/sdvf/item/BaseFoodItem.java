package th.tamkungz.sdvf.item;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class BaseFoodItem extends Item {
    private final String tooltipText;
    private final boolean executeProcedure;

    public BaseFoodItem(int nutrition, float saturation, String tooltip, boolean executeProcedure) {
        super(new Item.Settings()
                .maxCount(64)
                .rarity(Rarity.COMMON)
                .food(new FoodComponent.Builder()
                        .hunger(nutrition)
                        .saturationModifier(saturation)
                        .build()));
        this.tooltipText = tooltip;
        this.executeProcedure = executeProcedure;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 64;
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return 0f;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.translatable(this.tooltipText));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);
        if (executeProcedure) {
            // Add any special procedure execution here
        }
        return result;
    }

    public boolean getExecuteProcedure() {
        return executeProcedure;
    }
}