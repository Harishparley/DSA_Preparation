import java.util.ArrayList;
import java.util.List;

public class fizzbuzzLc412 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));

    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if ( i % 3 == 0 && (int) i % 5 == 0) {
                result.add("fizzbuzz");
            } else if ( i % 3 == 0) {
                result.add("fizz");
            } else if( i % 5 == 0) {
                result.add("buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
