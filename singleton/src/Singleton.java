public class Singleton {
    private static volatile Singleton object = null;

    private Singleton() {}

    public String singletonClassMethod() {
        return "Singleton class method of object "+this;
    }

    public static Singleton getInstance() {
        if(object == null){
            synchronized (Singleton.class) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (object == null) {
                    object = new Singleton();
                }
            }
        }
        return object;
    }

}
