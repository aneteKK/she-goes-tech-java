package com.sda.she_likes_java.final_project.entity;

import java.time.LocalDate;
import java.util.Objects;

public final class User {
    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;
    private final String login;
    private final String password;
    private final LocalDate drivingLicenseIssueDate;

    public User(String name, String surname, LocalDate dateOfBirth, String login, String password,
                LocalDate drivingLicenseIssueDate) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.login = login;
        this.password = password;
        this.drivingLicenseIssueDate = drivingLicenseIssueDate;
    }

    public String name() {
        return name;
    }

    public String surname() {
        return surname;
    }

    public LocalDate dateOfBirth() {
        return dateOfBirth;
    }

    public String login() {
        return login;
    }

    public String password() {
        return password;
    }

    public LocalDate drivingLicenseIssueDate() {
        return drivingLicenseIssueDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (User) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.surname, that.surname) &&
                Objects.equals(this.dateOfBirth, that.dateOfBirth) &&
                Objects.equals(this.login, that.login) &&
                Objects.equals(this.password, that.password) &&
                Objects.equals(this.drivingLicenseIssueDate, that.drivingLicenseIssueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth, login, password, drivingLicenseIssueDate);
    }

    @Override
    public String toString() {
        return "User[" +
                "name=" + name + ", " +
                "surname=" + surname + ", " +
                "dateOfBirth=" + dateOfBirth + ", " +
                "login=" + login + ", " +
                "password=" + password + ", " +
                "drivingLicenseIssueDate=" + drivingLicenseIssueDate + ']';
    }


}