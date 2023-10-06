import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Telefonbuch telefonbuch = new Telefonbuch();

        while (true) {
            System.out.println("");
            System.out.println("Telefonbuch-Verwaltung");
            System.out.println("┌ 1. Eintrag hinzufügen");
            System.out.println("├ 2. Eintrag suchen nach Vorname");
            System.out.println("├ 3. Eintrag löschen nach Telefonnummer");
            System.out.println("├ 4. Telefonbuch anzeigen");
            System.out.println("└ 5. Beenden");
            System.out.println("");
            System.out.println(">> Bitte wählen Sie eine Option:");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Vorname: ");
                    String vorname = scanner.nextLine();
                    System.out.print("Nachname: ");
                    String nachname = scanner.nextLine();
                    System.out.print("Telefonnummer: ");
                    String telefonnummer = scanner.nextLine();
                    telefonbuch.eintragHinzufuegen(new Telefonbucheintrag(vorname, nachname, telefonnummer));
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Suche nach Vorname: ");
                    String gesuchterVorname = scanner.nextLine();
                    Telefonbucheintrag gefunden = telefonbuch.eintragSuchenNachVorname(gesuchterVorname);
                    if (gefunden != null) {
                        System.out.println("");
                        System.out.println("Gefunden: " + gefunden);
                    } else {
                        System.out.println("");
                        System.out.println("Kein Eintrag gefunden.");
                    }
                    break;
                case 3:
                    System.out.print("Telefonnummer zum Löschen: ");
                    String zuLoeschendeTelefonnummer = scanner.nextLine();
                    boolean geloescht = telefonbuch.eintragLoeschenNachTelefonnummer(zuLoeschendeTelefonnummer);
                    if (geloescht) {
                        System.out.println("");
                        System.out.println("Eintrag gelöscht.");
                    } else {
                        System.out.println("");
                        System.out.println("Eintrag nicht gefunden.");
                    }
                    break;
                    case 4:
                    System.out.println("");
                    System.out.println("====================================");
                    System.out.println("");
                    System.out.println("Telefonbuch:");
                    System.out.println(telefonbuch);
                    System.out.println("====================================");
                    break;
                    case 5:
                    System.out.println("");
                    System.out.println("Programm beendet.");
                    scanner.close();
                    System.exit(0);
                    break;
                    default:
                    System.out.println("");
                    System.out.println("Ungültige Option.");
                    break;
            }
        }
    }
    
}
