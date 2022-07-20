package github.quarytr.abilities;

import github.quarytr.abilities.instance.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player){

            final Player player = (Player) commandSender;

            if (strings.length == 0) player.sendMessage("Type an Ability name.");
            if (strings.length > 1) player.sendMessage("Invalid command usage.");


            if (strings.length == 1){

                final String abilityName = strings[0];
                final AbilityType abilityType = AbilityType.valueOf(abilityName);

                Abilities abilities = null;

                if (abilityType.equals(AbilityType.EXPLODE)) abilities = new ExplodeAbility();
                if (abilityType.equals(AbilityType.THUNDER)) abilities = new ThunderAbility();
                if (abilityType.equals(AbilityType.FIRE)) abilities = new FireAbility();

                abilities.eject(player);

            }

        }




        return false;
    }
}
