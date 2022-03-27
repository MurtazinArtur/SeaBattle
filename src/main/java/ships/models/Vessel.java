package ships.models;

import exceptions.CreateVesselException;
import ships.interfaces.Damager;
import ships.interfaces.Sailable;

public class Vessel implements Sailable {
    private final Point[] decks;
    private Damager damager;

    public Vessel(int decks) throws CreateVesselException {
        if (decks > 4) {
            throw new CreateVesselException("Вы указали недопустимую длину корабля");
        }
        this.decks = new Point[decks];
    }

    public void attack(Point point) {
        damager.damage(point);
    }

    public void sail() {

    }

    public Integer getCountDecks() {
        return decks.length;
    }
}
