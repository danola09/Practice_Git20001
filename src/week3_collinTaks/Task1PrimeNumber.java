package week3_collinTaks;

public class Task1PrimeNumber {
    public static void main(String[] args) {
        int a = 50;

        for (int i = 1; i < a; i++) {
            System.out.println("Is "+i+" a prime number? "+primeNumber(i));
        }

    }

    public static boolean primeNumber(int a){
        if(a==2||a==3||a==5||a==7){//to make sure these show up as true, set them right away otherwise in if method below they will give false, as they are divisible by themselves.
            return true;
        }else if (a % 2 != 0 && a%3!=0 && a%5!=0 && a%7!=0) {//expression to check if divisible by smallest number.
            return true;
        }
        return false;
        }

    }



