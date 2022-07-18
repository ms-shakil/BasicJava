class Students{
    String name;
    int age;
    String id;
    String Subject;

    Students(String name,int age,String id , String Subject){
        this.name = name;
        this .age = age;
        this . id = id;
        this. Subject = Subject;
    }

}

public class array_practice {
    public static void main(String[] args) {
        Students[] s = new Students[5];
        for(int i =0;i<s.length;i++){
            if (i ==2){
                s[i]= new Students("Shakil",21,"232323","CSE");
            }
        }

        
        System.out.println(s[2].name +","+s[2].age+","+s[2].id + ","+s[2].Subject);
        
    }
}
