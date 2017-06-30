package com.accenture.controller;

import com.accenture.Validaciones.Validaciones;
import com.accenture.model.HotelesModel;
import com.accenture.service.Conexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
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

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("BuscarNombre");
        mav.addObject("hotel", new HotelesModel());

        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("hotel") HotelesModel h, BindingResult result, SessionStatus status) { //Reenviamos los datos del formulario
        
        if (h.getNombre().equals("")) {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("BuscarNombre");
            mav.addObject("hotel", new HotelesModel());
            
            return mav;

        } else {
            ModelAndView mav = new ModelAndView();

            String sql = "select  * from hoteles where estado=1 and nombre='" + h.getNombre() + "'";
            List datos = this.jdbcTemplate.queryForList(sql);
            mav.addObject("datos", datos);
            mav.setViewName("home");
            return mav;
        }
    }

}
