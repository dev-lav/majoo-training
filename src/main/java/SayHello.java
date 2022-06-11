public class SayHello {

    String greeting;

    public void setGreeting(String greeting)
    {
        this.greeting = greeting;
    }

    public void sayGreeting()
    {
        System.out.println(greeting);
    }

    public  static void main(String args[])
    {
        SayHello halo = new SayHello();
        halo.setGreeting("Halo");
        halo.sayGreeting();
    }
}
