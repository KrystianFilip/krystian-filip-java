package stubs.weather;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub() {
        //Given
        //Easiest way to deal with our dependency is to create a stub in form of a dummy class that is hardcoded to return any data in
        //expected format. We can also replace our stub with a mock.

        Temperatures temperatures = new TemperaturesStub();

        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0, 25.5);
        temperaturesMap.put(1, 26.2);
        temperaturesMap.put(2, 24.8);
        temperaturesMap.put(3, 25.2);
        temperaturesMap.put(4, 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateTemperatures().size();
        //Then
        Assert.assertEquals(5,quantityOfSensors);
    }
}
