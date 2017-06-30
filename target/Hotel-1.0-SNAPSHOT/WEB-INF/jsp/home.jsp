
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <!--Aquí va el enlace de boostrap-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

        <title>Página principal</title>
    </head>
    <body>
        <div class="row">
            <div class="col-md-1">
                <img src="https://www.accenture.com/_acnmedia/Accenture/next-gen-2/event-hpe-discover/Accenture-Lockup.png" width="130" height="100"/>
                
            </div>
            <div class="col-md-11">
                <div class="page-header">
                    <h1> Administrador web<small> Hoteles</small></h1>
                </div>
            </div>
        </div>


        <div class="container">
            <div class="row">

                <div class="col-md-2"> </div>

                <div class="col-md-8">

                    <h2>Listado de hoteles creados</h2>
                    <table class=" table table-bordered table table-striped"> <!--filas con distintos colores-->
                        <thead>
                        <th class="info">ID</th>
                        <th>Nombre</th>
                        <th class="info">Dirección</th>
                        <th>Número de estrellas</th>
                        <th class="info">Huespedes</th>
                        <th>TripAdvisor</th>
                        <th class="info">Opciones de editado</th>

                        <!--Aqui esta mostrando todo lo que hay en la tabla -->
                        </thead>
                        <tbody>
                            <c:forEach items="${datos}" var="dato">
                                <tr>
                                    <!--Ese dato es el objeto para llamar a la clase hoteles que esta en la clase homecontroller-->
                                    <td class="info"><c:out value="${dato.id}"/></td> 
                                    <td><c:out value="${dato.nombre}"/></td>
                                    <td class="info"><c:out value="${dato.direccion}"/></td>
                                    <td><c:out value="${dato.numEstrellas}"/></td>
                                    <td class="info"><c:out value="${dato.huespedes}"/></td>
                                    <td><c:out value="${dato.tripAdvisor}"/></td>
                                    <td class="info"><a href="<c:url value="edit.htm?id=${dato.id}" />">Editar</a>  <a href="<c:url value="delete.htm?id=${dato.id}" />">Eliminar</a></td>
                                </tr>

                            </c:forEach>
                        </tbody>
                    </table>

                    <div class="row text-center" >
                        <a href="<c:url value="add.htm" />" class="btn btn-success">Agregar hotel</a>
                        <a href="<c:url value="BuscarNombre.htm" />" class="btn btn-info">Filtrar por nombre</a>
                        <a href="<c:url value="BuscarDireccion.htm" />" class="btn btn-primary">Filtrar por ubicación</a>
                    </div>
                </div>

                <div class="col-md-2"> </div>
            </div>

        </div>
        <br>
        <ol class="breadcrumb">
            <li><a href="<c:url value="/home.htm" />">Página principal</a></li>
        </ol>
    </body>
</html>
