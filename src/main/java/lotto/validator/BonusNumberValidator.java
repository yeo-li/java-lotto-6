package lotto.validator;

import java.util.List;
import lotto.constant.Constant;
import lotto.constant.ErrorMessage;
import lotto.model.Lotto;

public class BonusNumberValidator {
    public static void validate(String bonusNumber, Lotto winningNumber){
        shouldBeOnlyNumber(bonusNumber);
        shouldNotBeTooBig(bonusNumber);
        shouldBeInLottoRange(bonusNumber);
        shouldNotBeDuplicated(winningNumber, bonusNumber);
    }
    private static void shouldNotBeDuplicated(Lotto winningNumber, String bonusNumber) {
        int bonus = Integer.parseInt(bonusNumber);
        // 당첨 번호가 winningNumber와 중복되는 상황
        if(winningNumber.containBonusNumber(bonus)){
            throw new IllegalArgumentException(ErrorMessage.DUPLICATED.getErrorMessage());
        }
    }
    private static void shouldBeInLottoRange(String bonusNumber) {
        int bonus = Integer.parseInt(bonusNumber);
        // 당첨 번호의 입력값이 1~45 사이의 정수가 아닌 상황
        if(!(Constant.MIN_RANGE.getConstant() <= bonus && bonus <= Constant.MAX_RANGE.getConstant())){
            throw new IllegalArgumentException(
                    ErrorMessage.OVER_LOTTO_NUMBER_RANGE.getErrorMessage(
                            Constant.MIN_RANGE.getConstant(),
                            Constant.MAX_RANGE.getConstant()
                    )
            );
        }
    }
    private static void shouldNotBeTooBig(String bonusNumber) {
        // bonusNumber가 너무 크면 안됨
        try{
            Integer.parseInt(bonusNumber);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(ErrorMessage.EXCEEDED_INTEGER.getErrorMessage());
        }
    }
    private static void shouldBeOnlyNumber(String bonusNumber) {
        // 숫자 이외의 것도 안됨
        for(char number: bonusNumber.toCharArray()){
            if(!Character.isDigit(number)){
                throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER.getErrorMessage());
            }
        }
    }
}
