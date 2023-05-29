package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    //handle internally

/** Script for creating table
* CREATE TABLE TEST
* (ID INT PRIMARY KEY, NAME VARCHAR(255));
*
        * Script for inserting one record (row) into table
* INSERT INTO
* TEST(ID, NAME)
* VALUES(1, 'Olga');
*
        * Script for reading data
* SELECT ID, NAME
 FROM TEST;
 *Script for updating data
 UPDATE TEST -- name of table to update
 SET NAME = 'Alma' -- column value to change
 WHERE ID=2; -- selected raw

 *Script for deleting data
 *
 * DELETE FROM
 * TEST
 * WHERE ID = 1;
 *
 * To see all recorded in table students
 * SELECT * FROM STUDENTS ;
*/
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db", "sa", "sa");
        } catch (SQLException e) {
            return null;
        }

    }

    //declare

    public static Connection getConnectionButSometimesThrow() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db", "sa", "sa");
    }
}
