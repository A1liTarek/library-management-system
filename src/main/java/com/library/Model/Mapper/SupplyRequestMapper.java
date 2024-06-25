package com.library.Model.Mapper;

import com.library.Model.Dto.SupplyRequestDto;
import com.library.Model.SupplyRequest;
import org.mapstruct.Mapper;
import java.util.List;


@Mapper(componentModel = "spring")
public interface SupplyRequestMapper {

    SupplyRequestDto toDto(SupplyRequest supplyRequest);

    SupplyRequest toEntity(SupplyRequestDto supplyRequestDto);

    List<SupplyRequestDto> toListDto(List<SupplyRequest> supplyRequests);
}
