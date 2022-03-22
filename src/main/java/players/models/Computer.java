package players.models;

import players.interfaces.Player;
import ships.models.Vessel;

import java.util.List;

public class Computer implements Player {
    private List<Vessel> vessels;

    public void getReadyForGame() {

    }

    public boolean isReadyToPlay() {
        return false;
    }

    public List<Vessel> getVessels() {
        return null;
    }
}
