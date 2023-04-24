/**
 *
 * @author Omar
 */
public class HaeufigstesWort {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        String[] wort = new String[] {"a", "b", "a", "c", "a", "c", "d", "c"};
        
        System.out.println(gibHaeufigstesWort(wort));
    }
    
    /**
     * Diese Methode, die das Wort liefert, das in dem übergebenen Feld
     * von Wörtern am häufigsten vorkommt.
     * @param wort ein Feld
     * @return Das Ergebnis
     */
    
    public static String gibHaeufigstesWort(String[] wort) {
               
        String geprueftesWort = "";
        String haeufigstesWort = "";
        int wievielMalVorkommt = 0;
        int haeufigkeit = 0;

        if (wort.length != 0) {
            int i = 0;
            while (i < wort.length) {
                geprueftesWort = wort[i];
                for (int j = i; j < wort.length; j++) {
                    if (geprueftesWort.equals(wort[j])) {
                        wievielMalVorkommt++;
                    }
                }
                
                if (wievielMalVorkommt > haeufigkeit) {
                    haeufigstesWort = geprueftesWort;
                    haeufigkeit = wievielMalVorkommt;
                }
                
                wievielMalVorkommt = 0;
                i++;
            }
        } else {
            haeufigstesWort = null;
        }
        return haeufigstesWort;
    }   
}
