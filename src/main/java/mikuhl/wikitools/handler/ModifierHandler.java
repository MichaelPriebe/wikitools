package mikuhl.wikitools.handler;

import mikuhl.wikitools.WikiTools;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class ModifierHandler {
	
	public static boolean STEVE_MODIFIER;
	public static boolean ENCHANT_MODIFIER;
	public static boolean SELF_MODIFIER;
	public static boolean INVISIBLE_MODIFIER;
	
	@SubscribeEvent
	public void onKeyInputEvent(KeyInputEvent event) {
		if (WikiTools.STEVE_MODIFIER.isKeyDown()) {
			STEVE_MODIFIER = !STEVE_MODIFIER;
			
			if (STEVE_MODIFIER) {
				WikiTools.sendMessage("&a[WikiTools] &fSteve Modifier has been &aenabled&f.");
			}
			else {
				WikiTools.sendMessage("&a[WikiTools] &fSteve Modifier has been &cdisabled&f.");
			}
		}
		if (WikiTools.ENCHANT_MODIFIER.isKeyDown()) {
			ENCHANT_MODIFIER = !ENCHANT_MODIFIER;
			
			if (ENCHANT_MODIFIER) {
				WikiTools.sendMessage("&a[WikiTools] &fEnchat Modifier has been &aenabled&f.");
			}
			else {
				WikiTools.sendMessage("&a[WikiTools] &fEnchat Modifier has been &cdisabled&f.");
			}
		}
		if (WikiTools.SELF_MODIFIER.isKeyDown()) {
			SELF_MODIFIER = !SELF_MODIFIER;
			
			if (SELF_MODIFIER) {
				WikiTools.sendMessage("&a[WikiTools] &fSelf Modifier has been &aenabled&f.");
			}
			else {
				WikiTools.sendMessage("&a[WikiTools] &fSelf Modifier has been &cdisabled&f.");
			}
		}
		if (WikiTools.INVISIBLE_MODIFIER.isKeyDown()) {
			INVISIBLE_MODIFIER = !INVISIBLE_MODIFIER;
			
			if (INVISIBLE_MODIFIER) {
				WikiTools.sendMessage("&a[WikiTools] &fInvisible Modifier has been &aenabled&f.");
			}
			else {
				WikiTools.sendMessage("&a[WikiTools] &fInvisible Modifier has been &cdisabled&f.");
			}
		}
	}
}