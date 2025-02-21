public class Main {
    public static void main(String[] args){
        ArithmeticExpression num = new Number(2);
        ArithmeticExpression num1 = new Number(1);
        ArithmeticExpression num2 = new Number(7);

        ArithmeticExpression right = new Expression(num1,num2, Operation.ADD);
        ArithmeticExpression ans = new Expression(num,right, Operation.MULTIPLY);
        System.out.println(ans.evaluate());
    }
}
