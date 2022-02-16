package com.turgaydede.business;

import com.turgaydede.business.exceptions.ProductNotFoundException;
import com.turgaydede.dataAccess.ProductDao;
import com.turgaydede.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager {
    ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void add(Product product) {
        this.productDao.save(product);
    }

    public void delete(int productId) {
        Product product = this.productDao.findById(productId)
                .orElseThrow(ProductNotFoundException::new);
        this.productDao.delete(product);
    }

    public void update(Product product) {
        this.productDao.save(product);
    }

    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
