
package Controlador;

import Modelo.Persona;
import ModeloDAO.PersonaDAO;
import Modelo.Usuarios;
import ModeloDAO.UsuariosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {

    String listar="vistas/listar.jsp";
    String add="vistas/add.jsp";
    String edit="vistas/edit.jsp";
    String mapag="vistas/mapa.jsp";
   
    Persona p=new Persona();
    PersonaDAO dao=new PersonaDAO();
    Usuarios u=new Usuarios();
    UsuariosDAO usuadao=new UsuariosDAO();
   
      
  
     int r;
    int id;
   
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
          try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
            
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;            
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            String ape=request.getParameter("txtApe");
            String dni=request.getParameter("txtDni");
            String nom=request.getParameter("txtNom");
            String cel=request.getParameter("txtCel");
            String ema=request.getParameter("txtEma");
            String di1=request.getParameter("txtDi1");
            String di2=request.getParameter("txtDi2");
            String par=request.getParameter("txtPar");
            String can=request.getParameter("txtCan");
            String pro=request.getParameter("txtPro");
            String dia=request.getParameter("txtDia");
            String exa=request.getParameter("txtExa");
            String ana=request.getParameter("txtAna");
            String com=request.getParameter("txtCom");
            String fe1=request.getParameter("txtFe1");
            String fe2=request.getParameter("txtFe2");
            
            
            p.setDni(dni);
            p.setNom(nom);
            p.setApe(ape);
            p.setCel(cel);
            p.setEma(ema);
            p.setDi1(di1);
            p.setDi2(di2);
            p.setPar(par);
            p.setCan(can);
            p.setPro(pro);
            p.setDia(dia);
            p.setExa(exa);
            p.setAna(ana);
            p.setCom(com);
            p.setFe1(fe1);
            p.setFe2(fe2);
         
            dao.add(p);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtid"));
           // String dni=request.getParameter("txtDni");
           // String nom=request.getParameter("txtNom");
           // String ape=request.getParameter("txtApe");
           // String cel=request.getParameter("txtCel");
           // String dia=request.getParameter("txtDia");
            
            String ape=request.getParameter("txtApe");
            String dni=request.getParameter("txtDni");
            String nom=request.getParameter("txtNom");
            String cel=request.getParameter("txtCel");
            String ema=request.getParameter("txtEma");
            String di1=request.getParameter("txtDi1");
            String di2=request.getParameter("txtDi2");
            String par=request.getParameter("txtPar");
            String can=request.getParameter("txtCan");
            String pro=request.getParameter("txtPro");
            String dia=request.getParameter("txtDia");
            String exa=request.getParameter("txtExa");
            String ana=request.getParameter("txtAna");
            String com=request.getParameter("txtCom");
            String fe1=request.getParameter("txtFe1");
            String fe2=request.getParameter("txtFe2");
            
            p.setId(id);
            p.setDni(dni);
            p.setNom(nom);
            p.setApe(ape);
            p.setCel(cel);
            p.setEma(ema);
            p.setDi1(di1);
            p.setDi2(di2);
            p.setPar(par);
            p.setCan(can);
            p.setPro(pro);
            p.setDia(dia);
            p.setExa(exa);
            p.setAna(ana);
            p.setCom(com);
            p.setFe1(fe1);
            p.setFe2(fe2);
            dao.edit(p);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso=listar;
        }
        
         else if(action.equalsIgnoreCase("map")){
           acceso=mapag;
        }
        
        else if(action.equalsIgnoreCase("Ingresar al sistema")){
           String nom=request.getParameter("txtnom");
           String correo=request.getParameter("txtcorreo");
            u.setUsuario(nom);
            u.setClave(correo);
            r=usuadao.VALIDAR(u);
            
            if (r==1){
                request.getSession().setAttribute("nom", nom);
                request.getSession().setAttribute("correo", correo);
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }else if(action.equalsIgnoreCase("Salir")){
             request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
