import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.gardin.screenmatch.models.Film;
import br.com.gardin.screenmatch.models.Series;
import br.com.gardin.screenmatch.timecalculus.TimeCalc;

public class Principal {
    public static void main(String[] args) throws Exception {
        Film fisrtFilm = new Film("name1", 1);
        Film secondFilm = new Film("name2", 2);



        ArrayList<Film> films = new ArrayList<>();

        films.add(secondFilm);
        films.add(fisrtFilm);

        System.out.println(films.size());
        System.out.println(films.get(0));
        System.out.println(films);
        //old way to sort
        // Collections.sort(films);

        //new way

        films.sort(Comparator.comparing(Film::getName));
        System.out.println(films);
    }
}
