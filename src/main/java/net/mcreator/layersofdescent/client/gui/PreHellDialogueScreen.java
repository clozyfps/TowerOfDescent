package net.mcreator.layersofdescent.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.layersofdescent.world.inventory.PreHellDialogueMenu;
import net.mcreator.layersofdescent.procedures.DisplayVoiceProcedure;
import net.mcreator.layersofdescent.procedures.BlackScreenDisplayProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PreHellDialogueScreen extends AbstractContainerScreen<PreHellDialogueMenu> {
	private final static HashMap<String, Object> guistate = PreHellDialogueMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PreHellDialogueScreen(PreHellDialogueMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("layersofdescent:textures/screens/pre_hell_dialogue.png");

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
		if (BlackScreenDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("layersofdescent:textures/screens/bigblack.png"), this.leftPos + -451, this.topPos + -167, 0, 0, 1500, 1500, 1500, 1500);
		}
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
		if (BlackScreenDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayVoiceProcedure.execute(entity), -42, 70, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
