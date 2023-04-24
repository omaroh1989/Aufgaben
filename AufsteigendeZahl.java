/**
 *
 * @author Omar
 */
public class AufsteigendeZahl {
    
    /**
     * In dieser Methode wird das System aufgefordert, das Ergebnis auf dem
     * Bildschirm anzuzeigen.
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        System.out.println(istAufsteigend(12345));
    }
    
    /**
     * Diese Methode gibt an, ob die Ziffernfolge der Dezimaldarstellung 
     * aufsteigend ist.
     * @param zahl Dezimaldarstellung.
     * @return liefert True, wenn Dezimaldarstellung aufsteigend ist.
     * sonst False.
     */
    
    public static boolean istAufsteigend(int zahl) {
            
        return zahl < 10 ? true : zahl / 10 % 10 < zahl % 10 
                                      ? istAufsteigend(zahl / 10) : false; 
    }
}
