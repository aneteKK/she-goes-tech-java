package com.sda.she_likes_java.final_project.repository;

import com.sda.she_likes_java.final_project.entity.User;
import com.sda.she_likes_java.final_project.exception.InexperiencedUserException;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private static long userCounter;
    private Map<Long, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public void registerNewUser(String name, String surname, LocalDate dateOfBirth, String login, String password, LocalDate drivingLicenseIssueDate) throws InexperiencedUserException {
        //check if user is eligible for registering
        checkDrivingLicense(drivingLicenseIssueDate);
        //get new id
       Long id = nextId();
        //register user
        registerUser(name, surname, dateOfBirth, login, password, drivingLicenseIssueDate, id);
    }
    private void registerUser(String name, String surname, LocalDate dateOfBirth, String login, String password, LocalDate drivingLicenseIssueDate, Long id) {
        User newUser = new User(id, name, surname, dateOfBirth, login, password, drivingLicenseIssueDate);
        users.put(id, newUser);
    }

    private static long nextId(){
        return ++userCounter;
    }
private void checkDrivingLicense(LocalDate drivingLicenseIssueDate) throws InexperiencedUserException {
//at least three years license
    final int requiredNumberOfYears = 3;
    LocalDate currentDate = LocalDate.now();
    LocalDate boundaryDate = drivingLicenseIssueDate.plusYears(requiredNumberOfYears);

    if(boundaryDate.isAfter(currentDate)){
        throw new InexperiencedUserException("Better buy a bicycle");

    }
}

    public void deleteUser() {

    }

    public List<User> listAllUsers() {
        return List.of();
    }

    public void updateUser(User user) {

    }

    public List<User> getUsersBasedOnCriteria() {
        return List.of();
    }

    public List<User> getOrderedUsers(Comparator<User> comparator) {
        return List.of();
    }
}
