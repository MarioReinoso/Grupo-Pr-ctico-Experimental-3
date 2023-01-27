
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//Sentencias SQL
public class PersonaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p=new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql="select * from domicilio";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("Id"));
                per.setDni(rs.getString("CI"));
                per.setNom(rs.getString("Nombres"));
                per.setApe(rs.getString("Apellidos"));
                per.setCel(rs.getString("Celular"));
                per.setDia(rs.getString("Diagnostico"));
                per.setEma(rs.getString("Email"));
                per.setDi1(rs.getString("Direcion1"));
                per.setDi2(rs.getString("Direccion2"));
                per.setPar(rs.getString("Parroquia"));
                per.setCan(rs.getString("Canton"));
                per.setPro(rs.getString("Provincia"));
                per.setExa(rs.getString("ExamenFisico"));
                per.setAna(rs.getString("Anamnesis"));
                per.setCom(rs.getString("Comentarios"));
                per.setFe1(rs.getString("FechaInicio"));
                per.setFe2(rs.getString("FechaFin"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql="select * from domicilio where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("Id"));
                p.setDni(rs.getString("CI"));
                p.setNom(rs.getString("Nombres"));
                p.setApe(rs.getString("Apellidos"));
                p.setCel(rs.getString("Celular"));
                p.setDia(rs.getString("Diagnostico"));
                p.setEma(rs.getString("Email"));
                 p.setDi1(rs.getString("Direcion1"));
                 p.setDi2(rs.getString("Direccion2"));
                 p.setPar(rs.getString("Parroquia"));
                 p.setCan(rs.getString("Canton"));
                 p.setPro(rs.getString("Provincia"));
                 p.setExa(rs.getString("ExamenFisico"));
                 p.setAna(rs.getString("Anamnesis"));
                 p.setCom(rs.getString("Comentarios"));
                 p.setFe1(rs.getString("FechaInicio"));
                 p.setFe2(rs.getString("FechaFin"));
                
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
       String sql="insert into domicilio(CI, Nombres, Celular, Apellidos, Diagnostico,Direcion1,Direccion2)values('"+per.getDni()+"','"+per.getNom()+"','"+per.getCel()+ "','"+per.getApe()+"','"+per.getDia()+"','"+per.getDi1()+"','"+per.getDi2()+"')";
        try { 
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql="update domicilio set CI='"+per.getDni()+"',Nombres='"+per.getNom()+"',Apellidos='"+per.getApe()+"',Celular='"+per.getCel()+"',Diagnostico='"+per.getDia()+"',Direcion1='"+per.getDi1()+"',Direccion2='"+per.getDi2()+"'where Id="+per.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from domicilio where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
