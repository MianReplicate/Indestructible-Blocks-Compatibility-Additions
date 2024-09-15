package mc.mian.indestructible_blocks_compat;

import mc.mian.indestructible_blocks_compat.config.ModConfiguration;
import mc.mian.indestructible_blocks_compat.util.IndestructibleResources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndestructibleBlocksCompatMod {
    public static final Logger LOGGER = LogManager.getLogger(IndestructibleResources.MOD_ID);
    public static ModConfiguration config;

    public static void init() {
        LOGGER.info("FILLING UR MODDED BLOCKS UP WITH BEDROCK MAUHAHAHA");
    }
}