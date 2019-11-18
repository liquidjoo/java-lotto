package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;

public class ManualLottos {

    private static final String DELIMITER = ", ";

    private List<String> manualLottos;

    public ManualLottos(List<String> manualLottos) {
        this.manualLottos = manualLottos;
    }

    public List<Lotto> getManualLottos() {
        return this.manualLottos
                .stream()
                .map(lotto -> new Lotto(
                                new LottoFactory()
                                        .createManualLotto(lotto.split(DELIMITER))
                                        .makeLotto()))
                .collect(Collectors.toList());
    }
}
