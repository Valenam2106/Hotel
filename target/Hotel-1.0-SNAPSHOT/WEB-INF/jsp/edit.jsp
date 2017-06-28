
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

        <title>Editar datos de hotel</title>
    </head>
    <body>
        <div class="page-header">
            <h1> Administrador web<small> Editar datos de hotel</small></h1>
        </div>
        <div class="container">
            <div class="row">

                <div class="col-md-2"> </div>

                <div class="col-md-8"> 
                    <form:form method="post" commandName="hotel">
                        <h1>Complete el formulario</h1>

                        <form:errors path="*" element="div" cssClass="alert alert-danger" />

                        <p>
                            <form:label path="nombre">Nombre:</form:label>
                            <form:input path="nombre" cssClass="form-control" />

                        </p>

                        <p>
                            <form:label path="direccion">Dirección:</form:label>
                            <form:input path="direccion" cssClass="form-control" />
                        </p>

                        <p>
                            <form:label path="numEstrellas">Número de estrellas:</form:label>
                            <form:input path="numEstrellas" cssClass="form-control" />
                        </p>

                        <p>
                            <form:label path="huespedes">Huespedes:</form:label>
                            <form:input path="huespedes" cssClass="form-control" />
                        </p>

                        <p>
                            <form:label path="tripAdvisor">¿Está en TripAdvisor?</form:label>
                            <form:select path="tripAdvisor" cssClass="form-control">

                                <form:option value="SI">SI</form:option>
                                <form:option value="NO">NO</form:option>

                            </form:select>

                        </p>
                        <hr />
                        <div class="row text-center" >
                            <input type="submit" value="Guardar cambios" class="btn btn-success"  />

                        </div>
                    </form:form>
                </div>



                <div class="col-md-2"> </div>
            </div>

        </div>
        <ol class="breadcrumb">
            <li><a href="<c:url value="/home.htm" />">Página principal</a></li>

        </ol>
    </body>
</html>
