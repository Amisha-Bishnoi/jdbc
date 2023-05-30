import java.sql.*;
class firstJDBC
{
public static void main(String args[]){
try{
 Class.forName("com.mysql.jdbc.Driver");
 String url="jdbc:mysql://localhost:3306/";
String name="root";
String pass="12345678";
Connection con=DriverManager.getConnection(url,name,pass);

Statement st=con.createStatement();
String sql="create database jdbc";
st.executeUpdate(sql);

System.out.println("JDBC connected");

}
catch(Exception e){
e.printStackTrace();
}
}}