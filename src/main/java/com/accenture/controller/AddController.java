package com.accenture.controller;

import com.accenture.Validaciones.Validaciones;
import com.accenture.model.HotelesModel;
import com.accenture.service.Conexion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("add.htm") //la vista a la que me dirige cuando tipeo
public class AddController {

    //Creammos la instancia a las clases que importamos
    Validaciones Validar;
    private JdbcTemplate jdbcTemplate;

    //Creamos constructor
    public AddController() {
        this.Validar = new Validaciones();
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        //El metodo conectar es el que tiene la conexion directa con la base de datos
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add"); //la vista que va a mostrar
        mav.addObject("hotel", new HotelesModel());
        //Le envio el parametro de la clase hotel
        return mav;
    }
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("hotel") HotelesModel h, BindingResult result, SessionStatus status)
    {
        this.Validar.validate(h, result);
        if(result.hasErrors())
        {
            ModelAndView mav=new ModelAndView();
            mav.setViewName("add");
            mav.addObject("hotel",new HotelesModel());
            return mav;
        }else
        {
        
        this.jdbcTemplate.update
        ("insert into hoteles (nombre,direccion,numEstrellas,huespedes,estado,tripAdvisor) values (?,?,?,?,?,?)",
         h.getNombre(),h.getDireccion().replace(" ", ""),h.getNumEstrellas(),h.getHuespedes(),1,h.getTripAdvisor());
         return new ModelAndView("redirect:/home.htm");
        //Luego de crear el registro en la base de datos cargo la pagina donde muestro los hoteles
        }
       
    }
}
