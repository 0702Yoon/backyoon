import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] line = sc.nextLine().split(" ");
		IntStream st = Stream.of(line).mapToInt(Integer::parseInt);
		int max = st.max().getAsInt();
		System.out.println(
				Stream.of(line).mapToDouble(Double::parseDouble).map(num -> num / max * 100).average().getAsDouble());
	}
}