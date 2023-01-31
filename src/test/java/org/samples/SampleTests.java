package org.samples;


import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTests {
    @Test
    public void roll2Then3() {
        var score = Bowling.score(2, 3);
        assertEquals(5, score.score);
    }

    @Test
    public void roll4Then3() {
        var score = Bowling.score(4, 3);
        assertEquals(7, score.score);
    }

    @Test
    public void roll1Then1() {
        var score = Bowling.score(1, 1);
        assertEquals(2, score.score);
    }
    @Test
    public void roll3Then4() {
        var score = Bowling.score(3, 4);
        assertEquals(7, score.score);
        assertEquals(7, score.frameScore.get(0));
    }
    @Test
    public void frameScore23() {
        var score = Bowling.score(2, 3);
        assertEquals(5, score.frameScore.get(0));
    }
    @Test
    public void frameScore81() {
        var score = Bowling.score(8, 1);
        assertEquals(9, score.frameScore.get(0));
    }
    @Test
    public void twoFrames() {
        var score = Bowling.score(4,4,3,2);
        assertEquals(13, score.score);
    }
    @Test
    public void twoFrames9001() {
        var score = Bowling.score(9,0,0,1);
        assertEquals(10, score.score);
        assertEquals(9, score.frameScore.get(0));
        assertEquals(1, score.frameScore.get(1));

    }
    @Test
    public void twoFrames4321() {
        var score = Bowling.score(4,3,2,1);
        assertEquals(3, score.frameScore.get(1));

    }
}
