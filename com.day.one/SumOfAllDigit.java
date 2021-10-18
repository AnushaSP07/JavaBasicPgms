public class SumOfAllDigit {
    public static void main(String[] args) {
        sumOfAll(55);
        sumOfAll(142);
        sumOfAll(7869);
    }

    public static void sumOfAll(int number){
        int copyOfNumber = number;
        int sum  = 0;
        while(copyOfNumber!=0){
            int lastDigit = copyOfNumber%10;
            sum = sum+lastDigit;
            copyOfNumber = copyOfNumber/10;
        }
        System.out.println("Sum of number "+number+" is = "+sum);
    }
}
