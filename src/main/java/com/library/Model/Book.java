package com.library.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book extends BaseEntity{

    @Column(name = "NUMBER_OF_PAGE")
    private Integer numberOfPage;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "QUANTITY")
    private Integer quantity;
}
