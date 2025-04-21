import java.io.*;
public class sequenceINPstream {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
FileInputStream obj=new FileInputStream("GSTvalue.java");
FileInputStream obj1= new FileInputStream("PTR.java");
SequenceInputStream si=new SequenceInputStream(obj,obj1);
int i=si.read();
System.out.println((char)i);
si.close();
	}

}
