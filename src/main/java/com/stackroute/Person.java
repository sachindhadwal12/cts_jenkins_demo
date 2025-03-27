package com.stackroute;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

class JsonReadDemo{
    private final static String JSON_FILE_PATH = "person.json";
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person("Arsh",24,"Singapore");
        try{
            mapper.writeValue(new File(JSON_FILE_PATH),person);
            System.out.println("JSON data is written to file successfully");
           Person person1 = mapper.readValue(new File(JSON_FILE_PATH), Person.class);
            System.out.println("Read Data from JSon "+ person1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
