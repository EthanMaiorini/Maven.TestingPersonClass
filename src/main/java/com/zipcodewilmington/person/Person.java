package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean hasLicense;
    private double height;
    private int weight;
    private boolean hasChildren;
    private String address;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.address = "";
        this.weight = 0;
        this.height = 4.0;
        this.hasLicense = false;
        this.hasChildren = false;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name =name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String address,
                  int weight, double height, boolean hasLicense,boolean hasChildren) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.hasChildren = hasChildren;
        this.hasLicense = hasLicense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {this.address = address;}

    public void setWeight(int weight ){ this.weight = weight;}

    public void setHeight(double height){this.height = height;}

    public void setLicense(boolean license){this.hasLicense = license;}

    public void setChildren(boolean hasChildren){this.hasChildren = hasChildren;}

    public String getName() { return this.name;}

    public Integer getAge() {
        return this.age;
    }

    public String getAddress() {return this.address;}

    public int getWeight( ){ return this.weight;}

    public double getHeight(){return this.height;}

    public boolean isLicenseTrue(){return this.hasLicense;}

    public boolean isChildrenTrue(){return this.hasChildren;}
}



