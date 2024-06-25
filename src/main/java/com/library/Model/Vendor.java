package com.library.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Setter
@Getter
@Entity
@Table
public class Vendor extends BaseEntity{

    @OneToMany(mappedBy = "vendor")
    List<SupplyRequest> supplyRequests;
}
