public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("----------------------------");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("----------------------------");

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));


    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        String strNumber = Integer.toString(number);
        String reversedStr = new StringBuilder(strNumber).reverse().toString();

        return strNumber.equals(reversedStr);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

     public static String numberToWords(int num) {
        if (num < 0) {
            return "invalid value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String numToText = "";
        for(char digit : digits){
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }
        return numToText.trim();
     }
}