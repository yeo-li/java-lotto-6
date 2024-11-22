package lotto.view;

import java.util.List;
import lotto.Lotto;
import lotto.constant.ViewMessage;

public class OutputView {
    public void printLotto(List<Lotto> lottos) {
        System.out.printf(ViewMessage.NUMBER_OF_LOTTO.getViewMessage(lottos.size()));
        for (Lotto lotto : lottos) {
            System.out.println(lotto.toString());
        }
    }
}
