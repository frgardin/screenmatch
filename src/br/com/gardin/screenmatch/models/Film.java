package br.com.gardin.screenmatch.models;

import br.com.gardin.screenmatch.timecalculus.Classifiable;

public class Film extends Title implements Classifiable{
    private String director;

    public Film(String name, int launchYear) {
        super(name, launchYear);
    }

    public String getDiretor() {
        return director;
    }

    public void setDiretor(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film: " + super.getName();
    }

    @Override
    public int getClassified() {
        return 5;
    }


    
}
