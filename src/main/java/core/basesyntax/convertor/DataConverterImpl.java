package core.basesyntax.convertor;

import core.basesyntax.model.FruitTransaction;

import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> inputReport) {
        return List.of();
    }
}
