package lotto.view;

import java.util.List;
import java.util.Map;
import lotto.constant.Constant;
import lotto.constant.ViewMessage;
import lotto.model.Lotto;

public class OutputView {
    public void printLotto(List<Lotto> lottoList) {
        System.out.printf(ViewMessage.NUMBER_OF_LOTTO.getViewMessage(lottoList.size()));
        for (Lotto lotto : lottoList) {
            System.out.println(lotto.toString());
        }
    }

    public void printWinningStatistic(Map<Integer, Integer> lottoRanking, double rateOfReturn) {
        System.out.println(ViewMessage.WINNING_STATISTIC.getViewMessage());
        System.out.println(ViewMessage.SEPARATOR.getViewMessage());
        printLottoResult(lottoRanking);
        System.out.println(ViewMessage.RATE_OF_RETURN.getViewMessage(rateOfReturn));
    }

    private void printLottoResult(Map<Integer, Integer> lottoRanking) {
        printFifthPlace(lottoRanking.get(Constant.FIFTH_PLACE.toStringConstant()));
        printFourthPlace(lottoRanking.get(Constant.FOURTH_PLACE.toStringConstant()));
        printThirdPlace(lottoRanking.get(Constant.THIRD_PLACE.toStringConstant()));
        printSecondPlace(lottoRanking.get(Constant.SECOND_PLACE.toStringConstant()));
        printFirstPlace(lottoRanking.get(Constant.FIRST_PLACE.toStringConstant()));
    }

    private void printFifthPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.FIFTH_PLACE_MONEY.toStringConstant(),
                        wins
                )
        );
    }

    private void printFourthPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.FOURTH_PLACE_MONEY.toStringConstant(),
                        wins
                )
        );
    }

    private void printThirdPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.THIRD_PLACE_MONEY.toStringConstant(),
                        wins
                )
        );
    }

    private void printSecondPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.SECOND_PLACE_MONEY.toStringConstant(),
                        wins
                )
        );
    }

    private void printFirstPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.FIRST_PLACE_MONEY.toStringConstant(),
                        wins
                )
        );
    }
}
