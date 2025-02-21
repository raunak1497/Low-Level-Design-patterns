public class Expression implements ArithmeticExpression {
    private final ArithmeticExpression leftExpression;
    private final ArithmeticExpression rightExpression;
    private final Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int leftValue = leftExpression.evaluate();
        int rightValue = rightExpression.evaluate();
        return operation.apply(leftValue, rightValue);
    }
}