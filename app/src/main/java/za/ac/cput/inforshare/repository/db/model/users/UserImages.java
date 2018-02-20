package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by hashcode on 2018/02/13.
 */
@Entity(nameInDb = "UserImages")
public class UserImages {

    @Id
    private String org;

    @Id
    private String emailId;

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "url   ")
    private String url    ;

    @Property(nameInDb = "description    ")
    private String description    ;

    @Property(nameInDb = "size  ")
    private String size     ;

    @Property(nameInDb = "mime ")
    private String mime ;

    @Property(nameInDb = "date ")
    private String date ;


    @Generated(hash = 1543916479)
    public UserImages(String org, String emailId, Long id, String url   , String description    ,String size  ,String mime , String date ) {
        this.org = org;
        this.emailId = emailId;
        this.id = id;
        this.url = url   ;
        this.description  = description    ;
        this.size  = size ;
        this.mime  = mime ;
        this.date  = date ;
    }

    @Generated(hash = 586692638)
    public UserImages() {
    }

    public String getOrg(){return this.org; }

    public void setOrg(String org){this.org = org;}

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url   ;
    }

    public void setUrl(String url   ) {
        this.url    = url ;
    }

    public String getDescription() {
        return this.description    ;
    }

    public void setDescription(String description    ) {
        this.description     = description  ;
    }

    public String getSize() {
        return this.size     ;
    }

    public void setSize(String size     ) {
        this.size      = size   ;
    }

    public String getMime() {
        return this.mime ;
    }

    public void setMime(String mime ) {
        this.mime  = mime ;
    }

    public String getDate() {
        return this.date ;
    }

    public void setDate(String date ) {
        this.date  = date ;
    }
}