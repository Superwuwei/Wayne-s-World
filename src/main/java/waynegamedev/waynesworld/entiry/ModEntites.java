package waynegamedev.waynesworld.entiry;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import waynegamedev.waynesworld.WaynesWorld;
import waynegamedev.waynesworld.entiry.custom.ZombieEntity;

public class ModEntites {
    public static final EntityType<ZombieEntity> ZOMBIE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(WaynesWorld.MOD_ID, "zombie"),
            EntityType.Builder.create(ZombieEntity::new, SpawnGroup.CREATURE)
                    .dimensions(16, 32).build());

    public static void registerModEnities() {
        WaynesWorld.LOGGER.info("Registering Mod Enitites for " + WaynesWorld.MOD_ID);
    }
}
