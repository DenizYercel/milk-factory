package com.guruspringframework.milkfactory.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MilkDto {

    private UUID id;
    private String milkName;
    private String milStyle;
    private Locale upc;
}
