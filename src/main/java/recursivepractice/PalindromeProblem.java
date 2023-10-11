package recursivepractice;

public class PalindromeProblem {

    public boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        int first = s.charAt(0);
        int last = s.charAt(s.length() -1);
        if(first != last) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length()-1));
    }
}
