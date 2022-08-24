package com.example.demo.app.insurance.model.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "insurance_comparison")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsuranceComparisonEntity {

    @Id
    @Column
    Long id;

    @Column
    String coverage;

    @Column
    String ipd;

    @Column
    String opd;

}
