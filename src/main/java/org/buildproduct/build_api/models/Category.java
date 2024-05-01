package org.buildproduct.build_api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    @OneToMany
    //by default fetch type is lazy because we dont want to load all the products when we load the category
//    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;


}

