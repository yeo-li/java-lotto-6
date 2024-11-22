package lotto.service;

import java.util.ArrayList;
import java.util.List;
import lotto.model.Lotto;

public class LottoService {
    public List<Lotto> buyLotto(int money) {
        List<Lotto> lottoList = new ArrayList<>();
        for (int i = 0; i < money / 1000; i++) {
            lottoList.add(new Lotto());
        }
        return lottoList;
    }
}
