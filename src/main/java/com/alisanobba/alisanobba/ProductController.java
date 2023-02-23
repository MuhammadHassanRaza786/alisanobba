package com.alisanobba.alisanobba;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Product/list")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    public ProductServicesImpl ProductServices;

    @PostMapping("")
    public ResponseEntity<Product>saveProduct(@RequestBody Product product){
        Product product1 = ProductServices.saveProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return ProductServices.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product1 = ProductServices.getProductById(id);
        if (product1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Product>(product1, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        Product product1 = ProductServices.getProductById(id);
        if (product1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            ProductServices.deleteProduct(id);;
            System.out.println("product deleted successfully");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
