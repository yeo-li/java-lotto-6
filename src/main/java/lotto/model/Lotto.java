package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
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
        return Randoms.pickUniqueNumbersInRange(
                Constant.MIN_RANGE.getConstant(),
                Constant.MAX_RANGE.getConstant(),
                Constant.NUMBER_OF_LOTTO.getConstant());
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
