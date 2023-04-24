/**
 *
 * @author Omar
 */
public class FeldRotieren {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        int[] feld1 = new int[] {1, 2, 3, 4, 5, 6};
            
        rotiere(feld1, 2);

        for (int i = 0; i < feld1.length; i++) {
            System.out.print(feld1[i] + " | ");  
        }
        System.out.println();
    }
    
    /**
     * Diese Methode verschiebt die Komponenten eines Felds um eine bestimmte 
     * Schrittweite. Werte, die durch die Verschiebung „rechts aus dem Feld 
     * herausrutschen“, kommen „links in das Feld“ wieder hinein.
     * @param feld1 ein Feld
     * @param schrittweite eine bestimmte Schrittweite
     */
    
    public static void rotiere(int[] feld1, int schrittweite) {
        
        if (feld1.length != 0) {
            int[] feld2 = new int[feld1.length];

            int j = schrittweite % feld1.length;
            int i = 0;
            while (j < feld1.length) {
                feld2[j] = feld1[i];
                i++;
                j++;
            }
            j = 0;
            while (j < schrittweite % feld1.length) {
                feld2[j] = feld1[i];
                i++;
                j++;
            }
            for (int k = 0; k < feld1.length; k++) {
                feld1[k] = feld2[k];
            }
        } 
    }   
}
