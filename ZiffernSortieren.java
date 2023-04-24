/**
 *
 * @author Omar
 */
public class ZiffernSortieren {
    
    /**
     * In dieser Methode wird das System aufgefordert, das Ergebnis auf dem
     * Bildschirm anzuzeigen.
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
//        System.out.println(sortiere(1987654321));
        System.out.println(mische(998899, 2278));
        
    }
    
    /**
     * Diese Methode sortiert eine Zahl.
     * @param zahl Parameter, der sortiert wird
     * @return Das Ergebnis
     */
    
    public static long sortiere(long zahl) {
            
        return istAufsteigend(zahl) ? zahl : zahl / 10 % 10 <= zahl % 10 
                                ? sortiere(10 * sortiere(zahl / 10) + zahl % 10)
                                : sortiere(zahl + zahl / 10 % 10 - zahl % 10
                                - 10 * (zahl / 10 % 10 - zahl % 10));
    }
    
    /**
     * Diese Methode testet, ob die Ziffernfolge des Zahles aufsteigend ist.
     * @param getesteZahl Parameter, der getestet wird
     * @return Das Ergebnis
     */
    
    public static boolean istAufsteigend(long getesteZahl) {
            
        return getesteZahl < 10 ? true 
                                : getesteZahl / 10 % 10 <= getesteZahl % 10 
                                ? istAufsteigend(getesteZahl / 10) : false; 
    }
    
    /**
     * Diese Methode sortiert gemichte Zahlen.
     * @param zahl1 erster Parameter
     * @param zahl2 zweiter Parameter
     * @return Das Ergebnis
     */
    
    public static long mische(long zahl1, long zahl2) {
        
        return sortiere(verkette(zahl1, zahl2));
    }
    
    /**
     * Diese Methode verkettet zwei Zahalen.
     * @param zahl1 erster Parameter
     * @param zahl2 zweiter Parameter
     * @return Das Ergebnis
     */
            
    public static long verkette(long zahl1, long zahl2) {
       
        return zahl2 == 0 ? zahl1 * 10 : verkette2(zahl1, zahl2);
    }
    
    /**
     * Diese Methode wird aufgerufen, wenn die Bedingung in der oben 
     * genannten Methode nicht erfüllt.
     * @param zahl1 erster Parameter
     * @param zahl2 zweiter Parameter
     * @return  Das Ergebnis des Ausdrucks
     */
    public static long verkette2(long zahl1, long zahl2) {
        
        return zahl2 > 0 ? verkette2(zahl1 * 10, zahl2 / 10) 
                                    - zahl2 / 10 + zahl2 
                                    : zahl1;
    }
}



