package com.example.demo.app.insurance.controller;

import com.example.demo.app.insurance.model.response.InsuranceResponse;
import com.example.demo.app.insurance.service.InsuranceService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(value = "insurances")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsuranceController {

    InsuranceService insuranceService;

    @GetMapping
    public List<InsuranceResponse> findAll() {
        log.info("Enter GET API");
        return insuranceService.getAll();
    }

}
