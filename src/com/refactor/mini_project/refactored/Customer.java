package com.refactor.mini_project.refactored;

import java.util.Enumeration;
import java.util.Vector;

class Customer {

    private String name;
    private Vector rentals = new Vector();

    Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Enumeration rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result.append("\t").append(each.getMovie().getTitle())
                    .append("\t").append(String.valueOf(each.getCharge())).append("\n");
        }
        result.append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n")
                .append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints()))
                .append(" frequent renter points");
        return result.toString();
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

}
