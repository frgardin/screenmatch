import java.util.ArrayList;

import br.com.gardin.screenmatch.models.Film;
import br.com.gardin.screenmatch.models.Series;
import br.com.gardin.screenmatch.timecalculus.TimeCalc;

public class Principal {
    public static void main(String[] args) throws Exception {
        Film fisrtFilm = new Film("name1");
        Film secondFilm = new Film("name2");



        ArrayList<Film> films = new ArrayList<>();

        films.add(fisrtFilm);
        films.add(secondFilm);

        System.out.println(films.size());
        System.out.println(films.get(0));
        System.out.println(films);

    }
}
