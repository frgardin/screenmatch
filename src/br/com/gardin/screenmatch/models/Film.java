package br.com.gardin.screenmatch.models;

public class Film extends Title {
    private String director;

    public Film(String name) {
        this.setName(name);
    }

    public String getDiretor() {
        return director;
    }

    public void setDiretor(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Filme: " + super.getName();
    }

}
