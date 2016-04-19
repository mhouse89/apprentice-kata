import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBabySitter {

    private BabySitter babySitter;

    private int startTime;
    private int bedTime;
    private int endTime;
    private int expectedCharge;
    private int nightlyCharge;

    @Before
    public void setup() {
        babySitter = new BabySitter();
    }

    @Test
    public void babySitterExists() {
        assertNotNull(babySitter);
    }

    @Test
    public void shiftMustStartAtFivePMOrLater() {
        Boolean validTime = babySitter.isValidStartTime(17);

        assertTrue(validTime);
    }

    @Test
    public void babySitterCanNotStartBeforeFivePM() {
        Boolean isValidTime = babySitter.isValidStartTime(16);

        assertFalse(isValidTime);
    }

    @Test
    public void babySitterCanNotStayPast4AM() {
        Boolean isValidTime = babySitter.isValidateEndTime(5);

        assertFalse(isValidTime);
    }

    @Test
    public void babySitterStayUpUntil4AM() {
        Boolean isValidTime = babySitter.isValidateEndTime(4);

        assertTrue(isValidTime);
    }

    @Test
    public void babySitterGetsPaid12DollarsAnHourFromStartToBedTime() {
        startTime = 20;
        bedTime = 22;
        endTime = 2;
        expectedCharge = 72;

        nightlyCharge = babySitter.calculateNightlyCharge(startTime, bedTime, endTime);

        assertEquals(expectedCharge, nightlyCharge);
    }

    @Test
    public void babySitterGetsPaid8DollarsAnHourFromBedTimeToMidnight() {
        startTime = 20;
        bedTime = 22;
        endTime = 2;
        expectedCharge = 72;

        nightlyCharge = babySitter.calculateNightlyCharge(startTime, bedTime, endTime);

        assertEquals(expectedCharge, nightlyCharge);
    }

    @Test
    public void babySitterGetsPaid16DollarsAnHourFromMidnightToEndOfShift() {
        startTime = 20;
        bedTime = 22;
        endTime = 2;
        expectedCharge = 72;

        nightlyCharge = babySitter.calculateNightlyCharge(startTime, bedTime, endTime);

        assertEquals(expectedCharge, nightlyCharge);
    }



}
