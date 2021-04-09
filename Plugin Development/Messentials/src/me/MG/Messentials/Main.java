package me.MG.Messentials;

import org.bukkit.plugin.java.JavaPlugin;
import me.MG.Messentials.commands.heal;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("[Messentials] Started.");
		this.getCommand("heal").setExecutor(new heal());
	}

	public void onDisable() {
		
	}
	
}
