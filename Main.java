import java.util.*;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {
  
  static ArrayList<Person> people;
  static String filename;
  static FileReader myFile;

  public static void main(String[] args) {

    people = new ArrayList<Person>();
    filename = "data.txt";
    String name = "", age = "", color = "";

    try {
      myFile = new FileReader(filename);
      BufferedReader reader = new BufferedReader(myFile);

      while (reader.ready()) {
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();
      System.out.printf("%-25s %-20s %-20s %n", name, age, color);
        // Place thePlace = new Place(place, Integer.parseInt(population), capital);
        // places.add(thePlace);
      }
      reader.close();
    } catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
    }

    // for(int i=0; i<places.size(); i++) {
    // System.out.printf("%-25s %-20s %-20s %n", places.get(i).getPlace(),
    // places.get(i).getPopulation(), places.get(i).getCapital());
    // }
    //System.out.printf("%-25s %-20s %-20s %n", place, population, capital);

    people.add(new Person("Webb", 1, "Maria"));

    // initializing FileWriter
      FileWriter toWriteFile;
      try {
        toWriteFile = new FileWriter("test2.txt");
        // Initialing BufferedWriter
        BufferedWriter output = new BufferedWriter(toWriteFile);
        // for(int i=0; i<places.size(); i++) {
        /*
        * output.write(places.get(i).getPlace()); output.newLine();
        * output.write(Integer.toString(places.get(i).getPopulation()));
        * output.newLine(); output.write(places.get(i).getCapital()); output.newLine();
        */
        output.write("Testing");
        output.newLine();
        output.write(Integer.toString(100));
        output.newLine();
        output.flush();
        // }
        // Closing BufferWriter to end operation
        output.close();
    } catch (IOException excpt) {
      excpt.printStackTrace();
    }
  }
}
