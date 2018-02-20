package za.ac.cput.inforshare.repository.db.model.security;

import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */

public class TokenFailException extends Exception {

    @Property(nameInDb = "message")
    private String message="";

    //please verify this
    @Property(nameInDb = "cause  ")
    private Throwable  cause = null  ;

    public TokenFailException(String message, Throwable cause){
        this.message = message;
        this.cause = cause;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }
}
