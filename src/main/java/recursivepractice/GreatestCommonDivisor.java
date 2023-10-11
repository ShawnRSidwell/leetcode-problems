package recursivepractice;

public class GreatestCommonDivisor {

    public int calculateCommonDivisor(int num1, int num2){
        if (num2 == 0) {
            return num1;
        }

        // Recursive case: calculate the GCD by recursively calling the method with num2 as the new num1 and the remainder as num2
        int remainder = num1 % num2;
        return calculateCommonDivisor(num2, remainder);
    }
}
