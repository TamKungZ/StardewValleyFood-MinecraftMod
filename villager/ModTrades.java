package th.tamkungz.sdvf.villager;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeOffer;
import net.minecraft.world.item.trading.TradeOffers;

public class ModTrades {
    public static void registerTrades() {
        TradeOffers.WANDERING_TRADER_TRADES.put(1, new TradeOffers.ItemListing[]{
            (entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(ModItems.FRIED_EGG.get(), 1),
                10, 2, 0.05F
            )
        });
    }
}