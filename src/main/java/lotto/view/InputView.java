package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.constant.ViewMessage;

public class InputView {
    public String inputAmount() {
        System.out.println(ViewMessage.PROMPT_AMOUNT.getViewMessage());
        return Console.readLine();
    }
}
