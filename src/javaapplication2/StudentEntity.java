/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author AjayaSharma
 */
public class StudentEntity {
    private int id;
    private String Username;
    private String email;
    private String Password;
    
    public void StudentEntity(){
        this.id = 0;
        this.Username = "";
        this.email = "";
        this.Password="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String firstName) {
        this.Username = Username;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String lastName) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String courseName) {
        this.Password = Password;
    }
    
}
