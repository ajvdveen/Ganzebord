package Model;

public class Dobbelsteen {
    private static int worp;   // Number showing on the first die.

    public Dobbelsteen() {
        // Constructor.  rol de dobbelsteen
        rol();  // rollen van de dobbelsteen.
    }

    public static void rol() {
        // Rol de dobbelsteen door een random
        // tussen 1 en 6 te bepalen.
        worp = (int)(Math.random()*6) + 1;
    }
    public static int getWorp() {
        // Retourneer het resultaat van dobbelsteen
        return worp;
    }
}
