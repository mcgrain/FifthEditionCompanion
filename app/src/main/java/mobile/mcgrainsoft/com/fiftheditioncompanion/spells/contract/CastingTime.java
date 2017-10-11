package mobile.mcgrainsoft.com.fiftheditioncompanion.spells.contract;

public enum CastingTime {

    ONE_ACTION("1 action"),
    ONE_BONUS_ACTION("1 bonus action"),
    ONE_REACTION("1 reaction"),
    ONE_MINUTE("1 minute"),
    TEN_MINUTES("10 minutes"),
    ONE_HOUR("1 hour"),
    EIGHT_HOURS("8 hours"),
    TWELVE_HOURS("12 hours"),
    TWENTY_FOUR_HOURS("24 hours"),
    INVALID("Invalid");

    private String value;

    CastingTime(String value) {
        this.value = value;
    }

    public static CastingTime fromValue(String s) {
        for (CastingTime castingTime : CastingTime.values()) {
            if (castingTime.value.equalsIgnoreCase(s)) {
                return castingTime;
            }
        }
        return INVALID;
    }

    public String getValue() {
        return value;
    }
}
