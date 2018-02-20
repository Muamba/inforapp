package za.ac.cput.inforshare.repository.db.model.votes;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Vote")
public class Vote {

    @Property(nameInDb = "siteId")
    private String siteId;

    @Property(nameInDb = "itemId")
    private String itemId;

    @Property(nameInDb = "ipAddress")
    private String ipAddress;

    @Property(nameInDb = "itemOwnerId")
    private String itemOwnerId;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    @Property(nameInDb = "status")
    private  String status ;

    public Vote(String siteId, String itemId, String ipAddress, String itemOwnerId,
                LocalDateTime date, String status){

        this.siteId = siteId;
        this.itemId = itemId;
        this.ipAddress = ipAddress;
        this.itemOwnerId = itemOwnerId;
        this.date = date;
        this.status = status;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getItemOwnerId() {
        return itemOwnerId;
    }

    public void setItemOwnerId(String itemOwnerId) {
        this.itemOwnerId = itemOwnerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
