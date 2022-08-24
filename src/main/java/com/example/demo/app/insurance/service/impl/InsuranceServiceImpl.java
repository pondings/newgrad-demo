package com.example.demo.app.insurance.service.impl;

import com.example.demo.app.insurance.mapper.InsuranceMapper;
import com.example.demo.app.insurance.model.response.InsuranceResponse;
import com.example.demo.app.insurance.repository.InsuranceRepository;
import com.example.demo.app.insurance.service.InsuranceService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsuranceServiceImpl implements InsuranceService {

    InsuranceRepository insuranceRepository;
    InsuranceMapper insuranceMapper;

    @Override
    public List<InsuranceResponse> getAll() {
        log.info("[ENTER] InsuranceService get all");
        return insuranceMapper.toResponses(insuranceRepository.findAll());
    }

}
