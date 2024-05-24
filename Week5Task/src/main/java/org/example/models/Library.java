package org.example.models;

import org.example.services.PersonComparator;

import java.util.*;

public class Library {

    public static PriorityQueue<Person> peoplePriorityQueue = new PriorityQueue<>(new PersonComparator());
    public static Queue<Person> peopleQueue= new LinkedList<>();

   private List<Book> inventory;

    public Library() {
        this.inventory = new ArrayList<>();
    }

}
