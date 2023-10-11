package recursivepractice;

public class FibonacciSequence {

    //Calculate n at nth position
    public int calculateSequence(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return  calculateSequence(n-1) + calculateSequence(n-2);
    }
}
