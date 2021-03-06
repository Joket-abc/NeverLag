package cn.jiongjionger.neverlag.tweaker;

import cn.jiongjionger.neverlag.config.ConfigManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;

public class NoSpawnChunkInMemory implements Listener {

	private final ConfigManager cm = ConfigManager.getInstance();

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	public void onWorldLoad(WorldInitEvent e) {
		e.getWorld().setKeepSpawnInMemory(cm.isKeepSpawnChunkInMemory);
	}
}
