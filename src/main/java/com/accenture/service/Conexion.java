
package com.accenture.service;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Conexion {
    //En esta clase conecto con la base de datos tambien en spring deberia crear una así
    
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        //Metodo de conectar la base de datos 
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/hoteles");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
        
    }
}
