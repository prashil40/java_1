import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class User {
    String name;
    String email;
    private boolean active;
    ZonedDateTime createdAt = getDefaultDate();

    User() {

    }

    User(String name, String email, boolean status) {
        this.name = name;
        this.email = email;
        this.setActive(status);
    }

    private static ZonedDateTime getDefaultDate() {
        LocalDate localDate = LocalDate.of(2020,1,1);
        return localDate.atStartOfDay(ZoneId.systemDefault());
    }

    public boolean isActive () {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        if(active) {
            return "Name: " + name + "\nEmail: " + email;
        } else {
            return "User is not active";
        }
    }
}
