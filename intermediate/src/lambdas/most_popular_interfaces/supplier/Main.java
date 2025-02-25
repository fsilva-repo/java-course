package lambdas.most_popular_interfaces.supplier;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		/*
		 * Supplier é uma interface funcional, o que significa que
		 * ela tem apenas um método abstrato. Isso permite que seja usada com expressões
		 * lambda ou referências de métodos.
		 * 
		 * O único método da interface Supplier é o get(), que não recebe
		 * parâmetros e retorna um valor do tipo especificado.
		 * 
		 * Genérica: A interface Supplier é genérica, ou seja, você pode especificar o
		 * tipo de dado que ela retorna. Por exemplo, Supplier<String> retorna uma
		 * String, e Supplier<Integer> retorna um Integer
		 */

		/* assinatura do interface
		 * @FunctionalInterface public interface Supplier<T> { T get(); }
		 */
		
		// ex: 1
		Supplier<Double> supplierRandom = () -> (Math.random() * 30);
		String formated = String.format("%.0f", supplierRandom.get());
		System.out.println(formated);
	
	}

}























