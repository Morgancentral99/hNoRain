package hexeption.morgancentral99;

import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.Bentipa.updater.SpigotPluginUpdater;

public class Main extends JavaPlugin implements Listener {
		protected boolean Enabled;
	}
	public void onEnable() {
        catch (IOException localIOException) {}
        if (!new File(getDataFolder(), "config.yml").exists()) {
          saveDefaultConfig();
        }
        reloadConfiguration();
		getServer().getConsoleSender().sendMessage("No Rain V0.0.1 Loaded");
        getServer().getPluginManager().registerEvents(this, this);
        SpigotPluginUpdater spu = new SpigotPluginUpdater(this/*Your Plugin*/, "http://http://localhost/VersionChecker/hNoRain.html");
        spu.enableOut(); // Enables an Output if there is a new Update and if the file was downloaded
       //spu.disableOut(); Disables the output
        if(spu.needsUpdate()) // Check if there is an Update availible
        //...
	}
	public void saveConfiguration() {
		getConfig.set("hNoRain.Enabled", Boolean.valueOf(this.Enabled))
	}
	public void reloadConfiguration() {
		reloadConfig();
		this.Enabled = getConfig(),getBoolean("hNoRain.enabled");
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if ((args.length == 0) || (args[0].equalsIgnoreCase("rain"))) {
			success = onRainCommand(sender, command, label, args);
		} else if ("help".equalsIgnoreCase(args[0])) {
			success = onRainCommand(sender, command, label, args);
		}
		if (!success) {
			sender.sendMessage(ChatColor.DARK_RED + "Invalid Arguments! " + "Use '/hNoRain Help' to get a list of commands!");
		}
		return true;
	}
	boolean onRainCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("hexeption.rain")) {
			if (args.length == 2) {
				if ("true".equalsIgnoreCase(args[1])) {
					this.plugin.setEnabled(true);
					sender.sendMessage(ChatColor.GREEN + "Rain Disabler has been enabled!");
				}
				else if ("false".equalsIgnoreCase(args[1])) {
					this.getPluginLoader().setEnabled(ChatColor.GREEN + "Rain Disabler has been disabled");
				}
				else {
					sender.sendMessage(ChatColor.AQUA + "Use True for Enable or False for Disable the Rain Plugin!");
				}
			}
		}
	}
	
	public boolean setEnabled(boolean enabled) {
		this.Enabled = enabled;
		saveConfiguration();
	}
	public void Enable() {
		if (this.plugin.Enabled())
	@EventHandler
	public void onWeatherChange(WeatherChangeEvent event){
		if (event.toWeatherState()) {
			event.setCancelled(true);
		}
	}
	
}
