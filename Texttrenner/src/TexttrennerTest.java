/**
 *
 * @author Omar
 */
public class TexttrennerTest {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        Texttrenner text = new Texttrenner("--xx+-yy--abc--", "+-");
        
       
        System.out.println(text.hatNochWoerter());
        System.out.println(text.hatNochWoerter());
        System.out.println(text.gibNaechstesWort());
        System.out.println(text.hatNochWoerter());
        System.out.println(text.hatNochWoerter());
        System.out.println(text.gibNaechstesWort());
        System.out.println(text.gibNaechstesWort());
        System.out.println(text.hatNochWoerter());
        System.out.println(text.hatNochWoerter());
        System.out.println(text.gibNaechstesWort());
        
        
    }
    
}
