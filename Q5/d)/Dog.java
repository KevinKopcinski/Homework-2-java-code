public class Dog {
    
    private String breed;
    private String name;
    private List<Paw> listPaw;

    Dog(){
        listPaw = new Arrays.asList(4);
        listPaw.add(new Paw(1));
        listPaw.add(new Paw(2));
        listPaw.add(new Paw(3));
        listPaw.add(new Paw(4));
    }
}
