<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  
        <title>Adicionar nuevos representantes</title>
    </head>
    <body>
         <nav class="navbar navbar-dark bg-dark">
             <a style="color:white" class="navbar-toggle"><span class="navbar-toggler-icon"></span>Inicio</a>     
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
                <h1>Agregar Representante de domicilio</h1>
                 
                  <br>
                <form action="Controlador">
                    CI:<br>
                    <input class="form-control" type="text" name="txtDni"><br>
                    Nombres: <br>
                    <input class="form-control" type="text" name="txtNom"><br>
                    Apellidos: <br>
                    <input class="form-control" type="text" name="txtApe"><br>
                    Celular: <br>
                    <input class="form-control" type="text" name="txtCel"><br>
                    Email:<br>
                    <input class="form-control" type="text" name="txtEma"><br>
                    Dirección (1): <br>
                    <input class="form-control" type="text" name="txtDi1"><br>
                    Dirección (2): <br>
                    <input class="form-control" type="text" name="txtDi2"><br>
                    Parroquia: <br>
                    <input class="form-control" type="text" name="txtPar"><br>
                    Cantón:<br>
                    <input class="form-control" type="text" name="txtCan"><br>
                    Provincia: <br>
                    <input class="form-control" type="text" name="txtPro"><br>
                    Características domicilio: <br>
                    <input class="form-control" type="text" name="txtDia"><br>
                    Problemas frecuentes: <br>
                    <input class="form-control" type="text" name="txtExa"><br>
                    Código acceso alarma:<br>
                    <input class="form-control" type="text" name="txtAna"><br>
                    Comentarios: <br>
                    <input class="form-control" type="text" name="txtCom"><br>
                    Fecha Registro: <br>
                    <input class="form-control" type="text" name="txtFe1"><br>
                    Fecha incidente: <br>
                    <input class="form-control" type="text" name="txtFe2"><br>
                    
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
                   
                </form>
            </div>

        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
