package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Collections;
import java.util.List;
import lotto.constant.Constant;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public Lotto() {
        this.numbers = createRandomLotto();
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != Constant.NUMBER_OF_LOTTO.getConstant()) {
            throw new IllegalArgumentException();
        }
    }

    private List<Integer> createRandomLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(
                Constant.MIN_RANGE.getConstant(),
                Constant.MAX_RANGE.getConstant(),
                Constant.NUMBER_OF_LOTTO.getConstant());
        Collections.sort(numbers);
        return numbers;
    }

    public int calculateMatches(Lotto lotto) {
        int matches = 0;
        for (int winningNumber : this.numbers) {
            if (lotto.numbers.contains(winningNumber)) {
                matches++;
            }
        }
        return matches;
    }

    public boolean containBonusNumber(int bonusNumber) {
        return this.numbers.contains(bonusNumber);
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
