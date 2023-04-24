/**
 *
 * @author Omar
 */
public class FelderMischen {
    
    /**
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        int[] feld1 = new int[] {-10, -5, 0, 2, 2, 3, 7};
        int[] feld2 = new int[] {-4, 0, 1, 2, 5, 6};
        int[] gemischtesFeld = mische(feld1, feld2);
        
        for (int i = 0; i < gemischtesFeld.length; i++) {
            if (i != gemischtesFeld.length - 1) {
                System.out.print(gemischtesFeld[i] + " | ");
            } else {
                System.out.println(gemischtesFeld[i]);
            }
        }
    }
    
    /**
     * Diese Methode mischt die Werte zweier sortierter Felder zu einem 
     * sortierten Feld zusammen.
     * @param feld1 erstes Array
     * @param feld2 zweites Array
     * @return Das Ergebnis
     */
    
    public static int[] mische(int[] feld1, int[] feld2) {
        
        int[] gemischtesFeld = new int[feld1.length + feld2.length];
        
        
        for (int i = 0; i < gemischtesFeld.length; i++) {
            if (i < feld1.length) {
                gemischtesFeld[i] = feld1[i];
            } else {
                gemischtesFeld[i] = feld2[i - feld1.length];
            }
        }
        for (int i = 0; i < gemischtesFeld.length - 1; i++) {
            for (int j = i + 1; j < gemischtesFeld.length; j++) {
                int gross;
                if (gemischtesFeld[i] > gemischtesFeld[j]) {
                    gross = gemischtesFeld[i];
                    gemischtesFeld[i] = gemischtesFeld[j];
                    gemischtesFeld[j] = gross;
                }
            }
        }
        return gemischtesFeld;  
    } 
}
