public enum OperationType {
    ADD(new AddOperation()),
    SUBTRACT(new SubtractOperation()),
    MULTIPLY(new MultiplyOperation()),
    DIVIDE(new DivideOperation());

    private final Operation operation;

    OperationType(Operation operation) {
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }
}