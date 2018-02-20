package za.ac.cput.inforshare.repository.db.model.contents;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/14/2018.
 */

@Entity(nameInDb = "Media")
public class Media {

    @Property(nameInDb = "contentId  ")
    private String contentId;

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "description  ")
    private String description;

    @Property(nameInDb = "url  ")
    private String url;

    @Property(nameInDb = "mime  ")
    private String mime;

    @Property(nameInDb = "date  ")
    private LocalDateTime date;

    @Property(nameInDb = "state  ")
    private String state;

  public Media(String contentId, String id, String description, String url, String mime,
               LocalDateTime date, String state) {

      this.contentId = contentId;
      this.id = id;
      this.description = description;
      this.url = url;
      this.mime = mime;
      this.date = date;
      this.state = state;
  }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

