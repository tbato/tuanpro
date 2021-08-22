package test.model;

public class Car {
	private String nameCar;
	private String idCar;
	private int numberBanhXe;
	public Car(String nameCar, String idCar,int numberBanhXe)
	{
		this.nameCar = nameCar;
		this.idCar = idCar;
		this.numberBanhXe = numberBanhXe;
	}
	public String getNameCar() {
		return nameCar;
	}
	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}
	public String getIdCar() {
		return idCar;
	}
	public void setIdCar(String idCar) {
		this.idCar = idCar;
	}
	public int getNumberBanhXe() {
		return numberBanhXe;
	}
	public void setNumberBanhXe(int numberBanhXe) {
		this.numberBanhXe = numberBanhXe;
	}
}
