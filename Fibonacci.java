import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public List<Integer> generateFibonacci(int limit) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1, c = a + b;
        while (c <= limit) {
            sequence.add(c);
            a = b;
            b = c;
            c = a + b;
        }
        return sequence;
    }
}
