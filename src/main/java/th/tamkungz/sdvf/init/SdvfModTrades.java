package th.tamkungz.sdvf.init;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import th.tamkungz.sdvf.SdvfMod;
import th.tamkungz.sdvf.init.villager.SdvfModVillagerProfessions;

public class SdvfModTrades {
    public static void initialize() {
        // Register trades for the FOOD_VENDOR profession
        TradeOfferHelper.registerVillagerOffers(
            SdvfModVillagerProfessions.FOOD_VENDOR, // Custom villager profession
            1, // Villager level (Apprentice)
            factories -> {
                // Add trades for all food items
                SdvfModItems.FOOD_ITEMS.values().forEach(item -> {
                    factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2), // Cost: 2 Emeralds
                        new ItemStack(item), // Item to sell
                        10, // Max uses
                        5, // Experience
                        0.05f // Price multiplier
                    ));
                });
            }
        );
    }
}

/*
package th.tamkungz.sdvf.init;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import th.tamkungz.sdvf.SdvfMod;

public class SdvfModTrades {
    public static void initialize() {
        VillagerProfession foodVendor = Registries.VILLAGER_PROFESSION.get(new Identifier("sdvf", "food_vendor"));
        TradeOfferHelper.registerVillagerOffers(
            foodVendor, // Use the occupation that is pulled from the Registry
            1, // Villager level (Apprentice)
            factories -> {
                SdvfModItems.FOOD_ITEMS.values().forEach(item -> {
                    factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2), // Cost: 2 Emeralds
                        new ItemStack(item),           // Item to sell
                        10, 5, 0.05f                   // Max uses, Experience, Price multiplier
                    ));
                });
            }
        );
    }
}
*/


/* // Old when using SdvfModVillagerProfessions to register a profession
package th.tamkungz.sdvf.init;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import th.tamkungz.sdvf.SdvfMod;

public class SdvfModTrades {
    public static void initialize() {
        // Register trades for the FOOD_VENDOR profession
        TradeOfferHelper.registerVillagerOffers(
            SdvfModVillagerProfessions.FOOD_VENDOR, // Custom villager profession
            1, // Villager level (Apprentice)
            factories -> {
                // Add trades for all food items
                SdvfModItems.FOOD_ITEMS.values().forEach(item -> {
                    factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2), // Cost: 2 Emeralds
                        new ItemStack(item), // Item to sell
                        10, // Max uses
                        5, // Experience
                        0.05f // Price multiplier
                    ));
                });
            }
        );
    }
}
*/