package br.com.gardin.screenmatch.models;

import br.com.gardin.screenmatch.timecalculus.Classifiable;

public class Episode implements Classifiable {
    private int id;
    private String name;
    private Series series;
    private int totalViews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassified() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }

    

}
