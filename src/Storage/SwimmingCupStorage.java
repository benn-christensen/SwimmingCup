package Storage;

import Application.Models.Deltager;
import Application.Models.Konkurrence;

import java.util.ArrayList;

public class SwimmingCupStorage {
    private ArrayList<Konkurrence> konkurrencer = new ArrayList<Konkurrence>();
    private ArrayList<Deltager> deltagere = new ArrayList<Deltager>();
    public void addKonkurrence(Konkurrence konkurrence) {
        konkurrencer.add(konkurrence);
    }

    public ArrayList<Konkurrence> hentKonkurrencer() {
        return new ArrayList<>(konkurrencer);
    }

    public void addDeltager(Deltager deltager) {
        deltagere.add(deltager);
    }

    public ArrayList<Deltager> hentDeltagere() {
        return new ArrayList<>(deltagere);
    }
}
