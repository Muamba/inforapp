package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by hashcode on 2018/02/13.
 */
@Entity(nameInDb = "UserDemographics")
public class UserDemographics {
    @Id
    private String emailId;

    @Id
    private String id;

    @Property(nameInDb = "genderId   ")
    private String genderId   ;

    @Property(nameInDb = "raceId   ")
    private String raceId   ;

    @Property(nameInDb = "dateOfBirth    ")
    private String dateOfBirth    ;

    @Property(nameInDb = "date")
    private String date;

    @Property(nameInDb = "state")
    private String state;


    @Generated(hash = 1543916479)
    public UserDemographics(String emailId, String id, String genderId  , String raceId   ,String dateOfBirth ,String date, String state) {
        this.emailId = emailId;
        this.id = id;
        this.genderId   = genderId  ;
        this.raceId    = raceId   ;
        this.dateOfBirth = dateOfBirth;
        this.date = date;
        this.state = state;
    }

    @Generated(hash = 586692638)
    public UserDemographics() {
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

    public String getGenderId() {
        return this.genderId  ;
    }

    public void setGenderId(String genderId  ) {
        this.genderId   = genderId;
    }

    public String getRaceId() {
        return this.raceId   ;
    }

    public void setRaceId(String raceId   ) {
        this.raceId    = raceId ;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth    ;
    }

    public void setDateOfBirth(String dateOfBirth    ) {
        this.dateOfBirth     = dateOfBirth  ;
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