package BobConstruye;

public class Casa extends Edificio {

	private int habitaciones;

	
	
	public Casa(String ubicasion, int habitaciones) {
		super(ubicasion);
		this.habitaciones = habitaciones;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	
}
