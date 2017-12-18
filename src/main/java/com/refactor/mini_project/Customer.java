package com.refactor.mini_project;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;
    private Vector<Rental> rentals = new Vector<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    String statement() {
        Enumeration<Rental> rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            //show figures for this rental
            result.append("\t")
                .append(each.getMovie().getTitle())
                .append("\t")
                .append(each.getThisAmount()).append("\n");
        }
        //add footer lines
        result.append("Amount owed is ")
            .append(getTotalAmount())
            .append("\n");
        result.append("You earned ")
            .append(getAllFrequentRenterPoints())
            .append(" frequent renter points");
        return result.toString();
    }

    private double getTotalAmount() {
        Enumeration<Rental> rentals = this.rentals.elements();
        double totalAmount = 0;
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            totalAmount += each.getThisAmount();
        }
        return totalAmount;
    }

    private int getAllFrequentRenterPoints() {
        Enumeration<Rental> rentals = this.rentals.elements();
        int frequentRenterPoints = 0;
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

}
