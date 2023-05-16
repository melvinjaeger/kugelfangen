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
        kugel.verschiebe( Math.random() * 2-2, 0 , Math.random() * 2-2);





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

    public void respawn() {
        kugel.setzeSichtbarkeit(false);

    }

    public boolean hit() {

        double abstand = Math.sqrt(
                Math.pow(this.gibX() - spieler.gibX(), 2) +
                        Math.pow(this.gibZ() -spieler.gibZ(), 2)
            );
            if (abstand < 20) {
                return true;
            }
            else{
                return false;
            }
        }

        }

