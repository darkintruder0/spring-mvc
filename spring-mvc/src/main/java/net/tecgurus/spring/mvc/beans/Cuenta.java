/**
 * 
 */
package net.tecgurus.spring.mvc.beans;

/**
 * @author Allan Flores Rojas
 *
 */
public class Cuenta {
	private String noCta;
	private Integer idTipCta;
	private Integer idEst;
	private String noTar;
	private Double blncCta;
	/**
	 * @return the noCta
	 */
	public String getNoCta() {
		return noCta;
	}
	/**
	 * @param noCta the noCta to set
	 */
	public void setNoCta(String noCta) {
		this.noCta = noCta;
	}
	/**
	 * @return the idTipCta
	 */
	public Integer getIdTipCta() {
		return idTipCta;
	}
	/**
	 * @param idTipCta the idTipCta to set
	 */
	public void setIdTipCta(Integer idTipCta) {
		this.idTipCta = idTipCta;
	}
	/**
	 * @return the idEst
	 */
	public Integer getIdEst() {
		return idEst;
	}
	/**
	 * @param idEst the idEst to set
	 */
	public void setIdEst(Integer idEst) {
		this.idEst = idEst;
	}
	/**
	 * @return the noTar
	 */
	public String getNoTar() {
		return noTar;
	}
	/**
	 * @param noTar the noTar to set
	 */
	public void setNoTar(String noTar) {
		this.noTar = noTar;
	}
	/**
	 * @return the blncCta
	 */
	public Double getBlncCta() {
		return blncCta;
	}
	/**
	 * @param blncCta the blncCta to set
	 */
	public void setBlncCta(Double blncCta) {
		this.blncCta = blncCta;
	}
}
