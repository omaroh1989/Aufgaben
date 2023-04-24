/**
 *
 * @author Omar
 */
public class Palindrom {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        System.out.println(istPalindrom("anna"));
    }
    
    /**
     * Diese Methode testet, ob der uebergebene Text von vorne wie hinten 
     * gelesen gleich ist. Wenn ja, liefert true, sonst false
     * @param text getesteter Text
     * @return Das Ergebnis
     */
    
    public static boolean istPalindrom(String text) {
        
        String umgedrehterText = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            
            umgedrehterText += text.charAt(i);
        }
        
        return text.equals(umgedrehterText);
    }
}
