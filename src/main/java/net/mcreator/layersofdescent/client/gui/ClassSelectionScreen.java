package net.mcreator.layersofdescent.client.gui;

public class ClassSelectionScreen extends AbstractContainerScreen<ClassSelectionMenu> {

	private final static HashMap<String, Object> guistate = ClassSelectionMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_ssl;
	Button button_ssl1;
	Button button_select;

	public ClassSelectionScreen(ClassSelectionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("layersofdescent:textures/screens/class_selection.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("layersofdescent:textures/screens/bigblack.png"), this.leftPos + 358, this.topPos + -37, 0, 0, 1500, 1500, 1500, 1500);

		guiGraphics.blit(new ResourceLocation("layersofdescent:textures/screens/bigblack.png"), this.leftPos + -397, this.topPos + -110, 0, 0, 1500, 1500, 1500, 1500);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.layersofdescent.class_selection.label_sslselect_your_class"), -48, -30, -1, false);
		guiGraphics.drawString(this.font,

				ClassDisplayProcedure.execute(entity), -37, 61, -1, false);
		guiGraphics.drawString(this.font,

				DisplayClassInfo1Procedure.execute(entity), -208, -11, -1, false);
		guiGraphics.drawString(this.font,

				DisplayClassInfo2Procedure.execute(entity), -208, 7, -1, false);
	}

	@Override
	public void init() {
		super.init();

		button_ssl = new PlainTextButton(this.leftPos + 62, this.topPos + 97, 40, 20, Component.translatable("gui.layersofdescent.class_selection.button_ssl"), e -> {
			if (true) {
				LayersofdescentMod.PACKET_HANDLER.sendToServer(new ClassSelectionButtonMessage(0, x, y, z));
				ClassSelectionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);

		guistate.put("button:button_ssl", button_ssl);
		this.addRenderableWidget(button_ssl);

		button_ssl1 = new PlainTextButton(this.leftPos + -73, this.topPos + 97, 40, 20, Component.translatable("gui.layersofdescent.class_selection.button_ssl1"), e -> {
			if (true) {
				LayersofdescentMod.PACKET_HANDLER.sendToServer(new ClassSelectionButtonMessage(1, x, y, z));
				ClassSelectionButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);

		guistate.put("button:button_ssl1", button_ssl1);
		this.addRenderableWidget(button_ssl1);

		button_select = Button.builder(Component.translatable("gui.layersofdescent.class_selection.button_select"), e -> {
			if (true) {
				LayersofdescentMod.PACKET_HANDLER.sendToServer(new ClassSelectionButtonMessage(2, x, y, z));
				ClassSelectionButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -28, this.topPos + 124, 56, 20).build();

		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);

	}

}
