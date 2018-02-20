package za.ac.cput.inforshare.repository.db.model.security;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */
@Entity(nameInDb = "Credential")
public class Credential {

    @Property(nameInDb = "email")
    private String email;

    @Property(nameInDb = "password  ")
    private String password;

    @Property(nameInDb = "siteId  ")
    private String siteId;

    public Credential(String email, String password, String siteId){

        this.email = email;
        this.password = password;
        this.siteId = siteId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}
