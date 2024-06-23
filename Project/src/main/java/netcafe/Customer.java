package netcafe;

public class Customer {

    protected String username;
    protected String password;
    protected String pcNumber;
    protected boolean isAdmin;
    protected String room;
    protected String rank;

    public Customer(String username, String pcNumber, String room, String rank) {
        this.username = username;
        this.pcNumber = pcNumber;
        this.room = room;
        this.rank = rank;
    }

    public Customer(String pcNumber) {
        this.pcNumber = pcNumber;
    }
    

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPcNumber(String pcNumber) {
        this.pcNumber = pcNumber;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Customer(String pcNumber, String room) {
        this.pcNumber = pcNumber;
        this.room = room;
    }

    public String getPcNumber() {
        return pcNumber;
    }

    public String getRoom() {
        return room;
    }

    public String getRank() {
        return rank;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

}
