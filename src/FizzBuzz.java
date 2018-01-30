public class FizzBuzz {

    public static String of(int number) {
        if (number == 0)
            return "0";

        String result = "";

        if (number % 3 == 0)
            result += "Fizz";
        if (number % 5 == 0)
            result += "Buzz";
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
