package br.com.gardin.screenmatch.timecalculus;

import br.com.gardin.screenmatch.models.Title;

public class TimeCalc {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title t){
        this.totalTime += t.getDurationInMinutes();
    }
    
}
