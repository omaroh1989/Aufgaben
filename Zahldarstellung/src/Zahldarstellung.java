/**
 *
 * @author Omar
 */
public class Zahldarstellung {
    
    /**
     * Hier wird das System aufgefordert, das Ergebnis auf dem Bildschirm 
     * anzuzeigen.
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        System.out.println(addiere(1001, 11, 2));
     
    }
    
    /**
     * Diese Methode addiert zweit Zahlen und das Ergebnis ist davon abhängig, 
     * zu welchem Basis diese Zahlen gehören.
     * @param zahl1 Erster Parameter Typ long
     * @param zahl2 Zweiter Parameter Typ long
     * @param basis Dritter Parameter Typ int gibt an, zu welcher Basis 
     * die Zahlen dargestellt sind.
     * @return Das Ergebnis
     */
    
    public static long addiere(long zahl1, long zahl2, int basis) {
        
        return istGueltig(zahl1, basis) && istGueltig(zahl2, basis) 
                                ? stellenWertSumme((dezimalWert(zahl1, basis)) 
                                + dezimalWert(zahl2, basis), basis) 
                                : -1;
    } 
    
    /**
     * Diese Methode testet, ob die beiden Zahalen gueltig sind oder nein.
     * @param zahl Parameter Typ long
     * @param basis Dritter Parameter Typ int gibt an, zu welcher Basis 
     * die Zahlen dargestellt sind.
     * @return Das Ergebnis
     */
    
    public static boolean istGueltig(long zahl, int basis) {
        
        return zahl < 10 && zahl >= 0 ? zahl < basis 
                                : zahl % 10 < basis && zahl >= 0 
                                ? istGueltig(zahl / 10, basis) 
                                : false;
    }
    
    /**
     * Hier wird Dezimalwert zurückgegeben.
     * @param wert Parameter Typ long
     * @param basis Dritter Parameter Typ int gibt an, zu welcher Basis 
     * die Zahlen dargestellt sind.
     * @return Das Ergebnis
     */
    
    public static long dezimalWert(long wert, int basis) {
        
        return wert == 0 ? 0 : wert % 10 
                                + basis * dezimalWert(wert / 10, basis);
    }
    
    /**
     * Umrechnung des gesamten Wertes in gewünchten Stellenwertsystem.
     * @param a Parameter Typ long
     * @param basis Dritter Parameter Typ int gibt an, zu welcher Basis 
     * die Zahlen dargestellt sind.
     * @return Das Ergebnis
     */
    
    public static long stellenWertSumme(long a, int basis) {
        
        return a == 0 ? 0 : 10 * stellenWertSumme(a / basis, basis) + a % basis;
    }
}
