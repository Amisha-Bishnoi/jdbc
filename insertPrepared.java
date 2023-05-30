import java.sql.*;
import java.io.*;
class insertPrepared{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

String url="jdbc:mysql://localhost/jdbc";
String user="root";
String pass="12345678";
Connection con=DriverManager.getConnection(url,user,pass);
String query= "insert into table1 (tName,tCity) values(?,?)";
PreparedStatement pstmt=con.prepareStatement(query);

BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name");
String name=bf.readLine();
System.out.println("Enter city");
String city=bf.readLine();
pstmt.setString(1,name);
pstmt.setString(2,city);
pstmt.executeUpdate();
System.out.println("Data inserted successfully");
con.close();

}
catch(Exception e){
e.printStackTrace();
}
}}