public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression( ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;
        if(operation == Operation.ADD){
            value = leftExpression.evaluate() + rightExpression.evaluate();
        }
        else if(operation == Operation.SUBTRACT){
            value = leftExpression.evaluate() - rightExpression.evaluate();
        }
        else if(operation == Operation.MULTIPLY){
            value = leftExpression.evaluate() * rightExpression.evaluate();
        }
        else if(operation == Operation.DIVIDE){
            value = leftExpression.evaluate() / rightExpression.evaluate();
        }
        return value;
    }
}
