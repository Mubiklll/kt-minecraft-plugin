package Main.ktPlugin

import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import net.kyori.adventure.text.Component

class EventListener : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) { // ивент срабатывает, дальше идут действия
        val player = event.player // тут получает игрока который зашел
        player.sendMessage(Component.text("пр пр ты зашел на сервер ахуеть")) // получаем игрока -> отправляем сообщение
    }
}