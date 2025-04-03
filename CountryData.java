public class CountryData extends Country {
    double[] enrollment;
    double gdp;
    double infantMortality;

    CountryData(){}

    //Constructor
    CountryData(String code, String name){
        super(code, name);
    }

    public double[] getEnrollment() {
     return this.enrollment;
    }
    public double getGdp() { return this.gdp; }
    public double getInfantMortality() { return this.infantMortality; }

    public void setEnrollment(double[] enrollment){
        this.enrollment = enrollment;
    }
    public void setGdp(double gdp){this.gdp = gdp;}
    public void setInfantMortality(double infantMortality ){
        this.infantMortality = infantMortality;
    }

    @Override
    public String toString(){
        String dataStr = "";
        for(int i = 0; i < this.enrollment.length; i++){
            double value = this.enrollment[i];
            if(value==0) {
                dataStr = dataStr.concat("-");
            } else {
                dataStr = dataStr.concat(String.valueOf(value));
            }
            if (i != this.enrollment.length-1) {
                dataStr = dataStr.concat(",");
            }
        }
        return "CountryData{code='" + this.code +  "'name='" + this.name + "', area=" + this.area + ", population=" + this.population+ ", gdp=" + this.gdp + ", infantMortality=" + this.infantMortality + ", data=[" + dataStr +"]}";
    }

}
