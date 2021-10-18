public class ArmStrong {
    
    public static void main(String[] args) {
        checkArmStrong(123);
        checkArmStrong(153);
        
    }

    public static void checkArmStrong(int number){
        int copyOfNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while(copyOfNumber!=0){
            int lastDigit = copyOfNumber%10;
            int lastDigitToThePowerOfDigit = 1;
            for(int i=0;i<numberOfDigits;i++){
                lastDigitToThePowerOfDigit = lastDigitToThePowerOfDigit*lastDigit;
            }
            sum = sum+lastDigitToThePowerOfDigit;
            copyOfNumber = copyOfNumber/10;
        }
        if(sum==number){
            System.out.println(number+" is Anagram");
        }else{
            System.out.println(number+" is not anagram");
        }
    }
}
