import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("G:\\java_prog\\file_handling\\f1.txt");
      myWriter.write("kunal");
      
      myWriter.write("ravi");
      
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}