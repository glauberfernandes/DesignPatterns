package criacionais.builder.example.builders;

import criacionais.builder.example.cars.CarType;
import criacionais.builder.example.components.Engine;
import criacionais.builder.example.components.GPSNavigator;
import criacionais.builder.example.components.Transmission;
import criacionais.builder.example.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 * 
 * @author glauber.fernandes
 *
 */
public interface Builder {
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}
