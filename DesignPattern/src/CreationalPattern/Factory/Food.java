package CreationalPattern.Factory;

public enum Food {
    FRUIT("fruit"),
    PEPPERONI("pepperoni"),
    SAUSAGE("sausage");
    private String value;

    Food(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
}
