package za.ac.cput.inforshare.repository.db.model.security;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "UserGeneratedToken")
public class UserGeneratedToken {

    @Property(nameInDb = "token")
    private String token;

    @Property(nameInDb = "status")
    private String status;

    @Property(nameInDb = "message")
    private String message;

    @Property(nameInDb = "siteId")
    private String siteId;

    public UserGeneratedToken(String token, String status, String message, String siteId){

        this.token = token;
        this.status = status;
        this.message = message;
        this.siteId= siteId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}
