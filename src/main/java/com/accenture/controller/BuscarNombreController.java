package com.accenture.controller;

import com.accenture.Validaciones.Validaciones;
import com.accenture.model.HotelesModel;
import com.accenture.service.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("BuscarNombre.htm")
public class BuscarNombreController {

    Validaciones Validar;
    private JdbcTemplate jdbcTemplate;

    public BuscarNombreController() {
        this.Validar = new Validaciones();
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }

    @RequestMapping(value = "BuscarNombre.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        return new ModelAndView("BuscarNombre", "command", new HotelesModel());
  
    }


}
