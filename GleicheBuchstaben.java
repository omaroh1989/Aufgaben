/**
 *
 * @author Omar
 */
public class GleicheBuchstaben {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        System.out.println(gibLaengstesKonstantesStueck("hallo"));   
    }
    
    /**
     * Diese Methode liefert das längste Teilwort der übergebenen Zeichenkette.
     * @param wort übergeben Wort
     * @return Das Ergebnis
     */
    
    public static String gibLaengstesKonstantesStueck(String wort) {
        
        String geteiltesTeilWort = "";
        String laengstesTeilWort = "";

        int i = 0;
        while (i < wort.length()) {
            int j = i + 1;
            while (j < wort.length() && wort.charAt(i) == wort.charAt(j)) {
                j++;
            }
            geteiltesTeilWort = wort.substring(i, j);
            laengstesTeilWort = laengstesTeilWort.length() 
                                >= geteiltesTeilWort.length()
                                ? laengstesTeilWort
                                : geteiltesTeilWort;
            i = j;
        }
        
        return laengstesTeilWort;
    }   
}
