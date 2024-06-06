package com.edson.bookstore_jpa;

import com.edson.bookstore_jpa.models.BookModel;
import com.edson.bookstore_jpa.models.PublisherModel;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreJpaApplication.class, args);

		BookModel b = new BookModel();
		b.setTitle("Book 1");
		System.out.println(b);
	}


}
