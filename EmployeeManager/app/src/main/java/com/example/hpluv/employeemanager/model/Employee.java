package com.example.hpluv.employeemanager.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by HpLuv on 4/14/2019.
 */

public class Employee {
    @SerializedName("employeeId")
    @Expose
    private int emp_ID;
    @SerializedName("employeeName")
    @Expose
    private String emp_name;
    @SerializedName("employeeMail")
    @Expose
    private String emp_mail;
    @SerializedName("employeeAddr")
    @Expose
    private String emp_address;
    @SerializedName("Password")
    @Expose
    private String emp_password;
    @SerializedName("employeePhoto")
    @Expose
    private String emp_photo;
    @SerializedName("employeeBank")
    @Expose
    private String emp_bank;
    @SerializedName("employeeBranch")
    @Expose
    private String emp_branch;
    public Employee(int emp_ID, String emp_name, String emp_mail, String emp_address, String emp_password, String emp_photo) {
        this.emp_ID = emp_ID;
        this.emp_name = emp_name;
        this.emp_mail = emp_mail;
        this.emp_address = emp_address;
        this.emp_password = emp_password;
        this.emp_photo = emp_photo;
    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public String getEmp_photo() {
        return emp_photo;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public void setEmp_photo(String emp_photo) {
        this.emp_photo = emp_photo;
    }
}
