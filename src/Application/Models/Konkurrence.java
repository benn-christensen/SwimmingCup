package Application.Models;

public class Konkurrence {
    private Disciplin disciplin;
    private int distance;
    private Køn køn;
    private int række;

    public Konkurrence(Disciplin disciplin, int distance, Køn køn, int række) {
        this.disciplin = disciplin;
        this.distance = distance;
        this.køn = køn;
        this.række = række;
    }

    @Override
    public String toString() {
        return "Køn: " + this.køn + " række: " + this.række + " disciplin: " + this.disciplin + " distance: " + this.distance;
    }
}
