package by.etc.AgregationAndComposition.course_task_four.TaskThree;

public class State {
    private City capital;
    private String name;
    private Region []regions;
    State(City capital, String name, Region ... regions){
        this.name = name;
        this.capital = capital;
        this.regions = regions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public City getCapital() {
        return capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public int getSquare(){
        int square = 0;
        for (int i = 0; i < regions.length; i++) {
            for (int j = 0; j < regions[i].getDistricts().length; j++) {
                square += regions[i].getDistricts()[j].getSquare();
            }
        }
        return square;
    }
    
    public void getRegionsCities(){
        System.out.print("Regional cities: ");
        for (int i = 0; i < regions.length; i++) {
            System.out.print(regions[i].getRegionalCity().getName());
            if (i < regions.length - 1){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

}
