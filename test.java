import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class P{
    String name ;
    int age;
    void printInfo(){
        System.out.println(name+age);
    }
    P(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class C extends P{
    double cgpa;
    void printInfo2(){
        System.out.println("hello c");
    }
    C(String name, int age, double cgpa){
        super(name, age);
        this.cgpa = cgpa;
    }
}
public class test{
 public static void main(String[] args) {

    int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
    P[] p = new P[num];
    try{
        FileWriter fwri = new FileWriter("student.txt");
        for(int i =0; i<num;i++){
            String nam = JOptionPane.showInputDialog("Enter your name:");
            int ag = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
            double  cg= Double.parseDouble(JOptionPane.showInputDialog("Enter cgpa:"));
            p[i] = new C(nam, ag, cg);
            fwri.write(p[i].name+" "+p[i].age+" "+((C)p[i]).cgpa+"\n");
           

        }
        fwri.close();

        File file = new File("student.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String Nam =sc.next();
            int Ag = sc.nextInt();
            double Cg = sc.nextDouble();
            
            JOptionPane.showMessageDialog(null,"Name ="+ Nam+" \n"+"Age ="+ Ag+" \n"+"Cgpa ="+ Cg+" \n");



        }

    }catch(IOException e){
      System.out.println(e);
    }


 }
}