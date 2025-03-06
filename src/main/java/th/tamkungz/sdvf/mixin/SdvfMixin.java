package th.tamkungz.sdvf.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mixin(MinecraftServer.class)
public class SdvfMixin {
    @Unique
    private static final Logger SDVF_LOGGER = LogManager.getLogger("sdvf_mixin");

    @Inject(at = @At("HEAD"), method = "loadWorld")
    private void init(CallbackInfo info) {
        // This code is injected into the start of MinecraftServer.loadWorld()V
        SDVF_LOGGER.info("SDVF Mixin is active! This is a unique Mixin for SDVF.");
    }

    @Unique
    private void sdvfUniqueMethod() {
        // This method is unique to the SDVF Mixin and does nothing but makes the Mixin distinct
        SDVF_LOGGER.info("This is a unique method in the SDVF Mixin.");
    }
}