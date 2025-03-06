package edu.consumer.example_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleBiFunction;
import java.util.function.Function;

public class Main {
  public static void main(String[] args) {
    /*
     * 
     */
    List<String> namesList = Arrays.asList("Edu", "Ana", "Mia", "Leo", "Pow");
    Consumer<String> names = s -> System.out.println(s.toUpperCase());

    namesList.forEach(names);

    Product p1 = new Product(null, 12.0);
    Function<Product, Double> extractPrice = p -> p.getPrice();

    System.out.println(extractPrice.apply(p1));

    Product paoFrances = new Product("Pao Frances kg: ", 14.0);
    Product boloCenoura = new Product("Bolo Cenoura kg: ", 23.);
    Product paoForma = new Product("Pao de Forma Un: ", 6.99);
    Product boloChoco = new Product("Bolo de Chocolate kg: ", 26.75);
    List<Product> padaria = Arrays.asList(paoForma, paoFrances, boloChoco, boloCenoura);

    Product desodoranteAxe = new Product("Desodoraante Axe Un: ", 12.0);
    Product desodoranteNivia = new Product("Desodorante Nivia", 17.0);
    Product cremeSeda = new Product("Creme Seda liso intenso Un: ", 25.0);
    Product cremeDental = new Product("Creme Dental Colgate Un: ", 5.45);
    List<Product> mercearia = Arrays.asList(desodoranteAxe, desodoranteNivia, cremeDental, cremeSeda);

    List<Product> limpeza = new ArrayList<>();
    List<Product> perfumaria = new ArrayList<>();

    List<Object> storage = new ArrayList<>(null);
    storage.add(padaria);
    storage.add(mercearia);
    storage.add(limpeza);
    storage.add(perfumaria);
  }
}
