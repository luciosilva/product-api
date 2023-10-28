package com.luciofdasilva.productapi.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductId, Long> {

    @Query(value = "select p "
    + "from product p "
    + "join category c on p.category_id = c.i"