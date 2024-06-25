package com.library.Model.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.library.Model.Vendor;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplyRequestDto{
    private Long id;
    private String name;
    private VendorDto vendor;
    private Long vendorId;
    private Double totalPrice;
    private Date requestDate;
}
