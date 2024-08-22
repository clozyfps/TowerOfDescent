package net.mcreator.layersofdescent.client.gui;

public class SinSelectionScreen extends AbstractContainerScreen<SinSelectionMenu> {

	private final static HashMap<String, Object> guistate = SinSelectionMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_ssl;
	Button button_ssl1;
	Button button_select;

	public SinSelectionScreen(SinSelectionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("layersofdescent:textures/screens/sin_selection.png");

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

		guiGraphics.blit(new ResourceLocation("layersofdescent:textures/screens/bigblack.png"), this.leftPos + -424, this.topPos + -110, 0, 0, 1500, 1500, 1500, 1500);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.layersofdescent.sin_selection.label_sslselect_your_sin"), -48, -30, -1, false);
		guiGraphics.drawString(this.font,

				DisplayStrengthTagProcedure.execute(entity), -208, -11, -1, false);
		guiGraphics.drawString(this.font,

				DisplayDefenseTagProcedure.execute(), -208, 7, -1, false);
		guiGraphics.drawString(this.font,

				DisplayAgilityTagProcedure.execute(entity), -208, 25, -1, false);
		guiGraphics.drawString(this.font,

				DisplayDexterityTagProcedure.execute(entity), -208, 43, -1, false);
		guiGraphics.drawString(this.font,

				DisplayMagicTagProcedure.execute(entity), -208, 61, -1, false);
		guiGraphics.drawString(this.font,

				SinDisplayProcedure.execute(), -37, 61, -1, false);
	}

	@Override
	public void init() {
		super.init();

		button_ssl = new PlainTextButton(this.leftPos + 62, this.topPos + 97, 40, 20, Component.translatable("gui.layersofdescent.sin_selection.button_ssl"), e -> {
			if (true) {
				LayersofdescentMod.PACKET_HANDLER.sendToServer(new SinSelectionButtonMessage(0, x, y, z));
				SinSelectionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);

		guistate.put("button:button_ssl", button_ssl);
		this.addRenderableWidget(button_ssl);

		button_ssl1 = new PlainTextButton(this.leftPos + -73, this.topPos + 97, 40, 20, Component.translatable("gui.layersofdescent.sin_selection.button_ssl1"), e -> {
			if (true) {
				LayersofdescentMod.PACKET_HANDLER.sendToServer(new SinSelectionButtonMessage(1, x, y, z));
				SinSelectionButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);

		guistate.put("button:button_ssl1", button_ssl1);
		this.addRenderableWidget(button_ssl1);

		button_select = Button.builder(Component.translatable("gui.layersofdescent.sin_selection.button_select"), e -> {
			if (true) {
				LayersofdescentMod.PACKET_HANDLER.sendToServer(new SinSelectionButtonMessage(2, x, y, z));
				SinSelectionButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -28, this.topPos + 124, 56, 20).build();

		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);

	}

}
