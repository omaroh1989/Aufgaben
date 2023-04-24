/**
 *
 * @author Omar
 */
public class Reiskoerner {

    /**
     * Die Parabel vom Schachspiel und den Reiskörnern. 
     * Die Anzahl der Reiskörner berechnen, die jeweils auf den ersten acht 
     * Feldern des Schachbretts liegen. Außerdem soll die Anzahl der Reiskörner
     * auf den acht Feldern insgesamt berechnet werden
     * 
     * @param args wird nicht verwendet
     *            
     */
    public static void main(String[] args) {
        
        /*
         * Deklaration der Variablen
         */
        int anzahlReiskoerner; 
        int prozent; 
        int gesamt = 0;
        /* 
         * Anfangswert der Reiskoerner 
         */
        anzahlReiskoerner = 1;        
        /* 
         * Prozent der Erhoehung der Anzahlreiskoerner 
         */
        prozent = 100; 
        
        // 1
        /* 
         * Hier wird das System aufgefordert, das Ergebnis auf dem Bildschirm 
         * anzuzeigen 
         */
        System.out.println(anzahlReiskoerner);         
        /* 
         * Hier wied der Gesamtwert gerechnet, indem der Anfangswert der
         * Anzahlreiskoerner benutzt wird, und erster Gesamtwert = 0 
         */
        gesamt = gesamt + anzahlReiskoerner; 
        
        // 2
        /* Hier wird neuer Wert der Anzahlreiskoerner durch den letzten Wert
         * der Anzahlreiskoerner + definiertes Prozent der letzten Wert der  
         * Anzahlreiskoerner
         */
        anzahlReiskoerner = anzahlReiskoerner + anzahlReiskoerner * prozent
                / 100;       
        /* Hier wird das System aufgefordert, das Ergebnis auf dem 
         * Bildschirm anzuzeigen 
         */
        System.out.println(anzahlReiskoerner);        
        /* Hier wird ein neuer Gesamtwert gerechnet, indem die neue 
         * Anzahlreiskoerner zu letztem Gesamtwert addiert wird 
         */
        gesamt = gesamt + anzahlReiskoerner;

        // 3
        /* 
         *Gleiche Rechnung 
         */
        anzahlReiskoerner = anzahlReiskoerner + anzahlReiskoerner * prozent 
                / 100;    
        /* 
         * Hier wird das System aufgefordert, das Ergebnis auf dem 
         * Bildschirm anzuzeigen 
         */
        System.out.println(anzahlReiskoerner);         
        /*
         * Gleiche Rechnung 
         */
        gesamt = gesamt + anzahlReiskoerner; 

        // 4
        /* 
         * Gleiche Rechnung 
         */
        anzahlReiskoerner = anzahlReiskoerner + anzahlReiskoerner * prozent 
                / 100;       
        /* 
         * Hier wird das System aufgefordert, das Ergebnis auf dem 
         * Bildschirm anzuzeigen
         */
        System.out.println(anzahlReiskoerner);       
        /* 
         * Gleiche Rechnung 
         */
        gesamt = gesamt + anzahlReiskoerner;

        // 5
        /* 
         * Gleiche Rechnung 
         */
        anzahlReiskoerner = anzahlReiskoerner + anzahlReiskoerner * prozent 
                / 100;       
        /* 
         * Hier wird das System aufgefordert, das Ergebnis auf dem 
         * Bildschirm anzuzeigen 
         */
        System.out.println(anzahlReiskoerner);       
        /* 
         * Gleiche Rechnung 
         */
        gesamt = gesamt + anzahlReiskoerner;

        // 6
        /* 
         * Gleiche Rechnung 
         */
        anzahlReiskoerner = anzahlReiskoerner + anzahlReiskoerner * prozent 
                / 100;       
        /* 
         * Hier wird das System aufgefordert, das Ergebnis auf dem 
         * Bildschirm anzuzeigen 
         */
        System.out.println(anzahlReiskoerner);       
        /* 
         * Gleiche Rechnung 
         */
        gesamt = gesamt + anzahlReiskoerner;

        // 7
        /* 
         * Gleiche Rechnung 
         */
        anzahlReiskoerner = anzahlReiskoerner + anzahlReiskoerner * prozent 
                / 100;       
        /* 
         * Hier wird das System aufgefordert, das Ergebnis auf dem 
         * Bildschirm anzuzeigen 
         */
        System.out.println(anzahlReiskoerner);        
        /* 
         * Gleiche Rechnung 
         */
        gesamt = gesamt + anzahlReiskoerner;

        // 8
        /* 
         * Gleiche Rechnung 
         */
        anzahlReiskoerner = anzahlReiskoerner + anzahlReiskoerner * prozent
                / 100;        
        /* 
         * Hier wird das System aufgefordert, das Ergebnis auf dem 
         * Bildschirm anzuzeigen 
         */
        System.out.println(anzahlReiskoerner);        
        /* 
         * Gleiche Rechnung 
         */
        gesamt = gesamt + anzahlReiskoerner;
        
        // Gesamtwert
        /* 
         * Hier wird das System aufgefordert, Gesamtwert der ersten acht Felder
         * auf dem Bildschirm anzuzeigen
         */
        System.out.println(gesamt);
        
    }
}