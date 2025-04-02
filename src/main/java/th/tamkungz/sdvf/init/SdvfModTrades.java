package th.tamkungz.sdvf.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SdvfModTrades {
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {
        if (event.getType() == SdvfModVillagerProfessions.FOOD_VENDOR.get()) {
            // Create shuffled list of all food items
            List<ItemStack> foodItems = SdvfModItems.FOOD_ITEMS.values().stream()
                    .map(item -> new ItemStack(item.get(), 1))
                    .collect(Collectors.toList());
            Collections.shuffle(foodItems);

            int[] itemIndex = {0}; // Array to maintain index across lambda expressions
            
            // Level 1: Base trade
            addTradeForLevel(event, 1, foodItems, itemIndex);
            
            // Levels 2-5: Add 2 new trades each level
            for(int level = 2; level <= 5; level++) {
                addTradeForLevel(event, level, foodItems, itemIndex);
                addTradeForLevel(event, level, foodItems, itemIndex);
            }
        }
    }

    private static void addTradeForLevel(VillagerTradesEvent event, int level, 
                                       List<ItemStack> foodItems, int[] index) {
        if(index[0] < foodItems.size()) {
            ItemStack food = foodItems.get(index[0]++);
            event.getTrades().get(level).add((trader, rand) -> 
                new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // Price
                    food, // Food item
                    10, // Max uses
                    level * 2, // XP (scales with level)
                    0.05f
                )
            );
        }
    }
}