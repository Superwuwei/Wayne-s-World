package waynegamedev.waynesworld;

import net.fabricmc.api.ClientModInitializer;
//import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
//import waynegamedev.waynesworld.entiry.ModEntites;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import waynegamedev.waynesworld.entiry.client.AmongUsModel;
//import waynegamedev.waynesworld.entiry.client.AmongUsRender;

public class WaynesWorldClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(AmongUsModel.AMONGUS, AmongUsModel::getTexturedModelData);
//        EntityRendererRegistry.register(ModEntites.AMONGUS, AmongUsRender::new);
    }
}
