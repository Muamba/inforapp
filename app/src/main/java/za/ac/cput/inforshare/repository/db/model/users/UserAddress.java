package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by christian on 2018/02/13.
 */
@Entity(nameInDb = "UserAddress")
public class UserAddress {

    @Id
    private String emailId;

    @Id
    private String id;

    @Property(nameInDb = "addressTypeId")
    private String addressTypeId;

    @Property(nameInDb = "description")
    private String description;

    @Property(nameInDb = "postalCode")
    private String postalCode;

    @Property(nameInDb = "date")
    private String date;

    @Property(nameInDb = "state")
    private String state;


    @Generated(hash = 1543916479)
    public UserAddress(String emailId, String id, String addressTypeId, String description, String postalCode , String date, String state) {
        this.emailId = emailId;
        this.id = id;
        this.addressTypeId = addressTypeId;
        this.description = description;
        this.postalCode = postalCode;
        this.date = date;
        this.state = state;
    }

    @Generated(hash = 586692638)
    public UserAddress() {
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.addressTypeId;
    }

    public void setAddressTypeId(String addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}