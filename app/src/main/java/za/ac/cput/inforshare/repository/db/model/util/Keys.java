package za.ac.cput.inforshare.repository.db.model.util;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */


@Entity (nameInDb = "keys")
public class Keys {

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "value")
    private String value;

    @Property(nameInDb = "status")
    private String status;


    public Keys(String id, String value, String status){

        this.id = id;
        this.value = value;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
