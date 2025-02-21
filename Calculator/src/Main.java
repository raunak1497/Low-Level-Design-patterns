public class Main {
    public static void main(String[] args) {
        ArithmeticExpression num = new Number(2);
        ArithmeticExpression num1 = new Number(1);
        ArithmeticExpression num2 = new Number(7);

        Operation addOperation = OperationFactory.getOperation(OperationType.ADD);
        Operation multiplyOperation = OperationFactory.getOperation(OperationType.MULTIPLY);

        ArithmeticExpression right = new Expression(num1, num2, addOperation);
        ArithmeticExpression ans = new Expression(num, right, multiplyOperation);

        System.out.println("Result: " + ans.evaluate());
    }
}