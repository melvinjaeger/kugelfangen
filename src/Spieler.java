import GLOOP.*;
public class Spieler {
    private GLZylinder spieler;
    private Spielfeld feld;
    private GLTastatur tastatur;

    public Spieler() {
      spieler = new GLZylinder (0,20,0,100,40,"src/img/kugeltextur.jpg/");
      spieler.drehe(90,0,0);








    }


    public void bewege(double speed) {

        if (tastatur.links() && spieler.gibX() > 750) {
            spieler.verschiebe( 1* speed,0,0);}
            if (tastatur.rechts() && spieler.gibX() > -750){
                spieler.verschiebe( -1* speed,0,0);}
                if (tastatur.oben() && spieler.gibZ() > 750){
                    spieler.verschiebe( 0,0,1* speed);}
                    if (tastatur.links() && spieler.gibZ() > -750){
                        spieler.verschiebe( 0 ,0,-1* speed);}
    }

    public double gibX()  {return spieler.gibX();}

    public double gibY(){
        return spieler.gibY();
    }

    public double gibZ() {
        return spieler.gibZ();
    }


}
