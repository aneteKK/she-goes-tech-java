package com.sda.she_likes_java.classes.constructor;

public class FullPersone {

    String name;
    String surname;
    int age;
    FullAddress address;


    public FullPersone() {
    }

    public FullPersone(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return "FullPersone{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public void describeYourself(){
        System.out.println("Hi, I'm " + name);
    }


    public static void main(String[] args) {
        FullAddress address = new FullAddress("Latvia", "Riga", "Liela iela 3", "Lv2015");
        FullPersone personWithConstructor = new FullPersone("Anete", "Koknevica", 30, address);
        System.out.println("Person is : "+ personWithConstructor);

personWithConstructor.describeYourself();

FullPersone personWithoutAddress = new FullPersone("Alise", "Koknevica", 33, null);

personWithoutAddress.describeYourself();

    }




}
