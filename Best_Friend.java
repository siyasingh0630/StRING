


// public class Best_Friend{
   
//         String make="fdf";
//         String tree="lkflsdfklsd";
//         String pree="kofoifoif";
//         public String toString(){
// String myString=make+tree+pree;
// return myString;
//         }
    
// public static void main(String[] args)
// {
// Best_Friend priya = new Best_Friend();
// System.out.println(priya.toString());
// }


// }

// Java program to illustrate
// working of toString() method
 
// Main class
class Best_Friend {
 
    // Member attributes of this class
    String name;
    int age;
    String college;
    String course;
    String address;
 
    // Constructor of this class
    Best_Friend(String name, int age, String college,
                String course, String address)
    {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.address = address;
    }
 
    // Method 1
    // Creating our own toString() method
    public String toString()
    {
        return name + " " + age + " " + college + " "
            + course + " " + address;
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Creating object of class inside main() method
        Best_Friend b = new Best_Friend(
            "Gulpreet Kaur", 21, "BIT MESRA", "M.TECH",
            "Kiriburu");
 
        // Print and display commands to illustrate
        // toString() method as both will print the same
        // Print the object
        // IMPLICIT CALL OF THE METHOD 
        System.out.println(b);
//  EXPLICITY CALL OF METHOD
        // Printing object but using toString() method
        System.out.println(b.toString());
    }
}