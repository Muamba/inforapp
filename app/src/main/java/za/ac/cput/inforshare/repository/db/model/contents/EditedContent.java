package za.ac.cput.inforshare.repository.db.model.contents;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/14/2018.
 */
@Entity(nameInDb = "EditedContent")
public class EditedContent {

    @Property(nameInDb = "org  ")
    private String org;

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "dateCreated  ")
    private LocalDateTime dateCreated;

    @Property(nameInDb = "creator  ")
    private String creator;

    @Property(nameInDb = "source  ")
    private String source;

    @Property(nameInDb = "category  ")
    private String category;

    @Property(nameInDb = "title  ")
    private String title;

    @Property(nameInDb = "content  ")
    private String content;

    @Property(nameInDb = "contentTypeId  ")
    private String contentTypeId;

    @Property(nameInDb = "status  ")
    private String status;

    @Property(nameInDb = "state  ")
    private String state;

    public EditedContent (String org, String id,LocalDateTime dateCreated, String creator, String source,
                          String category, String title, String content, String ContentTypeId,
                          String status, String state ) {

        this.org = org;
        this.id = id;
        this.dateCreated = dateCreated;
        this.creator = creator;
        this.source = source;
        this.category = category;
        this.title = title;
        this.content = content;
        this.contentTypeId = contentTypeId;
        this.status = status;
        this.state = state;
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

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

