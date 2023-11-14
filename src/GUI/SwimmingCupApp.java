package GUI;

import Application.Controller.Controller;
import Application.Models.Deltager;
import Application.Models.Disciplin;
import Application.Models.Konkurrence;
import Application.Models.Køn;

public class SwimmingCupApp {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.opretKonkurrence(Disciplin.FRI, 100, Køn.PIGE, 4);
        controller.opretKonkurrence(Disciplin.BRYST, 200, Køn.PIGE, 4);
        controller.opretKonkurrence(Disciplin.MEDLEY, 400, Køn.DRENG, 4);
        Deltager deltager1 = controller.opretDeltager(4, Køn.PIGE);
        Deltager deltager2 = controller.opretDeltager(4, Køn.DRENG);
        for (Konkurrence konkurrence : controller.getStorage().hentKonkurrencer()) {
            System.out.println(konkurrence);
        }
        Konkurrence konkurrence1 = controller.getStorage().hentKonkurrencer().get(0);
        Konkurrence konkurrence2 = controller.getStorage().hentKonkurrencer().get(1);

        controller.tilmeldKonkurence(deltager1, konkurrence1, 56.12);
        controller.tilmeldKonkurence(deltager2, konkurrence1, 65.34);
        controller.tilmeldKonkurence(deltager2, konkurrence2, 140.34);

    }
}
