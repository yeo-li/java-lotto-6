package lotto.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringParser {
    public List<String> parse(String string, String separator){
        String[] result = string.split(separator);
        return new ArrayList<>(Arrays.stream(result).toList());
    }
}
