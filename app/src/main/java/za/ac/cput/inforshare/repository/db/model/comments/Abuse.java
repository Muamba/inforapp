package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by hashcode on 2/14/2018.
 */
@Entity(nameInDb = "abuse")
public class Abuse {

    @Id
    private String siteId ;

    @Property
    private String commentIdOrResponseId  ;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    @Property(nameInDb = "details  ")
    private String details  ;

    @Property(nameInDb = "emailId")
    private String emailId ;

    public Abuse (String siteId , String commentIdOrResponseId  ,LocalDateTime date, String details, String emailId  ) {
        this.siteId  = siteId ;
        this.commentIdOrResponseId   = commentIdOrResponseId  ;
        this.date = date;
        this.details   = details  ;
        this.emailId = emailId;
    }

    public Abuse() {
    }

    public String getSiteId() {
        return this.siteId ;
    }

    public void setSiteId(String siteId) {
        this.siteId  = siteId ;
    }


    public String commentIdOrResponseId() {
        return this.commentIdOrResponseId  ;
    }

    public void setCommentIdOrResponseId(String commentIdOrResponseId  ) {
        this.commentIdOrResponseId   = commentIdOrResponseId  ;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDetails() {
        return this.details  ;
    }

    public void setDetails(String details  ) {
        this.details   = details  ;
    }

    public String getEmailId(){ return this.emailId; }

    public void setEmailId(String emailId){ this.emailId = emailId ; }

}
