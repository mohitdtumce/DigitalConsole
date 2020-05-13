package com.flipkart.digitalconsole30.repository;

import com.flipkart.digitalconsole30.model.InventoryUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryUnitsRepository extends JpaRepository<InventoryUnit, Integer> {
}
