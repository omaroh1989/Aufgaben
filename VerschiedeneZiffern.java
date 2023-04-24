/**
 *
 * @author Omar
 */
public class VerschiedeneZiffern {
    
    /**
     * Hier wird das System aufgefordert, das Ergebnis auf dem Bildschirm
     * anzuzeigen.
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        System.out.println(anzahlZiffern(1234));
    }
    
    /**
     * Diese Methode gibt wieder zurueck, wieviele verschiedene Ziffern 
     * darin vorkommen.
     * @param zahl Parameter im Typ int
     * @return Das Ergebnis
     */                                            
    
    public static int anzahlZiffern(int zahl) {
        
        return filter(zahl, zahl % 10) == 0 ? 1 
                : anzahlZiffern(filter(zahl, zahl % 10)) + 1;
        
        /* Andere Methode
        return zahl < 10 ? 1 : zahl / 10 % 10 == zahl % 10 
                ? anzahlZiffern(zahl / 10)
                : anzahlZiffern(filter(zahl, zahl % 10)) + 1;
        */
        
        /* Andere Methode, indem die Methode istEnthaelt verwendet wurde 
        return zahl < 10 ? 1 
                : istEnthaelt(zahl / 10, zahl % 10) ? anzahlZiffern(zahl / 10)
                : anzahlZiffern(zahl / 10) + 1;
        */ 
    }
    
    /**
     * In dieser Methode wird der zweite Parameter in dem ersten Parameter
     * gefiltert, wenn der erste den zweiten enthält.
     * @param wert Erster Parameter, der gefiltert werden muss
     * @param zifferzufiltern Zweiter Parameter
     * @return Das Ergebnis
     */
    
    public static int filter(int wert, int zifferzufiltern) {
        
        return wert < 10 ? wert == zifferzufiltern ? 0 : wert 
                        : wert % 10 == zifferzufiltern 
                        ? filter(wert / 10, zifferzufiltern) 
                        : 10 * filter(wert / 10, zifferzufiltern) + wert % 10;
    } 
    
    /*
    public static boolean istEnthaelt(long zahl, long ziffer) {
        
        return zahl % 10 == ziffer ? true : zahl < 10 ? false 
                        : istEnthaelt(zahl / 10, ziffer);   
    }
    */
}
