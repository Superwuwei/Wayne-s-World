package waynegamedev.waynesworld;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import waynegamedev.waynesworld.entiry.ModEntites;
import waynegamedev.waynesworld.entiry.custom.AmongUsEntity;

public class WaynesWorld implements ModInitializer {
	public static final String MOD_ID = "waynesworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModEntites.registerModEntites();

        FabricDefaultAttributeRegistry.register(ModEntites.AMONGUS, AmongUsEntity.createAttributes());
	}
}