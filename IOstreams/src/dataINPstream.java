import java.io.*;
public class dataINPstream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
DataInputStream obj=new DataInputStream(System.in);
System.out.println("Enter your name here");
String name=obj.readLine();
System.out.println("Hello mr "+ name);
obj.close();
	}

}
