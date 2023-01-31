package org.samples;

import org.lambda.query.Query;
import org.lambda.query.Queryable;

public class Bowling {
    public static Score score(Integer... rolls) {
        var s = new Score( );
        for (int i = 0;  i < rolls.length; i+=2) {
            s.add(rolls[i]+rolls[i+1]);
        }
        return s;
    }
}
