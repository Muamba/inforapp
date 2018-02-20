package za.ac.cput.inforshare.repository.db.model.storage;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */


@Entity(nameInDb = "FileMeta")
public class FileMeta {

    @Property(nameInDb = "fileName")
    private String fileName;

    @Property(nameInDb = "contentType")
    private String contentType;

    public FileMeta(String fileName, String contentType){

        this.fileName = fileName;
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
