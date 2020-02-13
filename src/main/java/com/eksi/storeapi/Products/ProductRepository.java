package com.eksi.storeapi.Products;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    void deleteById(String id);

    @Query("select p from Product p where p.name like %?1% or p.id like %?1% or p.description like %?1%")
    List<Product> findByName(String name);
}
