package com.library.Model.Mapper;

import com.library.Model.Dto.RequestPurchaseDto;
import com.library.Model.RequestPurchase;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RequestPurchaseMapper{

    RequestPurchaseDto toDto(RequestPurchase requestPurchase);

    RequestPurchase toEntity(RequestPurchaseDto requestPurchaseDto);

    List<RequestPurchaseDto> toListDto(List<RequestPurchase> requestPurchases);
}
