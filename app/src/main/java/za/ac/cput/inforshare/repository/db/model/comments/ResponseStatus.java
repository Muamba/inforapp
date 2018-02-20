package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/14/2018.
 */


@Entity(nameInDb = "ResponseStatus")

public class ResponseStatus {

    @Property(nameInDb = "responseId  ")
    private String responseId  ;

    @Property(nameInDb = "status  ")
    private String status  ;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    public ResponseStatus ( String responseId,String status ,LocalDateTime date  ) {

        this.responseId = responseId;
        this.status = status;
        this.date = date;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}