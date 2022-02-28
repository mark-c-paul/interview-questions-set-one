package com.influencehealth.clinical.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

/*
 * For your third programming problem, modify the existing program to do the following:
 *
 * - Change the program from using a Statement to using a PreparedStatement that properly paramaterizes
 *   the where clause of the query.
 * - Fix any other problems you may see with how ResultSet/Statement/Connection objects
 * are being handled properly.
 *
 * Note that, in order for this program to actually work, it requires a local installation of mysql,
 * which you may not have access to. If not, don't worry about running the program, just make the 
 * modifications and make sure that the program compiles.
 */
public class ProblemThree
{
    // before use, double check these settings and make sure they are correct
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/connect";
    static final String USER = "developer";
    static final String PASS = "developer";
    static final String USER_ID_TO_QUERY = "1";

    public static void main(String[] args)
    {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Executing query...");
            //st = con.createStatement();
            String sql;
            sql = "SELECT id, user_mapping_id, first_name, last_name FROM connect.user_info WHERE id=?";
            st = (PreparedStatement) con.prepareStatement(sql);
            st.setString(1, USER_ID_TO_QUERY);
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                // Retrieve by column name
                int id = rs.getInt("id");
                int userMappingId = rs.getInt("user_mapping_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");

                System.out.println("ID: " + id);
                System.out.println("User Mapping ID: " + userMappingId);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
            }

            rs.close();
            st.close();
            con.close();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        System.out.println("Completed.");
    }
}
