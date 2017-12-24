package info.nightscout.androidaps;

/**
 * Created by mike on 07.06.2016.
 */
public class Constants {
    public static final String MGDL = "mg/dl"; // This is Nightscout's representation
    public static final String MMOL = "mmol";

    public static final double MMOLL_TO_MGDL = 18; // 18.0182;
    public static final double MGDL_TO_MMOLL = 1 / MMOLL_TO_MGDL;

    public static final double defaultDIA = 3d;

    public static final double basalAbsoluteOnlyForCheckLimit = 10101010d;
    public static final Integer basalPercentOnlyForCheckLimit = 10101010;
    public static final double bolusOnlyForCheckLimit = 10101010d;
    public static final Integer carbsOnlyForCheckLimit = 10101010;

    public static final Integer notificationID = 556677;

    public static final int hoursToKeepInDatabase = 72;
    public static final int daysToKeepHistoryInDatabase = 30;

    public static final long keepAliveMsecs = 5 * 60 * 1000L;

    // SMS COMMUNICATOR
    public static final long remoteBolusMinDistance = 15 * 60 * 1000L;

    // Circadian Percentage Profile
    public static final int CPP_MIN_PERCENTAGE = 50;
    public static final int CPP_MAX_PERCENTAGE = 200;
    public static final int CPP_MIN_TIMESHIFT = -6;
    public static final int CPP_MAX_TIMESHIFT = 23;

    // Very Hard Limits Ranges
    // First value is the Lowest and second value is the Highest a Limit can define
    public static final int[] VERY_HARD_LIMIT_MIN_BG = {72,180};
    public static final int[] VERY_HARD_LIMIT_MAX_BG = {90,270};
    public static final int[] VERY_HARD_LIMIT_TARGET_BG = {80,200};

    // Very Hard Limits Ranges for Temp Targets
    public static final int[] VERY_HARD_LIMIT_TEMP_MIN_BG = {72,180};
    public static final int[] VERY_HARD_LIMIT_TEMP_MAX_BG = {72,270};
    public static final int[] VERY_HARD_LIMIT_TEMP_TARGET_BG = {72,200};

    //DanaR
    public static final double dailyLimitWarning = 0.95d;

    //NSClientInternal
    public static final int MAX_LOG_LINES = 100;

    //Screen: Threshold for width/height to go into small width/height layout
    public static final int SMALL_WIDTH = 320;
    public static final int SMALL_HEIGHT = 480;

    //Autosens
    public static final double DEVIATION_TO_BE_EQUAL = 2.0;

    // Pump
    public static final int PUMP_MAX_CONNECTION_TIME_IN_SECONDS = 120 - 1;
    public static final int MIN_WATCHDOG_INTERVAL_IN_SECONDS = 12 * 60;
}
