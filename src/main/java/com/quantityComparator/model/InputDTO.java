package com.quantityComparator.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class InputDTO {
    private long inputValue;
    private IUnit unitType;

    public InputDTO() {
    }

    public InputDTO(long inputValue, IUnit unitType) {
        this.unitType = unitType;
        this.inputValue = inputValue;
    }

    public IUnit getUnitType() {
        return this.unitType;
    }

    public long getValue() {
        return this.inputValue;
    }
}
