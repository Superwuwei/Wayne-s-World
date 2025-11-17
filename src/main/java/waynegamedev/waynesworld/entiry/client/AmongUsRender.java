package waynegamedev.waynesworld.entiry.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import waynegamedev.waynesworld.WaynesWorld;
import waynegamedev.waynesworld.entiry.custom.AmongUsEntity;

public class AmongUsRender extends MobEntityRenderer<AmongUsEntity, AmongUsModel<AmongUsEntity>> {
    public AmongUsRender(EntityRendererFactory.Context context) {
        super(context, new AmongUsModel<>(context.getPart(AmongUsModel.AMONGUS)), 0.75f);
    }

    @Override
    public Identifier getTexture(AmongUsEntity entity) {
        return Identifier.of(WaynesWorld.MOD_ID, "textures/entity/AmongUs/AmongUs.png");
    }

    @Override
    public void render(AmongUsEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
