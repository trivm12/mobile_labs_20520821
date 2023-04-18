package com.example.myapplication;

import static java.lang.Math.round;

import android.widget.ListView;

public class Employee {
    private String fullName;
    private double grossSalary;
    private double netSalary;

    public Employee(String fullName, double grossSalary) {
        this.fullName = fullName;
        this.grossSalary = grossSalary;
        this.netSalary = calSalary();
    }

    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGrossSalary(){
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }

    public int getNetSalary(){
        return (int) netSalary;
    }
    public void setNetSalary(double netSalary){
        this.netSalary = netSalary;
    }

    public double calSalary(){
        double temp;
        temp = grossSalary - grossSalary * 0.105;
        if (temp <= 11000000)
            netSalary = temp;
        else
            netSalary = 11000000 + (temp - 11000000) * (1 - 0.05);
        return (int) netSalary;
    }


    @Override
    public String toString(){
        return fullName + ": " + netSalary;
    }
}
