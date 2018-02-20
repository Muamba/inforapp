package za.ac.cput.inforshare.repository.db.model.util;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Status")
public class Status {

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "name")
    private String name;

    @Property(nameInDb = "value")
    private String value;

    @Property(nameInDb = "state")
    private String state;

    public Status(String id, String name, String value, String state) {

        this.id = id;
        this.name = name;
        this.value = value;
        this.state = state;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
