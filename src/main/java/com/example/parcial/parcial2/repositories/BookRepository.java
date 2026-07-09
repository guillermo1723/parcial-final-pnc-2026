package com.example.parcial.parcial2.repositories;

import com.example.parcial.parcial2.domain.entities.Book;
import com.example.parcial.parcial2.domain.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {

    Optional<Book> findByIsbn(String isbn);

    List<Book> findByAuthor(String author);

    List<Book> findByGenre(Genre genre);

    List<Book> findByAuthorAndGenre(String author, Genre genre);
    // 1- Se ha modificado de String a Enum, paso a ser Genre, y eso hacía
    // que no recibiera correctamente el tipo de dato
}
