import java.sql.*;
class Insert
{
public static void main(String args[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver created ");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("connection success");
Statement s=c.createStatement();
String sql="insert into priyaa values(1,'sai')";
int no_of_rows_effected=s.executeUpdate(sql);
System.out.println("no.of rows effected"+no_of_rows_effected);
String sql1="insert into priyaa values(2,'sweety')";
no_of_rows_effected=s.executeUpdate(sql1);
System.out.println("no.of rows effected"+no_of_rows_effected);
String sql2="insert into priyaa values(3,'sunny')";
no_of_rows_effected=s.executeUpdate(sql2);
System.out.println("no.of rows effected"+no_of_rows_effected);
String sql3="insert into priyaa values(4,'arjun')";
no_of_rows_effected=s.executeUpdate(sql3);
System.out.println("no.of rows effected"+no_of_rows_effected);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
