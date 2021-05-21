/*
1. A vampire number v is a number with an even number of digits n,
that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.
 */
package Assignment6;
public class VampireNumber {
    static boolean flag = false;
    //Converting the number into an array
    public static int[] numberIntoArray(int num) {
        int rem =0,ind =0;
        int len = (int) (Math.log10(num) + 1);
        int numArray[] = new int[len];
        while (num != 0) {
            rem = num % 10;
            numArray[ind] = rem;
            num = num / 10;
            ind++;
        }
        return numArray;
    }

   //checking whether it is a vampire number by multiplying first and second halves of array

    public static boolean isVampireNumber(int[] arr, int num) {

        int firstHalf = 0;
        int secondHalf = 0;
        //to see that both numbers don't contain trailing zeroes
        if(arr[(arr.length/2)-1]==0 && arr[arr.length-1]==0)return false;
        for (int index = 0; index < (arr.length) / 2; index++) {
            firstHalf += arr[index] * Math.pow(10, (arr.length) / 2 - index - 1);
        }
        for (int index = (arr.length) / 2; index < arr.length; index++) {
            secondHalf += arr[index] * Math.pow(10, (arr.length - index - 1));
        }
        if (firstHalf * secondHalf == num) {
            return true;
        }
        return false;
    }

    //Finds all the permutations of the given input array and sending to isVampireNumber method to verify

    static void permute(int[] arr, int index, int num) {
        if (index >= arr.length - 1) {
            if (isVampireNumber(arr, num)) {
                //flag will set to true if it is a vampire number.
                flag = true;
            }
        }
        for (int i = index; i < arr.length; i++) {
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            permute(arr, index + 1, num);
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }

    public static void main(String[] args) {
        int number = 1001;
        int counter = 0;
        System.out.println("The vampire numbers are : ");
        while (counter < 100) {
            if (((int) (Math.log10(number) + 1))%2 == 0) {
                int[] array = numberIntoArray(number);
                permute(array, 0, number);
                if (flag) {
                    System.out.println(number);
                    counter++;
                    flag = false;
                }
            }
            number++;
        }
    }
}