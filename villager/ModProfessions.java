package th.tamkungz.sdvf.villager;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

public class ModProfessions {
    public static final VillagerProfession CHEF = new VillagerProfession(
        "chef",
        holder -> holder.is(ModPOIs.CHEF_POI),
        holder -> holder.is(ModPOIs.CHEF_POI),
        Set.of(),
        Set.of(),
        null
    );

    public static void registerProfessions() {
        Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, new ResourceLocation("chefmod", "chef"), CHEF);
    }
}