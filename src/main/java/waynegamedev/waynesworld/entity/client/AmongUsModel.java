package waynegamedev.waynesworld.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import waynegamedev.waynesworld.WaynesWorld;
import waynegamedev.waynesworld.entity.custom.AmongUsEntity;

public class AmongUsModel<T extends AmongUsEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer AMONGUS = new EntityModelLayer(Identifier.of(WaynesWorld.MOD_ID, "amongus"), "main");

    private final ModelPart AmongUs;
    private final ModelPart Body;
    private final ModelPart BackPack;
    private final ModelPart LeftLeg;
    private final ModelPart RightLeg;

    public AmongUsModel(ModelPart root) {
        this.AmongUs = root.getChild("AmongUs");
        this.Body = this.AmongUs.getChild("Body");
        this.BackPack = this.Body.getChild("BackPack");
        this.LeftLeg = this.AmongUs.getChild("LeftLeg");
        this.RightLeg = this.AmongUs.getChild("RightLeg");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData AmongUs = modelPartData.addChild("AmongUs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData Body = AmongUs.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -6.0F, -3.0F, 8.0F, 12.0F, 6.0F, new Dilation(0.0F))
                .uv(32, 10).cuboid(-3.0F, -4.0F, -5.0F, 6.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

        ModelPartData BackPack = Body.addChild("BackPack", ModelPartBuilder.create().uv(0, 21).cuboid(-3.0F, -4.5F, -1.0F, 6.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, 4.0F));

        ModelPartData LeftLeg = AmongUs.addChild("LeftLeg", ModelPartBuilder.create().uv(17, 22).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.5F, -6.0F, 0.0F));

        ModelPartData RightLeg = AmongUs.addChild("RightLeg", ModelPartBuilder.create().uv(17, 22).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -6.0F, 0.0F));
        return TexturedModelData.of(modelData, 48, 32);
    }

    @Override
    public void setAngles(AmongUsEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        this.updateAnimation(entity.idleAnimationState, AmongUsAnimations.Idle, ageInTicks, 1f);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        AmongUs.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return AmongUs;
    }
}
