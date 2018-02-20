package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/14/2018.
 */

@Entity(nameInDb = "Comment")
public class Comment {

    @Id
    private String siteId ;

    @Property(nameInDb = "subjectId")
    private String subjectId  ;

    @Property(nameInDb = "commentId  ")
    private String commentId  ;

    @Property(nameInDb = "comment  ")
    private String comment  ;

    @Property(nameInDb = "emailId")
    private String emailId ;

    @Property(nameInDb = "ipaddress")
    private String ipaddress;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    public Comment (String siteId , String subjectId  ,String commentId,String comment, String emailId, String ipaddress,LocalDateTime date  ) {
        this.siteId  = siteId ;
        this.subjectId   = subjectId  ;
        this.commentId = commentId;
        this.comment = comment;
        this.emailId = emailId;
        this.ipaddress = ipaddress;
        this.date = date;


    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
