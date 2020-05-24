package db;

import java.sql.ResultSet;

public class Credentials extends Database{

    ResultSet credentials = null;

    public Credentials()
    {
        super();
        try{
            credentials = statement.executeQuery("SELECT * FROM credentials");
        } catch (Exception e) {
            printException(e);
        }
    }

    public void addAccount(String query)
    {
        try{
            statement.executeQuery(query);
        } catch(Exception e) {
            printException(e);
        }
    }

    public boolean nextRow(ResultSet credentials)
    {
        try {
            return credentials.next();
        } catch (Exception e) {
            printException(e);
            return false;
        }
    }

    public String getUsername(ResultSet credentials) {
        try {
            return credentials.getString("username");
        } catch (Exception e) {
            printException(e);
            return "";
        }
    }

    public String getPassword(ResultSet credentials) {
        try {
            return credentials.getString("password");
        } catch (Exception e) {
            printException(e);
            return "";
        }
    }

    public int getType(ResultSet credentials)
    {
        try {
            return credentials.getInt("type");
        } catch (Exception e) {
            printException(e);
            return 0;
        }
    }

    public void printAllCredentials()
    {
        try{
            while(nextRow(credentials)) {
                System.out.println("Username: " + getUsername(credentials));
                System.out.println("Password: " + getPassword(credentials));
                System.out.println("Type: " + getType(credentials) + "\n");
            }
        } catch(Exception e) {
            printException(e);
        }
    }
}
