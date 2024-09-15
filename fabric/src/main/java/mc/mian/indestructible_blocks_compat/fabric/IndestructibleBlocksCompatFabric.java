package mc.mian.indestructible_blocks_compat.fabric;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import mc.mian.indestructible_blocks_compat.util.ModResources;
import net.fabricmc.api.ModInitializer;
import mc.mian.indestructible_blocks_compat.IndestructibleBlocksCompatMod;
import mc.mian.indestructible_blocks_compat.config.ConfigHolder;
import net.minecraftforge.fml.config.ModConfig;

public class IndestructibleBlocksCompatFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ForgeConfigRegistry.INSTANCE.register(ModResources.MOD_ID, ModConfig.Type.COMMON, ConfigHolder.SERVER_SPEC);
        IndestructibleBlocksCompatMod.config = ConfigHolder.SERVER;
        IndestructibleBlocksCompatMod.init();
    }
}