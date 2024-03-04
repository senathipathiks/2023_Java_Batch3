package com.oopsassign4;

/*Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
individual private instance variables routeNumber in Bus and manufacturerName in Car
and both of them having showData ( ) method showing all details of Bus and Car
respectively with content of the super class’s showData ( ) method.*/

class Q1 {
    public static void main(String[] args) {
        Bus bus=new Bus(18295001,80.0,"Red","Suvra","Tata Motors");
        bus.showData();
        Car car=new Car(22569082,60.0,"Blue","Shaw","Mahindra");
        car.showData();
    }}
class Vehicle {
    protected int regnNumber;
    protected double speed;
    protected String color;
    protected String ownerName;
    void showData() {
        System.out.println("This is a vehicle class");
    }}
class Bus extends Vehicle {
    private String routeNumber;
    Bus(int regnNumber,double speed,String color,String ownerName,String routeNumber) {
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
        this.routeNumber=routeNumber;
    } void showData() {
        super.showData();
        System.out.println(String.format("Registration No. %d", regnNumber));
        System.out.println(String.format("Speed - %f", speed));
        System.out.println(String.format("Color - %s", color));
        System.out.println(String.format("Owner - %s", ownerName));
        System.out.println(String.format("Route No. %s", routeNumber));
    }}
class Car extends Vehicle {
    private String manufacturerName;
    Car(int regnNumber,double speed,String color,String ownerName,String manufacturerName) {
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
        this.manufacturerName=manufacturerName;
    } void showData() {
        super.showData();
        System.out.println(String.format("Registration No. %d", regnNumber));
        System.out.println(String.format("Speed - %f", speed));
        System.out.println(String.format("Color - %s", color));
        System.out.println(String.format("Owner - %s", ownerName));
        System.out.println(String.format("Manufacturer - %s", manufacturerName));
    }}
