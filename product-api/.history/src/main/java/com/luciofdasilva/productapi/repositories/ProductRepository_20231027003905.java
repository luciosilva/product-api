package com.luciofdasilva.productapi.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductId, Long> {

    @Que
} 