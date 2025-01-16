package clases;

import java.util.Objects;

public abstract class Animal {
	private int idAnimal;
	private String nombre;
	private boolean chip; //Indica si tiene o no chip
	
	////////// CONSTRUCTORES //////////
	public Animal(int idAnimal, String nombre, boolean chip) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = nombre;
		this.chip = chip;
	}
	
	public Animal(int idAnimal) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = "******";
		this.chip = false;
	}

	public Animal() {
		super();
		this.idAnimal = 0;
		this.nombre = "******";
		this.chip = false;
	}
	
	////////// GETERS Y SETTERS //////////
	/**
	 * @return the idAnimal
	 */
	public int getIdAnimal() {
		return idAnimal;
	}

	/**
	 * @param idAnimal the idAnimal to set
	 */
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the chip
	 */
	public boolean isChip() {
		return chip;
	}

	/**
	 * @param chip the chip to set
	 */
	public void setChip(boolean chip) {
		this.chip = chip;
	}

	////////// TO STRING //////////
	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nombre=" + nombre + ", chip=" + chip + "]";
	}
	
	////////// HASHCODE Y EQUALS //////////
	@Override
	public int hashCode() {
		return Objects.hash(chip, idAnimal, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return chip == other.chip && idAnimal == other.idAnimal && Objects.equals(nombre, other.nombre);
	}
	
	////////// OTROS METODOS //////////
	public abstract void saludar();
	public abstract void comer();
	public abstract String beber();

}
