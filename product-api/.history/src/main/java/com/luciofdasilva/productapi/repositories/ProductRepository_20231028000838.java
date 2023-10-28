package com.luciofdasilva.productapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.luciofdasilva.productapi.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select p "
    + "from product p "
    + "join category c on p.category_id = c.id "
    + "where c.id = 1 ")
    public List<Product> getProductByCategory(@Param("category_id") long category_id);

    public Product findByProductIdentifier(String productIdentifier);
}