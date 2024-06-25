package com.library.Model.Mapper;

import com.library.Model.Dto.VendorDto;
import com.library.Model.Vendor;
import org.mapstruct.Mapper;
import java.util.List;


@Mapper(componentModel = "spring")
public interface VendorMapper{

    VendorDto toDto(Vendor vendor);

    Vendor toEntity(VendorDto vendorDto);

    List<VendorDto> toListDto(List<Vendor> vendors);
}
