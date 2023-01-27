
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  
        <title>Edición de Representante de domicilios</title>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
             <a style="color:white" class="navbar-toggle"><span class="navbar-toggler-icon"></span>Home</a>     
             <div class="dropdown">
                 <a style="color: white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar sesión</a>
                 <div class="dropdown-menu text-center">
                     <a><img src="img/Usuario.jpg" height="40" width="40"/></a><br>
                     <a>${nom}</a>
                     <a>${correo}</a>
                     <div class="dropdown-divider"></div>
                     <a href="Controlador?accion=Salir" class="dropdown-item">Salir</a>
                </div>
                 
             </div>    
             </nav>
        <div class="container">
            <div class="col-lg-6">
              <%
              PersonaDAO dao=new PersonaDAO();
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Persona p=(Persona)dao.list(id);
             %>
            <h1>Editar información de  Representante de Domicilio</h1>
            <form action="Controlador">
                C.I.:<br>
                <input class="form-control" type="text" name="txtDni" value="<%= p.getDni()%>"><br>
                Nombres: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= p.getNom()%>"><br>
                Apellidos: <br>
                <input class="form-control" type="text" name="txtApe" value="<%= p.getApe()%>"><br>
                Celular: <br>
                <input class="form-control" type="text" name="txtCel" value="<%= p.getCel()%>"><br>
                Características domicilio: <br>
                <input class="form-control" type="text" name="txtDia" value="<%= p.getDia()%>"><br>
                
                    Email:<br>
                    <input class="form-control" type="text" name="txtEma" value="<%= p.getEma()%>"><br>
                    Dirección (1): <br>
                    <input class="form-control" type="text" name="txtDi1" value="<%= p.getDi1()%>"><br>
                    Dirección (2): <br>
                    <input class="form-control" type="text" name="txtDi2" value="<%= p.getDi2()%>"><br>
                    Parroquia: <br>
                    <input class="form-control" type="text" name="txtPar" value="<%= p.getPar()%>"><br>
                    Cantón:<br>
                    <input class="form-control" type="text" name="txtCan" value="<%= p.getCan()%>"><br>
                    Provincia: <br>
                    <input class="form-control" type="text" name="txtPro" value="<%= p.getPro()%>"><br>
                    Problemas frecuentes: <br>
                    <input class="form-control" type="text" name="txtExa" value="<%= p.getExa()%>"><br>
                    Código acceso alarma:<br>
                    <input class="form-control" type="text" name="txtAna" value="<%= p.getAna()%>"><br>
                    Comentarios: <br>
                    <input class="form-control" type="text" name="txtCom" value="<%= p.getCom()%>"><br>
                    Fecha registro: <br>
                    <input class="form-control" type="text" name="txtFe1" value="<%= p.getFe1()%>"><br>
                    Fecha incidente: <br>
                    <input class="form-control" type="text" name="txtFe2" value="<%= p.getFe2()%>"><br>   
                
               
                <input type="hidden" name="txtid" value="<%= p.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
