class Objject{

    
    public void Name(){
        System.out.println("Simple Object");
    }
}

class Teachr extends Objject {

    @Override
    public void Name(){
        System.out.println("Teacher Object");
    }
}

class Student extends Objject {

    @Override
    public void Name(){
        System.out.println("Student Object");
    }
}

class Polimorfisan{
    public static void main(String[] args){

        Objject ob1 = new Student();

        ob1.Name();

        
    }
}