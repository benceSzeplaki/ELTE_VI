package main.gyak1;

public enum City {

    BUDAPEST(),
    LONDON(1001),
    MADRID("1002"),
    BARCELONA(MADRID);

    private final int zipCode;

    City() {
        this(1234);
    }

    City(int zipCode) {
        this.zipCode = zipCode;
    }

    City(String zipCodeAsText) {
        this(Integer.parseInt(zipCodeAsText));
    }

    City(City other) {
        this(other.zipCode);
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "City{" +
                " city=" + this.name() +
                ", zipCode=" + zipCode +
                '}';
    }

}
