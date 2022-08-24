package com.example.demo.app.insurance.repository;

import com.example.demo.app.insurance.model.entity.InsuranceEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InsuranceRepository extends CrudRepository<InsuranceEntity, Long> {

    List<InsuranceEntity> findAll();

}
