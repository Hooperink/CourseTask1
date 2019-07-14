package by.etc.AgregationAndComposition.course_task_four.TaskThree;

public class Region {
    private District []districts;
    private String name;
    private City regionalCity;

    Region(String name, City regionalCity, District ... districts){
        this.name = name;
        this.regionalCity = regionalCity;
        this.districts = districts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public void setRegionalCity(City regionalCity) {
        this.regionalCity = regionalCity;
    }

    public String getName() {
        return name;
    }

    public City getRegionalCity() {
        return regionalCity;
    }

    public District[] getDistricts() {
        return districts;
    }
}
