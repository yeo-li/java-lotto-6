package lotto.constant;

import java.text.NumberFormat;

public enum Constant {
    FIFTH_PLACE_MONEY(5000),
    FIFTH_PLACE(5),
    FOURTH_PLACE_MONEY(50000),
    FOURTH_PLACE(4),
    THIRD_PLACE_MONEY(1500000),
    THIRD_PLACE(3),
    SECOND_PLACE_MONEY(30000000),
    SECOND_PLACE(2),
    FIRST_PLACE_MONEY(2000000000),
    FIRST_PLACE(1),
    MIN_RANGE(1),
    MAX_RANGE(45),
    NUMBER_OF_LOTTO(6),
    NO_RANK(-1),
    MONEY_MIN_UNIT(1000);


    private final int constant;

    private Constant(int constant) {
        this.constant = constant;
    }

    public int getConstant() {
        return this.constant;
    }


    public String toStringConstant(Object... args) {
        String formatConstant = NumberFormat.getInstance().format(constant);
        return java.text.MessageFormat.format(formatConstant, args);
    }
}
