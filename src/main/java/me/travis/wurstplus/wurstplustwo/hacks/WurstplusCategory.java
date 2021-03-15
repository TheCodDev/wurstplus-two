package me.travis.wurstplus.wurstplustwo.hacks;

public enum WurstplusCategory {
	WURSTPLUS_CHAT ("Chat", "LynxChat", false),
	WURSTPLUS_COMBAT ("Combat", "LynxCombat", false),
	WURSTPLUS_MOVEMENT ("Movement", "LynxMovement", false),
	WURSTPLUS_RENDER ("Render", "LynxRender", false),
	WURSTPLUS_EXPLOIT ("Exploit", "LynxExploit", false),
	WURSTPLUS_MISC ("Misc", "LynxMisc", false),
	WURSTPLUS_GUI ("GUI", "LynxGUI", false),
	WURSTPLUS_BETA ("Beta", "LynxBeta", false),
	WURSTPLUS_HIDDEN ("Hidden", "LynxHidden", true);

	String name;
	String tag;
	boolean hidden;

	WurstplusCategory(String name, String tag, boolean hidden) {
		this.name   = name;
		this.tag    = tag;
		this.hidden = hidden;
	}

	public boolean is_hidden() {
		return this.hidden;
	}

	public String get_name() {
		return this.name;
	}

	public String get_tag() {
		return this.tag;
	}
}
