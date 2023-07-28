import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.*;

public class TeacherMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Comparator<Teacher> com = new Comparator<Teacher>() {

			@Override
			public int compare(Teacher o1, Teacher o2) {
				// TODO Auto-generated method stub
				return (o1.getName()).compareTo(o2.getName());
			}
			
		};
		try{
		ArrayList<Teacher> set = new ArrayList<Teacher>();
		File f = new File("ABC.txt");int i=0;int j=0;
		int a;String b;String c;String d;
		PrintWriter pw = new PrintWriter(new File("ABC1.txt"));
		Scanner sc = new Scanner(f);
		String teach;
		Teacher te[] = new Teacher[50];
		System.out.println("Before Sorting a Records in input File is .....");
		while(sc.hasNextLine())
		{
			a=sc.nextInt();
			b=sc.next();
			c=sc.next();
			set.add(new Teacher(a,b,c));
			i++;

		}
		Collections.sort(set,com);
		Iterator itr = set.iterator();
		System.out.println("After Sorting a Records in files are.....");
		while(itr.hasNext())
		{
			teach=(itr.next()).toString();
			System.out.println(teach);
			pw.append(teach);
			pw.flush();
		}
		}catch(Exception e){
		System.out.println(e.getMessage());
		}

		finally
		{
		System.out.println("File Closed Successfully...");
		}
	}
}
