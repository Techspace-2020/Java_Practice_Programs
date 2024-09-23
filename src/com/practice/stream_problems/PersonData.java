package com.practice.stream_problems;

import java.util.List;

public class PersonData {

    public int id;
    public String name;
    public String place;
    public int age;
    public String gender;
    public List<String> phoneNum;

    public PersonData(int id, String name, String place, int age, String gender, List<String> phoneNum) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.age = age;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(List<String> phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
