package br.com.gardin.screenmatch.timecalculus;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Classifiable classifiable){
        if (classifiable.getClassified() >= 4){
            System.out.println("Favorites of the moment");
        } else if (classifiable.getClassified() >= 2){
            System.out.println("Some people like");
        } else {
            System.out.println("Follow to watch");
        }
    }
    
}
