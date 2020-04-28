package com.uca.capas.tarea3.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea3.models.AlumnoForm;

@Controller
public class MainController {

	@RequestMapping("/ingresar")
	public String index(AlumnoForm alumno) {
		return "/ingresar";
	}

	@RequestMapping("/resultado")
	public ModelAndView ingresar(@Valid AlumnoForm alumnoForm, BindingResult br) {
		ModelAndView mav = new ModelAndView();
		if (br.hasErrors()) {
			if (!isDateValid(alumnoForm.getDateofbirth())) {
				mav.addObject("dateofbirth", "La fecha debe ser mayor al 01/01/2003");
			}
			if (br.getFieldError("name") != null)
				mav.addObject("name", br.getFieldError("name").getDefaultMessage());
			if (br.getFieldError("lastname") != null)
				mav.addObject("lastname", br.getFieldError("lastname").getDefaultMessage());
			if (br.getFieldError("placeofbirth") != null)
				mav.addObject("placeofbirth", br.getFieldError("placeofbirth").getDefaultMessage());
			if (br.getFieldError("highschool") != null)
				mav.addObject("highschool", br.getFieldError("highschool").getDefaultMessage());
			if (br.getFieldError("phonenumber") != null)
				mav.addObject("phonenumber", br.getFieldError("phonenumber").getDefaultMessage());
			if (br.getFieldError("cellphone") != null)
				mav.addObject("cellphone", br.getFieldError("cellphone").getDefaultMessage());
			mav.setViewName("error");
			return mav;
		}
		if (!isDateValid(alumnoForm.getDateofbirth())) {
			mav.addObject("dateofbirth", "La fecha debe ser mayor al 01/01/2003");
			mav.setViewName("error");
		} else
			mav.setViewName("resultado");
		return mav;
	}

	private boolean isDateValid(String date) {
		SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
		Date d1, d2;
		try {
			d1 = sdformat.parse(date);
			d2 = sdformat.parse("01/01/2003");
			return d1.compareTo(d2) >= 0;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}

}
