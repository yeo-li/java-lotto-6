package lotto.validator;

public class MoneyValidator {

    public static void validate(String money){
        // 구입 금액의 입력 값에 숫자 외 다른 숫자가 들어있다면 예외 발생
        for(char number: money.toCharArray()){
            if(!Character.isDigit(number)){
                throw new IllegalArgumentException("구입 금액은 숫자만 입력할 수 있습니다.");
            }
        }
        // 구입 금액이 int 보다 크다면 예외 발생
        try{
            Integer.parseInt(money);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("구입 금액의 범위가 초과 되었습니다.");
        }
        // 구입 금액이 1000단위보다 작다면 예외 발생
        if(Integer.parseInt(money)%1000 !=0){
            throw new IllegalArgumentException("구입 금액의 최소 단위는 1000원 입니다.");
        }
    }
}
