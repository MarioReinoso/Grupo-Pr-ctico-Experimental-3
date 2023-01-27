<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
  <head>
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
        
    <title>Mapa Georeferenciado</title>
    <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
     <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
    <script src="https://unpkg.com/@google/markerclustererplus@4.0.1/dist/markerclustererplus.min.js"></script>
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBIwzALxUPNbatRBj3Xi1Uhp0fFzwWNBkE&callback=initMap&libraries=&v=weekly"
      defer
    ></script>
    <style type="text/css">
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }

      /* Optional: Makes the sample page fill the window. */
      html,
      body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
    <script>
      function initMap() {
        const map = new google.maps.Map(document.getElementById("map"), {
          zoom: 15,
          center: { lat: -2.90055, lng: -79.00453 },   
        });
        // Create an array of alphabetical characters used to label the markers.
        const labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Add some markers to the map.
        // Note: The code uses the JavaScript Array.prototype.map() method to
        // create an array of markers based on a given "locations" array.
        // The map() method here has nothing to do with the Google Maps API.
        const markers = locations.map((location, i) => {
          return new google.maps.Marker({
            position: location,
            label: labels[i % labels.length],
          });
        });
        // Add a marker clusterer to manage the markers.
        new MarkerClusterer(map, markers, {
          imagePath:
            "https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/m",
        });
      }
      const locations = [
        { lat: -2.8940722, lng: -79.0055215 },//luis coredro y Sangurima
        { lat: -2.888847, lng: -79.0045973 },//luis coredro  y heroes de verdeloma
        { lat: -2.9014631, lng: -79.0069176 },//luis coredro y larga
        { lat: -2.902809, lng: -79.0221543 },//av Loja y Pichincha
        { lat: -2.9135563, lng: -79.0069176 },//av loja y don bosco
        { lat: -2.9106384, lng: -79.0011198 },//paucarbamba y Luis Moreno Mora
        { lat: -2.90608, lng: -78.9858285 },//Max hule y pumapungo
      
      ];
    </script>
  </head>
  <body>
      <div class="form-group text-center">
                             
                  <br>
                  <p><strong>Mapa Geo-referenciado</strong></p>
      </div> 
    <div id="map"></div>
  </body>
</html>
