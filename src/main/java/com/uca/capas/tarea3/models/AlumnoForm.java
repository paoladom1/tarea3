package com.uca.capas.tarea3.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AlumnoForm {
	@Size(min=1, max=25, message="El campo Nombres debe tener entre {min} y {max} caracteres")
	@NotNull
	private String name;
	
	@Size(min=1, max=25, message="El campo Apellidos debe tener entre {min} y {max} caracteres")
	@NotNull
	private String lastname;
	
	@NotNull
	private String dateofbirth;
	
	@Size(min=1, max=25, message="El campo Lugar de Nacimiento debe tener entre {min} y {max} caracteres")
	@NotNull
	private String placeofbirth;
	
	@Size(min=1, max=100, message="El campo Institucion debe tener entre {min} y {max} caracteres")
	@NotNull
	private String highschool;
	
	@Size(min=8, max=8, message="El campo Telefono Fijo debe tener {max} caracteres")
	@NotNull
	private String phonenumber;
	
	@Size(min=8, max=8, message="El campo Telefono Movil debe tener {max} caracteres")
	@NotNull
	private String cellphone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getPlaceofbirth() {
		return placeofbirth;
	}

	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}

	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	

}
