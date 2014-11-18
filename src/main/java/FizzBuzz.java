/**
 * Created by ellaschofield on 18/11/2014.
 */
public class FizzBuzz {
    public boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    public boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    public boolean isDivisibleByFifteen(int number) {
        return number % 15 == 0;
    }

    public String itSays(int number) {
        if (isDivisibleByFifteen(number)) { return "FizzBuzz";}
        if (isDivisibleByThree(number)){ return "Fizz";}
        if (isDivisibleByFive(number)) { return "Buzz";}

        else return String.valueOf(number);
    }
}
