package th.tamkungz.sdvf.villager;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Blocks;

import java.util.Set;

public class ModPOIs {
    public static final PoiType CHEF_POI = new PoiType(Set.copyOf(Blocks.SMOKER.getStateDefinition().getPossibleStates()), 1, 1);

    public static void registerPOIs() {
        Registry.register(BuiltInRegistries.POINT_OF_INTEREST_TYPE, new ResourceLocation("sdvf", "chef_poi"), CHEF_POI);
    }
}