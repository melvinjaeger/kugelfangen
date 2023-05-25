import GLOOP.*;
public class Spieler{
    GLZylinder spieler;
   public double punkte;




    public Spieler() {
        spieler = new GLZylinder(0,20,0,80,50);
        spieler.setzeTextur("src/img/maus.jpg");
        spieler.drehe(90,0,0);
    }




    public void punkte(){
        punkte++;
    }

    public double GibPunkte() {
        return punkte;
    }


    public void bewegeLinks(){
        spieler.verschiebe(-1.5,0,0);
    }
    public void bewegeRechts(){
        spieler.verschiebe(1.5,0,0);
    }
    public void bewegevorne(){
        spieler.verschiebe(0,0,-1.5);
    }
    public void bewegehinten(){
        spieler.verschiebe(0,0,1.5);
    }





    public double gibX()  {return spieler.gibX();}

    public double gibY(){
        return spieler.gibY();
    }

    public double gibZ() {
        return spieler.gibZ();
    }


}
