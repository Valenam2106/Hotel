<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

        <title>Busqueda por nombre</title>
    </head>
    <body>
        <div class="page-header">
            <h1> Administrador web<small> Busqueda por nombre</small></h1>
        </div>

        <div class="container">
            <div class="row">

                <div class="col-md-2"> </div>

                <div class="col-md-8">

                    <form:errors path="*" element="div" cssClass="alert alert-danger" />

                    <div clas="form-control">

                        <div class="input-group">
                            <form:label path="nombre" cssclass="input-group-addon">Hotel a buscar:</form:label>
                            <form:input path="nombre" cssClass="form-control" />

                        </div>
                        <input type="submit" value="Buscar " class="btn btn-info form-control"  />

                    </div>

                </div>

                <div class="col-md-2"> </div>
            </div>

        </div>
    </body>
</html>
