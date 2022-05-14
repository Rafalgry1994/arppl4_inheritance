package pl.sda.arp4.inheritance.rodzina;
// klasa abstrakcyjna i nie moze istniec instancja tej klasy (nie możemy stworzyć takiego obiektu)

public abstract class Człowiek {
    public void przedstawSię(){
        System.out.println("Jestem człowiekiem");
    }
    public abstract boolean czyPelnoletni();
}
