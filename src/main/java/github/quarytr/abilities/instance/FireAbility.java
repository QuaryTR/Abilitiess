package github.quarytr.abilities.instance;

import org.bukkit.entity.Player;

public class FireAbility implements Abilities{

    @Override
    public void eject(Player var0) {
        var0.setFireTicks(200);
    }
}
