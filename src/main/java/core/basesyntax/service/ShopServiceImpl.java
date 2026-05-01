package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationStrategy;

import java.util.List;

public class ShopServiceImpl implements ShopService {
    public ShopServiceImpl(OperationStrategy operationStrategy) {
    }

    public ShopServiceImpl() {
    }

    @Override
    public void process(List<FruitTransaction> transactions) {

    }
}
