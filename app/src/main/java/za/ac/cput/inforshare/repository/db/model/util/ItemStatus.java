package za.ac.cput.inforshare.repository.db.model.util;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "ItemStatus")
public class ItemStatus {

    @Property(nameInDb = "itemId")
    private String itemId;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    @Property(nameInDb = "status")
    private String status;

    @Property(nameInDb = "description")
    private String description;

    public ItemStatus(String itemId, LocalDateTime date, String status, String description){

       this.itemId = itemId;
       this.date = date;
       this.status = status;
       this.description = description;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
