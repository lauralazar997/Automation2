public class Temperature {
    double celsius;

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public void toFahrenheit(){
        double tempFahrenheit = this.celsius*9/5 + 32;
        System.out.println("Valoarea temperaturii " + this.celsius + " in Fahrenheit este: " + tempFahrenheit);
    }

    public void toKelvin(){
        double tempKelvin = this.celsius + 273.15;
        System.out.println("Valoarea temperaturii " + this.celsius + "in Kelvin este: " + tempKelvin);
    }

    public static void main(){
        Temperature temp = new Temperature(15);
        temp.toFahrenheit();
        temp.toKelvin();
    }


}
