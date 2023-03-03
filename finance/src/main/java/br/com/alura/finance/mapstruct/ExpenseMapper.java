package br.com.alura.finance.mapstruct;

import br.com.alura.finance.model.ExpenseEntity;
import br.com.alura.finance.model.dto.ExpenseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseMapper {
    ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);

    @Mappings({
            @Mapping(source = "key", target = "key"),
            @Mapping(source = "value", target = "value"),
            @Mapping(source = "createdDate", target = "createdDate"),
            @Mapping(source = "endDate", target = "endDate")
    })
    ExpenseDTO dtoToEntity(ExpenseEntity expense);

    @Mappings({
            @Mapping(source = "key", target = "key"),
            @Mapping(source = "value", target = "value"),
            @Mapping(source = "createdDate", target = "createdDate"),
            @Mapping(source = "endDate", target = "endDate")
    })
    ExpenseEntity saveDTOToEntity(ExpenseDTO expense);

}
