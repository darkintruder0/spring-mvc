/**
 * 
 */
package net.tecgurus.spring.mvc.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Allan Flores Rojas
 *
 */
@Entity
@Table(name="catalogo_general")
public class CatalogoGeneralEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id_cat;
	public String dsc_cor_cat;
	public String dsc_com_cat;
	public Integer id_est_cat;
	public Timestamp fch_cre;
	public Timestamp fch_mod;
	/**
	 * @return the id_cat
	 */
	public Integer getId_cat() {
		return id_cat;
	}
	/**
	 * @param id_cat the id_cat to set
	 */
	public void setId_cat(Integer id_cat) {
		this.id_cat = id_cat;
	}
	/**
	 * @return the des_cor_cat
	 */
	public String getDsc_cor_cat() {
		return dsc_cor_cat;
	}
	/**
	 * @param des_cor_cat the des_cor_cat to set
	 */
	public void setDsc_cor_cat(String dsc_cor_cat) {
		this.dsc_cor_cat = dsc_cor_cat;
	}
	/**
	 * @return the des_com_cat
	 */
	public String getDsc_com_cat() {
		return dsc_com_cat;
	}
	/**
	 * @param des_com_cat the des_com_cat to set
	 */
	public void setDsc_com_cat(String dsc_com_cat) {
		this.dsc_com_cat = dsc_com_cat;
	}
	/**
	 * @return the id_est_cat
	 */
	public Integer getId_est_cat() {
		return id_est_cat;
	}
	/**
	 * @param id_est_cat the id_est_cat to set
	 */
	public void setId_est_cat(Integer id_est_cat) {
		this.id_est_cat = id_est_cat;
	}
	/**
	 * @return the fch_cre
	 */
	public Timestamp getFch_cre() {
		return fch_cre;
	}
	/**
	 * @param fch_cre the fch_cre to set
	 */
	public void setFch_cre(Timestamp fch_cre) {
		this.fch_cre = fch_cre;
	}
	/**
	 * @return the fch_mod
	 */
	public Timestamp getFch_mod() {
		return fch_mod;
	}
	/**
	 * @param fch_mod the fch_mod to set
	 */
	public void setFch_mod(Timestamp fch_mod) {
		this.fch_mod = fch_mod;
	}	

}
