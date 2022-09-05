
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class Student{
    String name;
    int age;
    double cgpa;

    Student(String name, int age, double cgpa){
        this.name =name;
        this.age = age;
        this.cgpa = cgpa;
    }
}
public class file {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
 
       Student [] std ;
       System.out.println("Enter total student:");
       int num = inp.nextInt();
       std = new Student[num];
     
       try{
           FileWriter file = new FileWriter("teacher.txt");
           
       for(int i =0;i<num;i++){
          System.out.println("Enter name:");
          String name = inp.next();
          System.out.println("Engetr your age:");
          int age = inp.nextInt();
          System.out.println("Enter Your cgpa:");
          double  cgpa = inp.nextDouble();
          std[i]= new Student (name,age,cgpa);
          file.write(std[i].name +" "+Integer.toString(std[i].age)+" "+Double.toString(std[i].cgpa)+"\n");
       //    file.write(Integer.toString(std[i].age));
       //    file.write(Double.toString(std[i].cgpa));

          
       }
       file.close();
       // file read
       File file_read = new File("teacher.txt");
        Scanner scn = new Scanner(file_read);
        while(scn.hasNextLine()){
           String Nam = scn.next();
           int ag = scn.nextInt();
           double cg = scn.nextDouble();
           System.out.println(Nam+"-----"+ag+"-----"+cg);
         }
       
       }
       catch(IOException e)
       {
           System.out.println( e);
       }

   }    
}
