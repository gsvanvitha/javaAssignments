package Assignment6;

public class VampireNumber {
    static boolean flag = false;
    //Converting the number into an array
    public static int[] convertToArray(int num) {
        int remainder = 0;
        int index = 0;
        int len = (int) (Math.log10(num) + 1);
        int numArray[] = new int[len];
        while (num != 0) {
            remainder = num % 10;
            numArray[index] = remainder;
            num = num / 10;
            index++;
        }
        return numArray;
    }

    //Calculating the first half and the secondHalf and finding the VampireNumber

    public static boolean isVampire(int[] arr, int num) {

        int firstHalf = 0;
        int secondHalf = 0;
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

    //Finds all the permutations of the given input array and returns to the isVampire() method.

    static void findPermutations(int[] arr, int index, int num) {
        if (index >= arr.length - 1) {
            if (isVampire(arr, num)) {
                //flag will set to true if it is a vampire number.
                flag = true;
            }
        }
        for (int i = index; i < arr.length; i++) {
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            findPermutations(arr, index + 1, num);
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
                int[] array = convertToArray(number);
                findPermutations(array, 0, number);
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