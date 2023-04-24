/**
 *
 * @author Omar
 */
public class ZahlUmdrehen {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        System.out.println(dreheUm(1234));
    }
    
    /**
     * Durch diese Methode wird eine Zahl umgedreht, sodass die erste 
     * Ziffer der übergebenen Zahl die letzte Ziffer der resultierenden 
     * Zahl ist.
     * @param zahl Natürliche Zahl
     * @return Hier wird die zweite Methode aufgerufen.
     */
    
    public static long dreheUm(long zahl) {
        
        return dreheUm(zahl, 0);
    }
    
    /**
     * 
     * @param zahl Natürliche Zahl
     * @param umgedrehteZahl Anfangswert ist 0, und wenn zahl = 0 ist, wäre 
     * umgedrehteZahl das Ergebnis der umgedrehten Zahl
     * @return Die Methode wird immer aufgerufen, bis a = 0 ist.
     */
    
    private static long dreheUm(long zahl, long umgedrehteZahl) {
        
        return zahl == 0 ? umgedrehteZahl 
                : dreheUm(zahl / 10, umgedrehteZahl * 10 + zahl % 10);
    } 
}
