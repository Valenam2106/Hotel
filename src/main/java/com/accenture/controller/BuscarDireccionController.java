
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
@RequestMapping("BuscarDireccion.htm")
public class BuscarDireccionController {
    
    Validaciones Validar;
    private JdbcTemplate jdbcTemplate;

    public BuscarDireccionController() {
        this.Validar = new Validaciones();
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("BuscarDireccion");
        mav.addObject("hotel", new HotelesModel());

        return mav;
    }
     @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("hotel") HotelesModel h, BindingResult result, SessionStatus status) { //Reivimos los datos del formulario        

         ModelAndView mav = new ModelAndView();
        String strDireccion = h.getDireccion().replace(" ", "");
         
        if (strDireccion.equals("")) {
           
            mav.setViewName("BuscarDireccion");
            mav.addObject("hotel", new HotelesModel());
            return mav;

        } else {
            

            String sql = "select  * from hoteles where estado=1 and direccion='" + strDireccion + "'";
            List datos = this.jdbcTemplate.queryForList(sql);
            mav.addObject("datos", datos);
            mav.setViewName("home");
            return mav;
        }
    }
    
}
