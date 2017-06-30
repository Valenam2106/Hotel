
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

        <title>Busqueda por dirección</title>
    </head>
    <body>
        <div class="row">
            <div class="col-md-1">
                <img src="https://www.accenture.com/_acnmedia/Accenture/next-gen-2/event-hpe-discover/Accenture-Lockup.png" width="130" height="100"/>

            </div>
            <div class="col-md-11">
                <div class="page-header">
                    <h1> Administrador web<small>  Busqueda por dirección</small></h1>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">

                <div class="col-md-3"> </div>

                <div class="col-md-6">

                    <form:form method="post" commandName="hotel">



                        <p>
                            <form:label path="direccion">Buscar dirección de hotel:</form:label>
                            <form:input path="direccion" cssClass="form-control" placeholder="Dirección de hotel "/>

                        </p>

                        <div class="row text-center" >
                            <input type="submit" value="Buscar hotel" class="btn btn-primary"  />
                        </div>


                    </form:form>
                </div>

                <div class="col-md-3"> </div>
            </div>

        </div>
        <br>
        <ol class="breadcrumb">
            <li><a href="<c:url value="/home.htm" />">Página principal</a></li>
        </ol>
    </body>
</html>
