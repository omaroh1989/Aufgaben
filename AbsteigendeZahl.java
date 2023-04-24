/**
 *
 * @author Omar
 */
public class AbsteigendeZahl {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        System.out.println(istAbsteigend(4321));
    }
    
    /**
     * Diese Methode testet, ob die Ziffernfolge der Zahl Absteigend sind.
     * @param zahl Zahl
     * @return Das Ergebnis
     */
    
    public static boolean istAbsteigend(int zahl) {
        
        boolean istZahlAbsteigend = true;
        
        while (zahl > 10 && istZahlAbsteigend) {
            
            if (zahl / 10 % 10 > zahl % 10) {
               
                zahl /= 10;
            
            } else {
                
                istZahlAbsteigend = false;
            } 
        }
        
        return istZahlAbsteigend;
    }
}
