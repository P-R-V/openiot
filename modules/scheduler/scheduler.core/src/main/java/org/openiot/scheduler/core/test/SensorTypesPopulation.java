package org.openiot.scheduler.core.test;

import org.openiot.commons.sensortypes.model.MeasurementCapability;
import org.openiot.commons.sensortypes.model.SensorType;
import org.openiot.commons.sensortypes.model.SensorTypes;
import org.openiot.commons.sensortypes.model.Unit;

public class SensorTypesPopulation {

	private SensorTypes testSensorTypes;

	public SensorTypesPopulation() {
		testSensorTypes = new SensorTypes();
		
		SensorType testSensorType1 = new SensorType();
		// http://lsm.deri.ie/ont/lsm.owl#hasSensorType
		testSensorType1
				.setId("http://lsm.deri.ie/resource/8a8291b7321534e701321534ee3f0015");
		testSensorType1.setName("weather");

		MeasurementCapability mc1Weather = new MeasurementCapability();
		// http://purl.oclc.ie/NET/ssnx/ssn#observes
		mc1Weather.setId("http://lsm.deri.ie/resource/5395423154665");
		mc1Weather.setName("AirTemperature");

		Unit unit1 = new Unit();
		unit1.setName("C");
		unit1.setType("double");
		mc1Weather.getUnit().add(unit1);

		// ////
		MeasurementCapability mc2Weather = new MeasurementCapability();
		mc2Weather.setId("http://lsm.deri.ie/resource/5395434919219");// windchill
		mc2Weather.setName("WindChill");

		Unit unit2 = new Unit();
		unit2.setName("C");
		unit2.setType("double");
		mc2Weather.getUnit().add(unit2);

		// ///

		MeasurementCapability mc3Weather = new MeasurementCapability();
		mc3Weather.setId("http://lsm.deri.ie/resource/5395438576035");// WindSpeed
		mc3Weather.setName("WindSpeed");

		Unit unit3 = new Unit();
		unit3.setName("km/h");
		unit3.setType("double");
		mc3Weather.getUnit().add(unit3);

		// //

		MeasurementCapability mc4Weather = new MeasurementCapability();
		mc4Weather.setId("http://lsm.deri.ie/resource/5395341713068");// AtmoshpereHumidity
		mc4Weather.setName("AtmoshpereHumidity");

		Unit unit4 = new Unit();
		unit4.setName("%");
		unit4.setType("double");
		mc4Weather.getUnit().add(unit4);

		// //

		MeasurementCapability mc5Weather = new MeasurementCapability();
		mc5Weather.setId("http://lsm.deri.ie/resource/5395345638854");// AtmoshperePressure
		mc5Weather.setName("AtmoshperePressure");

		Unit unit5 = new Unit();
		unit5.setName("mb");
		unit5.setType("double");
		mc5Weather.getUnit().add(unit5);

		// /

		MeasurementCapability mc6Weather = new MeasurementCapability();
		mc6Weather.setId("http://lsm.deri.ie/resource/5395349164649");// AtmoshpereVisibility
		mc6Weather.setName("AtmoshpereVisibility");

		Unit unit6 = new Unit();
		unit6.setName("mb");
		unit6.setType("double");
		mc6Weather.getUnit().add(unit6);

		// /

		MeasurementCapability mc7Weather = new MeasurementCapability();
		mc7Weather.setId("http://lsm.deri.ie/resource/5395417401338");// Status
		mc7Weather.setName("Status");

		Unit unit7 = new Unit();
		unit7.setName("null");
		unit7.setType("Cloudy");
		mc7Weather.getUnit().add(unit7);

		// /

		MeasurementCapability mc8Weather = new MeasurementCapability();
		mc8Weather.setId("http://lsm.deri.ie/resource/5395372015952");// Direction
		mc8Weather.setName("Direction");

		Unit unit8 = new Unit();
		unit8.setName("null");
		unit8.setType("NNW");
		mc8Weather.getUnit().add(unit8);

		testSensorType1.getMeasurementCapability().add(mc1Weather);
		testSensorType1.getMeasurementCapability().add(mc2Weather);
		testSensorType1.getMeasurementCapability().add(mc3Weather);
		testSensorType1.getMeasurementCapability().add(mc4Weather);
		testSensorType1.getMeasurementCapability().add(mc5Weather);
		testSensorType1.getMeasurementCapability().add(mc6Weather);
		testSensorType1.getMeasurementCapability().add(mc7Weather);
		testSensorType1.getMeasurementCapability().add(mc8Weather);

		testSensorTypes.getSensorType().add(testSensorType1);

		SensorType testSensorType2 = new SensorType();
		testSensorType2
				.setId("http://lsm.deri.ie/resource/8a8291b7321534e701321534ee440017");
		testSensorType2.setName("bikehire");

		MeasurementCapability mc1BikeHire = new MeasurementCapability();
		mc1BikeHire.setId("http://lsm.deri.ie/resource/5395352331763");// BikeAvailability
		mc1BikeHire.setName("BikeAvailability");

		Unit unit1BikeHire = new Unit();
		unit1BikeHire.setName("bike");
		unit1BikeHire.setType("double");
		mc1BikeHire.getUnit().add(unit1BikeHire);

		// //

		MeasurementCapability mc2BikeHire = new MeasurementCapability();
		mc2BikeHire.setId("http://lsm.deri.ie/resource/5395355582227");// BikeDockAvailability
		mc2BikeHire.setName("BikeDockAvailability");

		Unit unit2BikeHire = new Unit();
		unit2BikeHire.setName("dock");
		unit2BikeHire.setType("double");
		mc2BikeHire.getUnit().add(unit2BikeHire);

		testSensorType2.getMeasurementCapability().add(mc1BikeHire);
		testSensorType2.getMeasurementCapability().add(mc2BikeHire);

		testSensorTypes.getSensorType().add(testSensorType2);

	}

	public SensorTypes getSensorTypes() {
		return testSensorTypes;
	}

}
