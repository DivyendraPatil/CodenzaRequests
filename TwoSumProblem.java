import java.util.*;

class TwoSumProblem{
    public static void main(String args[]) {
    int intArray[] = {1,2,3,4,5,6,7,8,9};
    int tempNumber;
    int check = 9;
        for (int i = 0; i < intArray.length; i++) {
            for (int j=i+1 ;j < intArray.length;){
                tempNumber = intArray[i]+intArray[j];
                if (tempNumber == check) {
                    System.out.println("Number found \n"+check);
                }
                break;
            }
        }
    }
}

