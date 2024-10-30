import java.sql.*;

class Main extends conn {
    public static void main(String args[]){
        //SQLException Handling ...
        conn obj = new conn();

        String url = obj.url;
        String username = obj.username;
        String password = obj.password;

        try(Connection con = DriverManager.getConnection(url,username,password)){
            System.out.print("Connect to the DB Server ");
//
//
//            Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","nyra");
            Statement st=con.createStatement();

//            st.addBatch("CREATE ");

            String sql = "CREATE SCHEMA Akshay";
            st.executeUpdate(sql);
//            st.addBatch("update st00 set sid=10 where sname='r'");


        } catch (SQLException e){
            System.out.print("NOT CONN");
        }
    }
}