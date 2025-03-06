package th.tamkungz.sdvf.init.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import th.tamkungz.sdvf.SdvfMod;

public class SdvfModVillagerProfessions {
    // Register the POI type
    public static final PointOfInterestType FOOD_VENDOR_POI = PointOfInterestHelper.register(
        new Identifier(SdvfMod.MODID, "food_vendor"),
        1, // ticketCount
        1, // searchDistance
        Blocks.CAMPFIRE // Use campfire as the workstation
    );

    // Create a RegistryKey for the POI
    public static final RegistryKey<PointOfInterestType> FOOD_VENDOR_POI_KEY = 
        RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), 
            new Identifier(SdvfMod.MODID, "food_vendor"));

    // Register the FOOD_VENDOR profession
    public static final VillagerProfession FOOD_VENDOR = registerProfession();

    private static VillagerProfession registerProfession() {
        return Registry.register(
            Registries.VILLAGER_PROFESSION,
            new Identifier(SdvfMod.MODID, "food_vendor"),
            new VillagerProfession(
                "food_vendor",
                entry -> entry.matchesKey(FOOD_VENDOR_POI_KEY),
                entry -> entry.matchesKey(FOOD_VENDOR_POI_KEY),
                ImmutableSet.of(),
                ImmutableSet.of(),
                SoundEvents.BLOCK_CAMPFIRE_CRACKLE
            )
        );
    }
}
//

/*
// old youtube
public class SdvfModVillagerProfessions {

    // my new code // i see in youtube by Modding by Kaupenjoe

    public static final RegistryEntry<PointOfInterestType> CAMPFIRE_POI_KEY = poiKey("campfirepoi");
    public static final PointOfInterestType CAMPFIRE_POI = registerPoi("campfirepoi", Blocks.CAMPFIRE);
    public static final VillagerProfession FOOD_VENDOR = registerProfession("food_vendor", CAMPFIRE_POI_KEY);
    
    // public static final RegistryEntry<PointOfInterestType> CAMPFIRE_POI = Registry.register(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(SdvfMod.MODID, "campfire_poi"), PointOfInterestHelper.register(poiKey("campfire"), 1, 1, Blocks.CAMPFIRE));

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(SdvfMod.MODID, name), 
            new VillagerProfession(name, entity -> entry.matchesKey(type), entity -> entry.matchesKey(type), 
                ImmutableSet.of(), ImmutableSet.of(), SoundEvents.BLOCK_CAMPFIRE_CRACKLE));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(
            poiKey(name),
            1,
            1,
            block
        );
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(SdvfMod.MODID, name));
    }
    
    /* // old
    public static final VillagerProfession FOOD_VENDOR = registerProfession(
        "food_vendor",
        () -> Blocks.CAMPFIRE,
        () -> SoundEvents.BLOCK_CAMPFIRE_CRACKLE
    );

    public static void initialize() {
        SdvfMod.LOGGER.debug("Registering villager professions...");
        registerProfessionPointsOfInterest();
        Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(SdvfMod.MODID, "food_vendor"), FOOD_VENDOR);
        SdvfMod.LOGGER.debug("Villager professions registered.");
    }

    private static VillagerProfession registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
        SdvfMod.LOGGER.debug("Registering POI type for profession: {}", name);
        Identifier poiId = new Identifier(SdvfMod.MODID, name + "_poi");
        PointOfInterestType poiType = PointOfInterestHelper.register(
            poiId,
            4,
            16,
            block.get()
        );

        Predicate<RegistryEntry<PointOfInterestType>> workstation = poi -> poi.value().equals(poiType);
        Predicate<RegistryEntry<PointOfInterestType>> matchingPOI = poi -> poi.value().equals(poiType);

        SdvfMod.LOGGER.debug("Creating profession: {}", name);
        return new VillagerProfession(
            SdvfMod.MODID + ":" + name,
            workstation,
            matchingPOI,
            ImmutableSet.<Item>of(),
            ImmutableSet.<Block>of(),
            soundEvent.get()
        );
    }

    private static void registerProfessionPointsOfInterest() {
        SdvfMod.LOGGER.debug("Registering POI types...");
        // Fabric's PointOfInterestHelper handles POI registration automatically
    }
    */
//}
