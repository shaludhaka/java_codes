public class CheckPalindrome {

    boolean isPalindrome(int number){
        if (number<=0)
            return false;
        else{
            int totalDigits=(int)Math.floor(Math.log10(number))+1;
            int mask=(int)Math.pow(10,totalDigits-1);
            for(int i=0; i<(totalDigits/2); i++){
                int mostSignificantDigit = number/mask;
                int leastSignificantDigit = number%10;
                if(leastSignificantDigit!=mostSignificantDigit){
                    return false;
                }
                number=number%mask;
                number=number/10;
                mask=mask/100;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println(checkPalindrome.isPalindrome(1221));
    }

}
