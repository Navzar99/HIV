package db;

import java.sql.ResultSet;

public class Credentials extends Database{

    public Credentials()
    {
        super();
    }

    public void addAccount(String query)
    {
        try{
            this.statement = this.db.createStatement();
            statement.executeQuery(query);
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void printAllCredentials()
    {
        try{
            this.statement = this.db.createStatement();
            ResultSet credentials = statement.executeQuery("SELECT * FROM credentials");
            while(credentials.next()) {
                String username = credentials.getString("username");
                String password = credentials.getString("password");
                int userType = credentials.getInt("type");

                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("Type: " + userType + "\n");
            }
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
