import java.lang.System;
import java.util.ArrayList;

public class ContactList {
    
    ArrayList<User> List = new ArrayList<>();

    long lastTimeUpdated;

    public ContactList() {
        this.lastTimeUpdated = System.currentTimeMillis();
    }

    public void add(User u) {
        List.add(u);
    }

    public void remove(User u) {
        List.add(u);
    }

    public void modify(User u, User new_u) {

    }



}
