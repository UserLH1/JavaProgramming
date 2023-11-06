public class Actor {
    private String nume;
    private String abilitatiDans;
    private String abilitatiCantat;

    public Actor(String nume, String abilitatiDans, String abilitatiCantat) {
        this.nume = nume;
        this.abilitatiDans = abilitatiDans;
        this.abilitatiCantat = abilitatiCantat;
    }

    // Getteri și setteri pentru atribute
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAbilitatiDans() {
        return abilitatiDans;
    }

    public void setAbilitatiDans(String abilitatiDans) {
        this.abilitatiDans = abilitatiDans;
    }

    public String getAbilitatiCantat() {
        return abilitatiCantat;
    }

    public void setAbilitatiCantat(String abilitatiCantat) {
        this.abilitatiCantat = abilitatiCantat;
    }

    // Metoda toString pentru a afișa detaliile despre actor
    @Override
    public String toString() {
        return "Actor: " + nume + ", Abilități dans: " + abilitatiDans + ", Abilități cântat: " + abilitatiCantat;
    }
}