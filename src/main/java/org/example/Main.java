package org.example;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JLabel jLabel1;
    private static JLabel jLabel2;
    private static JLabel jLabel3;
    private static JLabel jLabel4;
    public static void main(String[] args) {

        Employee employee = new Employee();
        JFrame jFrame= new JFrame("Employee status");
        JButton jButton =new JButton();
        jButton.setText("Save");
        jButton.setBounds(130,250,100,20);

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(44, 49, 53, 18);
        jLabel1.setText("Adınız:");
        JTextField name = new JTextField();
        name.setBounds(96, 49, 160, 18);

        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(44, 70, 53, 18);
        jLabel2.setText("Maaşı:");
        JTextField salary = new JTextField();
        salary.setBounds(96, 70, 160, 18);

        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(44, 91, 53, 18);
        jLabel3.setText("Çalışma saati:");
        JTextField workHours = new JTextField();
        workHours.setBounds(96, 91, 160, 18);

        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(44, 112, 53, 18);
        jLabel4.setText("Başlanıç Yılı:");
        JTextField hireYears = new JTextField();
        hireYears.setBounds(96, 112, 160, 18);



        jFrame.add(jButton);
        jFrame.add(name);
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);
        jFrame.add(jLabel4);
        jFrame.add(salary);
        jFrame.add(workHours);
        jFrame.add(hireYears);
        jFrame.setSize(500,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employee.setName(name.getText());

                String temp1 = salary.getText();
                int Salary=Integer.parseInt(temp1);
                employee.setSalary(Salary);

                String temp2 =workHours.getText();
                int workHours=Integer.parseInt(temp2);
                employee.setWorkHours(workHours);

                String temp3= hireYears.getText();
                int hireYears=Integer.parseInt(temp3);
                employee.setHireYear(hireYears);
                employee.tax();
                employee.bonus(workHours);
                employee.raiseSalary();
                employee.toString();


            }
        });

    }
}