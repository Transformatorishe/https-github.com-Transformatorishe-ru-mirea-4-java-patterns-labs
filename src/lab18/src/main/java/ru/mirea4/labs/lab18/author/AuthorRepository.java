package ru.mirea4.labs.lab18.author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author getAuthorById(Long id);
}
