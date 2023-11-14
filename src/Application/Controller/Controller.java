package Application.Controller;

import Application.Models.*;
import Storage.SwimmingCupStorage;

public class Controller {
    private SwimmingCupStorage storage;

    public Controller() {
        storage = new SwimmingCupStorage();
    }

    public void opretKonkurrence(Disciplin disciplin, int distance, Køn køn, int række) {
        Konkurrence nyKonkurrence = new Konkurrence(disciplin, distance, køn, række);
        storage.addKonkurrence(nyKonkurrence);
    }

    public void tilmeldKonkurence(Deltager deltager, Konkurrence konkurrence, double tid) {
        Tilmelding tilmelding = new Tilmelding(deltager, konkurrence, tid);
    }

    public Deltager opretDeltager(int række, Køn køn) {
        Deltager nyDeltager = new Deltager(række, køn);
        storage.addDeltager(nyDeltager);
        return nyDeltager;
    }

    public SwimmingCupStorage getStorage() {
        return this.storage;
    }
}
