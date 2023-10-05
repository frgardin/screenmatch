package br.com.gardin.screenmatch.models;

public class Title implements Comparable<Title>{
    private String name;
    private int launchYear;
    private boolean isIncluded;
    private int durationInMinutes;

    public Title(String name, int launchYear) {
        this.name = name;
        this.launchYear = launchYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    private double gradesSum;
    private int gradesTotal;

    public String getName() {
        return name;
    }

    public int getGradesTotal() {
        return gradesTotal;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public boolean isIncluded() {
        return isIncluded;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncluded(boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    void showDataSheet() {
        System.out.println("Film Name: " + name);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("The duration in minutes is: " + durationInMinutes);
    }

    void evaluate(double grade) {
        gradesSum += grade;
        gradesTotal++;
    }

    double getAverage() {
        return gradesSum / gradesTotal;
    }

    @Override
    public int compareTo(Title title) {
        return this.getName().compareTo(title.getName());
    }

}
