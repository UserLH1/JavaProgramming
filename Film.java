public class Film
{
    private String titlu;
    private String regizor;
    private double buget;

    public Film(String titlu, String regizor, double buget) {
        this.titlu = titlu;
        this.regizor = regizor;
        this.buget = buget;
    }
    public Film() {
        titlu="X-Men";
        regizor = "Arnold";
        buget = 180000;
    }

    public double getBuget() {
        return buget;
    }
    public void setBuget(double buget) {
        this.buget = buget;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getRegizor() {
        return regizor;
    }

    public void setRegizor(String regizor) {
        this.regizor = regizor;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titlu='" + titlu + '\'' +
                ", regizor='" + regizor + '\'' +
                ", buget=" + buget +
                '}';
    }
}
