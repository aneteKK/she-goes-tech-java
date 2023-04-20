package com.sda.she_likes_java.static_modifier;
public class WashMachineFactory {
    public static void main(String[] args) {
        WashMachine samsung = new WashMachine("Samsung", "1x2");
        WashMachine samsung2 = new WashMachine("Samsung", "1x2");
        for (int i = 0; i < 10; i++) {
            makeSomeWashMachines();
        }

        System.out.println("We have made some washing machines: " + WashMachine.getNumberOfCreatedMachines());
        // some generic way to obtain number of produced washmachines
    }


    public static void makeSomeWashMachines() {
        new WashMachine("LG", "1111");
        new WashMachine("LG", "112");
        new WashMachine("LG", "113451");
        new WashMachine("LG", "14551");
        new WashMachine("LG", "114555");
    }
}