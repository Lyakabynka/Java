package entities;

import entities.abstractions.Building;
import entities.enums.ShopType;

public class Shop extends Building {

    private ShopType type;



    public Shop(String address, int squareMeters) {
        super(address, squareMeters);
    }

    public ShopType getType() {
        return type;
    }

    public void setType(ShopType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString() + "\n" + super.toString();
    }
}
