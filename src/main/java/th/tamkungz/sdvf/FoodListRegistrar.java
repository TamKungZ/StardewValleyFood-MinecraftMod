package th.tamkungz.sdvf;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.ArrayList;
import java.util.List;

public class FoodListRegistrar {
    public static final List<DeferredHolder<Item, BaseFood>> ITEM_HOLDERS = new ArrayList<>();

    private static final List<FoodDefinition> FOOD_ITEMS = List.of(
        // Light snacks (1-3 hunger)
        new FoodDefinition("cookie", 2, 0.2f, "item.sdvf.cookie.tooltip"),
        new FoodDefinition("cranberry_candy", 1, 0.1f, "item.sdvf.cranberry_candy.tooltip"),
        new FoodDefinition("fried_egg", 3, 0.4f, "item.sdvf.fried_egg.tooltip"),
        new FoodDefinition("fried_mushroom", 2, 0.3f, "item.sdvf.fried_mushroom.tooltip"),
        new FoodDefinition("ginger_ale", 1, 0.1f, "item.sdvf.ginger_ale.tooltip"),
        new FoodDefinition("maple_bar", 2, 0.3f, "item.sdvf.maple_bar.tooltip"),
        new FoodDefinition("miner_treat", 2, 0.3f, "item.sdvf.miner_treat.tooltip"),
        new FoodDefinition("poppyseed_muffin", 3, 0.4f, "item.sdvf.poppyseed_muffin.tooltip"),
        new FoodDefinition("roasted_hazelnuts", 2, 0.3f, "item.sdvf.roasted_hazelnuts.tooltip"),
        new FoodDefinition("super_joja_cola", 1, 0.1f, "item.sdvf.super_joja_cola.tooltip"),
        
        // Small meals (4-6 hunger)
        new FoodDefinition("algae_soup", 5, 0.6f, "item.sdvf.algae_soup.tooltip"),
        new FoodDefinition("artichoke_dip", 4, 0.5f, "item.sdvf.artichoke_dip.tooltip"),
        new FoodDefinition("baked_fish", 5, 0.7f, "item.sdvf.baked_fish.tooltip"),
        new FoodDefinition("bread", 5, 0.6f, "item.sdvf.bread.tooltip"),
        new FoodDefinition("bruschetta", 4, 0.5f, "item.sdvf.bruschetta.tooltip"),
        new FoodDefinition("carp_surprise", 5, 0.6f, "item.sdvf.carp_surprise.tooltip"),
        new FoodDefinition("coleslaw", 4, 0.5f, "item.sdvf.coleslaw.tooltip"),
        new FoodDefinition("crab_cakes", 5, 0.7f, "item.sdvf.crab_cakes.tooltip"),
        new FoodDefinition("crispy_bass", 5, 0.7f, "item.sdvf.crispy_bass.tooltip"),
        new FoodDefinition("fried_calamari", 5, 0.7f, "item.sdvf.fried_calamari.tooltip"),
        new FoodDefinition("fried_eel", 5, 0.7f, "item.sdvf.fried_eel.tooltip"),
        new FoodDefinition("hashbrowns", 4, 0.6f, "item.sdvf.hashbrowns.tooltip"),
        new FoodDefinition("ice_cream", 3, 0.3f, "item.sdvf.ice_cream.tooltip"),
        new FoodDefinition("maki_roll", 5, 0.7f, "item.sdvf.maki_roll.tooltip"),
        new FoodDefinition("pancakes", 4, 0.5f, "item.sdvf.pancakes.tooltip"),
        new FoodDefinition("pepper_poppers", 4, 0.6f, "item.sdvf.pepper_poppers.tooltip"),
        new FoodDefinition("radish_salad", 4, 0.5f, "item.sdvf.radish_salad.tooltip"),
        new FoodDefinition("salad", 4, 0.5f, "item.sdvf.salad.tooltip"),
        new FoodDefinition("sashimi", 4, 0.6f, "item.sdvf.sashimi.tooltip"),
        new FoodDefinition("shrimp_cocktail", 4, 0.6f, "item.sdvf.shrimp_cocktail.tooltip"),
        new FoodDefinition("strange_bun", 5, 0.6f, "item.sdvf.strange_bun.tooltip"),
        
        // Medium meals (7-9 hunger)
        new FoodDefinition("autumn_bounty", 8, 1.0f, "item.sdvf.autumn_bounty.tooltip"),
        new FoodDefinition("banana_pudding", 7, 0.8f, "item.sdvf.banana_pudding.tooltip"),
        new FoodDefinition("bean_hotpot", 8, 1.0f, "item.sdvf.bean_hotpot.tooltip"),
        new FoodDefinition("blackberry_cobbler", 7, 0.8f, "item.sdvf.blackberry_cobbler.tooltip"),
        new FoodDefinition("blueberry_tart", 7, 0.8f, "item.sdvf.blueberry_tart.tooltip"),
        new FoodDefinition("cheese_cauliflower", 8, 1.0f, "item.sdvf.cheese_cauliflower.tooltip"),
        new FoodDefinition("chowder", 8, 1.0f, "item.sdvf.chowder.tooltip"),
        new FoodDefinition("dish_o_the_sea", 8, 1.0f, "item.sdvf.dish_o_the_sea.tooltip"),
        new FoodDefinition("eggplant_parmesan", 8, 1.0f, "item.sdvf.eggplant_parmesan.tooltip"),
        new FoodDefinition("escargot", 7, 0.9f, "item.sdvf.escargot.tooltip"),
        new FoodDefinition("farmer_lunch", 8, 1.0f, "item.sdvf.farmer_lunch.tooltip"),
        new FoodDefinition("fiddlehead_risotto", 8, 1.0f, "item.sdvf.fiddlehead_risotto.tooltip"),
        new FoodDefinition("fish_stew", 8, 1.0f, "item.sdvf.fish_stew.tooltip"),
        new FoodDefinition("fis_taco", 7, 0.9f, "item.sdvf.fis_taco.tooltip"),
        new FoodDefinition("fruit_salad", 7, 0.8f, "item.sdvf.fruit_salad.tooltip"),
        new FoodDefinition("glazed_yams", 7, 0.9f, "item.sdvf.glazed_yams.tooltip"),
        new FoodDefinition("lobster_bisque", 8, 1.0f, "item.sdvf.lobster_bisque.tooltip"),
        new FoodDefinition("mango_sticky_rice", 7, 0.8f, "item.sdvf.mango_sticky_rice.tooltip"),
        new FoodDefinition("omelet", 7, 0.9f, "item.sdvf.omelet.tooltip"),
        new FoodDefinition("pale_broth", 6, 0.7f, "item.sdvf.pale_broth.tooltip"),
        new FoodDefinition("parsnip_soup", 7, 0.9f, "item.sdvf.parsnip_soup.tooltip"),
        new FoodDefinition("pizza", 8, 1.0f, "item.sdvf.pizza.tooltip"),
        new FoodDefinition("plum_pudding", 7, 0.8f, "item.sdvf.plum_pudding.tooltip"),
        new FoodDefinition("poi", 6, 0.7f, "item.sdvf.poi.tooltip"),
        new FoodDefinition("pumpkin_soup", 7, 0.9f, "item.sdvf.pumpkin_soup.tooltip"),
        new FoodDefinition("red_plate", 8, 1.0f, "item.sdvf.red_plate.tooltip"),
        new FoodDefinition("rice_pudding", 7, 0.8f, "item.sdvf.rice_pudding.tooltip"),
        new FoodDefinition("roots_platter", 8, 1.0f, "item.sdvf.roots_platter.tooltip"),
        new FoodDefinition("salmon_dinner", 8, 1.0f, "item.sdvf.salmon_dinner.tooltip"),
        new FoodDefinition("spaghetti", 8, 1.0f, "item.sdvf.spaghetti.tooltip"),
        new FoodDefinition("spicy_eel", 8, 1.0f, "item.sdvf.spicy_eel.tooltip"),
        new FoodDefinition("squid_ink_ravioli", 8, 1.0f, "item.sdvf.squid_ink_ravioli.tooltip"),
        new FoodDefinition("stir_fry", 8, 1.0f, "item.sdvf.stir_fry.tooltip"),
        new FoodDefinition("stuffing", 7, 0.9f, "item.sdvf.stuffing.tooltip"),
        
        // Large meals (10+ hunger)
        new FoodDefinition("chocolate_cake", 10, 0.5f, "item.sdvf.chocolate_cake.tooltip"), // high hunger but low saturation (sugar crash)
        new FoodDefinition("complete_breakfast", 10, 1.5f, "item.sdvf.complete_breakfast.tooltip"),
        new FoodDefinition("lucky_lunch", 10, 1.5f, "item.sdvf.lucky_lunch.tooltip"),
        new FoodDefinition("pink_cake", 10, 0.5f, "item.sdvf.pink_cake.tooltip"),
        new FoodDefinition("pumpkin_pie", 9, 1.2f, "item.sdvf.pumpkin_pie.tooltip"),
        new FoodDefinition("rhubarb_pie", 9, 1.2f, "item.sdvf.rhubarb_pie.tooltip"),
        new FoodDefinition("seafoam_pudding", 10, 1.5f, "item.sdvf.seafoam_pudding.tooltip"),
        new FoodDefinition("super_meal", 12, 2.0f, "item.sdvf.super_meal.tooltip"),
        new FoodDefinition("cranberry_sauce", 9, 1.0f, "item.sdvf.cranberry_sauce.tooltip")
    );

    public static void register() {
        for (FoodDefinition def : FOOD_ITEMS) {
            DeferredHolder<Item, BaseFood> holder = ModMain.ITEMS.register(def.id(),
                () -> new BaseFood(
                    new Properties().food(def.toFoodProperties()),
                    def.tooltipKey()
                )
            );
            ITEM_HOLDERS.add(holder);
        }
    }

    public record FoodDefinition(String id, int hunger, float saturation, String tooltipKey) {
        public FoodProperties toFoodProperties() {
            return new FoodProperties.Builder()
                .nutrition(hunger)
                .saturationModifier(saturation)
                .build();
        }
    }

    public static ItemStack getItemStackById(String id) {
        return ITEM_HOLDERS.stream()
            .filter(holder -> holder.getId().getPath().equals(id))
            .findFirst()
            .map(holder -> new ItemStack(holder.get()))
            .orElseThrow(() -> new IllegalArgumentException("Item with id " + id + " not found"));
    }
}