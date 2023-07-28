import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
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
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher",
	            "root", "12345");
		PreparedStatement ps;
		System.out.println("Before Sorting a Records in input File is .....");
		while(sc.hasNextLine())
		{
			a=sc.nextInt();
			b=sc.next();
			c=sc.next();
			set.add(new Teacher(a,b,c));
			d=String.valueOf(a)+"\t"+b+"\t"+c+"\n";
			pw.append(d);
			System.out.println(d);
			pw.flush();

		}

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Teacher");
		while(rs.next())
		{
			a=rs.getInt(1);
			b=rs.getString(2);
			c=rs.getString(3);
			set.add(new Teacher(a,b,c));
		}

		Iterator itr = set.iterator();
		System.out.println("After Sorting a Records in files are.....");

		Iterator itr1 = set.iterator();Teacher tt;
		Statement stmt1= con.createStatement();
		stmt1.execute("drop table Teacher");
		stmt1.executeUpdate("Create table Teacher(id int(10) Primary key,name varchar(20),address varchar(20))");
		System.out.println("Table Created");
		
		while(itr1.hasNext())
		{
			tt=(Teacher) itr1.next();
			set.add(tt);
			a=tt.getId();
			b=tt.getName();
			c=tt.getAddress();
			System.out.println(a+"\t"+b+"\t"+c);
			ps = con.prepareStatement("insert into Teacher values(?,?,?)");
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setString(3,c);
			ps.execute();
			System.out.println("Inserted Successfully....");
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
