package com.example.CRUDAplication.model;

import jakarta.persistence.*;
import lombok.*;

import javax.lang.model.element.Name;

@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String title;

    private String author;


}
