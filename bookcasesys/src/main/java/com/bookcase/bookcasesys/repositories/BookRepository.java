package com.bookcase.bookcasesys.repositories;

import com.bookcase.bookcasesys.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
