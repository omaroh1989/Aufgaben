/**
 *
 * @author Omar
 */

public class Umrechnungen {
    
    /**
     * Hier geht es darum, Ausdrücke zu bilden, die bestimmte Berechnungen
     * durchführen.
     * Umrechnung einer Temperatur von der Einheit Grad Fahrenheit in die
     * Einheit Grad Celsius,
     * Der Wechselkurs des Schweizer Franken zum Euro und
     * Realisierung vom Ausdruck, der zu einer Anzahl Minuten die vollen
     * Stunden und verbleibenden Minuten im Format hmm liefert.
     * 
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) { 
        /*
         * Aufgabe 1 :
         * Umrechnung einer Temperatur von der Einheit Grad Fahrenheit in die
         * Einheit Grad Celsius
         * Folgende Formel ist genutzt worden :
         * Celsius = (5 * (fahrenheit - 32))/ 9        
         */   
       
        System.out.println(5 * (40 - 32) / 9);
        System.out.println(5 * (41 - 32) / 9);
    
    
        /*
         * Aufgabe 2 :
         * Der Wechselkurs des Schweizer Franken zum Euro
         * Euro betrug vor einigen Tagen : 1,1401 CHF = 1 EUR
         * Folgende Formel ist genutzt worden : e = s / 1.1401
         * Mit : e = Euro und s = CHF-Betrag
         */
                
        System.out.println(100 * 10000 / 11401);  
        System.out.println(10000 * 10000 / 11401);
        
        /*
         * Aufgabe 3 : 
         * Realisierung vom Ausdruck, der zu einer Anzahl Minuten die vollen
         * Stunden und verbleibenden Minuten im Format hmm liefert.
         * Folgende Formel ist genutzt worden :
         * hmm = ( ( minuten / 60 ) * 100 ) + minuten % 60
         */   
    
        System.out.println(5 / 60  * 100  + 5 % 60);
        System.out.println(59 / 60 * 100 + 59 % 60);
        System.out.println(60 / 60 * 100 + 60 % 60);
        System.out.println(61 / 60 * 100 + 61 % 60);
        System.out.println(825 / 60 * 100 + 825 % 60);

    }
}
