package weeks.week15;

public class Calculator extends Number{
    public static final int ZERO = 0;
    public Calculator() {
    }

    public Calculator(double num) {
        super(num);
    }
    public double add(double num){
        super.setNum(getNum() + num);
        return super.getNum() + num;
    }
    public double extract(double num){
        super.setNum(getNum() - num);
        return super.getNum() - num;
    }
    public double divide(double num){
        if(num == 0){
            System.out.println("UNPROPER DIVIDE!");
            return -1;
        }
        super.setNum(getNum() / num);
        return super.getNum() / num;
    }
    public double multiply(double num){
        super.setNum(getNum() * num);
        return super.getNum() * num;
    }
    public double mod(double num){
        super.setNum(getNum() % num);
        return super.getNum() % num;
    }
    public void convertNegative(){
        setNum(getNum() * -1);
    }
    public void clear(){
        setNum(ZERO);
    }
    @Override
    public String toString(){
        return "Result: " +getNum();
    }
}
