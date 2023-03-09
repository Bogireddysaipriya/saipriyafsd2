import java.sql.*;
class Update
{
public static void main(String args[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver created ");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("connection success");
Statement s=c.createStatement();
String sql="update priyaa set eid=79 where ename='sweety'";
s.executeUpdate(sql);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
