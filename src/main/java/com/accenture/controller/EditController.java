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
@RequestMapping("edit.htm")
public class EditController {

    Validaciones Validar;
    private JdbcTemplate jdbcTemplate;

    public EditController() {
        this.Validar = new Validaciones();
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        HotelesModel datos = this.selectHoteles(id);
        mav.setViewName("edit");
        mav.addObject("hotel", new HotelesModel(id, datos.getNombre(), datos.getDireccion(), datos.getNumEstrellas(), datos.getHuespedes(), 1, datos.getTripAdvisor()));
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(
            @ModelAttribute("hotel") HotelesModel h,
            BindingResult result,
            SessionStatus status,
            HttpServletRequest request
    ) {
        this.Validar.validate(h, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            int id = Integer.parseInt(request.getParameter("id"));
            HotelesModel datos = this.selectHoteles(id);
            mav.setViewName("edit");
            mav.addObject("hotel", new HotelesModel(id, datos.getNombre(), datos.getDireccion(), datos.getNumEstrellas(), datos.getHuespedes(), 1, datos.getTripAdvisor()));
            return mav;
        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            this.jdbcTemplate.update(
                    "update hoteles "
                    + "set nombre=?,"
                    + " direccion=?,"
                    + " numEstrellas=?, "
                    + " huespedes=?, "
                    + " tripAdvisor=? "
                    + "where "
                    + "id=? ",
                    h.getNombre(), h.getDireccion(), h.getNumEstrellas(), h.getHuespedes(), h.getTripAdvisor(), id);
            return new ModelAndView("redirect:/home.htm");
        }

    }

    public HotelesModel selectHoteles(int id) {
        final HotelesModel hotel = new HotelesModel();
        String quer = "SELECT * FROM hoteles WHERE id='" + id + "'";
        return (HotelesModel) jdbcTemplate.query(quer, new ResultSetExtractor<HotelesModel>() {
            public HotelesModel extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    hotel.setId(rs.getInt("id"));
                    hotel.setNombre(rs.getString("nombre"));
                    hotel.setDireccion(rs.getString("direccion"));
                    hotel.setNumEstrellas(rs.getString("numEstrellas"));
                    hotel.setHuespedes(rs.getString("huespedes"));
                    hotel.setTripAdvisor(rs.getString("tripAdvisor"));
                }
                return hotel;
            }

        }
        );
    }

}
