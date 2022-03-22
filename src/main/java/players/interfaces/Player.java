package players.interfaces;

import ships.models.Vessel;

import java.util.List;

public interface Player {
    void getReadyForGame();
    boolean isReadyToPlay();
    List<Vessel> getVessels();
}
