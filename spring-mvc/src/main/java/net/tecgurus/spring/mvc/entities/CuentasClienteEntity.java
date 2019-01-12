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
@Table(name="cuentas_cliente")
public class CuentasClienteEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id_cta_cte;
	public Integer id_cta;
	public Integer id_cte;
	public Timestamp fch_cre;
	public Integer id_edo_cta_cte;
	public String cmnt_cta_cte;
	public Integer id_tip_cta_cte;
	/**
	 * @return the id_cta_cte
	 */
	public Integer getId_cta_cte() {
		return id_cta_cte;
	}
	/**
	 * @param id_cta_cte the id_cta_cte to set
	 */
	public void setId_cta_cte(Integer id_cta_cte) {
		this.id_cta_cte = id_cta_cte;
	}
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
	 * @return the id_cte
	 */
	public Integer getId_cte() {
		return id_cte;
	}
	/**
	 * @param id_cte the id_cte to set
	 */
	public void setId_cte(Integer id_cte) {
		this.id_cte = id_cte;
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
	 * @return the id_edo_cta_cte
	 */
	public Integer getId_edo_cta_cte() {
		return id_edo_cta_cte;
	}
	/**
	 * @param id_edo_cta_cte the id_edo_cta_cte to set
	 */
	public void setId_edo_cta_cte(Integer id_edo_cta_cte) {
		this.id_edo_cta_cte = id_edo_cta_cte;
	}
	/**
	 * @return the cmnt_cta_cte
	 */
	public String getCmnt_cta_cte() {
		return cmnt_cta_cte;
	}
	/**
	 * @param cmnt_cta_cte the cmnt_cta_cte to set
	 */
	public void setCmnt_cta_cte(String cmnt_cta_cte) {
		this.cmnt_cta_cte = cmnt_cta_cte;
	}
	/**
	 * @return the id_tip_cta_cte
	 */
	public Integer getId_tip_cta_cte() {
		return id_tip_cta_cte;
	}
	/**
	 * @param id_tip_cta_cte the id_tip_cta_cte to set
	 */
	public void setId_tip_cta_cte(Integer id_tip_cta_cte) {
		this.id_tip_cta_cte = id_tip_cta_cte;
	}
}
