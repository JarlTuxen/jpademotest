package dk.kea.jpademotest.repository;

import dk.kea.jpademotest.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void getProducts(){
        List<Product> products = new ArrayList<>();

        productRepository.findAll().forEach(products::add);

        assertEquals(2, products.size());

        products.forEach(System.out::println);
    }
}