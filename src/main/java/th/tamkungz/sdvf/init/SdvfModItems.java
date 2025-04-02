package th.tamkungz.sdvf.init;

import th.tamkungz.sdvf.SdvfMod;
import th.tamkungz.sdvf.item.BaseFoodItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.item.Item;

import java.util.Map;
import java.util.LinkedHashMap;

public class SdvfModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SdvfMod.MODID);
    public static final Map<String, RegistryObject<Item>> FOOD_ITEMS = new LinkedHashMap<>();
    
    static {
        registerFoodItem("algae_soup", 5, 0.5f, "item.sdvf.algae_soup.tooltip", true);
        registerFoodItem("artichoke_dip", 5, 0.5f, "item.sdvf.artichoke_dip.tooltip", true);
        registerFoodItem("autumn_bounty", 5, 0.5f, "item.sdvf.autumn_bounty.tooltip", true);
        registerFoodItem("baked_fish", 5, 0.5f, "item.sdvf.baked_fish.tooltip", false);
        registerFoodItem("banana_pudding", 5, 0.5f, "item.sdvf.banana_pudding.tooltip", true);
        registerFoodItem("bean_hotpot", 5, 0.5f, "item.sdvf.bean_hotpot.tooltip", true);
        registerFoodItem("blackberry_cobbler", 5, 0.5f, "item.sdvf.blackberry_cobbler.tooltip", true);
        registerFoodItem("blueberry_tart", 5, 0.5f, "item.sdvf.blueberry_tart.tooltip", true);
        registerFoodItem("bread", 5, 0.5f, "item.sdvf.bread.tooltip", true);
        registerFoodItem("bruschetta", 5, 0.5f, "item.sdvf.bruschetta.tooltip", true);
        registerFoodItem("carp_surprise", 5, 0.5f, "item.sdvf.carp_surprise.tooltip", false);
        registerFoodItem("cheese_cauliflower", 5, 0.5f, "item.sdvf.cheese_cauliflower.tooltip", true);
        registerFoodItem("chocolate_cake", 5, 0.5f, "item.sdvf.chocolate_cake.tooltip", true);
        registerFoodItem("chowder", 5, 0.5f, "item.sdvf.chowder.tooltip", true);
        registerFoodItem("coleslaw", 5, 0.5f, "item.sdvf.coleslaw.tooltip", true);
        registerFoodItem("complete_breakfast", 5, 0.5f, "item.sdvf.complete_breakfast.tooltip", true);
        registerFoodItem("cookie", 5, 0.5f, "item.sdvf.cookie.tooltip", true);
        registerFoodItem("crab_cakes", 5, 0.5f, "item.sdvf.crab_cakes.tooltip", true);
        registerFoodItem("cranberry_candy", 5, 0.5f, "item.sdvf.cranberry_candy.tooltip", true);
        registerFoodItem("cranberry_sauce", 5, 0.5f, "item.sdvf.cranberry_sauce.tooltip", true);
        registerFoodItem("crispy_bass", 5, 0.5f, "item.sdvf.crispy_bass.tooltip", true);
        registerFoodItem("dish_o_the_sea", 5, 0.5f, "item.sdvf.dish_o_the_sea.tooltip", true);
        registerFoodItem("eggplant_parmesan", 5, 0.5f, "item.sdvf.eggplant_parmesan.tooltip", true);
        registerFoodItem("escargot", 5, 0.5f, "item.sdvf.escargot.tooltip", true);
        registerFoodItem("farmer_lunch", 5, 0.5f, "item.sdvf.farmer_lunch.tooltip", true);
        registerFoodItem("fiddlehead_risotto", 5, 0.5f, "item.sdvf.fiddlehead_risotto.tooltip", true);
        registerFoodItem("fish_stew", 5, 0.5f, "item.sdvf.fish_stew.tooltip", true);
        registerFoodItem("fis_taco", 5, 0.5f, "item.sdvf.fis_taco.tooltip", true);
        registerFoodItem("fried_calamari", 5, 0.5f, "item.sdvf.fried_calamari.tooltip", true);
        registerFoodItem("fried_eel", 5, 0.5f, "item.sdvf.fried_eel.tooltip", true);
        registerFoodItem("fried_egg", 5, 0.5f, "item.sdvf.fried_egg.tooltip", true);
        registerFoodItem("fried_mushroom", 5, 0.5f, "item.sdvf.fried_mushroom.tooltip", true);
        registerFoodItem("fruit_salad", 5, 0.5f, "item.sdvf.fruit_salad.tooltip", true);
        registerFoodItem("ginger_ale", 5, 0.5f, "item.sdvf.ginger_ale.tooltip", true);
        registerFoodItem("glazed_yams", 5, 0.5f, "item.sdvf.glazed_yams.tooltip", true);
        registerFoodItem("hashbrowns", 5, 0.5f, "item.sdvf.hashbrowns.tooltip", true);
        registerFoodItem("ice_cream", 5, 0.5f, "item.sdvf.ice_cream.tooltip", true);
        registerFoodItem("lobster_bisque", 5, 0.5f, "item.sdvf.lobster_bisque.tooltip", true);
        registerFoodItem("lucky_lunch", 5, 0.5f, "item.sdvf.lucky_lunch.tooltip", true);
        registerFoodItem("maki_roll", 5, 0.5f, "item.sdvf.maki_roll.tooltip", true);
        registerFoodItem("mango_sticky_rice", 5, 0.5f, "item.sdvf.mango_sticky_rice.tooltip", true);
        registerFoodItem("maple_bar", 5, 0.5f, "item.sdvf.maple_bar.tooltip", true);
        registerFoodItem("miner_treat", 5, 0.5f, "item.sdvf.miner_treat.tooltip", true);
        registerFoodItem("omelet", 5, 0.5f, "item.sdvf.omelet.tooltip", true);
        registerFoodItem("pale_broth", 5, 0.5f, "item.sdvf.pale_broth.tooltip", true);
        registerFoodItem("pancakes", 5, 0.5f, "item.sdvf.pancakes.tooltip", true);
        registerFoodItem("parsnip_soup", 5, 0.5f, "item.sdvf.parsnip_soup.tooltip", true);
        registerFoodItem("pepper_poppers", 5, 0.5f, "item.sdvf.pepper_poppers.tooltip", true);
        registerFoodItem("pink_cake", 5, 0.5f, "item.sdvf.pink_cake.tooltip", true);
        registerFoodItem("pizza", 5, 0.5f, "item.sdvf.pizza.tooltip", true);
        registerFoodItem("plum_pudding", 5, 0.5f, "item.sdvf.plum_pudding.tooltip", true);
        registerFoodItem("poi", 5, 0.5f, "item.sdvf.poi.tooltip", true);
        registerFoodItem("poppyseed_muffin", 5, 0.5f, "item.sdvf.poppyseed_muffin.tooltip", true);
        registerFoodItem("pumpkin_pie", 5, 0.5f, "item.sdvf.pumpkin_pie.tooltip", true);
        registerFoodItem("pumpkin_soup", 5, 0.5f, "item.sdvf.pumpkin_soup.tooltip", true);
        registerFoodItem("radish_salad", 5, 0.5f, "item.sdvf.radish_salad.tooltip", true);
        registerFoodItem("red_plate", 5, 0.5f, "item.sdvf.red_plate.tooltip", true);
        registerFoodItem("rhubarb_pie", 5, 0.5f, "item.sdvf.rhubarb_pie.tooltip", true);
        registerFoodItem("rice_pudding", 5, 0.5f, "item.sdvf.rice_pudding.tooltip", true);
        registerFoodItem("roasted_hazelnuts", 5, 0.5f, "item.sdvf.roasted_hazelnuts.tooltip", true);
        registerFoodItem("roots_platter", 5, 0.5f, "item.sdvf.roots_platter.tooltip", true);
        registerFoodItem("salad", 5, 0.5f, "item.sdvf.salad.tooltip", true);
        registerFoodItem("salmon_dinner", 5, 0.5f, "item.sdvf.salmon_dinner.tooltip", true);
        registerFoodItem("sashimi", 5, 0.5f, "item.sdvf.sashimi.tooltip", true);
        registerFoodItem("seafoam_pudding", 5, 0.5f, "item.sdvf.seafoam_pudding.tooltip", true);
        registerFoodItem("shrimp_cocktail", 5, 0.5f, "item.sdvf.shrimp_cocktail.tooltip", true);
        registerFoodItem("spaghetti", 5, 0.5f, "item.sdvf.spaghetti.tooltip", true);
        registerFoodItem("spicy_eel", 5, 0.5f, "item.sdvf.spicy_eel.tooltip", true);
        registerFoodItem("squid_ink_ravioli", 5, 0.5f, "item.sdvf.squid_ink_ravioli.tooltip", true);
        registerFoodItem("stir_fry", 5, 0.5f, "item.sdvf.stir_fry.tooltip", true);
        registerFoodItem("strange_bun", 5, 0.5f, "item.sdvf.strange_bun.tooltip", true);
        registerFoodItem("stuffing", 5, 0.5f, "item.sdvf.stuffing.tooltip", true);
        registerFoodItem("super_joja_cola", 5, 0.5f, "item.sdvf.super_joja_cola.tooltip", false);
        registerFoodItem("super_meal", 5, 0.5f, "item.sdvf.super_meal.tooltip", true);
        registerFoodItem("survival_burger", 5, 0.5f, "item.sdvf.survival_burger.tooltip", true);
        registerFoodItem("tom_kha_soup", 5, 0.5f, "item.sdvf.tom_kha_soup.tooltip", true);
        registerFoodItem("tortilla", 5, 0.5f, "item.sdvf.tortilla.tooltip", true);
        registerFoodItem("triple_shot_espresso", 5, 0.5f, "item.sdvf.triple_shot_espresso.tooltip", true);
        registerFoodItem("tropical_curry", 5, 0.5f, "item.sdvf.tropical_curry.tooltip", true);
        registerFoodItem("trout_soup", 5, 0.5f, "item.sdvf.trout_soup.tooltip", true);
        registerFoodItem("vegetable_medley", 5, 0.5f, "item.sdvf.vegetable_medley.tooltip", true);
    }

    private static void registerFoodItem(String name, int nutrition, float saturation, String tooltip, boolean executeProcedure) {
        FOOD_ITEMS.put(name, REGISTRY.register(name, () -> new BaseFoodItem(nutrition, saturation, tooltip, executeProcedure)));
    }
}