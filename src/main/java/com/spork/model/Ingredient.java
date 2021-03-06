package com.spork.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ingredient {
    private String text;
    private Float weight;

    public Ingredient(String text) {
        this.text = text;
    }
}
