import GLOOP.*;
public class game {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;
    private Spieler spieler;

    Kugeln[] balls;



    public game() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 1000, 1800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/wald.jpg");
        tastatur = new GLTastatur();

        spieler=new Spieler();

        balls = new Kugeln[100];
        for (int i = 0; i < balls.length; i++) {
            balls[i]= new Kugeln();
        }

        Spielfeld spielfeld = new Spielfeld();

        fuehreAus();
    }

    public void fuehreAus() {
        while (!tastatur.esc()) {
            if (tastatur.rechts() && spieler.gibX() < 1200) {
                spieler.bewegeRechts();
            }
            if (tastatur.links() && spieler.gibX() > -1200) {
                spieler.bewegeLinks();
            }
            if (tastatur.oben() && spieler.gibZ() > -1200) {
                spieler.bewegevorne();
            }
            if (tastatur.unten() && spieler.gibZ() < 1200) {
                spieler.bewegehinten();
            }
            Sys.warte();
        }
    }
}