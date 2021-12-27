package essentialclient.utils.render;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;

public class RuleWidget {

	String name;
	int x;
	int y;
	int width;
	int height;

	public RuleWidget(String name, int x, int y, int width, int height) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void drawRule(MatrixStack matrices, TextRenderer font, float fontX, float fontY, int colour) {
		font.draw(matrices, getShortName(this.name), fontX, fontY, colour);
	}

	public boolean isHovered(int mouseX, int mouseY) {
		return mouseX >= this.x && mouseX < this.x + this.width && mouseY >= this.y && mouseY < this.y + this.height;
	}

	public static String getShortName(String string) {
		if (string.length() > 34) {
			return string.substring(0, 31) + "...";
		}
		return string;
	}
}
