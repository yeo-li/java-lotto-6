package lotto.constant;

public enum ViewMessage {
    PROMPT_AMOUNT("구입 금액을 입력해 주세요");


    private String viewMessage;

    private ViewMessage(String viewMessage) {
        this.viewMessage = viewMessage;
    }

    public String getViewMessage() {
        return viewMessage;
    }
}
