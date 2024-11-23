package lotto.validator;

import java.util.Collections;
import java.util.List;
import lotto.constant.Constant;
import lotto.constant.ErrorMessage;
import lotto.constant.ViewMessage;
import lotto.util.StringParser;
import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin;

public class WinningNumberValidator {

    public void validator(String inputWinningNumber){
        List<String> winningNumbers = StringParser.parse(inputWinningNumber, ViewMessage.PARSER_SEPARATOR.getViewMessage());

        shouldBeOnlyNumber(winningNumbers);
        shouldNotBeTooBig(winningNumbers);
        shouldBeInLottoRange(winningNumbers);
        shouldBeNumberOfLotto(winningNumbers);
        shouldNotBeDuplicated(winningNumbers);
    }

    private static void shouldNotBeDuplicated(List<String> winningNumbers) {
        // 당첨 번호의 입력값이 중복되는 상황
        for(String number: winningNumbers){
            if(Collections.frequency(winningNumbers, number) > 1){
                throw new IllegalArgumentException(ErrorMessage.DUPLICATED.getErrorMessage());
            }
        }
    }

    private static void shouldBeNumberOfLotto(List<String> winningNumbers) {
        // 당첨 번호의 개수가 6개가 아닌 상황
        if(winningNumbers.size() != Constant.NUMBER_OF_LOTTO.getConstant()){
            throw new IllegalArgumentException(ErrorMessage.OVER_RANGE.getErrorMessage(Constant.NUMBER_OF_LOTTO));
        }
    }

    private static void shouldBeInLottoRange(List<String> winningNumbers) {
        // 당첨 번호의 입력값이 1~45사이의 값이 아닌 상황
        for(String winningNumber: winningNumbers){
            int number = Integer.parseInt(winningNumber);
            if(!(Constant.MIN_RANGE.getConstant() <= number && number <= Constant.MAX_RANGE.getConstant())){
                throw new IllegalArgumentException(
                            ErrorMessage.OVER_LOTTO_NUMBER_RANGE.getErrorMessage(
                                Constant.MIN_RANGE.getConstant(),
                                Constant.MAX_RANGE.getConstant()
                            )
                        );
            }
        }
    }

    private static void shouldNotBeTooBig(List<String> winningNumbers) {
        // 당첨 번호의 입력값이 int의 범위를 초과하는 경우
        for(String number : winningNumbers){
            try{
                Integer.parseInt(number);
            } catch (NumberFormatException e){
                throw new IllegalArgumentException(
                        ErrorMessage.OVER_LOTTO_NUMBER_RANGE.getErrorMessage(
                                Constant.MIN_RANGE.getConstant(),
                                Constant.MAX_RANGE.getConstant()
                        )
                );
            }
        }
    }

    private static void shouldBeOnlyNumber(List<String> winningNumbers) {
        // 당첨 번호의 입력값이 숫자가 아닌 경우
        for(String number: winningNumbers){
            if(!isNumber(number)){
                throw new IllegalArgumentException(
                        ErrorMessage.OVER_LOTTO_NUMBER_RANGE.getErrorMessage(
                                Constant.MIN_RANGE.getConstant(),
                                Constant.MAX_RANGE.getConstant()
                        )
                );
            }
        }
    }

    private static boolean isNumber(String number){
        for(char c : number.toCharArray()){
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
