package com.mycompany.employeesapplication;

public class Administrator extends Personel {

    private String userName;
    private String password;

    public Administrator(String name, String surName, String phoneNumber, String tcNo, int id, String userName, String password) {
        super(id,name, surName, phoneNumber, tcNo);
        this.userName = userName;
        this.password = password;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the passwordString
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param passwordString the passwordString to set
     */
    public void setPasswordString(String password) {
        this.password = password;
    }
}
