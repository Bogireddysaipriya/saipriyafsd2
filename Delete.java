import java.sql.*;
class Delete
{
public static void main(String args[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver created ");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("connection success");
Statement s=c.createStatement();
String sql="delete from priyaa where ename='sai'";
s.executeUpdate(sql);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
