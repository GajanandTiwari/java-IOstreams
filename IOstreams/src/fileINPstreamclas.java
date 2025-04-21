import java.io.*;
public class fileINPstreamclas {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream obj = new FileInputStream("GSTvalue.java");
int i=obj.read();
while(i!=-1)
{
System.out.println((char)i);
	obj.close();	
}
	}

}
