import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.*;

public class TeacherMain {

	public static void main(String[] args) throws Exception {

		Comparator<Teacher> com =new Comparator<Teacher>() {

			public int compare(Teacher o1, Teacher o2) {
				return o1.compareTo(o2);
			}
			
		};
		try{
		TreeSet<Teacher> set = new TreeSet<Teacher>(com);
		int a;String b;String c;String d;
		PrintWriter pw = new PrintWriter(new File("ABC1.txt"));
		String teach;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher",
	            "root", "12345");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Teacher");
		while(rs.next())
		{
			a=rs.getInt(1);
			b=rs.getString(2);
			c=rs.getString(3);
			pw.append(a+"\t"+b+"\t"+c+"\n");
			System.out.println("Inserted Successfully");
			pw.flush();
		}
		}catch(Exception e) {}
	}
}
