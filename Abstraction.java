
 abstract class  Animal {

    abstract void Animal_name();
    abstract void Animal_voice();

}

 class Cat extends Animal{

    @Override
     void Animal_name(){
        System.out.println("Animal is Cat !!");
    }

    @Override
     void Animal_voice(){

        System.out.println("Mau Mau....");
    }

}


class Abstraction{
    public static void main(String[] args){
        Animal obj = new Cat();

        obj.Animal_name();
        obj.Animal_voice();
    }
}