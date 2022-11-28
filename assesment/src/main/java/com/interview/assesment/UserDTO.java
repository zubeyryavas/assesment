package com.interview.assesment;

import java.util.UUID;


public class UserDTO {
    private UUID loginUuid;
    private String gender;
    private String firstName;
    private String lastName;
    private String city;
    private String registrationDate;

    public UserDTO(UUID loginUuid, String gender, String firstName, String lastName, String city, String registrationDate) {
        this.loginUuid = loginUuid;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.registrationDate = registrationDate;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getLoginUuid() {
        return loginUuid;
    }

    public void setLoginUuid(UUID loginUuid) {
        this.loginUuid = loginUuid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "loginUuid=" + loginUuid +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
}
