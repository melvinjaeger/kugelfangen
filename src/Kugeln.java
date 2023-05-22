import GLOOP.*;
public class Kugeln {
    private GLKugel kugel;
    private Spieler spieler;
    private Spielfeld feld;
    private double radius;


    public Kugeln() {
        kugel = new GLKugel(-1125 + Math.random() * 2250, 20, -1125 + Math.random() * 2250, 10, "src/img/käse.jpg/");

    }


    public void bewegen() {
        kugel.verschiebe(Math.random() * 4 - 2, 0, Math.random() * 4 - 2);
        if(getroffen()){
            kugel.setzePosition(-1000000,-1000000,0);
        }

        }




    public boolean getroffen() {
        double abstand = Math.sqrt(Math.pow(kugel.gibX() - spieler.gibX(), 2)
                + Math.pow(kugel.gibZ() - spieler.gibZ(), 2));
       if (abstand < 60) {
            return true;
        } else {
            return false;
        }

    }
}




