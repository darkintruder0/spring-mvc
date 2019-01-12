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
@Table(name="movimientos_cuenta")
public class MovimientosCuentaEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id_mov_cta;
	public Integer id_cta;
	public Timestamp fch_cre;
	public Integer id_tip_mov;
	public Double mnt_mov;
	public String dsc_mov;
	public String fol_aut;
	/**
	 * @return the id_mov_cta
	 */
	public Integer getId_mov_cta() {
		return id_mov_cta;
	}
	/**
	 * @param id_mov_cta the id_mov_cta to set
	 */
	public void setId_mov_cta(Integer id_mov_cta) {
		this.id_mov_cta = id_mov_cta;
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
	 * @return the id_tip_mov
	 */
	public Integer getId_tip_mov() {
		return id_tip_mov;
	}
	/**
	 * @param id_tip_mov the id_tip_mov to set
	 */
	public void setId_tip_mov(Integer id_tip_mov) {
		this.id_tip_mov = id_tip_mov;
	}
	/**
	 * @return the mnt_mov
	 */
	public Double getMnt_mov() {
		return mnt_mov;
	}
	/**
	 * @param mnt_mov the mnt_mov to set
	 */
	public void setMnt_mov(Double mnt_mov) {
		this.mnt_mov = mnt_mov;
	}
	/**
	 * @return the dsc_mov
	 */
	public String getDsc_mov() {
		return dsc_mov;
	}
	/**
	 * @param dsc_mov the dsc_mov to set
	 */
	public void setDsc_mov(String dsc_mov) {
		this.dsc_mov = dsc_mov;
	}
	/**
	 * @return the fol_aut
	 */
	public String getFol_aut() {
		return fol_aut;
	}
	/**
	 * @param fol_aut the fol_aut to set
	 */
	public void setFol_aut(String fol_aut) {
		this.fol_aut = fol_aut;
	}
}
