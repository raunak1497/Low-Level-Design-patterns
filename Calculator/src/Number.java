public class Number implements ArithmeticExpression{
    private final int number;

    public Number(int number){
        this.number = number;
    }

    @Override
    public int evaluate(){
        return number;
    }
}
