package com.modernjava.records;

import java.math.BigDecimal;
import java.util.Objects;

public record Product(String name,
                      BigDecimal cost,
                      String type) {

    public Product {
        if (name != null && name.isBlank()) {
            throw new IllegalArgumentException("Name is not valid");
        }
        if (cost.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Cost is not valid");
        }
    }

    public Product(String name,
                   BigDecimal cost) {
        this(name, cost, "General");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(cost, product.cost) && Objects.equals(type, product.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, type);
    }
}
