/**
 *
 * @author Omar
 */
public class Stromrechnung {
    
    /**
     * Hier wird Jahresverbrauch von  Energie gerechnet, 
     * indem zwei Tarife genutzt wird.
     * Außerdem legt  der Energieversorger für die Jahresrechnung stets den
     * Tarif zugrunde, der zum kleineren Rechnungsbetrag führt.
     * Das Ergebnis wird auf dem Bildschirm gezeigt.
     *
     * @param args wird nicht verwendet
     */
    
    public static void main(String[] args) {
        
        /* Deklaration von Variabeln */        
        int jahresverbrauch;
        float grundpreis1;
        float grundpreis2; 
        float verbrauchspreis1; 
        float verbrauchspreis2;
        float rechnungsbetrag1; 
        float rechnungsbetrag2; 
        float rechnungsbetrag;
        
        /* Jahresverbrauch in kWh */
        jahresverbrauch = 3536; 
        /* Grundpreis des Tarifs 1 in Euro pro Monat */
        grundpreis1 = 5.75F; 
        /* Grundpreis des Tarifs 2 in Euro pro Monat */
        grundpreis2 = 9.85F; 
        /* Verbrauchspreis des Tarifs 1 in Cent pro kWh */
        verbrauchspreis1 = 23.49F; 
        /* Verbrauchspreis des Tarifs 1 in Cent pro kWh */
        verbrauchspreis2 = 22.10F;   
        
        /* Rechnung des Energieverbrauchs durch Tarif 1 in Euro */
        rechnungsbetrag1 = jahresverbrauch * verbrauchspreis1
                / 100 + grundpreis1 * 12;
        
        /* Rechnung des Energieverbrauchs durch Tarif 2 in Euro */
        rechnungsbetrag2 = jahresverbrauch * verbrauchspreis2
                / 100 + grundpreis2 * 12;
       
        /* Die Auswahl des kleineren Rechnungsbetrags */
        rechnungsbetrag = (rechnungsbetrag1 <= rechnungsbetrag2)
                ? rechnungsbetrag1 : rechnungsbetrag2;
        
        /* Hier wird der Rechnungsbetrag auf 2 Stellen gerundet. */
        rechnungsbetrag = (int) (100 * rechnungsbetrag + 0.5);
        rechnungsbetrag = (float) rechnungsbetrag / 100;
        
        /* 
         * Hier wird das System aufgefordert. 
         * das Ergebnis auf dem Bildschirm anzuzeigen 
         */
        System.out.println(rechnungsbetrag);
        
    }
}
