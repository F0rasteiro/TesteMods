// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer CORPO_TODO;
	private final ModelRenderer CABECA;
	private final ModelRenderer CORPO;
	private final ModelRenderer RABO;
	private final ModelRenderer PATA_FRENTE_DIREITA;
	private final ModelRenderer PATA_FRENTE_ESQUERDA;
	private final ModelRenderer PATA_ATRAS_DIREITA;
	private final ModelRenderer PATA_ATRAS_ESQUERDA;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		CORPO_TODO = new ModelRenderer(this);
		CORPO_TODO.setRotationPoint(4.0F, 24.0F, -8.0F);

		CABECA = new ModelRenderer(this);
		CABECA.setRotationPoint(-4.0F, -8.0F, 3.0F);
		CORPO_TODO.addChild(CABECA);
		CABECA.setTextureOffset(0, 18).addBox(-3.0F, -3.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		CABECA.setTextureOffset(28, 29).addBox(-2.0F, 0.0F, -7.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		CABECA.setTextureOffset(30, 18).addBox(2.0F, -2.0F, -3.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		CABECA.setTextureOffset(30, 6).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		CORPO = new ModelRenderer(this);
		CORPO.setRotationPoint(0.0F, 0.0F, 0.0F);
		CORPO_TODO.addChild(CORPO);
		CORPO.setTextureOffset(0, 0).addBox(-7.0F, -10.0F, 3.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);

		RABO = new ModelRenderer(this);
		RABO.setRotationPoint(-8.0F, -8.0F, 8.0F);
		CORPO_TODO.addChild(RABO);
		RABO.setTextureOffset(21, 18).addBox(2.5F, -9.0F, 7.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		PATA_FRENTE_DIREITA = new ModelRenderer(this);
		PATA_FRENTE_DIREITA.setRotationPoint(-3.0F, -5.0F, 4.0F);
		CORPO_TODO.addChild(PATA_FRENTE_DIREITA);
		PATA_FRENTE_DIREITA.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		PATA_FRENTE_ESQUERDA = new ModelRenderer(this);
		PATA_FRENTE_ESQUERDA.setRotationPoint(-6.0F, -5.0F, 4.0F);
		CORPO_TODO.addChild(PATA_FRENTE_ESQUERDA);
		PATA_FRENTE_ESQUERDA.setTextureOffset(9, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		PATA_ATRAS_DIREITA = new ModelRenderer(this);
		PATA_ATRAS_DIREITA.setRotationPoint(-3.0F, -5.0F, 14.0F);
		CORPO_TODO.addChild(PATA_ATRAS_DIREITA);
		PATA_ATRAS_DIREITA.setTextureOffset(0, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		PATA_ATRAS_ESQUERDA = new ModelRenderer(this);
		PATA_ATRAS_ESQUERDA.setRotationPoint(-6.0F, -5.0F, 14.0F);
		CORPO_TODO.addChild(PATA_ATRAS_ESQUERDA);
		PATA_ATRAS_ESQUERDA.setTextureOffset(23, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		CORPO_TODO.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.PATA_ATRAS_DIREITA.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.PATA_FRENTE_DIREITA.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.CABECA.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.CABECA.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.PATA_FRENTE_ESQUERDA.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.PATA_ATRAS_ESQUERDA.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}