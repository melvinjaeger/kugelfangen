import GLOOP.*;
public class Kugeln {
    private GLKugel kugel;
    private Spieler Box;
    private Spielfeld feld;
    private double radius;


    public Kugeln() {
        kugel = new GLKugel(-750 + Math.random() * 1500, 20, -750 + Math.random() * 1500, 10, "src/img/kugeltextur.jpg/");

    }


    public void bewege(double speed) {
        kugel.verschiebe(-75 + Math.random() * 150, 0, -75 + Math.random() * 150);


    }

    public void abprallen(){

   //    if() kugel.gibX > feld.breite


    }




    public double gibX() {
        return kugel.gibX();
    }

    public double gibY() {
        return kugel.gibY();
    }

    public double gibZ() {
        return kugel.gibZ();
    }
}