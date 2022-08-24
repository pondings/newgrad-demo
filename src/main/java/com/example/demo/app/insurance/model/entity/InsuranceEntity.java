package com.example.demo.app.insurance.model.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "insurance")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsuranceEntity {

    @Id
    @Column
    Long id;

    @Column
    String name;

    @OneToMany
    @JoinColumn(name = "insuranceId", referencedColumnName = "id")
    List<InsuranceBulletEntity> bulletEntities;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    InsuranceComparisonEntity insuranceComparisonEntity;

}
