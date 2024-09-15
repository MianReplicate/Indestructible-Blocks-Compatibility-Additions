package mc.mian.indestructible_blocks_compat.util;

import net.minecraft.resources.ResourceLocation;

public class IndestructibleResources {
    public static final String MOD_ID = "indestructible_blocks_compat";

    public static ResourceLocation modLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
