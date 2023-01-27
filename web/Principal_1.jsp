
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
     <%--   <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>--%>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
             <a style="color:white" class="navbar-toggle"><span class="navbar-toggler-icon"></span>Home</a>     
        <br>
        <br>
        <div class="container">
            <h1>SISTEMA GEORENCIACION DOMICILIOS</h1>
            <a class="btn btn-success btn-lg" href="Controlador?accion=listar">Listar domicilios</a>
        </div>
        <br>
        <br>
         <div class="container">
            <a class="btn btn-success btn-lg" href="Controlador?accion=listar">Georefenciacion</a>
        </div>
    </body>
</html>
