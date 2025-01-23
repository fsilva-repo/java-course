package _01string._1declaration;

public class Main {
  public static void main(String[] args) {
    /*
     * strings sao uma cadei de caracteres na qual podemos escrever qualquer coisa
     * entre aspas duplas, e definida e tipada pela class String.
     */

    // ex.
    String name = "fsilva";

    // concatenacao com o metodo concat
    System.out.println(name.concat("\n"));
    
    // concatenacao
    String msg = "Meu nome: " + name;
    
    System.out.println(msg);

    String o = new String("Ola");
		String s = "Silva";
		
		System.out.println(o + ", " + s ); // concatenando strings

    String m = "Monteiro";
		m = m + " ".concat(s); // metodo concat
		
		System.out.println(m);

		String city = "Rio de Janeiro";
		System.out.println(city);
		
		city = city.toUpperCase();
		System.out.println(city);
		
		
		System.out.println(city.startsWith("Rio"));
		
		System.out.println(city.endsWith("Rio"));
		
		System.out.println("'" + city.charAt(7) + "'");

		System.out.println(city.length());

    		// formatacoes de string

		String firstname = "Moraes";

		System.out.printf("nome: " + firstname + ", sobrenome: " + "Silva");

		String personInfo = "\nnome: " + firstname + "\nsobrenome: " + "Silva";

		System.out.println("\n" + personInfo + "\nidade: 35");

		String lastname = "Silva";
		int age = 35;
		double salary = 6813.45;
		boolean holiday = false;

		String formattedInfo = String.format(
				"\nName: %s \nLastname: %s \nAge: %d \nSalary: %.2f \nStatus Holiday: %b",
				name, lastname, age, salary, holiday
				);

		System.out.println(formattedInfo);


  }
}
