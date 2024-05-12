import java.util.Arrays;
import java.util.Scanner;

//------------------------- BUY N SELL STOCKS ; BUY FIRST ALWAYS --------------------------

// A P P R O A C H  02 - " GREEDY APPROACH "
// TIME COMPLEXITY : O(N)        AUXILIARY COMPLEXITY : O(1)
public class arrayQ2
{
//    static int maxProfit(int[] array){
//    }

    // DRIVER CODE
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N - ");
        int N = sc.nextInt();
        System.out.println("enter prices - ");
        int[] prices = new int[N];

        int buy=0, profit=0;

        for(int i=0; i<N;i++){
            prices[i]=sc.nextInt();
            buy=prices[0];
            if(prices[i]<buy && i>0){
                buy=prices[i];
            }
            else if(prices[i]>buy && (prices[i]-buy>profit) && i>0 ){
                profit = prices[i]-buy;
            }
        }

        System.out.println("max profit is - "+profit);

    }
}

// A P P R O A C H  01 - NAIVE APPROACH
// TIME COMPLEXITY : O(N)        AUXILIARY COMPLEXITY : O(1)

// { FLAWEDDDDDDDDDDDD!!!!!!!!!!!!!!!!!!!!!!!!!!!! }
// { did not cover all cases }
//public class arrayQ2
//{
//    static int maxProfit(int[] array){
//        int length = array.length;
//        int min=0;
//        int max = 0;
//        int minIndex = 0;
//
//        int[] sortedArray = Arrays.stream(array).sorted().toArray();
//
//        //choosing the minimum element
//        if(sortedArray[0]==array[length-1])
//        {
//            min=sortedArray[1];
//        }
//        else { min = sortedArray[0]; }
//        System.out.println("minimum value selected is - "+min);
//
//        //finding index of minimum element chosen
//        for(int i=0;i<length;i++){
//            if(array[i]==min){
//                minIndex=i;
//            }
//        }
//        System.out.println("index of that chosen value is - "+minIndex);
//
//        //finding the max element after the minimum one
//        for(int i=(minIndex+1);i<length;i++){
//            if(array[i]>max){
//                max = array[i];
//            }
//        }
//        System.out.println("max element is - "+max);
//
//        int maxProfit=max-min;
//        return maxProfit;
//    }
//
//    // DRIVER CODE
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter N - ");
//        int N = sc.nextInt();
//        System.out.println("enter prices - ");
//        int[] prices = new int[N];
//
//        for(int i=0; i<N;i++){
//            prices[i]=sc.nextInt();
//        }
//
//        System.out.println("Max profit obtained is "+maxProfit(prices));
//    }
//}

