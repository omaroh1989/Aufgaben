/**
 *
 * @author Omar
 */
public class Texttrenner {
    
    /**
     * Zeichenkette.
     */
    private String zeichenKette;
    
    /**
     * Trennzeichen.
     */
    private String trennZeichen;
    
    /**
     * Konstruktor zur Erzeugung eines Texttrenner-Objekts.
     * @param zeichenKette erster Parameter
     * @param trennZeichen zweiter Parameter
     */
    
    public Texttrenner(String zeichenKette, String trennZeichen) {
        
        this.zeichenKette = zeichenKette;
        this.trennZeichen = trennZeichen;
    }
    
    /**
     * Diese Instanzmethode testet, ob noch mindestens ein Wort gibt. Wenn ja,
     * liefert true, sonst false.
     * @return Das Ergebnis
     */
                                                    
    public boolean hatNochWoerter() {
        
        boolean existiert;
        boolean hatNochWoerter = false;
        
        for (int i = 0; i < zeichenKette.length() && !hatNochWoerter; i++) {
            existiert = false;
            for (int j = 0; j < trennZeichen.length(); j++) {
                if (zeichenKette.charAt(i) == trennZeichen.charAt(j)) {
                    existiert = true;   
                }
            }
            if (!existiert) {
                hatNochWoerter = true;
            }
        }
        return hatNochWoerter;
    }
    
    /**
     * Diese Instanzmethode liefert das nächste Wort aus der zugrunde liegenden 
     * Zeichenkette. Falls die Zeichenkette kein Wort mehr enthält, liefert 
     * die Methode null.
     * @return Das Ergebnis
     */
    
    public String gibNaechstesWort() {
        
        String wort = null;
        boolean trennZeichenExistiert = true;
        
        for (int i = 0; i < zeichenKette.length() && hatNochWoerter() 
                                               && trennZeichenExistiert; i++) {
            trennZeichenExistiert = false;
            for (int j = 0; j < trennZeichen.length(); j++) {
                if (zeichenKette.charAt(i) == trennZeichen.charAt(j) 
                                           && !trennZeichenExistiert) {
                    trennZeichenExistiert = true;
                }
            }
            if (!trennZeichenExistiert) {
                zeichenKette = zeichenKette.substring(i, zeichenKette.length());
            }
        }
        
        for (int i = 0; i < zeichenKette.length() 
                                            && !trennZeichenExistiert; i++) {
            for (int j = 0; j < trennZeichen.length(); j++) {
                if (zeichenKette.charAt(i) == trennZeichen.charAt(j) 
                                           && !trennZeichenExistiert) {
                    trennZeichenExistiert = true;
                }               
            }
            if (trennZeichenExistiert && hatNochWoerter()) {
                wort = zeichenKette.substring(0, i);
                zeichenKette = zeichenKette.substring(i);
            }
            
            if (i == zeichenKette.length() - 1 && !trennZeichenExistiert) {
                wort = zeichenKette;
                zeichenKette = "";
            }
        }
        return wort;
    }
}
