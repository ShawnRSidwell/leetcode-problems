package recursivepractice;

public class PossibleStringPermutations {

    public int calcPermutations(String s){
        if(s.isEmpty()){
            return 1;
        }
        return s.length() * calcPermutations(s.substring(1));
    }
}
