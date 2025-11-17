package waynegamedev.waynesworld.entiry;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import waynegamedev.waynesworld.WaynesWorld;
import waynegamedev.waynesworld.entiry.custom.AmongUsEntity;

public class ModEntites {
    public static final EntityType<AmongUsEntity> AMONGUS = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(WaynesWorld.MOD_ID, "amongus"),
            EntityType.Builder.create(AmongUsEntity::new, SpawnGroup.CREATURE)
                    .dimensions(8, 18).build());

    public static void registerModEntites() {
        WaynesWorld.LOGGER.info("Registering Mod Entites for " + WaynesWorld.MOD_ID);
    }
}
