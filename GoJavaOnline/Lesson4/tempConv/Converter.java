package mod4.figures.temperature;

public class Converter {
    double temperature;
    public void convertTemp(double temperature, char convertTo) {
        if (convertTo == 'C') {
            this.temperature = (temperature * 1.8) + 32;
            System.out.println("по Фаренгейту: " + this.temperature);
        }
        if (convertTo == 'F') {
            this.temperature = (temperature - 32) * 1.8;
            System.out.println("по Цельсию: " + this.temperature);
        }
    }
}
