import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    private static final Map<OperationType, Operation> operations = new HashMap<>();

    static {
        for (OperationType operationType : OperationType.values()) {
            operations.put(operationType, operationType.getOperation());
        }
    }

    public static Operation getOperation(OperationType operationType) {
        return operations.get(operationType);
    }
}