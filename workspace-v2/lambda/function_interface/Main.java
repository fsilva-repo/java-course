import java.util.function.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Product p1 = new Product("vasoura", 13.75);
		Product p2 = new Product("vaso com flor", 16.50);
		Product p3 = new Product("Patins", 75.0);
		Product p4 = new Product("Patinete", 123.0);
		Product p5 = new Product("Escova de Cabelos", 7.80);
		Product p6 = new Product("Secador de cabelos", 89.90);

		List<Product> list = Arrays.asList(p1, p2, p3, p4, p5, p6);

		Function<Product, String> productName = arg -> arg.getName();
		Function<Product, Double> productPrice = arg -> arg.getPrice();

		BiFunction<String, Double, String> concatTo =
									(s, d) -> "Name: " + s + ", Price: " + d;


	list.forEach(p -> System.out.println(
		concatTo.apply(productName.apply(p), productPrice.apply(p))));

	// Function<Product, Double> sumPrice = p -> {
	// 	double acc = 0;
	// 	acc += productPrice.apply(p);
	// 	return acc;
	// };

	//System.out.println(sumPrice.apply(productPrice.apply(p2)));
	//list.forEach(p -> System.out.println(sumPrice.apply(productPrice.apply(p))));
	}
}