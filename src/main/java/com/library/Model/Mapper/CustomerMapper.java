package com.library.Model.Mapper;

import com.library.Model.Customer;
import com.library.Model.Dto.CustomerDto;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper{
    CustomerDto toDto(Customer customer);

    Customer toEntity(CustomerDto customerDto);

    List<CustomerDto> toListOfDto(List<Customer> customerList);
}
