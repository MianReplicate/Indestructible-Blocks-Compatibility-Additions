package mc.mian.indestructible_blocks_compat.forge;

import mc.mian.indestructible_blocks_compat.IndestructibleBlocksCompatMod;
import mc.mian.indestructible_blocks_compat.config.ConfigHolder;
import mc.mian.indestructible_blocks_compat.util.ModResources;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(ModResources.MOD_ID)
public class IndestructibleBlocksCompatModForge {
    public IndestructibleBlocksCompatModForge() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHolder.SERVER_SPEC);

        IndestructibleBlocksCompatMod.config = ConfigHolder.SERVER;
        IndestructibleBlocksCompatMod.init();
    }
}