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
        Person teacher = new Person("Sampson Gbewa", 30, Role.TEACHER);
        Person senior = new Person("Alabo Hamlet", 23,  Role.SENIOR_STUDENT);
        Person junior = new Person("Royal Mathias", 16, Role.JUNIOR_STUDENT);

        //Books that can be added to the Library
        Book book1 = new Book("Things fall Apart" ,"Chinua Achebe",2);
        Book book2 = new Book("Purple Hibiscus", "Chimamanda Ngozi Adichie",2);
        Book book3 = new Book("Stay with Me", "Ayọ̀bámi Adébáyọ̀",2);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();

        System.out.println("*****************************************");
        //Adding people to queue
        System.out.println("First Come");
        libraryServices.addPeopleToQueueOnFirstCome(junior);
        libraryServices.addPeopleToQueueOnFirstCome(senior);


        System.out.println(libraryServices.booksGivenByFirstCome(book3));
        System.out.println(libraryServices.booksGivenByFirstCome(book3));
        System.out.println(libraryServices.booksGivenByFirstCome(book3));
//        libraryServices.booksGivenByFirstCome(book3);
//        libraryServices.booksGivenByFirstCome(book3);


        System.out.println("****************************");
        System.out.println("Priority");
        //Adding people to queue
        libraryServices.requestBook(junior, book2);
        libraryServices.requestBook(senior, book2);
        libraryServices.requestBook(teacher, book1);


        libraryServices.giveBookBasedOnRole(book1);
        libraryServices.giveBookBasedOnRole(book1);
        libraryServices.giveBookBasedOnRole(book1);

        System.out.println("*************************");


    }
}