/**
 *
 * @author Omar
 */
public class SelektionSortieren {
    
    public static void main(String[] args) {
        
        int[] feld = {5, 8, 6, 3, 9, 4, 1, 2, 7};
        sortiereDurchSelektion(feld);
        int i;
        for (i = 0; i < feld.length - 1; i++) {
            System.out.print(feld[i] + " | ");
        }
        System.out.println(feld[i]);
    }
    
    public static void sortiereDurchSelektion(int[] feld) {
        
        int kleinsterWert = 0;
        int position = 0;
        int zwischenspeicher;
        
        for (int i = 0; i < feld.length - 1; i++) {
            kleinsterWert = feld[i];
            for (int j = i + 1; j < feld.length; j++) {
                if (feld[j] < kleinsterWert) {
                    position = j;
                }
                kleinsterWert = feld[j] < kleinsterWert
                        ? feld[j] : kleinsterWert;
                
            }
            System.out.println("Position : " + position + " *** Kleinster Wert " + kleinsterWert);
            zwischenspeicher = feld[i];
            feld[i] = feld[position];
            feld[position] = zwischenspeicher;
            int k;
        for (k = 0; k < feld.length - 1; k++) {
            System.out.print(feld[k] + " | ");
        }
        System.out.println(feld[k]);
        }
    }
}
