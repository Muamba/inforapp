package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by christian on 2018/02/11.
 */
@Entity(nameInDb = "UserRole")
public class UserRole {

    @Id
    private String siteId ;

    @Id(autoincrement = true)
    private String emailId ;

    @Property(nameInDb = "date")
    private String date;

    @Property(nameInDb = "roleId ")
    private String roleId ;


    @Generated(hash = 1543916479)
    public UserRole(String siteId , String emailId ,String date, String roleId ) {
        this.siteId  = siteId ;
        this.emailId  = emailId ;
        this.date = date;
        this.roleId  = roleId ;
    }

    @Generated(hash = 586692638)
    public UserRole() {
    }

    public String getSiteId() {
        return this.siteId ;
    }

    public void setSiteId(String siteId) {
        this.siteId  = siteId ;
    }


    public String getId() {
        return this.emailId ;
    }

    public void setId(String emailId ) {
        this.emailId  = emailId ;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoleId() {
        return this.roleId ;
    }

    public void setRoleId(String roleId ) {
        this.roleId  = roleId ;
    }
}