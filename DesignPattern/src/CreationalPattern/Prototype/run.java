package CreationalPattern.Prototype;

public class run {
    public static void main(String[] args) {
        BlackShape original=new BlackShape(1,1,"white");
        BlackShape clone=original.clone();

        System.out.println("original hashcode:"+original.hashCode()+"\n clone hashcode:"+clone.hashCode());
    }
}
