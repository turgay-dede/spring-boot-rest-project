package com.turgaydede.api;

import com.turgaydede.business.ProductManager;
import com.turgaydede.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private final ProductManager productManager;

    public ProductsController(ProductManager productManager) {
        this.productManager = productManager;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody Product product) {
        this.productManager.add(product);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam int productId) {
        this.productManager.delete(productId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Product product) {
        this.productManager.update(product);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok().body(this.productManager.getAll());
    }
}
