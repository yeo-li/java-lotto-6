package lotto.view;

import java.util.List;
import java.util.Map;
import lotto.Lotto;
import lotto.constant.Constant;
import lotto.constant.ViewMessage;

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
        printFifthPlace(lottoRanking.get(Constant.FIFTH_PLACE.getConstant()));
        printFourthPlace(lottoRanking.get(Constant.FOURTH_PLACE.getConstant()));
        printThirdPlace(lottoRanking.get(Constant.THIRD_PLACE.getConstant()));
        printSecondPlace(lottoRanking.get(Constant.SECOND_PLACE.getConstant()));
        printFirstPlace(lottoRanking.get(Constant.FIRST_PLACE.getConstant()));
    }

    private void printFifthPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.THREE_MATCHES_MONEY.getConstant(),
                        wins
                )
        );
    }

    private void printFourthPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.FOUR_MATCHES_MONEY.getConstant(),
                        wins
                )
        );
    }

    private void printThirdPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.FIVE_MATCHES_MONEY.getConstant(),
                        wins
                )
        );
    }

    private void printSecondPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.FIVE_MATCHES_BONUS_MONEY.getConstant(),
                        wins
                )
        );
    }

    private void printFirstPlace(int wins) {
        System.out.println(
                ViewMessage.LOTTO_THREE_MATCHES.getViewMessage(
                        Constant.SIX_MATCHES_MONEY.getConstant(),
                        wins
                )
        );
    }
}
