package com.emergentspark.cartwave.service.product;

import com.emergentspark.cartwave.dto.product.ProductDTO;
import com.emergentspark.cartwave.model.Product;
import com.emergentspark.cartwave.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    // Additional service methods if needed
    public List<ProductDTO> getAllProductDTOs() {
        return getAllProducts().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO convertToDTO(Product product) {
           ProductDTO productDTO = new ProductDTO();
            productDTO.setName(product.getName());
            productDTO.setDescription(product.getDescription());
            productDTO.setCategory(product.getCategory());
            productDTO.setQuantity(product.getQuantity());
            productDTO.setPrice(product.getPrice());
            return productDTO;
    }
}