
package lambdas.most_popular_interfaces.predicate;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
public class Main {

	public static void main(String[] args) {

		/*
		 * A interface Predicate é usada para representar uma função que recebe um
		 * argumento e retorna um valor booleano É Ela é frequentemente usada para É
		 * comumente usada para filtrar ou testar elementos em coleções, como listas, ou
		 * em operações de stream
		 */

		/*
		 * @FunctionalInterface public interface Predicate<T> { boolean test(T t); }
		 */

		Product notebook = new Product("Notebook", 3605.0);
		Product console = new Product("Console Game", 4800.0);
		Product mouse = new Product("Mouse", 45.0);

		List<Product> list = new ArrayList<>();

		list.add(notebook);
		list.add(console);
		list.add(mouse);

		Predicate<Product> IsDiscount = prod -> prod.getPrice() >= 1500.0;

		System.out.println("notebook aplica desconto: " + IsDiscount.test(notebook));
		System.out.println("console aplica desconto: " + IsDiscount.test(console));
		System.out.println("mouse aplica desconto: " + IsDiscount.test(mouse));

		/*
		 * realizando modificacoes com a interface ToDoubleFunction
		 * para obter descontos nos precos
		 * */
		ToDoubleFunction<Product> stractorPrice = Product::getPrice;
		double priceWithDiscount = stractorPrice.applyAsDouble(console)
				- (stractorPrice.applyAsDouble(console) * 15) / 100;
		System.out.println(priceWithDiscount);

	}

}
