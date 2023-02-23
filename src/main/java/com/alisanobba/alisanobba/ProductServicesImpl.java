package com.alisanobba.alisanobba;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServicesImpl implements ProductServices{
    @Autowired
    public ProductRepository productRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

      // get all information
      public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

}
