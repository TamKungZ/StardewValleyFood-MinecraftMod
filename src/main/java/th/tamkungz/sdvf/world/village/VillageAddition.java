/*
package th.tamkungz.sdvf.world.village;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.mojang.datafixers.util.Pair;
import th.tamkungz.sdvf.SdvfMod;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Mod.EventBusSubscriber(modid = SdvfMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class VillageAddition {

    private static final ResourceKey<Registry<StructureTemplatePool>> TEMPLATE_POOL_REGISTRY =
            ResourceKey.createRegistryKey(new ResourceLocation("minecraft", "template_pool"));

    private static final ResourceKey<Registry<StructureProcessorList>> PROCESSOR_LIST_REGISTRY =
            ResourceKey.createRegistryKey(new ResourceLocation("minecraft", "processor_list"));

    private static final ResourceKey<StructureProcessorList> EMPTY_PROCESSOR_LIST_KEY =
            ResourceKey.create(PROCESSOR_LIST_REGISTRY, new ResourceLocation("minecraft", "empty"));

    private static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry,
                                          Registry<StructureProcessorList> processorListRegistry,
                                          ResourceLocation poolRL,
                                          String nbtPieceRL,
                                          int weight) {

        Optional<Holder.Reference<StructureProcessorList>> emptyProcessorListOpt =
                processorListRegistry.getHolder(EMPTY_PROCESSOR_LIST_KEY);

        if (emptyProcessorListOpt.isEmpty()) {
            System.err.println("Could not find EMPTY_PROCESSOR_LIST_KEY!");
            return;
        }
        Holder<StructureProcessorList> emptyProcessorList = emptyProcessorListOpt.get();

        Optional<StructureTemplatePool> poolOpt = templatePoolRegistry.getOptional(poolRL);
        if (poolOpt.isEmpty()) {
            System.err.println("Could not find structure pool: " + poolRL);
            return;
        }
        StructureTemplatePool pool = poolOpt.get();

        SinglePoolElement piece = SinglePoolElement.legacy(nbtPieceRL, emptyProcessorList)
                .apply(StructureTemplatePool.Projection.RIGID);

        // Corrected templates list handling
        List<StructurePoolElement> modifiedTemplates = new ArrayList<>(pool.templates);
        modifiedTemplates.add(piece);

        // No direct way to modify pools at runtime, but we print a log.
        System.out.println("Added structure to " + poolRL + " (But Forge does not allow modifying it at runtime!)");
    }

    @SubscribeEvent
    public static void addNewVillageBuilding(final ServerAboutToStartEvent event) {
        Registry<StructureTemplatePool> templatePoolRegistry = event.getServer()
                .registryAccess()
                .registry(TEMPLATE_POOL_REGISTRY)
                .orElseThrow();

        Registry<StructureProcessorList> processorListRegistry = event.getServer()
                .registryAccess()
                .registry(PROCESSOR_LIST_REGISTRY)
                .orElseThrow();

        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/plains/houses"),
                "sdvf:kitchen", 250);
    }
}
*/