import java.io.*;
import java.util.*;

public class Cau1_Deserialize{

	public static void main(String[] args) {

		ArrayList<Employee> arr = null;

		try
		{
			FileInputStream file = new FileInputStream("data/employee.ser");
			ObjectInputStream in = new ObjectInputStream(file);

			arr = (ArrayList<Employee>) in.readObject();

			in.close();
			file.close();
		}
		catch(IOException i)
		{
			System.err.println(i.getMessage());
		}
		catch(ClassNotFoundException ex)
		{
			System.err.println(ex.getMessage());
		}

		System.out.println("Deserialized Emploee...");
		for(Employee e : arr)
		{
			System.out.println("Name: "+e.getName());
			System.out.println("Address: "+e.getAddress());
			System.out.println("SSN: "+e.getSSN());
		}
	}
}