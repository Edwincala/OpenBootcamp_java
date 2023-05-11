
public class Main {

    public static void main(String[] args) {
        CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();
        cocheCRUDImpl.save();
        cocheCRUDImpl.findAll();
        cocheCRUDImpl.delete();
    }
}