package com.flipkart.digitalconsole30.exception;

public class InventoryUnitsNotFoundException extends Throwable {
    public InventoryUnitsNotFoundException(Integer id) {
        super("Inventory Unit Not Found: " + id);
    }
}
