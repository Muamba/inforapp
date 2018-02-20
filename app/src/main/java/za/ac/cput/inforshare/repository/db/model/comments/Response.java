package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/14/2018.
 */


@Entity(nameInDb = "Response")
public class Response {


    @Property(nameInDb = "commentId  ")
    private String commentId  ;

    @Property(nameInDb = "responseId  ")
    private String responseId  ;

    @Property(nameInDb = "response  ")
    private String response  ;

    @Property(nameInDb = "emailId")
    private String emailId ;

    @Property(nameInDb = "ipaddress")
    private String ipaddress;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    public Response (String commentId,String response, String responseId,String emailId, String ipaddress,LocalDateTime date  ) {

        this.commentId = commentId;
        this.responseId = responseId;
        this.response = response;
        this.emailId = emailId;
        this.ipaddress = ipaddress;
        this.date = date;

    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
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