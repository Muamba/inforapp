package za.ac.cput.inforshare.repository.db.model.syslog;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "SystemLogEvents")
public class SystemLogEvents {

    @Property(nameInDb = "siteId")
    private String siteId;

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "eventName")
    private String eventName;

    @Property(nameInDb = "eventType")
    private String eventType;

    @Property(nameInDb = "message")
    private String message;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    public SystemLogEvents(String siteId, String id, String eventName, String eventType,
                           String message, LocalDateTime date){

        this.siteId = siteId;
        this.id = id;
        this.eventName = eventName;
        this.eventType = eventType;
        this.message = message;
        this.date = date;
    }

}
