package com.customer.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.springboot.entity.Flower;
@Repository
public interface FlowerRepository extends JpaRepository<Flower,Integer>{

}
