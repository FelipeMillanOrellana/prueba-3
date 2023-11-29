/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connector;

import java.sql.*; 
/**
 *
 * @author profe
 */
public class Conector {
    private Connection con = null; //crea objeto conexion nulo
   
    public  Connection getConexion() throws Exception{
        try {
              String user = "root"; // el root de mysql
              String pass = ""; //passwd del mysql
              String url = "jdbc:mysql://localhost:3306/peliculasdb";
              Class.forName("com.mysql.jdbc.Driver").newInstance();//declaración del driver para conectarse
              con = DriverManager.getConnection(url,user,pass); //este conecta
            }
            catch (SQLException sqle){
                       System.out.println("Error SQL.....conexion" +sqle);
            }
        return con;
    }

    public void cerrarConexion()
    {
        try
            {
                if(con != null)
                {
                    con.close();
                }
               
            }
            catch(SQLException e)
            {
                System.out.println("Problemas con la conexión");
            }
        }



}
