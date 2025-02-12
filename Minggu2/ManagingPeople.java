/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2;

/**
 *
 * @author ASUS
 */
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

public class ManagingPeople {
    public static void main(String[] args){
        Person p1 = new Person("Arial", 15);
        Person p2 = new Person("Joseph", 15);
        
        System.out.println("Nama p1: " + p1.getName() + ", Usia: " + p1.getAge());
        System.out.println("Nama p2: " + p2.getName() + ", Usia: " + p2.getAge());
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName() + " is the same age as " +p2.getName());
        }else{
            System.out.println(p1.getName() + " is NOT the same age as " +p2.getName());
        }   
    }
}
