package stubs.weather;

import java.util.HashMap;
import java.util.Map;
//This is our SUT. It calculates the weather based on the read of the measurements from sensors. To simplify this class we are
//adding only +1 degree Celsius to each sensor (line 18).

public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateTemperatures() {
        HashMap<Integer, Double> resultMap = new HashMap<>();
        for (Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }
}
