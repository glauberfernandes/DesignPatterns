package criacionais.builder.example.builders;

import criacionais.builder.example.cars.Car;
import criacionais.builder.example.cars.CarType;
import criacionais.builder.example.components.Engine;
import criacionais.builder.example.components.GPSNavigator;
import criacionais.builder.example.components.Transmission;
import criacionais.builder.example.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 * 
 * @author glauber.fernandes
 *
 */
public class CarBuilder implements Builder {

	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	@Override
	public void setCarType(CarType type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer,
				gpsNavigator);
	}
}
