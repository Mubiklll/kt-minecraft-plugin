package Main.ktPlugin

import org.bukkit.plugin.java.JavaPlugin

class KtPlugin : JavaPlugin() {

    override fun onEnable() {
        // тут когда включается плугин плагин пон д
        server.pluginManager.registerEvents(EventListener(), this)
    }

    override fun onDisable() {
        // тут когда выключается плугин плагин пон д
    }
}
