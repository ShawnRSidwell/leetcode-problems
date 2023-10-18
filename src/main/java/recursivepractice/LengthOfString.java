package recursivepractice;

public class LengthOfString {

    //calc the length of a string recursively

    public int calcLength(String s){
        if(s.isEmpty()){
            return 0;
        }
        return 1 + calcLength(s.substring(1));
    }
}
