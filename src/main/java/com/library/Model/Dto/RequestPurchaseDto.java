package com.library.Model.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.library.Model.Book;
import com.library.Model.Customer;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestPurchaseDto{
    private Long id;
    private String name;
    private List<BookDto> bookList;
    private Double totalPrice;
    private Date requestDate;
    private CustomerDto customer;
    private Long customerId;
}
