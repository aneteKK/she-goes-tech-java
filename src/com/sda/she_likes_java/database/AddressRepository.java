package com.sda.she_likes_java.database;

import java.util.List;

public class AddressRepository {
private static final String allAddressesQuery = """
        SELECT ID, CITY, STREET, POSTAL_CODE,COUNTRY
        FROM ADDRESSED
        """;

private static final String findAddressById = """
        SELECT ID, CITY, STREET, POSTAL_CODE,COUNTRY
        FROM ADDRESSED
        WHERE CITY = %d
        """;

    private static final String findAddressByCityAndCountry = """
        SELECT ID, CITY, STREET, POSTAL_CODE,COUNTRY
        FROM ADDRESSED
        WHERE ID = %s AND COUNTRY = %s
        """;

    public static List<Address> getAllUsers(){
        return List.of();
    }
}
