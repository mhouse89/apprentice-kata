
public class BabySitter {

    private static final int UPPER_END_TIME_THRESHOLD = 4;
    private static final int LOWER_START_TIME_THRESHOLD = 17;
    private static final int MIDNIGHT = 24;

    private static final int START_TO_BED = 12;
    private static final int BED_TO_MIDNIGHT = 8;
    private static final int MIDNIGHT_TO_END = 16;


    public int calculateNightlyCharge(int startTime, int bedTime, int endTime) {

        int nightlyCharge = 0;

        if (timeIsValid(startTime, endTime)) {

            nightlyCharge += startToBedtime(startTime, bedTime);
            nightlyCharge += bedToMidnight(bedTime);
            nightlyCharge += midnightToEnd(endTime);

        }

        return nightlyCharge;
    }

    private int midnightToEnd(int endTime) {
        return (endTime) * MIDNIGHT_TO_END;
    }

    private int bedToMidnight(int bedTime) {
        return (MIDNIGHT - bedTime) * BED_TO_MIDNIGHT;
    }

    private int startToBedtime(int startTime, int bedTime) {
        return (bedTime - startTime) * START_TO_BED;
    }

    private boolean timeIsValid(int startTime, int endTime) {
        return isValidStartTime(startTime) && isValidateEndTime(endTime);
    }

    public Boolean isValidStartTime(int startTime) {

        return startTime >= LOWER_START_TIME_THRESHOLD;
    }

    public Boolean isValidateEndTime(int endTime) {
        return endTime <= UPPER_END_TIME_THRESHOLD;
    }
}
