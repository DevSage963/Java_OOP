package Variablen_und_Datentype;                // Aufgabe 2a)

public class Aufgabe_2 {
    public static void gehalt_rechner(){

        double gehalt = 13.50;
        int vollzeit_stunden_pro_woche = 40;
        int teilzeit_stunden_pro_woche = 20;
        System.out.println("Gehalt für Vollzeit-Arbeiter/in pro Woche ist: " + (vollzeit_stunden_pro_woche*gehalt) );
        System.out.println("Gehalt für Teilzeit-Arbeiter/in pro Woche ist: " + (teilzeit_stunden_pro_woche*gehalt) );
    }

    public static void mittelwert_regen(){      // Aufgabe 2b)

        double regen_mengen_oktobar = 126.4;
        double regen_mengen_septemper = 192.9;
        double regen_mengen_august = 241.1;

        double mittelwert = (regen_mengen_oktobar+regen_mengen_august+regen_mengen_septemper)/3;
        System.out.println("Mittelwert von Regenmengen für die Monate: /n August /n Septemper /n Oktobar ist: " + mittelwert);
    }

}