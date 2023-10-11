package recursivepractice;

public class ReverseStringProblem {

    public String reverseString(String s){
        if(s.isEmpty() || s.length() == 1){
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
