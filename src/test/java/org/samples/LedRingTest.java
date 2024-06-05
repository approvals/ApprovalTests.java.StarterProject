package org.samples;

import org.approvaltests.Approvals;
import org.approvaltests.core.Options;
import org.approvaltests.reporters.AutoApproveReporter;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.utils.parseinput.ParseInput;
import org.junit.jupiter.api.Test;
import org.lambda.utils.Range;

public class LedRingTest {

    @Test
    @UseReporter(AutoApproveReporter.class)
    public void zeroPercentMeansRingIsOff() {
        var expected = """
            0 -> [-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-]
            5 -> [*,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-]
            10 -> [*,*,-,-,-,-,-,-,-,-,-,-,-,-,-,-]
            15 -> [*,*,-,-,-,-,-,-,-,-,-,-,-,-,-,-]
            20 -> [*,*,*,-,-,-,-,-,-,-,-,-,-,-,-,-]
            25 -> [*,*,*,*,-,-,-,-,-,-,-,-,-,-,-,-]
            30 -> [*,*,*,*,*,-,-,-,-,-,-,-,-,-,-,-]
            35 -> [*,*,*,*,*,*,-,-,-,-,-,-,-,-,-,-]
            40 -> [*,*,*,*,*,*,-,-,-,-,-,-,-,-,-,-]
            45 -> [*,*,*,*,*,*,*,-,-,-,-,-,-,-,-,-]
            50 -> [*,*,*,*,*,*,*,*,-,-,-,-,-,-,-,-]
            55 -> [*,*,*,*,*,*,*,*,*,-,-,-,-,-,-,-]
            60 -> [*,*,*,*,*,*,*,*,*,*,-,-,-,-,-,-]
            65 -> [*,*,*,*,*,*,*,*,*,*,-,-,-,-,-,-]
            70 -> [*,*,*,*,*,*,*,*,*,*,*,-,-,-,-,-]
            75 -> [*,*,*,*,*,*,*,*,*,*,*,*,-,-,-,-]
            80 -> [*,*,*,*,*,*,*,*,*,*,*,*,*,-,-,-]
            85 -> [*,*,*,*,*,*,*,*,*,*,*,*,*,*,-,-]
            90 -> [*,*,*,*,*,*,*,*,*,*,*,*,*,*,-,-]
            95 -> [*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,-]
            100 -> [*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*]
            """;
        var ring = new LedRing();
        var steps = Range.getAsQueryable(0, 20).select(i -> i * 5);
        Approvals.verifyAll(steps, s -> String.format("%s -> %s", s, ring.setLightLevel(s)), new Options().inline(expected));
    }
}