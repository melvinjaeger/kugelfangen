import GLOOP.*;
public class Kugeln {
    private GLKugel kugel1, kugel2, kugel3;
    private spieler Box;
    private Spielfeld feld;
    private double radius;



    public Kugeln(double pX, double pY, double pZ, double pR){
        kugel1 = new GLKugel(10,100,100,10,"src/img/kugeltextur.jpg/");
        kugel2 = new GLKugel(10,100,100,10,"src/img/kugeltextur.jpg/");
        kugel3 = new GLKugel(10,100,100,10,"src/img/kugeltextur.jpg/");
    }

}
