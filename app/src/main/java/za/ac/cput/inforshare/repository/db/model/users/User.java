/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by christian on 08/12/16.
 */

@Entity(nameInDb = "user")
public class User {

    @Id(autoincrement = true)
    private Long siteId ;

    @Property(nameInDb = "email")
    private String email ;

    @Property(nameInDb = "firstName ")
    private String firstName ;

    @Property(nameInDb = "lastName ")
    private String lastName ;

    @Property(nameInDb = "screenName  ")
    private String screenName  ;

    @Property(nameInDb = "password   ")
    private String password   ;

    @Property(nameInDb = "state")
    private String state    ;

    @Property(nameInDb = "date")
    private String date    ;


    @Generated(hash = 1543916479)
    public User(Long siteId , String email , String firstName , String lastName ,String screenName, String password, String state, String date ) {
        this.siteId  = siteId ;
        this.email  = email ;
        this.firstName  = firstName ;
        this.lastName = lastName ;
        this.screenName = screenName;
        this.password = password;
        this.state = state;
        this.date = date;
    }

    @Generated(hash = 586692638)
    public User() {
    }



    public Long getSiteId() {
        return this.siteId ;
    }

    public void setSiteId(Long siteId ) {
        this.siteId  = siteId ;
    }

    public String getEmail() {
        return this.email ;
    }

    public void setEmail(String email ) {
        this.email  = email ;
    }

    public String getFirstName() {
        return this.firstName ;
    }

    public void setFirstName(String firstName ) {
        this.firstName  = firstName ;
    }

    public String getLastName() {
        return this.lastName ;
    }

    public void setLastName(String lastName ) {
        this.lastName  = lastName ;
    }

    public String getScreenName(){return this.screenName;}

    public void setScreenName(String screenName){this.screenName = screenName;}

    public String getPassword(){return this.password;}

    public void setPassword(String password ){this.password = password; }

    public String getState(){return  this.state; }

    public void setState( String state){this.state = state; }

    public String getDate(){return this.date;}

    public void setDate(String date) {
        this.date = date;
    }
}