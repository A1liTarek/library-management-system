package com.library.Model;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table
public class SupplyRequest extends BaseEntity{
    @ManyToMany
    @JoinTable(name = "BOOK_SUPPLY_REQUEST",
            joinColumns = @JoinColumn(name = "SUPPLY_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID")
    )
    private List<Book> bookList;

    @Column(name = "TOTAL_PRICE")
    private Double totalPrice;

    @Column(name = "SUPPLY_DATE")
    private Date requestDate;

    @ManyToOne
    @JoinColumn(name = "VENDOR_ID",updatable = false,insertable = false)
    private Vendor vendor;

    @Column(name = "VENDOR_ID")
    private Long vendorId;
}
