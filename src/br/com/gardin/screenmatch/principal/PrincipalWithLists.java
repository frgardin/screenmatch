package br.com.gardin.screenmatch.principal;

import java.util.ArrayList;

import br.com.gardin.screenmatch.models.Film;
import br.com.gardin.screenmatch.models.Series;
import br.com.gardin.screenmatch.models.Title;

public class PrincipalWithLists {
    public static void main(String[] args) {
        Film myFilm = new Film(null, 0);
        Film secondFilm = new Film(null, 0);
        Series mySeries = new Series(null, 0);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myFilm);
        list.add(mySeries);
        list.add(secondFilm);

        for (Title title: list){
            System.out.println(title.getName());
            if (title instanceof Film film){
                System.out.println("Classified" + film.getClassified());
            }
        }
    }
}
