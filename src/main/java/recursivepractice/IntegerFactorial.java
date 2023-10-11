package recursivepractice;

public class IntegerFactorial {

    //calculate n!
    public static int calculateFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * calculateFactorial(n -1);
    }
}
