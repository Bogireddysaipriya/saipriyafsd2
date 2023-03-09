import java.sql.*;
class Fetch
{
public static void main(String args[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver created ");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("connection success");
Statement s=c.createStatement();
String sql="select * from priyaa";
ResultSet rs=s.executeQuery(sql);
rs.next();
while(rs.next())
{
System.out.print(rs.getInt(1));
System.out.print(" ");
System.out.print(rs.getString("ename"));
System.out.print("\n");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
