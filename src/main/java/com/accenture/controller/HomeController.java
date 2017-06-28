package com.accenture.controller;

import com.accenture.service.Conexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
 private JdbcTemplate jdbcTemplate;

    //Creamos un constructor
    public HomeController() {
        //creamos una instancia de el objeto JDBCTemplate
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar()); //Instanciamos el metodo conectar que hace la conexion a la base de datos

    }

    @RequestMapping("home.htm")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();

        String sql = "select  * from hoteles where estado=1";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("datos", datos);
        mav.setViewName("home");
        return mav;

    }
}
