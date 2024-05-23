
package com.mycompany.employeesapplication;


public class HumanResources extends Personel {
    private String userName;
    private String password;

    
    
    public HumanResources(String name, String surName, String phoneNumber, String tcNo, int id, String userName, String password) {
        super(id,name, surName, phoneNumber, tcNo );
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
