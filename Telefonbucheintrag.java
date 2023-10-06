public class Telefonbucheintrag {
    private String vorname;
    private String nachname;
    private String telefonnummer;

    public Telefonbucheintrag(String vorname, String nachname, String telefonnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + ": " + telefonnummer;
    }
}
