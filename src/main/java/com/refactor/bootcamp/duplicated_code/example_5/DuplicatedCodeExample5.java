package com.refactor.bootcamp.duplicated_code.example_5;

class DuplicatedCodeExample5 {

    private final Hotel hotel;
    private final Person person;

    public DuplicatedCodeExample5(Hotel hotel, Person person) {
        this.hotel = hotel;
        this.person = person;
    }

    public String getHotelTelephoneNumber() {
        return hotel.getTelephoneNumber();
    }

    public String getPersonOfficeTelephoneNumber() {
        return person.getOfficeTelephoneNumber();
    }
}
