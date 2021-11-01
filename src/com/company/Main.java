package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student []=new Student[3];
        student [0]=new Student(1,"Asel","Nursultan","87752535585","5");
        student[1]=new Student(1,"Alida","oskemen","8545645455","5");
        student[2]=new Student(1,"Bal","alm","5548454545","4");
        System.out.println("a) Studennter tyzymy korse ocenkamen");
        String ocen=sc.nextLine();
        for (int i = 0; i <3 ; i++) {
            if(student[i].getOcenki().equalsIgnoreCase(ocen)){
                System.out.println(student[i].toString());
            }
        }
    }

    public static class Student {
        private    int id;
        private      String FIO,

                adress,
                telefon,
                ocenki;
        public Student(){
        }
        public int getId() {
            return id;
        }
        public String getFIO() {
            return FIO;
        }
        public String getAdress() {
            return adress;
        }
        public String getTelefon() {
            return telefon;
        }
        public String getOcenki() {
            return ocenki;
        }
        public Student(int ID, String FIO, String adress, String ocenki, ) {
            this.id = id;
            this.FIO = FIO;
            this.adress= adress;
            this.telefon= telefon;
            this.ocenki = ocenki;

        }
        @Override
        public String toString() {
            return "com.company.Main.Student{" +
                    "id=" + id +
                    ", FIO='" + FIO + '\'' +
                    ", adress='" + adress + '\'' +
                    ", telefon='" + telefon + '\'' +
                    ", addres='" + ocenki + '\'' +

                    '}';
        }
    }
}

