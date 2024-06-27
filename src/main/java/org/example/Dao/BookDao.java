package org.example.Dao;

public class BookDao {
    private int num;
    private String databaseID;

    public void setNum(int num) {
        this.num = num;
    }

    public void setDatabaseID(String databaseID) {
        this.databaseID = databaseID;
    }

    public void save() {
    System.out.println("book dao save ..."+num+" "+databaseID);
    }
}
