import java.io.*;
public class bufferdINPstream {
public static void main(String[] args) throws Exception {
	FileInputStream obj =new FileInputStream("GSTvalue.java");
	BufferedInputStream b = new BufferedInputStream(obj);
	long L=System.currentTimeMillis();
	int i=b.read();
	b.close();
	obj.close();
}
}
