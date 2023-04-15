/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;
import Modelo.Problema9;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author artem
 */

public class Problema9DAO {
Connection con;
PreparedStatement ps;
Statement st;
ResultSet rs;
Conexion cn= new Conexion();

    public List consultar() {
   
        ArrayList<Problema9> list= new ArrayList<>();
        String sql="select * from trabajador";
        try {
            con=cn.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                Problema9 per= new Problema9();
                per.setNombre(rs.getString("nombre"));
                per.setHorasT(rs.getInt("horasT"));
                per.setSalario(rs.getInt("salario"));
                per.setCuota(rs.getInt("cuota"));
                list.add(per);
                System.out.println("Id");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        return list;
    }

    public boolean registrar(Problema9 per) {
        String sql="insert into trabajador values('"+per.getNombre()+"','"+per.getHorasT()+"','"+per.getSalario()+"','"+per.getCuota()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        }catch(Exception e){
            System.err.println("Error"+e);
        }
        return false;
    }
}    

