package com.luciofdasilva.productapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select p "
    + "from product p "
    + "join category c on p.category_id = c.id "
    + "where c.id = :category_id ")
    public List<Product> findAll();