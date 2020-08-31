package stubs.weather;

import java.util.HashMap;

//It is an interface that Team #1 and Team #2 agreed upon. Both pieces of the code will implement its methods.

public interface Temperatures {
    //First element of Integer type is an identifier of weather station
    //Second element of Double type is a temperature measured in Celsius degrees.
    HashMap<Integer, Double> getTemperatures();
}
