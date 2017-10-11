package mobile.mcgrainsoft.com.fiftheditioncompanion.spells.contract;

public enum Duration {

    INSTANTANEOUS("Instantaneous"),
    UNTIL_DISPELLED("Until dispelled"),
    SEVEN_DAYS("7 days"),
    TWENTY_FOUR_HOURS("24 hours"),
    EIGHT_HOURS("8 Hours"),
    ONE_MINUTE("1 minute"),
    UP_TO_ONE_MINUTE("Up to 1 minute"),
    UP_TO_TEN_MINUTES("Up to 10 minutes"),
    UP_TO_ONE_HOUR("Up to 1 hour"),
    ONE_ROUND("1 round"),
    SPECIAL("Special"),
    INVALID("Invalid");

    private String value;

    Duration(String value) {
        this.value = value;
    }

    public static Duration getFromValue(String s) {
        for (Duration value : Duration.values()) {
            if (value.value.equalsIgnoreCase(s)) {
                return value;
            }
        }
        return INVALID;
    }

    public String getValue() {
        return value;
    }
}
