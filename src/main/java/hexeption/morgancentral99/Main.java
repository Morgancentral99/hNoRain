package hexeption.morgancentral99;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("No Rain V0.0.1 Loaded");
        getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onWeatherChange(WeatherChangeEvent event){
		if (event.toWeatherState()) {
			event.setCancelled(true);
		}
	}

}
