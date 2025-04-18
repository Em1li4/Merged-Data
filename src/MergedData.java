//
// Project: Merged Data
// Author: [Jingwen Li]
//
import java.io.IOException;

/* --- do not modify below --- */
public class MergedData {
    public static void main(String[] args) throws IOException {
        WorldData wd = new WorldData();
        wd.loadEnrollmentData();
        try {
            wd.importFactBookData();
        }
        catch (ImportException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("-----------------------------------");
        System.out.println(wd.lookup("Burkina Faso").toString());
        System.out.println(wd.lookup("DJI").toString());
        System.out.println(wd.lookup("Guam").toString());
        System.out.println(wd.lookup("IRL").toString());
        System.out.println(wd.lookup("Kenya").toString());
        System.out.println(wd.lookup("LBY").toString());
        System.out.println(wd.lookup("Nauru").toString());
        System.out.println(wd.lookup("PRK").toString());
        System.out.println(wd.lookup("Samoa").toString());
        System.out.println(wd.lookup("YEM").toString());
        System.out.println("-----------------------------------");
    }
}
/* --- do not modify above --- */

/*

C:\Users\em1li\.jdks\openjdk-23.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\lib\idea_rt.jar=64717:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\em1li\IdeaProjects\WorldSimulator\out\production\WorldSimulator MergedData
84 non-matching or failed imports
-----------------------------------
CountryData{code='BFA'name='Burkina Faso', area=274200.0, population=0.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,2.46756,-,2.99355,3.50964,-,-,5.27344,-,-,6.67478,6.8609,6.86524,-,-,-,-,8.63831,-,7.98013,-,9.48721,10.55512,11.39514,12.2104,12.92052,14.773,15.822,16.48295,18.46052,19.74492,21.66185,-,26.53378,28.10485,29.14227,31.00148,-]}
CountryData{code='DJI'name='Djibouti', area=23000.0, population=50.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,9.0938,9.36461,9.96238,9.3606,-,-,-,-,-,-,-,-,11.44128,-,-,-,14.17161,14.7086,-,19.26153,21.2435,-,-,26.46648,-,-,-,-,-,-,37.8168,-,-,-,-]}
CountryData{code='GUM'name='Guam', area=549.0, population=15.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-]}
CountryData{code='IRL'name='Ireland', area=70280.0, population=4.3, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,63.38682,65.28022,69.69175,72.93361,75.54909,77.24009,78.11463,78.65693,-,79.9479,-,82.70063,-,-,-,-,-,-,-,-,78.04497,79.51083,-,-,82.85109,82.53367,81.64421,88.22536,90.01793,90.36688,90.54107,91.59308,92.27449,93.2769,93.59603,93.78802,94.91267,94.53881,95.8761,96.66345,-,98.01034,-,98.07109,98.10531,98.14067,98.6613,-,-]}
CountryData{code='KEN'name='Kenya', area=582650.0, population=40.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,32.8737,-,34.25671,35.80986,38.54144,40.25251,41.16133,43.23433,47.81761,47.42096,-,-,-,-,-,-,-,-,-,-]}
CountryData{code='LBY'name='Libya', area=1759540.0, population=30.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,13.22033,15.95872,20.68498,28.01731,33.17223,41.50767,45.90826,52.13122,55.45254,57.72015,55.33849,-,58.4499,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-]}
CountryData{code='NRU'name='Nauru', area=21.0, population=90.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,48.64583,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,72.50608,-,73.66255,-,71.80984,-,-,-]}
CountryData{code='PRK'name='Korea Dem. People’s Rep.', area=0.0, population=0.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-]}
CountryData{code='WSM'name='Samoa', area=2944.0, population=0.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,40.86395,-,-,68.49613,71.07261,64.55151,65.82802,-,-,-,-,-,-,-,79.78155,80.53411,81.10508,82.18894,-,85.97104,85.50756,85.51776,-,-,-]}
CountryData{code='YEM'name='Yemen Rep.', area=0.0, population=0.0, gdp=0.0, infantMortality=0.0, data=[-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,33.4825,-,-,-,-,-,-,-,-,-,-,39.72381,-,42.33233,43.7515,-,-,47.59088,-,-,-]}
-----------------------------------

Process finished with exit code 0

*/
