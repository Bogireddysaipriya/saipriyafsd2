import java.sql.*;
import java.util.*;
class Sample
{
public static void main(String args[])
{
try{
int id;
String name;
Scanner s=new Scanner(System.in);
System.out.println("Enter id");
id=s.nextInt();
System.out.println("Enter name");
name=s.next();
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver created ");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("connection success");
String sql="insert into priyaa values(?,?)";
PreparedStatement stmt=c.prepareStatement(sql);
stmt.setInt(1,id);
stmt.setString(2,name);
int i=stmt.executeUpdate();
System.out.println(i+"records inserted");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
