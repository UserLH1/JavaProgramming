class Documentar extends Film {
    private int numarEpisoade;
    private String descriereSubiect;

    public Documentar(String titlu, String regizor, double buget, int numarEpisoade, String descriereSubiect) {
        super(titlu, regizor, buget);
        this.numarEpisoade = numarEpisoade;
        this.descriereSubiect = descriereSubiect;
    }

    // Getteri și setteri pentru noile atribute
    public int getNumarEpisoade() {
        return numarEpisoade;
    }

    public void setNumarEpisoade(int numarEpisoade) {
        this.numarEpisoade = numarEpisoade;
    }

    public String getDescriereSubiect() {
        return descriereSubiect;
    }

    public void setDescriereSubiect(String descriereSubiect) {
        this.descriereSubiect = descriereSubiect;
    }

    // Suprascrierea metodei toString pentru a include detaliile specifice documentarului
    @Override
    public String toString() {
        return super.toString() + ", Număr de episoade: " + numarEpisoade + ", Descriere: " + descriereSubiect;
    }
}
