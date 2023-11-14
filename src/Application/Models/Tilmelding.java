package Application.Models;

public class Tilmelding {
    private double kvalifikationTid;
    private Konkurrence konkurrence;
    private Deltager deltager;

    public Tilmelding(Deltager deltager, Konkurrence konkurrence, double tid) {
        if (this.deltager != deltager) {
            this.deltager = deltager;
            deltager.tilføjTilmelding(this);
        }
        this.konkurrence = konkurrence;
        kvalifikationTid = tid;
    }
}
