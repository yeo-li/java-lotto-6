package lotto.validator;

import lotto.constant.Constant;
import lotto.constant.ErrorMessage;

public class MoneyValidator {
    public static void validate(String money){
        shouldBeOnlyNumber(money);
        shouldNotBeTooBig(money);
        shouldBeDividedIntoMinUnit(money);
    }
    private static void shouldBeOnlyNumber(String money){
        // 구입 금액의 입력 값에 숫자 외 다른 숫자가 들어있다면 예외 발생
        for(char number: money.toCharArray()){
            if(!Character.isDigit(number)){
                throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER.getErrorMessage());
            }
        }
    }
    private static void shouldNotBeTooBig(String money){
        // 구입 금액이 int 보다 크다면 예외 발생
        try{
            Integer.parseInt(money);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(ErrorMessage.EXCEEDED_INTEGER.getErrorMessage());
        }
    }

    private static void shouldBeDividedIntoMinUnit(String money){
        // 구입 금액이 1000단위보다 작다면 예외 발생
        if(Integer.parseInt(money) % Constant.MONEY_MIN_UNIT.getConstant() !=0){
            throw new IllegalArgumentException(ErrorMessage.MIN_UNIT.getErrorMessage(Constant.MONEY_MIN_UNIT));
        }
    }
}
