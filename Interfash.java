//Interfash program for the demo example

interface Animal {

public  void Animal_name();
public void Animal_voice();

}

class Cat implements Animal{

    @Override
    public void Animal_name(){
        System.out.println("Animal is Cat !!");
    }

    @Override
    public void Animal_voice(){

        System.out.println("Mau Mau....");
    }

}

class Interfash {
    public static void main(String[] args){

        Animal obj = new Cat();

        obj.Animal_name();
        obj.Animal_voice();
        // System.out.print("Hello Akki !");


    }
}