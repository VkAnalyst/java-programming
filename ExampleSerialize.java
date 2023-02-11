import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
class Student implements Serializable{
   private static String name;
   public Student(String name){
      this.name = name;
   }
   public static String getName() {
      return name;
   }
   public static void setAge(String name) {
      Student.name = name;
   }
}
public class ExampleSerialize{
   public static void main(String args[]) throws Exception{
      Student std1 = new Student("Krishna", 30);
      FileOutputStream fos = new FileOutputStream("e:\student.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(std1);

      FileInputStream fis = new FileInputStream("e:\student.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Student std2 = (Student) ois.readObject();
      System.out.println(std2.getName());
   }
}