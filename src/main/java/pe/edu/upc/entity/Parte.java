package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;


@Entity
@Table(name="Parte")


public class Parte implements Serializable {

	public Parte() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParte;
	
	
	@Column(name="nombreParte",nullable=false, length=45)
	private String nombreParte;
	
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Motor motor;


	public int getIdParte() {
		return idParte;
	}

	public void setIdParte(int idParte) {
		this.idParte = idParte;
	}

	public String getNombreParte() {
		return nombreParte;
	}

	public void setNombreParte(String nombreParte) {
		this.nombreParte = nombreParte;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Parte(int idParte, String nombreParte, Motor motor) {
		super();
		this.idParte = idParte;
		this.nombreParte = nombreParte;
		this.motor = motor;
	}
	
	
}
