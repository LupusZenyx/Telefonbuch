import java.util.ArrayList;
import java.util.List;

public class Telefonbuch {
    private List<Telefonbucheintrag> eintraege;

    public Telefonbuch() {
        eintraege = new ArrayList<>();
    }

    public void eintragHinzufuegen(Telefonbucheintrag eintrag) {
        eintraege.add(eintrag);
    }

    public Telefonbucheintrag eintragSuchenNachVorname(String vorname) {
        for (Telefonbucheintrag eintrag : eintraege) {
            if (eintrag.getVorname().equalsIgnoreCase(vorname)) {
                return eintrag;
            }
        }
        return null; 
    }

    public boolean eintragLoeschenNachTelefonnummer(String telefonnummer) {
        for (Telefonbucheintrag eintrag : eintraege) {
            if (eintrag.getTelefonnummer().equals(telefonnummer)) {
                eintraege.remove(eintrag);
                return true; 
            }
        }
        return false; 
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Telefonbucheintrag eintrag : eintraege) {
            builder.append(eintrag.toString()).append("\n");
        }
        return builder.toString();
    }
}
