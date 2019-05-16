package com.jsmu.exercise.entities;

import lombok.*;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Getter
@Setter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @NotNull (message = "Product's name can not be null")
    @NotEmpty(message = "Product's name can not be empty")
    @Size(max = 255 , message = "Product's name must be a maximum of 255 characters")
    private String name;

    @NotNull (message = "Product's value can not be null")
    @Digits(message = "Product's value is wrong", integer = 15 , fraction = 2)
    private double value;

}
