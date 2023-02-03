public abstract class Bird extends Animal implements ICanFly //both extends abstract Animal class and implements
// abstract ICanFly Interface. Is also abstract and cannot make a Bird object.
{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }

//    public abstract void fly(); could choose to have abstract method in this abstract subclass, but having fly defined
    // in a bird class leads to problems when dealing with other animals that can fly that are not birds. instead,
    // implement a fly interface
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }


}