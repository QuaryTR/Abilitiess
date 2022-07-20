package github.quarytr.abilities.instance;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class ThunderAbility implements Abilities{



    @Override
    public void eject(Player var0) {

        final Location pLoc = var0.getLocation();
        final World locWorld = pLoc.getWorld();

        locWorld.strikeLightning(pLoc);
    }
}
