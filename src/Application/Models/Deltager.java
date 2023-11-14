package Application.Models;

import java.util.ArrayList;

public class Deltager {
    private int række;
    private Køn køn;
    private boolean fremmødt;
    private ArrayList<Tilmelding> tilmeldinger = new ArrayList<Tilmelding>();

    public Deltager(int række, Køn køn) {
        this.række = række;
        this.køn = køn;
        fremmødt = false;
    }

    public void tilføjTilmelding(Tilmelding tilmelding) {
        if (!tilmeldinger.contains(tilmelding)) {
            tilmeldinger.add(tilmelding);
        }
    }
}
