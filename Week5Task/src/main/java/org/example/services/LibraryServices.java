package org.example.services;

import org.example.models.Book;
import org.example.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public interface LibraryServices {

     void addPersonToQueueOnPriority (Person persons);

    String requestBook(Person person, Book book);

    String giveBookBasedOnRole( Book book);

    void addPeopleToQueueOnFirstCome(Person person);


    String booksGivenByFirstCome(Book book);





}
