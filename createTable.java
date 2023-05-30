import java.sql.*;
class createTable{

public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

String url="jdbc:mysql://localhost/jdbc";
String user="root";
String pass="12345678";
Connection con=DriverManager.getConnection(url,user,pass);

String q="Create table table1(tID int(20) primary key auto_increment,tName varchar(50) not null,tCity varchar(100) not null)";

Statement st=con.createStatement();
st.executeUpdate(q);
System.out.println("Table created successfully");
con.close();

}
catch(Exception e){
e.printStackTrace();
}
}
}