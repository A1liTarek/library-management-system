package com.library.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Setter
@Getter
public class Customer extends BaseEntity{

    @OneToMany(mappedBy = "customer")
    private List<RequestPurchase> purchaseList;
}
