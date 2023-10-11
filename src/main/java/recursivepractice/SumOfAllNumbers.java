package recursivepractice;

public class SumOfAllNumbers {

    //calculate sum of all numbers up to n;
    public int calculateSum(int n){
        if(n == 1){
            return 1;
        }
        return n + calculateSum(n-1);

    }
}
