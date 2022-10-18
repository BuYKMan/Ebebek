package org.example;

import java.sql.SQLOutput;

public class Employee {

    private String name;
    private int salary;
    private int workHours;
    private int hireYear;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours(int workHours) {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int tax(){
        if(salary<=1000) {
            salary = salary;
            return 0;
        }
        else{
            int tax=salary*3/100;
            salary-=tax;
            return tax;
        }

    }

    public int bonus(int workHours){
        if(workHours>40) {
            salary += (workHours - 40) * 30;
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public int raiseSalary(){
         int thisYear=2021;
         if(2021-hireYear<10){
             int bonus=salary*5/100;
             salary=salary+bonus;
             return salary; }

         else if(2021-hireYear>9&&2021-hireYear<20){
             int bonus=salary*10/100;
             salary=salary+bonus;
         return  salary;}

         else{
             int bonus=salary*15/100;
             salary=salary+bonus;
         return  salary;}
    };


    public String toString(){
        System.out.println("Adı:"+name);
        System.out.println("Maaşı:"+salary);
        System.out.println("Çalışma Saati"+workHours);
        System.out.println("Vergi "+tax());
        System.out.println("Bonus: "+bonus(workHours));
        System.out.println("Maaş Artışı: "+bonus( workHours));
        System.out.println("Vergi ve Bonuslarla birlikte maaş:");
        System.out.println("Toplam Maaş:"+raiseSalary());
;
        return null;
    }
}
