import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import model.services.ProductService;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("===================================");
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    ProductService ps = new ProductService();

    double sum = ps.filteredSum(list);

    System.out.println("Sum = " + String.format("%.2f", sum));

    System.out.println("===================================");
  }
}
