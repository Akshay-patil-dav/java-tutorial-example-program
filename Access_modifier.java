
class  External_class{
    int n=1; // java use defult public access modifire  in the java 

    private  int n1 = 2; // we provide the private access modifire in it for secure the data 

    protected int n2 = 3;// we can't use the protected Access modifire out side the package like in other java file .
    
    public int n3 =4;//we use public Access modifire all type of class.


//I create a Method in the External_class for access the private access modifire  directly becasue of private access modifire can't access out side the class and out side the packages .
    public static  void op(){

        External_class obj = new External_class();

        System.out.println("n1 : \t"+obj.n1);
    }
}


// It be the main class of the program file .
 class  Access_modifier {


    public static void main(String[] args){

// Here i create an Object of theExternal_class for access the different type od variable from the external class . 
      External_class obj = new External_class();



        System.out.println("n : \t"+obj.n);

        
        // I use the Exception Handling in this stap for remove the run time error in it for solving the error 
        try{
            obj.op();
        }catch (Exception e){
            System.out.print("n1  is  Private");
        }

        System.out.println("n1 :\t"+obj.n2);
        System.out.println("n1 :\t"+obj.n3);

    }
}