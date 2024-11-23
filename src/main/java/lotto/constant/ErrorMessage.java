package lotto.constant;

public enum ErrorMessage {
    NOT_NUMBER("구입 금액은 숫자만 입력할 수 있습니다."),
    EXCEEDED_INTEGER("구입 금액의 범위가 초과 되었습니다."),
    MIN_UNIT("구입 금액의 최소 단위는 {0}원 입니다."),
    DUPLICATED("당첨 번호가 중복 되었습니다."),
    OVER_RANGE("당첨 번호는 중복되지 않는 {0}개의 숫자입니다."),
    OVER_LOTTO_NUMBER_RANGE("당첨 번호의 범위는 {0}~{1} 사이의 정수 입니다.")
    ;


    private final String errorMessage;
    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorMessage(Object... args){
        return java.text.MessageFormat.format(this.errorMessage, args);
    }
}
