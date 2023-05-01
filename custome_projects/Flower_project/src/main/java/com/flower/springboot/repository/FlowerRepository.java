package com.flower.springboot.repository;
import com.flower.springboot.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FlowerRepository extends JpaRepository<Flower,Integer>{

}
