package criacionais.builder.example.builders;

import criacionais.builder.example.cars.CarType;
import criacionais.builder.example.cars.Manual;
import criacionais.builder.example.components.Engine;
import criacionais.builder.example.components.GPSNavigator;
import criacionais.builder.example.components.Transmission;
import criacionais.builder.example.components.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 * 
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 * @author glauber.fernandes
 *
 */
public class CarManualBuilder implements Builder {
	
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

	public Manual getResult(){
		return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
