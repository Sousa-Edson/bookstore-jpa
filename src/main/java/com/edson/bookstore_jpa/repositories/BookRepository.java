package com.edson.bookstore_jpa.repositories;

import com.edson.bookstore_jpa.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
    BookModel findBoookModelByTitle(String title);

    //    consulta nativa
    @Query(value = "SELECT * FROM tb_book WHERE publisher_id = :id", nativeQuery = true)
    List<BookModel> findBooksByPublisherId(@Param("id") UUID publisherId); // isto é uma consulta nativa

}
