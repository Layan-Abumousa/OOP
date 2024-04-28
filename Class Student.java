import java.util.*;


public class Student {
    Random r = new Random();
    private String name ; 
    private String city ; 
    String[] courses = new String[5] ; 
    int [] mark = new int[5];
    private int age ; 
    private String collage ; 
     int id ; 
    static int c1=5000 ,c2=6000 ; 

    public Student(String name, String collage, int age, String city) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.collage = collage;
        if (this.collage.equals("eng")) {
            this.id=c1;
c1++;
        }
        else {
            this.id=c2;
c2++;
        }
        fill();
            
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    void fill(){
        for (int i = 0; i < 5; i++) {
            
        
        this.mark[i]=r.nextInt(80, 100);
                
                }
        
    }
    int maxo(){
        Arrays.sort(this.mark);
        return mark[4];
    }
    boolean tul(){
        if (this.city.equalsIgnoreCase("tulkarem")) {
            return true;
        }
        return false ; 
    }
   boolean fromCity(String ci){
       return ci.equalsIgnoreCase(this.city);
   }
    
   boolean comp(Student s , Student ss){
       return (s.city.equalsIgnoreCase(ss.city));
   }
   
   void list (Student[] o){
       for (int i = 0; i < o.length -1; i++) {
           if (o[i].avg()>=90.0) {
               System.out.println(o[i].name);
           }
       }
   }
   
   double avg(){
       double a = 0;
       for (int i = 0; i < 5; i++) {
           a+=this.mark[i];
       }
       return a/5;
   }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", city=" + city +  ", mark=" + Arrays.toString(mark) + ", age=" + age + ", collage=" + collage + ", id=" + id + '}';
    }
   
   
    
}
