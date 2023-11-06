import java.util.List;
public class Muzical extends Film
{
    private List<Actor> lista;

    public Muzical(String titlu, String regizor, double buget, List<Actor> lista) {
        super(titlu, regizor, buget);
        this.lista = lista;
    }

    public Muzical(List<Actor> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Muzical{" +
                "lista=" + lista +
                '}';
    }

    public List<Actor> getLista() {
        return lista;
    }

    public void setLista(List<Actor> lista) {
        this.lista = lista;
    }

}
