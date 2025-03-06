package th.tamkungz.sdvf.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import th.tamkungz.sdvf.SdvfMod;

public class DebugCommand {
    private static boolean debugEnabled = false;

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(
            CommandManager.literal("sdvf")
                .then(CommandManager.literal("debug")
                    .then(CommandManager.argument("enabled", BoolArgumentType.bool())
                        .executes(context -> {
                            boolean enabled = BoolArgumentType.getBool(context, "enabled");
                            setDebugEnabled(enabled);
                            context.getSource().sendFeedback(() -> 
                                Text.of("Debug mode: " + (enabled ? "ON" : "OFF")), 
                                false
                            );
                            return 1;
                        })
                )
        ));
    }

    public static boolean isDebugEnabled() {
        return debugEnabled;
    }

    private static void setDebugEnabled(boolean enabled) {
        debugEnabled = enabled;
        SdvfMod.LOGGER.info("Debug mode is now " + (enabled ? "enabled" : "disabled"));
    }
}