<%-- 
    Document   : ResultBusName
    Created on : Jun 28, 2017, 6:34:59 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado de la busqueda</title>
    </head>
    <body>
        <div class="page-header">
            <h1> Administrador web<small> Resultado busqueda por nombre</small></h1>
        </div>
        <div class="container">
            <div class="row">

                <div class="col-md-3"> </div>

                <div class="col-md-6">

                    <h2>Resultados busqueda por nombre</h2>
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
                        <c:forEach items="${hotel}" var="dato">
                            <tr>
                                <!--Ese dato es el objeto para llamar a la clase hoteles que esta en la clase homecontroller-->
                                <td class="info"><c:out value="${dato.id}"/></td> 
                            <td><c:out value="${dato.nombre}"/></td>
                            <td class="info"><c:out value="${dato.direccion}"/></td>
                            <td><c:out value="${dato.numEstrellas}"/></td>
                            <td class="info"><c:out value="${dato.huespedes}"/></td>
                            <td><c:out value="${dato.tripAdvisor}"/></td>
                            <td class="info"><a href="<c:url value="edit.htm?id=${dato.id}" />">Editar</a>   <a href="<c:url value="delete.htm?id=${dato.id}" />">Eliminar</a></td>
                            </tr>

                        </c:forEach>
                        </tbody>
                    </table>

                </div>

                <div class="col-md-3"> </div>
            </div>

        </div>
    </body>
</html>
