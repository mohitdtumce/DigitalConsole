package com.flipkart.digitalconsole30.controller;

import com.flipkart.digitalconsole30.exception.InventoryUnitsNotFoundException;
import com.flipkart.digitalconsole30.model.InventoryUnit;
import com.flipkart.digitalconsole30.repository.InventoryUnitsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryUnitController {

    private InventoryUnitsRepository inventoryUnitsRepository;

    InventoryUnitController(InventoryUnitsRepository inventoryUnitsRepository) {
        this.inventoryUnitsRepository = inventoryUnitsRepository;
    }

    @GetMapping("/get/all")
    List<InventoryUnit> getAllInventoryUnits() {
        return inventoryUnitsRepository.findAll();
    }

    @GetMapping("/get/{id}")
    InventoryUnit getInventoryUnit(@PathVariable Integer id) throws InventoryUnitsNotFoundException {
        return inventoryUnitsRepository.findById(id)
                .orElseThrow(() -> new InventoryUnitsNotFoundException(id));
    }

    @PostMapping("/add_new_unit")
    InventoryUnit addNewUnit(@RequestBody InventoryUnit inventoryUnit) {
        return inventoryUnitsRepository.save(inventoryUnit);
    }
}
