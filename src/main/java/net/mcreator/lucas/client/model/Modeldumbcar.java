package net.mcreator.lucas.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldumbcar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("lucas", "modeldumbcar"), "main");
	public final ModelPart front_axil;
	public final ModelPart back_axil2;
	public final ModelPart Donotaddpivotpointhere;

	public Modeldumbcar(ModelPart root) {
		this.front_axil = root.getChild("front_axil");
		this.back_axil2 = root.getChild("back_axil2");
		this.Donotaddpivotpointhere = root.getChild("Donotaddpivotpointhere");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition front_axil = partdefinition.addOrReplaceChild("front_axil",
				CubeListBuilder.create().texOffs(83, 66).addBox(15.0F, -7.0F, -16.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(83, 35).addBox(-16.0F, -7.0F, -16.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = front_axil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(116, 93).addBox(-14.0F, -1.0F, -1.0F, 29.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -12.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition back_axil = front_axil.addOrReplaceChild("back_axil", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, -12.0F));
		PartDefinition back_axil2 = partdefinition.addOrReplaceChild("back_axil2",
				CubeListBuilder.create().texOffs(0, 66).addBox(15.0F, -7.0F, 8.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(8, 35).addBox(-16.0F, -7.0F, 8.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = back_axil2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(93, 18).addBox(-14.0F, -2.0F, 23.0F, 29.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -12.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition Donotaddpivotpointhere = partdefinition.addOrReplaceChild("Donotaddpivotpointhere",
				CubeListBuilder.create().texOffs(0, 66).addBox(-13.0F, -6.0F, -14.0F, 27.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-13.0F, -2.0F, -14.0F, 27.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(83, 35)
						.addBox(-11.0F, -4.0F, -12.0F, 24.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(93, 0).addBox(-13.0F, -16.0F, -12.0F, 27.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 78)
						.addBox(12.0F, -16.0F, -10.0F, 2.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(124, 23).addBox(-13.0F, -16.0F, 13.0F, 25.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 60)
						.addBox(-13.0F, -16.0F, -10.0F, 2.0F, 10.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(12.0F, -42.0F, 13.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-13.0F, -42.0F, 13.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 0).addBox(12.0F, -42.0F, -12.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -42.0F, -12.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-15.0F, -46.0F, -14.0F, 31.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(50, 97)
						.addBox(-13.0F, -32.0F, -10.0F, 2.0F, 16.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 97).addBox(12.0F, -32.0F, -10.0F, 2.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 136)
						.addBox(12.0F, -32.0F, 9.0F, 2.0F, 26.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(100, 108).addBox(-13.0F, -42.0F, -10.0F, 2.0F, 10.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(127, 108)
						.addBox(-11.0F, -42.0F, 13.0F, 23.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 71).addBox(12.0F, -43.0F, -11.0F, 2.0F, 11.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = Donotaddpivotpointhere.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 97).addBox(-15.0F, -32.0F, -11.0F, 2.0F, 16.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		front_axil.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		back_axil2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Donotaddpivotpointhere.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.back_axil2.xRot = ageInTicks;
		this.front_axil.xRot = ageInTicks;
		this.Donotaddpivotpointhere.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Donotaddpivotpointhere.xRot = headPitch / (180F / (float) Math.PI);
	}
}