package entities.abstractions;

import com.github.cliftonlabs.json_simple.JsonObject;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.InvalidPropertiesFormatException;

public abstract class Building {
    private String address;
    private int squareMeters;

    public Building(String address, int squareMeters)
    {
        this.address = address;
        this.squareMeters = squareMeters;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareMeters() {
        return this.squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public String toString() {
        return address + "\n" + squareMeters + "\n";
    }
}
