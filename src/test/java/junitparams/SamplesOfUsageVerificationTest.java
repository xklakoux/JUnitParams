package junitparams;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import junitparams.usage.SamplesOfUsageTest;

public class SamplesOfUsageVerificationTest {

    @Test
    public void verifyNoTestsIgnoredInSamplesOfUsageTest() {
        Result result = JUnitCore.runClasses(SamplesOfUsageTest.class);

        assertEquals(0, result.getFailureCount());
        // TODO(JUnit4.10) - 2 tests are ignored because they do not work when run on the device.
        assertEquals(2, result.getIgnoreCount());
    }

}
