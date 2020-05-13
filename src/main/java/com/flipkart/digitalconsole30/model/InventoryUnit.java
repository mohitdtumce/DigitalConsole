package com.flipkart.digitalconsole30.model;

import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.*;

@Entity(name = "inventory_units")
@Data
public class InventoryUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inventory_unit_id")
    private Integer inventoryUnitId;

    @Column(name = "inventory_id")
    private Integer inventoryId;

    @Column(name = "inventory_type")
    private String inventoryType;

    @Column(name = "activation_hash")
    private String activationHash;

    @Column(name = "state")
    private String state;

    @Column(name = "created_at")
    private DateTime createdAt;

    @Column(name = "updated_at")
    private DateTime updatedAt;


}
