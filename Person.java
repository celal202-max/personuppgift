public class Person {

    private String fodelsedatum;
    private String namn;
    private String GatuAdress;
    private String postNummer;
    private String postort;

    public Person(String fodelsedatum) {
        this.fodelsedatum = fodelsedatum;
    }

    public String getFodelsedatum() {
        return fodelsedatum;
    }

    public void setFodelsedatum(String fodelsedatum) {
        this.fodelsedatum = fodelsedatum;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getGatuAdress() {
        return GatuAdress;
    }

    public void setGatuAdress(String GatuAdress) {
        this.GatuAdress = GatuAdress;
    }

    public String getPostnummer() {
        return postNummer;
    }

    public void setPostnummer(String postnummer) {
        this.postNummer = postnummer;
    }

    public String getPostort() {
        return postort;
    }

    public void setPostort(String postort) {
        this.postort = postort;
    }
}