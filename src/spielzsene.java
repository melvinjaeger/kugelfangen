import GLOOP.*;
public class spielzsene {
    private GLKamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private spieler Box;
    private Kugeln kugel1, kugel2, kugel3;

    public spielzsene() {
        kamera = new GLKamera();
        kamera.setzePosition(0, 500, 800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

        Spielfeld spielfeld = new Spielfeld(1000, 1000);
        Kugeln kugel1 = new Kugeln(10,10,10,10);

        fuehreAus();
    }

    public void fuehreAus() {


    }
}

