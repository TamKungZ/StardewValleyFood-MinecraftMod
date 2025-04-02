package th.tamkungz.sdvf.init;

import th.tamkungz.sdvf.SdvfMod;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.util.SoundEvents;

import com.google.common.collect.ImmutableSet;

public class SdvfModVillagerProfessions {
    public static final DeferredRegister<PointOfInterestType> POI_TYPES = 
        DeferredRegister.create(ForgeRegistries.POI_TYPES, SdvfMod.MODID);
    public static final DeferredRegister<VillagerProfession> PROFESSIONS = 
        DeferredRegister.create(ForgeRegistries.PROFESSIONS, SdvfMod.MODID);

    public static final RegistryObject<PointOfInterestType> FOOD_VENDOR_POI = POI_TYPES.register(
        "food_vendor_poi", 
        () -> new PointOfInterestType("food_vendor", 
            ImmutableSet.copyOf(Blocks.FURNACE.getStateDefinition().getPossibleStates()), 
            1, 1)
    );

    public static final RegistryObject<VillagerProfession> FOOD_VENDOR = PROFESSIONS.register(
        "food_vendor", 
        () -> new VillagerProfession(
            SdvfMod.MODID + ":food_vendor",
            FOOD_VENDOR_POI.get(),
            ImmutableSet.of(),
            ImmutableSet.of(),
            SoundEvents.VILLAGER_WORK_BUTCHER
        )
    );
}