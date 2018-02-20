package za.ac.cput.inforshare.repository.db.model.organisation;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Organisation")
public class Organisation {

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "name  ")
    private String name;

    @Property(nameInDb = "details  ")
    private String details;

    @Property(nameInDb = "adminAttached  ")
    private String adminAttached;

    @Property(nameInDb = "date  ")
    private LocalDateTime date;

    @Property(nameInDb = "state  ")
    private String state;


    public Organisation (String id,String name, String details, String adminAttached, String state ) {

        this.id = id;
        this.name = name;
        this.details = details;
        this.adminAttached = adminAttached;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAdminAttached() {
        return adminAttached;
    }

    public void setAdminAttached(String adminAttached) {
        this.adminAttached = adminAttached;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

