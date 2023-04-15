/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Modelo.Problema5;
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
public class Problema5DAO {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    Problema5 p=new Problema5();
    Conexion cn= new Conexion();


    public List consultar() {
   
        ArrayList<Problema5> list= new ArrayList<>();
        String sql="select * from grupos";
        try {
            con=cn.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                Problema5 per= new Problema5();
                per.setGrupo(rs.getString("grupo"));
                per.setnHombres(rs.getInt("numH"));
                per.setnMujeres(rs.getInt("numM"));
                per.setPorcH(rs.getInt("porcH"));
                per.setPorcM(rs.getInt("porcM"));
                list.add(per);
                System.out.println("Id");
                System.out.println(per.getGrupo()+""+per.getnHombres());
            }
            
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        return list;
    }

    public boolean registrar(Problema5 per) {
        String sql="insert into grupos values('"+per.getGrupo()+"','"+per.getnHombres()+"','"+per.getnMujeres()+"','"+per.getPorcH()+"','"+per.getPorcM()+"')";
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
