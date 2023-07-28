import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.*;

public class TeacherMain1 {

	public static void main(String[] args) throws Exception {
		try{
		File f = new File("ABC.txt");int i=0;int j=0;
		int a;String b;String c;String d;
		PrintWriter pw = new PrintWriter(new File("ABC1.txt"));
		Scanner sc = new Scanner(f);
		String teach;
		while(sc.hasNextLine())
		{
			a=sc.nextInt();
			b=sc.next();
			c=sc.next();
			d=String.valueOf(a)+"\t"+b+"\t"+c+"\t";
			System.out.println(d);
			pw.append(d+"\n");
			pw.flush();
		}
		}catch(Exception e){}
		finally
		{
		System.out.println("File Closed Successfully...");
		}
	}
}
