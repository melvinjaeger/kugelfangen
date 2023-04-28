import GLOOP.*;
public class game {
    private GLKamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Spieler spieler;
    private Kugeln[] kugel;

    public game() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 1500, 1500);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/kugeltextur.jpg/");
        tastatur = new GLTastatur();

        Spielfeld spielfeld = new Spielfeld(2000, 2000);


        kugel = new Kugeln[100];

        for (int i = 0; i < kugel.length; i++) {
            kugel[i] = new Kugeln();
        }
        spieler = new Spieler();

        fuehreAus();
    }


        public void fuehreAus () {

            while (!tastatur.esc()) ;{


                spieler.bewege(1);


                for (int i = 0; i < kugel.length; i++) {
                    kugel[i].bewege(1);
                }




            }
            Sys.warte();
        }





}

