import GLOOP.*;
public class Kugeln {
    private GLKugel kugel;
    private Spieler spieler;
    private Spielfeld spielfeld;

    double xspeed, zspeed;
    double abstand;




    public Kugeln(Spieler pspieler, Spielfeld pspielfeld) {
        spieler = pspieler;
        spielfeld = pspielfeld;

        kugel = new GLKugel(-1125 + Math.random() * 2250, 20, -1125 + Math.random() * 2250, 10, "src/img/käse.jpg/");

        xspeed = Math.random() * 2 - 0.5;
        zspeed = Math.random() * 2 - 0.5;


    }


    public void bewegen() {
        if(-spielfeld.gibTiefe()/2+50>= kugel.gibZ()+250||+spielfeld.gibTiefe()/2-50<= kugel.gibZ()-250){
            zspeed = -zspeed;
        }
        if(-spielfeld.gibBreite()/2+95>= kugel.gibX()+285||+spielfeld.gibBreite()/2-95<= kugel.gibX()-285){
            xspeed = -xspeed;
        }
        kugel.drehe(0, Math.random() * 2 - 1, 0);
        kugel.verschiebe(xspeed, 0, zspeed);
        if(getroffen()){
            kugel.setzePosition(-6000,-1000,-1000);
        }
    }




    public boolean getroffen() {
        abstand = Math.sqrt(Math.pow(kugel.gibX() - spieler.gibX(), 2)+Math.pow(kugel.gibZ() - spieler.gibZ(), 2));
        if (abstand < 90) {
            spieler.punkte();
            return true;
        } else {
            return false;
        }


    }
}




