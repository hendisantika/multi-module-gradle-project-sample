package id.my.hendisantika.search;

import id.my.hendisantika.common.Product;
import id.my.hendisantika.common.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/search")
public class SearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

    /*
        Simple GET call to test this application.
     */
    @GetMapping("/hello")
    public String hello() {
        return "Search: Hello";
    }

    /*
       Simple GET call to see whether we are able return a class as JSON.
    */
    @GetMapping("/product")
    public Product product() {
        return new Product(1, "Laptop", "Laptop", 45000d);
    }

    /*
        Get call using a Path param and return a Product as JSON.
     */
    @GetMapping("/product/{id}")
    public Product productWith(@PathVariable("id") long id) {
        Optional<Product> product = ProductService.getProducts()
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst();
        return product.get();
    }

}
