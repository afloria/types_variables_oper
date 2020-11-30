class Main {
  public static void main(String[] args) {
    //the above code will not print
    //int cannot be used as a variable name
    //int int = 0;
    //System.out.println(int);
 
    //the below code will print out
    int var_num = 10;
    System.out.println(var_num);

    //the below code will not print
    // the variable var_name is initialized as
    //an int but had a string value placed
    //into the variable
    //int var_name = "Keke";
    //System.out.println(var_name);

    //the below code will print
    String var_name = "Keke";
    System.out.println(var_name);

    //the code below will not print because
    //the variable name was not
    //initialized
    //System.out.println(name + " is " + age);

    //the below code will print
    String name = "Amina";
    int age = 27;
    System.out.println(name + " is " + age);

    //the below code will not print because
    //the variable newNumber is locally scoped
    //within the if statement
    //int numberOne = 1;
    //if(numberOne == 1) {
      //String newNumber = "is equal";
    //}
    //System.out.println(newNumber);

    //the below code will work
     int numberOne = 1;
     if(numberOne == 1) {
      String newNumber = "is equal";
      System.out.println(newNumber);
    }
    

  }
}