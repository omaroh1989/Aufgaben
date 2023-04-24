/**
 *
 * @author Omar
 */
public class Zahlenspielerei {
    
    /**
     * In dieser Methode wird das System aufgefordert, das Ergebnis auf dem 
     * Bildschirm anzuzeigen.
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
          
        System.out.println("*****************");
        System.out.println(verkette(521, 12));
        System.out.println("*****************");
        System.out.println(enthaelt(4711, 1));
        System.out.println("*****************");
        System.out.println(gibAnzahl(4711, 1));
        System.out.println("*****************");
        System.out.println(filter(4175, 4));
    }
    
    /**
     * In dieser Methode wird zweit  Parameter verkettet.
     * @param zahl1 erster Parameter
     * @param zahl2 zweiter Parameter
     * @return Das Ergebnis des Ausdrucks
     */
    
    public static long verkette(long zahl1, long zahl2) {
       
        return zahl2 == 0 ? zahl1 * 10 : verkette2(zahl1, zahl2);
    }
    
    /**
     * Diese Methode wird aufgerufen, wenn die Voraussetzung in der oben 
     * genannten Methode nicht erfüllt.
     * @param zahl1 erster Parameter
     * @param zahl2 zweiter Parameter
     * @return  Das Ergebnis des Ausdrucks
     */
    public static long verkette2(long zahl1, long zahl2) {
        
        return zahl2 > 0 ? verkette2(zahl1 * 10, zahl2 / 10) 
                                                 - zahl2 / 10 + zahl2 : zahl1;
    }
    
    /**
     * In dieser Methode wird True geliefert, wenn der erster Parameter den
     * zweiten enthält, sonst False.
     * @param zahl1 erster Parameter
     * @param zahl2 zweiter Parameter
     * @return Das Ergebnis des Ausdrucks
     */
    
    public static boolean enthaelt(long zahl1, int zahl2) {
        
        return (zahl1 % 10 == zahl2) ? true : zahl1 < 10 ? false 
                                 : enthaelt(zahl1 / 10, zahl2);   
    }
    
    /**
     * Diese Methode gibt an, wie häufig der zweite Parameter in dem ersten 
     * Parameter vorkommt.
     * @param zahl1 erster Parameter
     * @param zahl2 zweiter Parameter
     * @return Das Ergebnis des Ausdrucks
     */
    
    public static int gibAnzahl(long zahl1, int zahl2) {
       
        return zahl1 < 10 ? zahl1 == zahl2 ? 1 : 0 
                : zahl1 % 10 == zahl2 ? gibAnzahl(zahl1 / 10, zahl2) + 1 
                : gibAnzahl(zahl1 / 10, zahl2);
    }
   
   /**
    * In dieser Methode wird der zweite Parameter in dem ersten Parameter 
    * gefiltert, wenn der erste den zweiten enthält.
    * @param zahl1 erster Parameter
    * @param zahl2 zweiter Parameter
    * @return Das Ergebnis des Ausdrucks
    */
    
    public static long filter(long zahl1, int zahl2) {
        
        return zahl1 < 10 ? zahl1 == zahl2 ? 0 : zahl1 : zahl1 % 10 == zahl2 
                                ? filter(zahl1 / 10, zahl2) 
                                : 10 * filter(zahl1 / 10, zahl2) + zahl1 % 10;
    }
}