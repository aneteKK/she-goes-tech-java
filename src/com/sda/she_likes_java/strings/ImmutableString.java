package com.sda.she_likes_java.strings;
//imutable class - class with no setters, you cannot modify, there are only getters - you can get info, not change it
    public class ImmutableString {
        public static void main(String[] args) {
            String name = "Anete";
            // name + “Koknevica”
            name.concat("Koknevica"); // + is shortcut for concat method call
            name = name.concat("she is 30");

 System.out.println("My name now: " + name);
            StringBuilder nameWithBuilder = new StringBuilder("Koknevica");
            nameWithBuilder.append("Koknevica");
            System.out.println("Name with builder: " + nameWithBuilder);
            String some = "Alice" + "is" + "10" + "years";
            // “Alice is” + ” 10" + ” years”
            // “Alice is 10" + years”
            // Alice is 10 years
            String alice = "Alice ";
            StringBuilder someString = new StringBuilder();
            someString.append("Alice");
            someString.append("is");
            someString.append("10");
            someString.append("years");
        }
    }
