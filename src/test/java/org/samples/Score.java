package org.samples;

import java.util.ArrayList;
import java.util.List;

public class Score {
    public int score;
    public List<Integer> frameScore= new ArrayList<>();

    public Score() {}
    public void add(int score){
        this.score += score;
        frameScore.add(Math.min(score,9));
    }
}
