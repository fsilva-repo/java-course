package _0test.composition;

public class Main {
  public static void main(String[] args) {
    Product desodorante = new Product("Desodorante axe", 12.0);
    Product sabonete = new Product("Sabonete dove", 18.70);
    Product foi_dental = new Product("Fio dental", 8.25);
    Product creme_dental = new Product("Creme dental", 7.80);

    Buy buy = new Buy();

    buy.addProduct(desodorante);
    buy.addProduct(sabonete);
    buy.addProduct(foi_dental);
    buy.addProduct(creme_dental);

    buy.showProductsList();

    System.out.println(buy.total());
  }
}