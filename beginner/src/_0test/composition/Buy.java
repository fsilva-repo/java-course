package _0test.composition;

import java.util.ArrayList;

public class Buy {
  /*
   * Utilizando se da composicao
   * podemos  reutilizar codigos sem a  nessecidade da heranca,
   * como e nesse caso,
   * invocamos o metodo da calss Calculator apenas referenciando
   * ela  dentro da class Buy.
   */
  private Calculator calc;
  private ArrayList<Product> products = new ArrayList<>();

  public Buy() {
    this.calc = new Calculator();
    calc.setProducts(products);
  }

  public void addProduct(Product p) {
    products.addLast(p);
  }

  public void showProductsList() {
    for (Product product : products) {
      String parsead = String.valueOf(product.getPrice());
      String msg = String.format("Product: %s Price: %s", product.getName(), parsead);
      System.out.println(msg);
    }
  }

  public double total() {
    double total = calc.calculatingPrices();
    return total;
  }
}
