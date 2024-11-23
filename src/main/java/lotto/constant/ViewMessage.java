package lotto.constant;

public enum ViewMessage {
    // INPUT
    PROMPT_AMOUNT("구입 금액을 입력해 주세요"),
    PROMPT_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
    PROMPT_BONUS_NUMBER("보너스 번호를 입력해 주세요."),

    // OUTPUT
    NUMBER_OF_LOTTO("{0}개를 구매했습니다."),
    LOTTO_THREE_MATCHES("3개 일치 ({0}원) - {1}개"),
    LOTTO_FOUR_MATCHES("4개 일치 ({0}원) - {1}개"),
    LOTTO_FIVE_MATCHES("5개 일치 ({0}원) - {1}개"),
    LOTTO_FIVE_MATCHES_BONUS("5개 일치, 보너스 볼 일치 ({0}원) - {1}개"),
    LOTTO_SIX_MATCHES("6개 일치 ({0}원) - {1}개"),
    WINNING_STATISTIC("당첨 통계"),
    OUTPUT_SEPARATOR("---"),
    PARSER_SEPARATOR(","),
    RATE_OF_RETURN("총 수익률은 {0}%입니다.");


    private final String viewMessage;

    private ViewMessage(String viewMessage) {
        this.viewMessage = viewMessage;
    }

    public String getViewMessage(Object... args) {
        return java.text.MessageFormat.format(viewMessage, args);
    }
}
