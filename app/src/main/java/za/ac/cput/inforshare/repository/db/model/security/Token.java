package za.ac.cput.inforshare.repository.db.model.security;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */
@Entity(nameInDb = "Token")
public class Token {

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "tokenValue  ")
    private String tokenValue;

    public Token(String id, String tokenValue){

        this.id = id;
        this.tokenValue = tokenValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }
}
