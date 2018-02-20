package za.ac.cput.inforshare.repository.db.model.organisation;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Location")
public class Location {

    @Property(nameInDb = "org")
    private String org;

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "name  ")
    private String name;

    @Property(nameInDb = "locationTypeId")
    private String locationTypeId;

    @Property(nameInDb = "code  ")
    private String code;

    @Property(nameInDb = "latitude  ")
    private String latitude;

    @Property(nameInDb = "longitude  ")
    private String longitude;

    @Property(nameInDb = "parentId  ")
    private String parentId;


    @Property(nameInDb = "state  ")
    private String state;

    @Property(nameInDb = "date  ")
    private LocalDateTime date;

public Location(String org, String id,String name, String localTypeId, String code, String latitude,
                 String longitude,String parentId, String state,LocalDateTime date){

    this.org = org;
    this.id = id;
    this.name = name;
    this.locationTypeId = localTypeId;
    this.code = code;
    this.latitude = latitude;
    this.longitude = longitude;
    this.parentId = parentId;
    this.state = state;
    this.date = date;

}

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
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

    public String getLocationTypeId() {
        return locationTypeId;
    }

    public void setLocationTypeId(String locationTypeId) {
        this.locationTypeId = locationTypeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}