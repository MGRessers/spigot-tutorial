package me.MG.Messentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class heal implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("heal")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("§4No.");
				return true;
			}
			Player player = (Player) sender;
			player.setHealth(20);
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&aYou have been healed!"));
			return true;
		}
		return true;
	}

}
