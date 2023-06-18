public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance(){
        if(singleton == null) {
            singleton =  new Singleton();
        }
        return singleton;
    }

    public void singletonMessage(){
        System.out.println("Esta es la instancia de la clase Singleton, ubicada en el espacio de memoria " + singleton);
    }
}
