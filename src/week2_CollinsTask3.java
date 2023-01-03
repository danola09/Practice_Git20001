public class week2_CollinsTask3 {
    public static void main(String[] args) {
        int n = 35;

        String result = "";
        for (int i=1; i <= n; i++){
            if(i%2==0&&i%3==0&&i%5==0){
                result+="CodilityTestCoders\n";
            }else if(i%2==0&&i%3==0){
                result+="CodilityTest\n";
            }else if(i % 5 == 0){
                result+="Coders\n";
            }else if(i%3==0){
                result+="Tester\n";
            }else if(i%2==0){//check to see if the number (i) is divisible by 2, then add Codility to String result.
                result+="Codility\n";
            }

            else{
                result+=i+"\n";
            }
        }

        System.out.println(result);


    }
}
/*
Write a function that given a positive interger N, prints the consective numbers from 1 to N, each on a
separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word
Codility, Test or Coders respectively. If a number is divisible by more than one of
the numbers: 2, 3 or 5, it should be replaced by a concatenation of the respective words
Codility, Test and Coders in this given order.
 */