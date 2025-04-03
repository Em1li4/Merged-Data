import java.io.PrintStream;

// com.foothill.Country class.
public class Country {
    String code;
    String name;
    double area;
    double population;

    Country(){}

    Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    public String getName() { return this.name; }
    public double getArea(double area) { return this.area; }
   public double getPopulation (double population) { return this.population;}

    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArea (double area) {this.area = area;}
    public void setPopulation(double population){this.population = population;}

    @Override
    public String toString() {
        return "code='" + this.code +"', name='" + this.name + "'" + ", area=" + this.area + ", population=" + this.population;
    }
}