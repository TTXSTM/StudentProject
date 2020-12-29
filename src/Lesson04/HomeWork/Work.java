package Lesson04.HomeWork;

import java.lang.reflect.GenericArrayType;

public class Work {

    public static void main(String[] args) {


        Employee employee = new Employee("Dubrovsky Sergey Vlodimirovich", "Programmer", 123254, 9000000, 100);
        Employee employee1 = new Employee("Pupkin Valera Valerivich", "Designer", 234223, 200000, 50);
        Employee employee2 = new Employee("Dubrovska Svetlana Vlodimirovna", "Designer", 193342, 300000, 70);
        Employee employee3 = new Employee("Gorin Genadii Pupkin", "Menager", 204244, 10000, 10);
        Employee employee4 = new Employee("Gubochkin Vsevolod Mario", "Killer", 666666, 500000, 45);

        int[] Growth = {employee.getGrowth(), employee1.getGrowth(), employee2.getGrowth(), employee3.getGrowth(), employee4.getGrowth()};
        String[] Post = {employee.getPost(), employee1.getPost(), employee2.getPost(), employee3.getPost(), employee4.getPost()};
        String[] FCS = {employee.getFCS(), employee1.getFCS(), employee2.getFCS(), employee3.getFCS(), employee4.getFCS()};
        int[] number = {employee.getNumber(), employee1.getNumber(), employee2.getNumber(), employee3.getNumber(), employee4.getNumber()};
        int[] money = {employee.getMoney(), employee1.getMoney(), employee2.getMoney(), employee3.getMoney(), employee4.getMoney()};





        System.out.println("ФИО: " + employee.getFCS() + "\n" + "Должность: " + employee.getPost());

        System.out.println();

        for (int i = 0; i < Growth.length; i++) {
            if(Growth[i] > 40) System.out.print( "ФИО: " +FCS[i] + " Должность: " + Post[i] + " Номер: " + number[i] + " Заработок: " + money[i] + " Возраст:" + Growth[i]);
            System.out.println();

            if(Growth[i] > 35){
                money[i] += 10000;
                System.out.println(money[i]);
            }else{

            }

        }


    }









    public static void Employee(){




    }

}
