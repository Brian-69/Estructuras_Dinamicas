import java.util.ArrayList;
import java.util.List;

public class Manager {

	private final Fibonacci fibonacci;
    private final Splitter splitter;

    public Manager() {
        this.fibonacci = new Fibonacci();
        this.splitter = new Splitter();
}
    public void execute() {
        List<Integer> sequence = fibonacci.generateFibonacci(1_000_000);
        List<Integer> evenNumbers = splitter.filterEven(sequence);
        List<Integer> oddNumbers = splitter.filterOdd(sequence);

        System.out.println("Secuencia Fibonacci hasta 1,000,000: " + sequence);
        System.out.println("Numeros pares: " + evenNumbers);
        System.out.println("Numeros impares: " + oddNumbers);
    }
}