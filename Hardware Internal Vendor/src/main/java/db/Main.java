package db;

public class Main {
    public static void main(String args[]) {
        Credentials db = new Credentials();
        db.addAccount("Tabby Halp 1");
        db.changePassword("Papa Water");
        db.printAllCredentials();
        db.removeAccount("Tabby");
        db.changePassword("Papa Fire");
        db.printAllCredentials();

        try {
            System.out.println(db.checkCredentials("Papa", "Water"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        db.close();
    }
}
