package lotto.constant;

public enum ViewMessage {
    // INPUT
    PROMPT_AMOUNT("구입 금액을 입력해 주세요"),
    PROMPT_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
    PROMPT_BONUS_NUMBER("보너스 번호를 입력해 주세요."),

    // OUTPUT
    NUMBER_OF_LOTTO("{0}개를 구매했습니다.");

    private final String viewMessage;

    private ViewMessage(String viewMessage) {
        this.viewMessage = viewMessage;
    }

    public String getViewMessage(Object... args) {
        return java.text.MessageFormat.format(viewMessage, args);
    }
}
