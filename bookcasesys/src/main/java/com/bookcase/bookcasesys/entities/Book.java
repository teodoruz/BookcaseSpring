package com.bookcase.bookcasesys.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Title;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
