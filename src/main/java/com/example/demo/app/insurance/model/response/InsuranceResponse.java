package com.example.demo.app.insurance.model.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsuranceResponse {

    Long id;
    String name;
    List<String> bullets;

    String coverage;
    String opd;
    String ipd;

}
