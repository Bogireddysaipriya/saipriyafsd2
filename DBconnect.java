import java.sql.*;
class DBconnect
{
    public static void main(String args[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver Registerted Successfully");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("Connection estabilished Successfully");
Statement stmt=c.createStatement();
String sql="create table priyaa(eid integer ,ename varchar2(40))";
stmt.execute(sql);
System.out.println("Table created");
}
catch(Exception e)
{
System.out.println(e);
}
}
}