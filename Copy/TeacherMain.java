import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.*;

public class TeacherMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Comparator<Teacher> com =new Comparator<Teacher>() {
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return o1.compareTo(o2);
			}
			
		};
		try{
		TreeSet<Teacher> set = new TreeSet<Teacher>(com);
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
