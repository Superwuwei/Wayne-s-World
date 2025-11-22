package waynegamedev.waynesworld;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import waynegamedev.waynesworld.entity.ModEntites;
import waynegamedev.waynesworld.entity.client.AmongUsModel;
import waynegamedev.waynesworld.entity.client.AmongUsRenderer;

public class WaynesWorldClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(AmongUsModel.AMONGUS, AmongUsModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntites.AMONGUS, AmongUsRenderer::new);
    }
}
