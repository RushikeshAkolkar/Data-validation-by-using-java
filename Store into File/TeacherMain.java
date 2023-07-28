import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.*;
import java.util.LinkedList;

public class TeacherMain {

	public static void main(String[] args) throws Exception {
		try{
		LinkedList<Teacher> set = new LinkedList<Teacher>();
		int a;String b;String c;String d;
		System.out.println("How Much Line Do you Want to store in file please ENter");
		FileWriter pw = new FileWriter(new File("ABC1.txt"),true);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String teach;
		for(int i=0;i<n;i++)
		{
			a=Integer.parseInt(sc.next());
			b=sc.next();
			c=sc.next();
			set.add(new Teacher(a,b,c));
			d=String.valueOf(a)+"\t"+b+"\t"+c+"\t";
			System.out.println(d);
			pw.append(d+"\n");
			pw.flush();

		}
		}catch(Exception e){

		}

		finally
		{
		System.out.println("File Closed Successfully...");
		}
	}
}
