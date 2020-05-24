package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public abstract class Database {
    protected Connection db = null;
    protected Statement statement = null;

    public Database()
    {
        try{
            db = DriverManager.getConnection("jdbc:sqlite:hivdb.sqlite");
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void close()
    {
        try {
            db.close();
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}
