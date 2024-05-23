public class Person {
    int id ; 
    String name ; 
    int age ; 

    public Person() {
    }

    public Person( String name , int id, int age) {
       this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
    
     public static void sort(Person[] o){
        for (int i = 0; i <  o.length-1 ; i++) {
            for (int j = 0; j <  o.length - i - 1; j++) {
                if (o[j].getAge() < o[j + 1].getAge()) { 
                    Person temp = o[j]; 
                    o[j] = o[j + 1]; 
                    o[j + 1] = temp; 
                }}
        }

    }    
    
    
    
}
