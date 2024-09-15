package mc.mian.indestructible_blocks_compat.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfiguration {
    public final ForgeConfigSpec.BooleanValue enableSoulsWeaponry;
    public ModConfiguration(final ForgeConfigSpec.Builder builder) {
        builder.comment("This category holds compatibility settings that can disabled or enabled for each mod.");
        builder.push("Compatibility Settings");
        this.enableSoulsWeaponry = buildBoolean(builder, "Souls Weaponry", true, null);
    }

    private static ForgeConfigSpec.BooleanValue buildBoolean(final ForgeConfigSpec.Builder builder, String translationPath, boolean defaultValue, String comment) {
        return comment == null ? builder.translation(translationPath).define(translationPath, defaultValue) : builder.comment(comment).translation(translationPath).define(translationPath, defaultValue);
    }

}
