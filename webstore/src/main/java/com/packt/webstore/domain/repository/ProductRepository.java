package com.packt.webstore.domain.repository;
import java.util.List;

import com.packt.webstore.domain.*;

public interface ProductRepository {
	List <Product> getAllProducts();
	List <Product> getProductsByCategory(String category);
	Product getProductById(String productId);
}
