/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Modelo.Problema4;
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
public class Problema4DAO {
    
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    Problema4 p=new Problema4();
    Conexion cn= new Conexion();


    public List consultar() {
   
        ArrayList<Problema4> list= new ArrayList<>();
        String sql="select * from calis";
        try {
            con=cn.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                Problema4 per= new Problema4();
                per.setCalifpar(rs.getInt("califpar"));
                per.setCalifexf(rs.getInt("califexf"));
                per.setCaliftraf(rs.getInt("califtraf"));
                per.setPromedio(rs.getInt("promedio"));
                per.setNombre(rs.getString("nombre"));
                list.add(per);
                System.out.println("Id");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        return list;
    }

    public boolean registrar(Problema4 per) {
        String sql="insert into calis values('"+per.getNombre()+"','"+per.getCalifpar()+"','"+per.getCalifexf()+"','"+per.getCaliftraf()+"','"+per.getPromedio()+"')";
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