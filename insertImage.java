import java.sql.*;
import java.io.*;

class insertImage{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","12345678");

String q="insert into images(images) values(?)";
PreparedStatement pst=con.prepareStatement(q);
FileInputStream fis=new FileInputStream("result.png");
pst.setBinaryStream(1,fis,fis.available());
pst.executeUpdate();
System.out.println("inserted successfully");
}
catch(Exception e){
e.printStackTrace();
System.out.println("Error during insertion");
}
}
}