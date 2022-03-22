package ships.models;

import ships.interfaces.Damager;
import ships.interfaces.Sailable;

public class Vessel implements Sailable {
    private Point point;
    private Damager damager;

    public void attack(int x, int y){
        damager.damage();
    }

    public void sail() {

    }
}
