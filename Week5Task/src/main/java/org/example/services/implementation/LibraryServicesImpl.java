package org.example.services.implementation;

import org.example.models.Book;
import org.example.models.Person;
import org.example.services.PersonComparator;
import org.example.services.LibraryServices;
import org.w3c.dom.ls.LSOutput;


import static org.example.models.Library.peoplePriorityQueue;
import static org.example.models.Library.peopleQueue;

public class LibraryServicesImpl implements LibraryServices {


    @Override
    public void addPersonToQueueOnPriority(Person persons) {
        peoplePriorityQueue.add(persons);
    }

    @Override
    public String requestBook(Person person, Book book) {
        if(book.getQuantityAvailable() <=0){
            return "Book not Available";
        }
        peoplePriorityQueue.add(person);
        return person.getFullName()+ " Has requested for "+book.getBookTitle();

    }

    @Override
    public String giveBookBasedOnRole(Book book) {
        if (peoplePriorityQueue.isEmpty()) {
            System.out.println("No person on the queue");
            return "No person on the queue";
        } else if (book.getQuantityAvailable() == 0) {
            System.out.println("Book Taken");
            return "Book Taken";
        }
        Person person = peoplePriorityQueue.poll();

        book.setQuantityAvailable(book.getQuantityAvailable() - 1);
        assert person != null;
        System.out.println(person.getFullName() + "has borrowed Book title" + book.getBookTitle() + ".");
        return person.getFullName() + "Has borrowed" + book.getBookTitle() + ".";

    }

    @Override
    public void addPeopleToQueueOnFirstCome(Person person) {
        peopleQueue.add(person);
    }

    @Override
    public String booksGivenByFirstCome(Book book) {

        if (peopleQueue.isEmpty()) {
            return "Nobody on queue";
        } else if (book.getQuantityAvailable() == 0) {
            return "Book Taken";
        }
        //reduces the number of book
        Person person = peopleQueue.poll();
        book.setQuantityAvailable(book.getQuantityAvailable() - 1);

        assert person != null;
       // System.out.println(person.getFullName() + " " + person.getRole() + ", borrowed: " + bookTitle.getBookTitle() + ".");
        return person.getFullName() + " " + person.getRole() + ", borrowed Book title: " + book.getBookTitle() + ".";

    }
}





