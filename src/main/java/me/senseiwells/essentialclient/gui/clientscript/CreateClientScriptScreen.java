package me.senseiwells.essentialclient.gui.clientscript;

import me.senseiwells.essentialclient.EssentialClient;
import me.senseiwells.essentialclient.clientscript.core.ClientScript;
import me.senseiwells.essentialclient.clientscript.core.ClientScriptInstance;
import me.senseiwells.essentialclient.utils.EssentialUtils;
import me.senseiwells.essentialclient.utils.render.WidgetHelper;
import me.senseiwells.essentialclient.utils.render.ChildScreen;
import me.senseiwells.essentialclient.utils.render.Texts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static me.senseiwells.essentialclient.utils.render.Texts.*;

public class CreateClientScriptScreen extends ChildScreen {
	private final TextFieldWidget nameBox;
	private final ButtonWidget createButton;
	private final ButtonWidget cancelButton;

	public CreateClientScriptScreen(ClientScriptScreen parent) {
		super(CREATE_NEW_SCRIPT, parent);
		this.nameBox = new TextFieldWidget(EssentialUtils.getClient().textRenderer, 0, 0, 200, 20, SCRIPT_NAME);
		this.createButton = WidgetHelper.newButton(0, 0, 80, 20, Texts.CREATE, button -> {
			String name = this.nameBox.getText();
			Path scriptPath = ClientScript.INSTANCE.getScriptDirectory();
			Path newScriptPath = scriptPath.resolve(name + ".arucas");
			if (Files.exists(newScriptPath)) {
				for (int i = 1; ; i++) {
					String iName = name + " " + i;
					newScriptPath = scriptPath.resolve(iName + ".arucas");
					if (!Files.exists(newScriptPath)) {
						name = iName;
						break;
					}
				}
			}
			try {
				Files.createFile(newScriptPath);
			} catch (IOException e) {
				EssentialClient.LOGGER.error(e);
				return;
			}
			ClientScriptInstance instance = new ClientScriptInstance(name, newScriptPath);
			parent.refresh();
			parent.openScriptConfigScreen(instance);
		});
		this.cancelButton = WidgetHelper.newButton(0, 0, 80, 20, CANCEL, button -> this.close());
	}

	@Override
	protected void init() {
		if (this.client == null) {
			return;
		}
		int halfHeight = this.height / 2;
		int halfWidth = this.width / 2;
		WidgetHelper.setPosition(this.nameBox, halfWidth - 100, halfHeight - 20);
		WidgetHelper.setPosition(this.createButton, halfWidth + 5, halfHeight + 10);
		WidgetHelper.setPosition(this.cancelButton, halfWidth - 85, halfHeight + 10);
		this.addDrawableChild(this.nameBox);
		this.addDrawableChild(this.createButton);
		this.addDrawableChild(this.cancelButton);
		this.setFocused(this.nameBox);
		super.init();
	}

	@Override
	public void tick() {
		this.nameBox.tick();
		super.tick();
	}

	@Override
	public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
		if (keyCode == GLFW.GLFW_KEY_ENTER && this.nameBox.isFocused()) {
			this.nameBox.setFocused(false);
		}
		return super.keyPressed(keyCode, scanCode, modifiers) || this.nameBox.keyPressed(keyCode, scanCode, modifiers);
	}

	@Override
	public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
		//#if MC >= 11904
		this.renderBackgroundTexture(matrices);
		//#else
		//$$this.renderBackground(0);
		//#endif
		this.textRenderer.draw(matrices, SCRIPT_NAME, this.width / 2.0F - 100, this.height / 2.0F - 33, 0x949494);
		drawCenteredTextWithShadow(matrices, this.textRenderer, this.title, this.width / 2, 8, 0xFFFFFF);
		super.render(matrices, mouseX, mouseY, delta);
	}
}
