package recursivepractice;

public class test {

    private static  <T> int test2(T input, T input2){
        if(input.getClass() == Integer.class && input2.getClass() == Integer.class){
            return ((Integer) input).intValue() + ((Integer) input2).intValue();
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(test2(5,4));
        System.out.println(test2("hel", "elo"));
    }
}
