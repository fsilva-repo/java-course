package _0test.composition;

import java.util.ArrayList;

public class Calculator {
  /*
   * Calculator possue um array de instancias do tipo Product
   */
  private ArrayList<Product> products;

  /*
   * O atributo products, apartir desse metodo recebe um deterrminado array de
   * instacias do tipo Product
   */
  public void setProducts(ArrayList<Product> p) {
    this.products = p;
  }

  /*
   * O atributo preco das instancias do typo Product que estao no array serao
   * acessados e somados retornando o total
   */
  public double calculatingPrices() {
    double x = 0;
    for (Product p : products) {
      x += p.getPrice();
    }
    return x;
  }

}
