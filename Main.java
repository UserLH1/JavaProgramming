import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> listaDeFilme = new ArrayList<Film>();

        listaDeFilme.add(new Film("Titlu Film 1", "Regizor 1", 1000000));
        listaDeFilme.add(new Documentar("Titlu Documentar", "Regizor Documentar", 500000, 5, "Descriere subiect documentar"));
        List<Actor> listaDeActori = new ArrayList<Actor>();
        listaDeActori.add(new Actor("Actor 1", "abilitati dans", "abilitati cantat"));
        listaDeActori.add(new Actor("Actor 2", "abilitati dans", "abilitati cantat"));
        listaDeFilme.add(new Muzical("Titlu Muzical", "Regizor Muzical", 1500000, listaDeActori));

        for (Film film : listaDeFilme) {
            System.out.println(film);
        }
    }
}