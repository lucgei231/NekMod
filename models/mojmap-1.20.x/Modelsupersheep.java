// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsupersheep<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "supersheep"), "main");
	private final ModelPart rleg;
	private final ModelPart rarm;
	private final ModelPart lleg;
	private final ModelPart torso;
	private final ModelPart larm;
	private final ModelPart head;

	public Modelsupersheep(ModelPart root) {
		this.rleg = root.getChild("rleg");
		this.rarm = root.getChild("rarm");
		this.lleg = root.getChild("lleg");
		this.torso = root.getChild("torso");
		this.larm = root.getChild("larm");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rleg = partdefinition.addOrReplaceChild("rleg", CubeListBuilder.create(),
				PartPose.offset(3.0F, 12.0F, 0.0F));

		PartDefinition rleg_r1 = rleg
				.addOrReplaceChild("rleg_r1",
						CubeListBuilder.create().texOffs(34, 31).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rarm = partdefinition.addOrReplaceChild("rarm", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 2.0F, 0.0F));

		PartDefinition rarm_r1 = rarm
				.addOrReplaceChild("rarm_r1",
						CubeListBuilder.create().texOffs(28, 11).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition lleg = partdefinition.addOrReplaceChild("lleg", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 12.0F, 0.0F));

		PartDefinition lleg_r1 = lleg
				.addOrReplaceChild("lleg_r1",
						CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -26.0F, -3.0F, 10.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition larm = partdefinition.addOrReplaceChild("larm", CubeListBuilder.create(),
				PartPose.offset(6.0F, 2.0F, 0.0F));

		PartDefinition larm_r1 = larm
				.addOrReplaceChild("larm_r1",
						CubeListBuilder.create().texOffs(14, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 21).addBox(3.0F, -34.0F, -3.0F, 8.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 27.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		larm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.lleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.larm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}