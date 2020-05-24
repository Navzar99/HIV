package db;

public class Main {
    public static void main(String args[]) {
        Credentials db = new Credentials();
        //db.addAccount("INSERT INTO credentials (username, password, type) VALUES ('Tabby', 'Halp', 1)");
        db.printAllCredentials();
        db.close();
    }
}
