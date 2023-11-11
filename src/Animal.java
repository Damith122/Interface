public interface Animal {
    abstract void getParts(int hands,int legs);


}
class Dog implements Animal{

    @Override
    public void getParts(int hands, int legs) {
        System.out.println("Hands :"+ hands+" Legs :"+legs);
    }
}
class Test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.getParts(2,2);

    }
}
