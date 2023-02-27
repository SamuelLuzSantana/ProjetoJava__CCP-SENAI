

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemdeservico;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Web2
 */
public class conexao {

public static Connection conector(){
java.sql.Connection conexao = null;

String driver = "com.mysql.jdbc.Driver";

String url="jdbc:mysql://10.0.1.6:3306/WELLINGTONWEB1";
String user="root";
String pass="71657284";

try{ 
        Class.forName(driver);
    conexao=DriverManager.getConnection(url,user,pass);
    return conexao;
} catch(Exception e){
    
    JOptionPane.showMessageDialog(null, e);
 
    return null;
  }
  }
}
