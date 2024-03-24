package co.cstad.restfulsampleapi.service;

import co.cstad.restfulsampleapi.dto.ProductRequest;
import co.cstad.restfulsampleapi.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProduct(String productName);
    ProductResponse createProduct(ProductRequest productRequest);
    void deleteProduct(int id);
    ProductResponse updateProduct(int id,ProductRequest productRequest);
    ProductResponse findProductById(int id);

}
