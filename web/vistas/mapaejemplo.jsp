


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        
        <script
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBIwzALxUPNbatRBj3Xi1Uhp0fFzwWNBkE&callback=initMap&libraries=&v=weekly"></script>
        <script>
                var map;
                function initialize() {
                  var mapOptions = {
                                    zoom: 15,
                                    center: new google.maps.LatLng(-2.90055,  -79.00453)
                                    };
                  map = new google.maps.Map(document.getElementById('map-canvas'),mapOptions);
                }

                google.maps.event.addDomListener(window, 'load', initialize);
                
                
                
        </script>
    </head>
    <body>
       <div class="form-group text-center">
                             
                  <br>
                  <p><strong>Mapa Geo-referenciado</strong></p>
                </div> 
        
       <div id="map-canvas" style="height:500px; width:1300px"></div>

    </body>
</html>
