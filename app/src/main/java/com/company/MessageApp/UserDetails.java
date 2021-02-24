package com.company.login_register;

import java.util.Date;

public class UserDetails {

    static String username = "";
    static String password = "";
    static String chatWith = "";
    private long messageTime;

   public UserDetails(){
       messageTime = new Date().getTime();
   }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
