package me.senseiwells.essentialclient.mixins.gameRuleSync;

import me.senseiwells.essentialclient.utils.interfaces.IGameRule;
import me.senseiwells.essentialclient.utils.render.Texts;

//#if MC < 11900
//$$import net.minecraft.network.MessageType;
//#elseif MC <= 11900
import net.minecraft.network.message.MessageType;
//#endif
//#if MC < 11901
import net.minecraft.util.Util;
//#endif
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.Text;
import net.minecraft.world.GameRules;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GameRules.Rule.class)
public abstract class RuleMixin<T extends GameRules.Rule<T>> implements IGameRule {
	@Shadow
	@Final
	protected GameRules.Type<T> type;

	@Shadow
	public abstract String serialize();

	@Shadow
	protected abstract void changed(@Nullable MinecraftServer server);

	/**
	 * We can't @Invoke this method because it
	 * leads to some weird recursion, idk.
	 */
	@Override
	public void ruleChanged(String ruleName, MinecraftServer server) {
		Text text = Texts.SET_GAME_RULE.generate(ruleName, this.serialize());
		//#if MC >= 11901
		//$$ server.getPlayerManager().broadcast(text, false);
		//#elseif MC >= 11900
		server.getPlayerManager().broadcast(text, MessageType.SYSTEM);
		//#elseif MC >= 11800
		//$$server.getPlayerManager().broadcast(text, MessageType.SYSTEM, Util.NIL_UUID);
		//#else
		//$$server.getPlayerManager().broadcastChatMessage(text, MessageType.SYSTEM, Util.NIL_UUID);
		//#endif
		this.changed(server);
	}
}
