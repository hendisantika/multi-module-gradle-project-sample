package id.my.hendisantika.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : multi-module-gradle-project-sample
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 08/02/25
 * Time: 16.10
 * To change this template use File | Settings | File Templates.
 */
public class ProductService {
    private static final List<Product> products = new ArrayList<>();

    // To initialize all the products.
    static {
        if (products == null || products.isEmpty()) {
            for (long i = 1; i <= 5; i++) {
                Product p = new Product(i, "Product-" + i, "Product-" + i, 1000d * i);
                products.add(p);
            }
        }
    }
}
