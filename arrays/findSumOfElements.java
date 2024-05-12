import java.util.Arrays;
import java.util.Scanner;

// -------------------- FIND IF 2 ELEMENTS EXIST IN AN ARRAY WHOSE SUM IS X ----------------------//

// A P P R O A C H 02 : 2 POINTERS
// BIG(O)= N LOG N , AUXILIARY SPACE = O(1)
public class arrayQ1 {

    static boolean hasTwoCandidates(int[] sortedArray, int X){
        int l=0;
        int r=sortedArray.length-1;
        boolean answer = false;

        while(l<r){
            if(sortedArray[l]+sortedArray[r]==X){
                answer=true;
                break;
            }
            else if(sortedArray[l]+sortedArray[r]<X){
                l++;
            }
            else {
                r--;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Total numbers in array : ");
        int N = sc.nextInt();
        System.out.print("Enter your numbers : ");
        int[] numbers = new int[N];
        for(int i=0;i<N;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter value of X : ");
        int X=sc.nextInt();

        if(hasTwoCandidates(Arrays.stream(numbers).sorted().toArray(),X)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

// A P P R O A C H : 0 1 : N-A-I-V-E A-P-P-R-O-A-C-H
// BIG(O)= N^2 , AUXILIARY SPACE = O(1)

// public class arrayQ1
//{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Total numbers in array : ");
//        int N = sc.nextInt();
//        System.out.print("Enter your numbers : ");
//        int[] numbers = new int[N];
//        for(int i=0;i<N;i++){
//            numbers[i]=sc.nextInt();
//        }
//        System.out.print("Enter value of X : ");
//        int X=sc.nextInt();
//        String answer = null;
//
//        for(int i=0;i<N;i++){
//            //select element
//            int currentElement = numbers[i];
//            //check if the pair for it exists
//            for(int j=0;j<N;j++) {
//                if (j != i) {
//                    if (X - currentElement == numbers[j]) {
//                        answer = "Yes";
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println( answer==null ? "No" : "Yes");
//    }
//}

// A P P R O A C H 03 : BINARY SEARCH
// BIG(O)= N LOG N , AUXILIARY SPACE = O(1)
//bool binarySearch(int A[], int low, int high, int searchKey)
//{
//
//    while (low <= high) {
//        int m = low + (high - low) / 2;
//
//        // Check if searchKey is present at mid
//        if (A[m] == searchKey)
//            return true;
//
//        // If searchKey greater, ignore left half
//        if (A[m] < searchKey)
//            low = m + 1;
//
//            // If searchKey is smaller, ignore right half
//        else
//            high = m - 1;
//    }
//
//    // if we reach here, then element was
//    // not present
//    return false;
//}

//    bool checkTwoSum(int A[], int arr_size, int sum)
//    {
//        int l, r;
//
//        /* Sort the elements */
//        sort(A, A + arr_size);
//
//        // Traversing all element in an array search for
//        // searchKey
//        for (int i = 0; i < arr_size - 1; i++) {
//
//            int searchKey = sum - A[i];
//            // calling binarySearch function
//            if (binarySearch(A, i + 1, arr_size - 1, searchKey)
//                    == true) {
//                return true;
//            }
//        }
//        return false;
//    }

