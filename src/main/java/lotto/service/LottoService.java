package lotto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lotto.constant.Constant;
import lotto.model.Lotto;

public class LottoService {
    public List<Lotto> buyLotto(int money) {
        List<Lotto> lottoList = new ArrayList<>();
        for (int i = 0; i < money / Constant.MONEY_MIN_UNIT.getConstant(); i++) {
            lottoList.add(new Lotto());
        }
        return lottoList;
    }

    public int calculateRanking(Lotto winningLotto, Lotto lotto, int bonusNumber) {
        int matches = winningLotto.calculateMatches(lotto);
        if (matches == 3) {
            return Constant.FIFTH_PLACE.getConstant();
        }
        if (matches == 4) {
            return Constant.FOURTH_PLACE.getConstant();
        }
        if (matches == 5 && !lotto.containBonusNumber(bonusNumber)) {
            return Constant.THIRD_PLACE.getConstant();
        }
        if (matches == 5 && lotto.containBonusNumber(bonusNumber)) {
            return Constant.SECOND_PLACE.getConstant();
        }
        if (matches == 6) {
            return Constant.FIRST_PLACE.getConstant();
        }
        return Constant.NO_RANK.getConstant();
    }

    public double calculateRateOfReturn(Map<Integer, Integer> lottoRanking, int money) {
        int totalAmount = 0;
        totalAmount += lottoRanking.get(Constant.FIFTH_PLACE.getConstant()) * Constant.FIFTH_PLACE_MONEY.getConstant();
        totalAmount +=
                lottoRanking.get(Constant.FOURTH_PLACE.getConstant()) * Constant.FOURTH_PLACE_MONEY.getConstant();
        totalAmount +=
                lottoRanking.get(Constant.FOURTH_PLACE.getConstant()) * Constant.FOURTH_PLACE_MONEY.getConstant();
        totalAmount +=
                lottoRanking.get(Constant.FOURTH_PLACE.getConstant()) * Constant.FOURTH_PLACE_MONEY.getConstant();
        totalAmount +=
                lottoRanking.get(Constant.FOURTH_PLACE.getConstant()) * Constant.FOURTH_PLACE_MONEY.getConstant();

        return Math.round((double) totalAmount / money * 100 * 100.0) / 100.0;
    }

}
