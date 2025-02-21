public class DivideOperation implements Operation {
    @Override
    public int apply(int left, int right) {
        if (right == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return left / right;
    }
}
