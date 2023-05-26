import GLOOP.*;
public class Gegner {
    private GLKugel gegner;
    private Spieler spieler;
    private Spielfeld spielfeld;


    double xgeschwindigkeit, zgeschwindigkeit;
    double distance;

   public double punkte;



    public Gegner(Spieler pspieler, Spielfeld pspielfeld) {
        spieler = pspieler;
        spielfeld = pspielfeld;

        gegner = new GLKugel(0, 100, -1000, 100, "src/img/sterne.jpg/");


        xgeschwindigkeit = Math.random() * 3 - 0.5;
        zgeschwindigkeit = Math.random() * 3 - 0.5;


    }


    public void move() {
        if(-spielfeld.gibTiefe()/2+50>= gegner.gibZ()+250||+spielfeld.gibTiefe()/2-50<= gegner.gibZ()-250){
            zgeschwindigkeit = -zgeschwindigkeit;
        }
        if(-spielfeld.gibBreite()/2+95>= gegner.gibX()+285||+spielfeld.gibBreite()/2-95<= gegner.gibX()-285){
            xgeschwindigkeit = -xgeschwindigkeit;
        }
        gegner.drehe(0, Math.random() * 2 - 1, 0);
        gegner.verschiebe(xgeschwindigkeit, 0, zgeschwindigkeit);

        if(hit()) {
            Sys.beenden();
        }
    }




    public boolean hit() {
        distance = Math.sqrt(Math.pow(gegner.gibX() - spieler.gibX(), 2)+Math.pow(gegner.gibZ() - spieler.gibZ(), 2));
        if (distance < 150) {
           Sys.beenden();
            return true;
        } else {
            return false;
        }


    }
}

