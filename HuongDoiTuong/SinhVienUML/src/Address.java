public class Address {
    String streetAdress;
    String city;
    String state;
    long zipCode;

    public Address() {
        super();
    }

    public Address(String streetAdress, String city, String state, long zipCode) {
        super();
        this.streetAdress = streetAdress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public  String toString(){
        return streetAdress +"  " + city+ "   " +state+ "   " + zipCode;
    }

}
