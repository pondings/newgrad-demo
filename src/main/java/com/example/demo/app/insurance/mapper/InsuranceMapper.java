package com.example.demo.app.insurance.mapper;

import com.example.demo.app.insurance.model.entity.InsuranceBulletEntity;
import com.example.demo.app.insurance.model.entity.InsuranceEntity;
import com.example.demo.app.insurance.model.response.InsuranceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface InsuranceMapper {

    @Mapping(target = "bullets", source = "bulletEntities", qualifiedByName = "mapBullets")
    @Mapping(target = "coverage", source = "insuranceComparisonEntity.coverage")
    @Mapping(target = "ipd", source = "insuranceComparisonEntity.ipd")
    @Mapping(target = "opd", source = "insuranceComparisonEntity.opd")
    InsuranceResponse toResponse(InsuranceEntity entity);

    List<InsuranceResponse> toResponses(List<InsuranceEntity> entities);

    @Named("mapBullets")
    default List<String> mapBullets(List<InsuranceBulletEntity> bulletEntities) {
        return bulletEntities.stream().map(InsuranceBulletEntity::getName)
                .collect(Collectors.toList());
    }

}
