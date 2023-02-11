import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
class Shop implements Serializable{
   private static String CustomerName;
   public Shop(String CustomerName){
      this.CustomaerName = CustomerName;
   }
   public static String getName() {
      return CustomerName;
   }
   public static void setAge(String name) {
      Shop.CustomerName = name;
   }
}
public class ShoppingSerialized{
   public static void main(String args[]) throws Exception{
      Shop C1 = new Shop("Vyshakh", 30);
      FileOutputStream fos = new FileOutputStream("c:\\Shop.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(C1);

      FileInputStream fis = new FileInputStream("c:\\Shop.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Shop C2 = (Shop) ois.readObject();
      System.out.println(C2.getName());
   }
}