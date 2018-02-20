package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/14/2018.
 */

@Entity(nameInDb = "CommentStatus")
public class CommentStatus {

    @Property(nameInDb = "commentId")
    private String commentId  ;

    @Property(nameInDb = "status")
    private String status;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    public CommentStatus (String commentId ,String status ,LocalDateTime date  ) {

        this.commentId = commentId;
        this.status = status;
        this.date = date;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
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
