package org.samples;

import org.approvaltests.Approvals;
import org.approvaltests.core.Options;
import org.approvaltests.reporters.AutoApproveReporter;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.utils.parseinput.ParseInput;
import org.junit.jupiter.api.Test;

public class LedRingTest {

    @Test
    @UseReporter(AutoApproveReporter.class)
    public void zeroPercentMeansRingIsOff() {
        var expected = """
            [-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-]
            """;
        var ring = new LedRing();
        ring.setLightLevel(0);
        Approvals.verify(ring, new Options().inline(expected));
    }
}