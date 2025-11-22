package waynegamedev.waynesworld.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import waynegamedev.waynesworld.WaynesWorld;
import waynegamedev.waynesworld.entity.custom.AmongUsEntity;

public class AmongUsRenderer extends MobEntityRenderer<AmongUsEntity, AmongUsModel<AmongUsEntity>> {
    public AmongUsRenderer(EntityRendererFactory.Context context) {
        super(context, new AmongUsModel<>(context.getPart(AmongUsModel.AMONGUS)), 0.75f);
    }

    public Identifier getTexture(AmongUsEntity entity) {
        return Identifier.of(WaynesWorld.MOD_ID, "textures/entity/amongus/AmongUs.png");
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
