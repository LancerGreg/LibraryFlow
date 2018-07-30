package unit;

import java.util.Date;

public class Admin {

    private int id;
    private int userId;
    private Access levelAccess;
    private Date date;
    private boolean actual;

    private User user;

    public Admin(int id, int userId, Access levelAccess, Date date, boolean actual) {
        this.id = id;
        this.userId = userId;
        this.levelAccess = levelAccess;
        this.date = date;
        this.actual = actual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Access getLevelAccess() {
        return levelAccess;
    }

    public void setLevelAccess(Access levelAccess) {
        this.levelAccess = levelAccess;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }
}
