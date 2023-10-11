package recursivepractice;

public class PowerCalculator {

    public int calculatePower(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * calculatePower(base, exponent -1);
    }
}
