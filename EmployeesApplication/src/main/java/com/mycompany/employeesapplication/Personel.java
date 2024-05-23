package com.mycompany.employeesapplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Personel {

    public String name;
    public String surName;
    public String phoneNumber;
    private String tcNo;
    public int id;
    private String adress;
    private double salary;
    public int totalDayOff;
    private String userName,password;
    public Personel(){
    
    }
    public Personel(int id, String name, String surName, String phoneNumber, String tcNo ){
    
    }
    public Personel(int id, String name, String surName, String phoneNumber, String tcNo, String adress,double salary, int TotalDayOff ){
	
        this.id = id;
        this.name = name;
	this.surName = surName;
	this.phoneNumber = phoneNumber;
	this.tcNo = tcNo;
	this.adress = adress;
	this.salary = salary;
	this.totalDayOff = totalDayOff;
        
    }
    public Personel(String name, String surName, String phoneNumber, String tcNo, int id, String adress, double salary,
		int totalDayOff) {
	this.name = name;
	this.surName = surName;
	this.phoneNumber = phoneNumber;
	this.tcNo = tcNo;
	this.id = id;
	this.adress = adress;
	this.salary = salary;
	this.totalDayOff = totalDayOff;
}
    /**
     * @return the tcNo
     */
    public String getTcNo() {
        return tcNo;
    }

    /**
     * @param tcNo the tcNo to set
     */
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
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
