package recursivepractice;

public class SumOfAllOdd {

    //Calc the sum of all odd numbers in an int[] recursively.
    public int calcSumOfAllOdd(int[] numList){
        return  calcSumOfAllOdd(numList, 0);
    }


    public int calcSumOfAllOdd(int[] numList, int index){
        if(index == numList.length) {
            return 0;
        }

        int count = calcSumOfAllOdd(numList, index +1);
        int num = numList[index];
        if(numList[index] % 2 != 0){
            count++;
        }

        return count;
    }

}
