package com.library.Model;

import jakarta.persistence.*;
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
@Entity
@Table
public class RequestPurchase extends BaseEntity{

    @ManyToMany
    @JoinTable(name = "BOOK_REQUEST_PURCHASE",
    joinColumns = @JoinColumn(name = "REQUEST_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID")
    )
    private List<Book> bookList;

    @Column(name = "TOTAL_PRICE")
    private Double totalPrice;

    @Column(name = "REQUEST_DATE")
    private Date requestDate;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID",insertable = false,updatable = false)
    private Customer customer;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;
}
