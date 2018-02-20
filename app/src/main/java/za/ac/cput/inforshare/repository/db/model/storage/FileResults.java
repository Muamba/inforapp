package za.ac.cput.inforshare.repository.db.model.storage;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */


@Entity(nameInDb = "FileResults")
public class FileResults {

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "url")
    private String url;

    @Property(nameInDb = "size")
    private String size;

    @Property(nameInDb = "mime")
    private String mime;

  public FileResults(String id, String url, String size, String mime){

      this.id = id;
      this.url = url;
      this.size = size;
      this.mime = mime;
  }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }
}
