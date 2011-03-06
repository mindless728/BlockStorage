package mindless728.BlockStorage;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.Serializable;

public class PluginBlockStorage<T extends Serializable> {
	JavaPlugin plugin;
	ChunkCache cache;
	
	public PluginBlockStorage(JavaPlugin p) {
		plugin = p;
		cache = new ChunkCache(p, 16);
	}
	
	@SuppressWarnings("unchecked")
	public T getData(Location loc) {
		return (T)(cache.getData(loc));
	}
	
	public void setData(Location loc, T data) {
		cache.setData(loc, data);
	}
	
	public void close() {
		cache.close();
	}
}