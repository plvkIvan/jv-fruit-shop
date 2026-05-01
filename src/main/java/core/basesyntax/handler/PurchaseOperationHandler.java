package core.basesyntax.handler;

import core.basesyntax.handler.OperationHandler;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.storage.Storage;

public class PurchaseOperationHandler implements OperationHandler {
    @Override
    public void apply(FruitTransaction transaction) {
        Storage.subtract(transaction.getFruit(), transaction.getQuantity());
    }
}
