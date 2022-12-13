package jpabook.jpashop.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateItemDto {
    private final String name;
    private final int price;
    private final int stockQuantity;

    @Builder
    public UpdateItemDto(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}
