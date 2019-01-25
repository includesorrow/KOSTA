/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.Serializable;

/**
 *
 * @author KOSTA
 */
public class Ex3_Member implements Serializable{
    /*implements 적어야함*/
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPay() {
        return pay;
    }

    //transient : 직렬화에서 제외됨
    public void setPay(int pay) {
        this.pay = pay;
    }
    transient private String pwd;
    private String name;
    private int age,pay;
   
}
