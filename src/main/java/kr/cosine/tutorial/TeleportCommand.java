package kr.cosine.tutorial;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("only player");
            return true;
        }
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("/" + label + " [닉네임]");
            return true;
        }
        String nickname = args[0];
        Player target = player.getServer().getPlayer(nickname);
        if (target == null) {
            player.sendMessage("해당 플레이어는 오프라인입니다.");
            return true;
        }
        player.teleport(target);
        player.sendMessage(target.getName() + "님에게 티피함");
        return true;
    }
}
