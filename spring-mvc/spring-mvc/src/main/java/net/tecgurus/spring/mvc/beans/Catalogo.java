package net.tecgurus.spring.mvc.beans;

public class Catalogo {
	private String dsc_cor_cat;
	private String dsc_com_cat;
	private Integer id_est_cat;
	
	public String getDsc_cor_cat() {
		return dsc_cor_cat;
	}
	public void setDsc_cor_cat(String dsc_cor_cat) {
		this.dsc_cor_cat = dsc_cor_cat;
	}
	public String getDsc_com_cat() {
		return dsc_com_cat;
	}
	public void setDsc_com_cat(String dsc_com_cat) {
		this.dsc_com_cat = dsc_com_cat;
	}
	public Integer getId_est_cat() {
		return id_est_cat;
	}
	public void setId_est_cat(Integer id_est_cat) {
		this.id_est_cat = id_est_cat;
	}

}
