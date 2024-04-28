public class Person {
    int id ; 
    String name ; 
    private int age ; 

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
    public class Uml {
    public static void bubbleSort(Person[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].getAge() > arr[j+1].getAge()) {
                    // swap arr[j+1] and arr[j]
                    Person temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
  
    
}
