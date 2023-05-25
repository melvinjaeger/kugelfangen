import GLOOP.*;
public class game {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;
    private GLTafel tafel1;
    private Spieler spieler;
    private Spielfeld spielfeld;
    private double Punkte;

    Gegner[]gegner;

    Kugeln[]balls;

    public game() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 1600, 2000);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/gras.jpg");
        tastatur = new GLTastatur();

        spieler=new Spieler();
        spielfeld = new Spielfeld(2000,2000);

        balls = new Kugeln[50];
        for (int i = 0; i < balls.length; i++) {
            balls[i]= new Kugeln(spieler,spielfeld);
        }

        gegner = new Gegner[3];
        for (int i = 0; i < gegner.length; i++) {
            gegner[i]= new Gegner(spieler,spielfeld);
        }


        tafel1 = new GLTafel(0,0,0,2500,0,"src/img/gold.jpg");
        tafel1.verschiebe(0,300,-1500);

        fuehreAus();


    }

    public void fuehreAus() {
        while (!tastatur.esc()) {
            this.updatebälle();
            this.updateTafel();
            if (tastatur.rechts() && spieler.gibX() < 1125) {
                spieler.bewegeRechts();
            }
            if (tastatur.links() && spieler.gibX() > -1125) {
                spieler.bewegeLinks();
            }
            if (tastatur.oben() && spieler.gibZ() > -1125) {
                spieler.bewegevorne();
            }
            if (tastatur.unten() && spieler.gibZ() < 1125) {
                spieler.bewegehinten();
            }

            for (int i = 0; i < gegner.length; i++) {
                gegner[i].move();

            }





            if(Punkte == 21){
                tafel1.setzeSichtbarkeit(false);
                tafel1 = new GLTafel(0, 500,0,20000,20000,"src/img/gold.jpg");
                tafel1.setzeText("Gewonnen",800);
                tafel1.drehe(-88,0,0);
                Sys.warte(5000);
                Sys.beenden();
            }


            Sys.warte();
        }
    }
    public void updatebälle(){
        for (int i = 0; i < balls.length; i++) {
            balls[i].bewegen();
        }
    }
    public void updateTafel(){
        if(spieler.GibPunkte()-Punkte >= 1){
            tafel1.setzeText("Kaese: "+spieler.GibPunkte(),500);
            Punkte = spieler.GibPunkte();
        }
    }
}
