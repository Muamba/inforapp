package za.ac.cput.inforshare.repository.db.model.storage;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */


@Entity(nameInDb = "StorageUrl")
public class StorageUrl {

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "name")
    private String name;

    @Property(nameInDb = "url")
    private String url;

    public StorageUrl(String id, String name, String url){

        this.id = id;
        this.name = name;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

