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
@Table(name="cuenta")
public class CuentaEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id_cta;
	public String no_cta;
	public Integer id_tip_cta;
	public Timestamp fch_alt;
	public Integer id_est;
	public Timestamp fch_cre;
	public Timestamp fch_mod;
	public String no_tar;
	public Double blnc_cta;
	/**
	 * @return the id_cta
	 */
	public Integer getId_cta() {
		return id_cta;
	}
	/**
	 * @param id_cta the id_cta to set
	 */
	public void setId_cta(Integer id_cta) {
		this.id_cta = id_cta;
	}
	/**
	 * @return the no_cta
	 */
	public String getNo_cta() {
		return no_cta;
	}
	/**
	 * @param no_cta the no_cta to set
	 */
	public void setNo_cta(String no_cta) {
		this.no_cta = no_cta;
	}
	/**
	 * @return the id_tip_cta
	 */
	public Integer getId_tip_cta() {
		return id_tip_cta;
	}
	/**
	 * @param id_tip_cta the id_tip_cta to set
	 */
	public void setId_tip_cta(Integer id_tip_cta) {
		this.id_tip_cta = id_tip_cta;
	}
	/**
	 * @return the fch_alt
	 */
	public Timestamp getFch_alt() {
		return fch_alt;
	}
	/**
	 * @param fch_alt the fch_alt to set
	 */
	public void setFch_alt(Timestamp fch_alt) {
		this.fch_alt = fch_alt;
	}
	/**
	 * @return the id_est
	 */
	public Integer getId_est() {
		return id_est;
	}
	/**
	 * @param id_est the id_est to set
	 */
	public void setId_est(Integer id_est) {
		this.id_est = id_est;
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
	/**
	 * @return the no_tar
	 */
	public String getNo_tar() {
		return no_tar;
	}
	/**
	 * @param no_tar the no_tar to set
	 */
	public void setNo_tar(String no_tar) {
		this.no_tar = no_tar;
	}
	/**
	 * @return the blnc_cta
	 */
	public Double getBlnc_cta() {
		return blnc_cta;
	}
	/**
	 * @param blnc_cta the blnc_cta to set
	 */
	public void setBlnc_cta(Double blnc_cta) {
		this.blnc_cta = blnc_cta;
	}
}
