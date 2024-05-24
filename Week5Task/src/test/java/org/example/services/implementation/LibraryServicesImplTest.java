package org.example.services.implementation;

import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServicesImplTest {
    Person person = new Person("Sampson Gbewa", 30, Role.TEACHER);
    Book book = new Book("Things fall Apart" ,"Chinua Achebe",3);
    LibraryServicesImpl libraryServices = new LibraryServicesImpl();

    @Test
    void testToRequestBookWhenAvailable() {
        String result = libraryServices.requestBook(person,book);
        assertEquals("Sampson Gbewa Has requested for Things fall Apart",result);
    }

    @Test
    void giveBookBasedOnRole() {
        assertNotEquals(libraryServices.giveBookBasedOnRole(book), book);

    }

    @Test
    void booksGivenByFirstCome() {
        assertNotEquals(libraryServices.booksGivenByFirstCome(book), book);
    }
}