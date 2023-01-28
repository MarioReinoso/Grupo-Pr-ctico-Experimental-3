
package ModeloDAO;

import Config.Conexion;
import Intefaces.VALIDAR;
import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuariosDAO implements VALIDAR{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuarios p=new Usuarios();
   
    

    @Override
    public int VALIDAR(Usuarios user) {
        int r=0;
        String sql ="select * from usuario where usuario=? and clave=?";
        try {
            
           String cadena1 = user.getUsuario();
           String cadena2 = user.getClave();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getClave());
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                r=r+1; 
                user.setUsuario(rs.getString("usuario"));
                user.setClave(rs.getString("clave"));
               
            }
            
            if(r==1 ){
                return 1;
            }else {
                return 0;
            }
        } catch (Exception e) {
           return 0;
    }
    
    
}
}
