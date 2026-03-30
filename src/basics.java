public class basics{

//    public static boolean checkPalindrome(int n){
//        int original = n;
//        int rev = 0;
//        while(n>0){
//            int lastDigit = n%10;
//            rev = rev*10 + lastDigit;
//            n = n/10;
//        }
//        return rev == original;
//    }

//    public static int sumOfDigits(int n){
//        int sum = 0;
//        while(n>0){
//            int digit = n%10;
//            sum += digit;
//            n=n/10;
//        }
//        return sum;
//    }


//    public static boolean primeNoChecker(int a){
//        if(a==2){
//            return true;
//        }
//        else{
//            for(int i=2; i<=Math.sqrt(a);i++){
//                if(a%i==0){
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

    public static int maxNoArray(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }

    public static int linearsearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int[] reverse(int givenArray[]){
        int newArray[] = new int[givenArray.length];
        for(int i=0; i<newArray.length; i++){
            newArray[i] = givenArray[givenArray.length-1-i];
        }
        return newArray;
    }

    public static void main(String[] args){

        System.out.println("this is the first class of java");

//        System.out.println(checkPalindrome(191));
//        System.out.println(checkPalindrome(789));
//        System.out.println(primeNoChecker(9));

        int arr[] = {1, 4, 6, 8, 45};
        System.out.println(maxNoArray(arr));

        System.out.println(reverse(arr));

        linearsearch(arr, 4);

    }
}