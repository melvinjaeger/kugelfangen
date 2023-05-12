import GLOOP.*;
public class Spielfeld{
    private GLQuader untergrund;
    private double breite, tiefe;

    private GLQuader wand1,wand2,wand3,wand4;

    public Spielfeld(){

        untergrund = new GLQuader(0,0,0, 2500,2000,2500);
        untergrund.setzeTextur("src/img/dirt.jpg");
        untergrund.verschiebe(0,-990,0);

        //vorne
        wand1 = new GLQuader(0,0,0,2500,200,50);
        wand1.verschiebe(0,0,1225);
        wand1.setzeTextur("src/img/dirt oben.jpg");

        //hinten
        wand2 = new GLQuader(0,0,0,2500,200,50);
        wand2.verschiebe(0,0,-1225);
        wand2.setzeTextur("src/img/dirt oben.jpg");

        //rechts
        wand3 = new GLQuader(0,0,0,2500,200,50);
        wand3.verschiebe(1225,0,0);
        wand3.drehe(0,90,0);
        wand3.setzeTextur("src/img/dirt oben.jpg");

        //links
        wand4 = new GLQuader(0,0,0,2500,200,50);
        wand4.verschiebe(-1225,0,0);
        wand4.drehe(0,90,0);
        wand4.setzeTextur("src/img/dirt oben.jpg");

    }







}


