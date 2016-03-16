package hexeption.morgancentral99;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.Bentipa.updater.SpigotPluginUpdater;

public class Main extends JavaPlugin implements Listener {
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("No Rain V0.0.1 Loaded");
        getServer().getPluginManager().registerEvents(this, this);
        SpigotPluginUpdater spu = new SpigotPluginUpdater(this/*Your Plugin*/, "http://http://localhost/VersionChecker/hNoRain.html");
        spu.enableOut(); // Enables an Output if there is a new Update and if the file was downloaded
       //spu.disableOut(); Disables the output
        if(spu.needsUpdate()) // Check if there is an Update availible
        //...
	}
	@EventHandler
	public void onWeatherChange(WeatherChangeEvent event){
		if (event.toWeatherState()) {
			event.setCancelled(true);
		}
	}
	
}
