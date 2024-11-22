package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.constant.ViewMessage;

public class InputView {
    public String inputAmount() {
        System.out.println(ViewMessage.PROMPT_AMOUNT.getViewMessage());
        return Console.readLine();
    }

    public String inputWinningNumber() {
        System.out.println(ViewMessage.PROMPT_WINNING_NUMBER.getViewMessage());
        return Console.readLine();
    }

    public String inputBonusNumber() {
        System.out.println(ViewMessage.PROMPT_BONUS_NUMBER.getViewMessage());
        return Console.readLine();
    }
}
