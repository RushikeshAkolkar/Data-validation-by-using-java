import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class TeacherMain {

	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher",
	            "root", "12345");
		PreparedStatement ps;
		File f = new File("ABC.txt");
		Scanner sc = new Scanner(f);
		int a;
		String b,c;
		while(sc.hasNextLine())
		{
			a = sc.nextInt();
			b=sc.next();
			c=sc.next();
			ps=con.prepareStatement("insert into Teacher values(?,?,?)");
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setString(3, c);
			ps.execute();
			System.out.println("Record Inserted Successfully");
		}
		}catch(Exception e){}
	}
}