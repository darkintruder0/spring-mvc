/**
 * 
 */
package net.tecgurus.spring.mvc.entities;

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
@Table(name="cliente")
public class ClienteEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id_cte;
	public String nom_cte;
	public String ape_pat_cte;
	public String ape_mat_cte;
	public String tel_cte;
	public String dir_cte;
	public Integer id_edo_cte;
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
	 * @return the nom_cte
	 */
	public String getNom_cte() {
		return nom_cte;
	}
	/**
	 * @param nom_cte the nom_cte to set
	 */
	public void setNom_cte(String nom_cte) {
		this.nom_cte = nom_cte;
	}
	/**
	 * @return the ape_pat_cte
	 */
	public String getApe_pat_cte() {
		return ape_pat_cte;
	}
	/**
	 * @param ape_pat_cte the ape_pat_cte to set
	 */
	public void setApe_pat_cte(String ape_pat_cte) {
		this.ape_pat_cte = ape_pat_cte;
	}
	/**
	 * @return the ape_mat_cte
	 */
	public String getApe_mat_cte() {
		return ape_mat_cte;
	}
	/**
	 * @param ape_mat_cte the ape_mat_cte to set
	 */
	public void setApe_mat_cte(String ape_mat_cte) {
		this.ape_mat_cte = ape_mat_cte;
	}
	/**
	 * @return the tel_cte
	 */
	public String getTel_cte() {
		return tel_cte;
	}
	/**
	 * @param tel_cte the tel_cte to set
	 */
	public void setTel_cte(String tel_cte) {
		this.tel_cte = tel_cte;
	}
	/**
	 * @return the dir_cte
	 */
	public String getDir_cte() {
		return dir_cte;
	}
	/**
	 * @param dir_cte the dir_cte to set
	 */
	public void setDir_cte(String dir_cte) {
		this.dir_cte = dir_cte;
	}
	/**
	 * @return the id_edo_cte
	 */
	public Integer getId_edo_cte() {
		return id_edo_cte;
	}
	/**
	 * @param id_edo_cte the id_edo_cte to set
	 */
	public void setId_edo_cte(Integer id_edo_cte) {
		this.id_edo_cte = id_edo_cte;
	}
}
