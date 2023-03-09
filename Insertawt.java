import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Insert extends Frame implements ActionListener
{
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button b;
  Insert()
  {
    setSize(300,300);
    setVisible(true);
    setBackground(Color.pink);
    setLayout(new FlowLayout());
    l1=new Label("Enter your roll no:");
    l2=new Label("Enter your name:");
   
    t1=new TextField(20); 
    t2=new TextField(30);
   
    b=new Button("Insert");
    b.setBackground(Color.blue);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
   
    add(b);
    b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver Loaded");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
      System.out.println("Connection Established");
      PreparedStatement pst=con.prepareStatement("insert into priyaa values(?,?)");
      String eid=t1.getText();
      String ename=t2.getText();
   
      pst.setString(1,eid);
      pst.setString(2,ename);
     
      pst.executeUpdate();
      System.out.println("Inserted");
    }
    catch(Exception ex){
        System.out.println(ex);
   }
  }
}
class Insertawt
{
  public static void main(String args[])
  {
      Insert i=new Insert();
  }
}
