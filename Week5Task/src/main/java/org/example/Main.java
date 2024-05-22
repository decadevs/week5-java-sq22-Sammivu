package org.example;

import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.Person;
import org.example.services.implementation.LibraryServicesImpl;

import java.util.ArrayList;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PriorityQueue<Person> people = new PriorityQueue<>();
        //People that can be added to the queue
        Person p1 = new Person("Sampson", 30, Role.TEACHER);
        Person p2 = new Person("Alabo Hamlet", 23,  Role.SENIOR_STUDENT);
        Person p3 = new Person("Sunday Agbo", 40, Role.TEACHER);
        Person p4 = new Person("Royal Mathias", 16, Role.JUNIOR_STUDENT);

        //Books that can be added to the Library
        Book book1 = new Book("How time flies" ,"Hamlet",3);
        Book book2 = new Book("Today is here", "Royal",9);
        Book book3 = new Book("The future is here", "Yomi",4);

        Library librarian = new Library();
        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);


        LibraryServicesImpl libraryServices = new LibraryServicesImpl();

        //Adding people to queue
        libraryServices.addPersonToQueue(p2);
        libraryServices.addPersonToQueue(p3);
        libraryServices.addPersonToQueue(p4);
        libraryServices.addPersonToQueue(p1);

        // People's request to borrow book
        p1.setBookBorrowed(book3);
        p2.setBookBorrowed(book2);

        //Processing request from people
//        libraryServices.addRequest(book3,p1);
//        libraryServices.addRequest(book2,p2);


        //Book availability check
        System.out.println(libraryServices.checkBookAvailability(p1,librarian.getBooks()));
        System.out.println("****************************");

        //Based on the persons on queue
        System.out.println(libraryServices.booksGivenByRole(p2, librarian.getBooks()));
        System.out.println(libraryServices.booksGivenByRole(p3, librarian.getBooks()));
        System.out.println(libraryServices.booksGivenByRole(p1, librarian.getBooks()));
        System.out.println("*****************************************");

        //Books given by priority
        libraryServices.booksGivenByRole(librarian.getBooks());

    }
}