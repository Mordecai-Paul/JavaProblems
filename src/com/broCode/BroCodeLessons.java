package com.broCode;



import com.sun.org.apache.xpath.internal.compiler.Compiler;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;


class Basics {
    public static void methodVariable() {
        System.out.print("hot mess dey worry me.");
        System.out.println("i love Garri and beans.");
        System.out.println();
    }

    public static void methodVariables() {
        //variable is placeholder. for a value that behaves as the value it contains.

        String x = " water";
        String y = "Kool-aid";
        String temp;

        temp = x;
        x = temp;

        y = temp;
        System.out.println(x + ",\t" + temp + y);
    }

    public static void methodScannerClass() {
        Scanner scn = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scn.nextLine();

        System.out.println("How old are you? ");
        int age = scn.nextInt();

        scn.nextLine(); //nextLine !!very important.

        System.out.println("what is your favorite food");
        String food = scn.nextLine();

        System.out.println("hello:\t" + name);
        System.out.println("Your are: \t" + age + "Years old\t");
        System.out.println("You like: \t" + food);

    }

    public static void methodOperands() {
        //expression = operands & operators.
        //operands = values,variables,numbers,quantity.
        //operators = + - * / %.

        int friends = 10;
        friends = (int) (double) friends / 3; //type casting.
        friends++; //short form
        System.out.println(friends);

    }

    public static void methodSimpleGui() {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello: \t" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are" + age + "Years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height "));
        JOptionPane.showMessageDialog(null, "your are " + height + "cm tall");


    }

    public static void methodFunctionMathClasses() {
        double x = 3.45;
        double y = 4;

        double z = Math.max(x, y);
        System.out.println(z);

        double m = Math.abs(x);
        System.out.println(m);

        double squareRoot = Math.sqrt(y);
        System.out.println(squareRoot);

        double roundingUp = Math.ceil(x);
        System.out.println(roundingUp); //rounding up


        double roundingDown = Math.floor(x);//rounding down.
        System.out.println(roundingDown);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:");
        Double xy = scanner.nextDouble();

        System.out.println("Enter side y:");
        Double yx = scanner.nextDouble();

        double t = (Math.pow(xy, 2)) + (Math.pow(yx, 2));
        double f = Math.sqrt(t);
        System.out.println("The hypotenuse is :" + f);

        scanner.close();


    }

    public static void methodMathRandom() {
        Random random = new Random();

        int x = random.nextInt() * 10;
        System.out.println(x);


    }

    public static void methodIfStatements() {

        //  if statement == performs a block of code if it's condition evaluates to be true.
        int age = 13;
        if (age >= 18) {
            System.out.println("you are an adult!");
        } else if (age >= 75) {
            System.out.println("okay boomer");
        } else if (age >= 13) {
            System.out.println("you are a teenager!");
        } else {
            System.out.println("you are a child");
        }

    }

    public static void methodSwitchCase() {
        //if  you are in a situation where you use a lot of if use a switch statement.
        String day = "Pizza";
        switch (day) {
            case "Sunday":
                System.out.println("It is sunday");
                break;
            case "Monday":
                System.out.println("It is Monday.");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday.");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday.");
                break;
            case "Thursday":
                System.out.println("It is Thursday.");
                break;
            case "Friday":
                System.out.println("It is Friday.");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("That is not a day");
        }
    }

    public static void methodLogicalOperators() {
        /*
            Logical Operators = used to connect two or more expressions.
            && = (AND) both conditions must be true.
            || = (OR) either conditions must be true.
            != (NOT) reverses boolean value of conditions.
         */
        int temp = 25;
        if (temp > 30) {
            System.out.println("It is hot outside.");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.print("it is cold outside");
        }


    }

    public static void methodLogicalOperators2() {
        Scanner scn = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scn.nextLine();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game pew pew");
        }
    }

    public static void methodLoopConstruct() {
//        WHILE LOOP.
        //while loop = executes a block of code
        // infinitely as long as a
        // its condition remains true.
//        Scanner scn = new Scanner(System.in);
//        String name = "";
//
//        while(name.isEmpty()){
//            System.out.println("Enter your name:\t");
//            name = scn.nextLine();
//
//
//
//        }
//        System.out.println("Hello:\t" + name);

        //DO WHILE LOOP.
//        do{
//            System.out.println("Hello who are you:");
//            name = scn.nextLine();
//        }while (name.isEmpty());
//        System.out.println("Hello:\t" + name);

        //for loop = executes a block of code a limited amount of times.
//        for(int index = 0; index <= 20 ; index+= 4){
//            System.out.println(index);
//        }
//        System.out.println("Happy Bro!!");

        //NESTED LOOP.
        /**
         * NESTED LOOP = A LOOP INSIDE A LOOP.
         */
        Scanner scn = new Scanner(System.in);

        int rows;
        int column;
        String symbol = "";

        System.out.println("Enter # of rows:");
        rows = scn.nextInt();

        System.out.println("Enter # of Column s");
        column = scn.nextInt();

        System.out.println("Enter Symbol to use:");
        symbol = scn.next();

        for (int index = 1; index <= rows; index++) {
            System.out.println();
            for (int jagged = 1; jagged <= column; jagged++) {
                System.out.print(symbol);
            }
        }

    }

    public static void ArraysInJava() {
        //array used to store multiple values in a single variable.
//        String car[] = {"Camerao","Corvette","Tesla","BMw"};
//        car[0] = "Mustang";
//
//        System.out.println(car[1]);

        String[] cars = new String[3];

        cars[0] = "Camero";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[1]);

        for (String x : cars) {
            System.out.println(x);
        }
        System.out.println("<===================================>");

        //or
        for (int x = 0; x < cars.length; x++) {
            System.out.println(cars[x]);
        }


    }

    public static void twoDimensionalArray() {
        // 2D array = Array is an array of array

        // String[][] cars = new String[3][3];
//
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Corvette";
//        cars[0][2] = "Silverado";
//        cars[1][0] = "Monterey";
//        cars[1][1] = "Ranger";
//        cars[1][2] = "F-150";
//        cars[2][0] = "Ferrari";
//        cars[2][1] = "Limo";
//        cars[2][2] = "Tesla";

        String[][] cars
                = {
                {"Camaro", "Corvette", "Silverado"},
                {"Monterey", "Ranger", "Ranger"},
                {"Ranger", "F-150", "Ferrari", "Limo", "Tesla"}
        };


    }

    public static void StringMethod() {
//        String  a reference data type that can store one or more characters.
        //reference data types have access to useful methods.
        String name = "    Bro  ";
        //  boolean result = name.equalsIgnoreCase("bro");
        //  int result = name.lengthe();
        //   char result = name.charAt(0);
        //  int result = name.indexOf("B");
        //   boolean result = name.isEmpty();
        //   String result = name.toUpperCase();
        //    String result = name.toLowerCase();
        //   String result = name.trim();
        String result = name.replace('o', 'a');

        System.out.println(result);


    }

    public void WrapperClass() {
        //Wrapper class = provides a way to use primitive data types as reference data types
        /*
         reference data types contain useful methods.
         can be used with collections (ex.ArrayList).
         */

        //primitive     //wrapper
        //*********     //*******
        //boolean       Boolean
        //char          Character
        //int           Integer
        //double        Double.

        //autoboxing = the automatic conversion that the java compiler make
        //between the primitive datatype and their corresponding object wrapper classes.
        /****/
        //unboxing = the reverse of autoboxing. Automatic conversion
        // of wrapper class to primitive.

        Boolean a = true;
        Character b = '@';  //reference datatype !wrapper class.
        Integer c = 123;
        Double d = 3.14;

        if (a == true) {
            System.out.println(true);
        }
    }
        public static void ArrayList()
        {
            //ArrayList = a resizable. array
            //Elements can be added and removed after compilation phase.
            //store reference data types.
            ArrayList<String> food = new ArrayList<String>();
            food.add("pizza");
            food.add("humburger");
            food.add("hotdog");

            food.set(0,"sushi");
            food.remove(2);
            food.clear();

            for(int i = 0; i < food.size(); i++){
                System.out.println(food.get(i));
        }
    }
        public static void ArrayList2d()
        {
         //2D ArrayList a dynamic list of lists.
         //You can change the size of these list during runtime.
            ArrayList< ArrayList<String>> groceryList = new ArrayList<>();

              ArrayList<String> bakeryList = new ArrayList<>();
              bakeryList.add("pasta");
              bakeryList.add("garlic bread");
              bakeryList.add("donuts");

                ArrayList<String> produceList = new ArrayList<String>();
                produceList.add("tomatoes");
                produceList.add("zucchini");
                produceList.add("peppers");

                ArrayList<String> drinkList = new ArrayList<>();
                drinkList.add("soda");
                drinkList.add("coffee");

                groceryList.add(bakeryList);
                groceryList.add(produceList);
                groceryList.add(drinkList);
//            System.out.println(bakeryList.get(0));
            System.out.println(groceryList.get(0).get(0));
        }
        public static void enhancedForLoop()
        {
            /*
            for-each = traversing technique to iterate through the elements
            in an array/collection
            less steps, more readable.
            less flexible.
             */
         //   String[] animals = {"cat" , "dog","bird"};
            ArrayList<String> animals = new ArrayList<String>();
            animals.add("cat");
            animals.add("Dog");
            animals.add("rat");
            animals.add("bird");


            for(String x: animals){
                System.out.println(x);
            }
        }

        public void methodsThatReturnsNothing(String name,int age)
        {
            // a block of code that is executed whenever it is called upon.
//            String name = "Bro";

            System.out.println("Hello\t"+ name +"\t"+ "You are\t"+age+" " +"years old.");
            //return name;

        }
        public int methodThatReturnsSomething(int x , int y){
                int sum = x + y;
                return sum;
        }

        /***********************overloading methods.*********************************/
        //overloaded method = methods that share the same name but
        //have different parameters
        //method name + parameters = method signature.

        static int add(int a, int  b)
        {
            System.out.println("This is overloaded method #1");
            return   a + b;
        }
        static int add(int a, int b, int c){
            System.out.println("This is overloaded method #2");
            return  a + b + c;
        }
        static int add(int a, int b, int c, int d){
            System.out.println("This is overloaded method #3");

            return  a + b + c + d;
        }

        static double add(double a, double  b)
        {
            System.out.println("This is overloaded method #1");
            return   a +  b;
        }
        static double add(double a, double b, int c){
            System.out.println("This is overloaded method #2");
            return  a + b + c;
        }
        static double add(double a, int b, int c, int d){
            System.out.println("This is overloaded method #3");

            return  (a + b + c + d);
        }
        /*************************************************************/
        public static void methodPrintf()
        {
            /*
            an optimal method to control, format and display text to the cond
            sole window
            two arguments = format strings + (object/variable/value)
            %[flag] [precision] [width] [conversion-character]
             */
//            System.out.printf("%d this is a format String ",123);
            boolean myBoolean = true;
            char myChar = '@';
            String myString = " Bro";
            int myInt = 50;
            double myDouble = 1000;

//            System.out.printf("%b",myBoolean);
//            System.out.printf("\n%c",myChar);
//            System.out.printf("\n%s" ,myString);
//            System.out.printf("\n%d",myInt );
//            System.out.printf("\n%f",myDouble );


            /*
            [width]
            //minimum number of character to be written as output
            System.out.printf("hello %s",mystring);
            //
             */

            /*
            [Precision]
               sets number of digits of precision when outputting
               floating-point values
         System.out.printf("You have this much money %f",myDouble);
             */
            /*
             [flags]
             add and effets to output based on the flag added to format specifier
             // - :left-justify
             // + : output a plus ( + ) or minus ( - ) sign for a numeric value.
             // 0 : numeric values are zero-padded.
             // , : comma grouping separator if numbers > 10000.

            */
           // System.out.printf("You have this much money %,f", myDouble);

        }
         public static void methodFinal()
         {
            //anything that is final cannot be changed when you declear it.
           final double PI = 3.14159;

           System.out.println(PI);
         }

         public static void objectOrientedProgramming()
         {
             //object = an instance of a class that may contain attributes and methods.
             //example: (phone, desk , computer , coffee ,cup);


         }
         public void ArrayOfObject(){

            /*
             Array of Object.
             */
            int [] number = new int[3];
            ArrayFood [] refrigerator = new ArrayFood[4];

            ArrayFood food1 = new ArrayFood("pizza");
            ArrayFood food2 = new ArrayFood("hamburger");
            ArrayFood food3 = new ArrayFood("hotDog");

            ArrayFood [] fridge = {food1,food2,food3};
            System.out.println(fridge[0].name);
            refrigerator[0] = food1;
            refrigerator[1] = food2;

            System.out.println(refrigerator[0].name);
            System.out.println(refrigerator[1].name);

         }
}



    /**
     * An important trait of Java’s String class is that its instances are immutable; once
     * an instance is created and initialized, the value of that instance cannot be changed.
     */


    /*Inheritance
     * The process where one class
     * acquires the
     * attributes and
     *  method of another.
     *
     * **/

class Bicycle extends Vehicle {

    int wheel = 2;
   int pedals = 4;
   public boolean methodOfABicycle(){
     super.go();

       return false;
   }
}

    /**
     * method overriding = Declaring a method in sub class,
     * which is already present in parent class
     * done so that a child class can give it own implementation.
     */



class Animals {
    void speaks(){
        System.out.println("The Animal speaks");
    }
}

 class Dog extends Animals{
     @Override
     void speaks()
    {
        System.out.println("The dog goes \"bark\" ");
    }
}

 /*
       Super = keyword refers to the superclass (parent) of an object.
         very similar to the "this " keyword.
          */





class Person{
    String name;
    int age;

    Person(){
        this.name = name;
        this.age = age;
    }
}



class Hero extends Person{
    String power;
    Hero(String person, int age, String power){
        super();
        this.name = name;
        this.age = age;
        this.power = power;
    }
}

/**
 * abstract = abstract classes cannot be instantiated,
 * but they can have a subclass
 * abstract methods are declared without an implementation.
 * a layer of security.
 */


/**
 * inteface a template that can be applied to a class
 * simlar to inheritance, but specifies what a class has /must do.
 * classes can apply more than one inteface,
 * inheritance is limited to 1 super.
 */

  interface  prey{
        void flee();


}

class Hawk implements Preditor {
      @Override
      public void hunt(){
        System.out.println("the fish is hunting");
      }
}

class Fish implements prey,Preditor{

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish");
    }

    @Override
    public void hunt() {
    System.out.println("This fish is hunting smaller fish");
    }
}

class Rabbit implements prey {
    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }
}

/*Access Modifiers add a level of security to our program.   */
/*a class is a blueprint for a code or
a collection of code  | Package is a collection of class*/

/**
 * exceptions = an event that occurs during the execution of a program that,
 * disrupts the normal flow of instructions.
 */
class exceptionHandling{
    public static void exception1(){
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Enter a whole number to divide ");
            int x  = scanner.nextInt();

            System.out.println("Enter a whole number to divide by ");
            int y = scanner.nextInt();

            int z = x /y;
            System.out.println("result :"  + z);

        }catch (ArithmeticException e){
            System.out.println("you can't divide by zero! IDIOT!" );

        }catch (InputMismatchException e){
            System.out.println("Please enter a number omfg!!");
        }
        //used to catch all type of exception// you can use it as a last resort
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        //finally will execute weather or not we catch an exception. || to close a scanner or any file that are open.
        finally {
            System.out.println("thank you!! ");
            scanner.close();

        }


    }
}

class FileHandling {
    public static void methodFileHandling() {
        //file  = An abstract representation of file and directory pathnames.
        File file = new File("/home/ubercipherx/Downloads/secret_message.txt");
        if (file.exists()) {
            System.out.println("That file exists! :0");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile());
//           System.out.println(file.delete());
        } else {
            System.out.println("That file doesn't exist:(");
        }
    }

    /* Writing to a file Using the file writer class.**/
    public static void methodFileWriter() {
        try {
            FileWriter writer = new FileWriter("/home/ubercipherx/Desktop/javawahala.txt");
            writer.write("your pussy is white\nViolet are blue\n booty booty booty \n i am happy");
            writer.append("\n A poem by bro");
            writer.close();//always ensure to close it
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            System.out.println("written");
        }

    }

    public static void FileReader() {
        /***
         * read the content of a file as a stream of characters. One by One read
         * returns an int value which contains the byte value when readd() returns -1,
         * there is no more data to be read.
         */

        try {
            FileReader reader = new FileReader("/home/ubercipherx/Desktop/javawahala.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void methodAudioPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        {
            Scanner scanner = new Scanner(System.in);

//            File file = new File("/home/ubercipherx/Downloads/Young-M.A-EAT-_Official-Video_.wav");
//            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioStream);
//
//            String response = "";
//
//
//            while(!response.equals("Q")){
//                System.out.println("P = Play , S = Stop , R = Reset, Q = Quit");
//                System.out.println("Enter your choice");
//
//                response = scanner.next();
//                response = response.toUpperCase();
//                switch (response){
//                    case ("p"):clip.start();
//                    break;
//                    case("s"):clip.stop();
//                    break;
//                    case("R"):clip.setMicrosecondPosition(0);
//                    case("Q"): clip.close();
//                    break;
//                    default: System.out.println("Not a valid response");
//
//                }
//
//            }
//            System.out.println("Byeeee!!");
//        }
//    }
        }
    }
}

class GUI
{
    public void methodGUI(){
        //Jframe = a GUI window to add components to.
        JFrame frame = new JFrame(); //creates a frame.
        frame.setTitle("Jframe title goes here");//sets title of frame.
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );//exit out of application.
        frame.setSize(420,420);//sets the x-dimension ,and y dimension of frame.
        frame.setVisible(true);//make frame visible.

        ImageIcon image = new ImageIcon("/home/ubercipherx/IdeaProjects/JavaProblems/src/icon.png");//this will create an imageIcon.
        frame.setIconImage(image.getImage());//change icon of frame.
        frame.getContentPane().setBackground(Color.green);

    }
    public void label(){
        JLabel label = new JLabel();//creating a label
        label.setText("Bro do you even code");//set text of label.

        ImageIcon image = new ImageIcon("/home/ubercipherx/Pictures/dandy_look/number_5_jackson_pollock.jpg");
        label.setIcon(image);
        label.setBackground(Color.black);
        label.setHorizontalAlignment(JLabel.CENTER);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
    public void panel(){
        //JPanel = a GUI component that functions as a container to hold other components.
        ImageIcon icon = new ImageIcon("/home/ubercipherx/Pictures/dandy_look/number_5_jackson_pollock.jpg");
        JLabel label = new JLabel();
        label.setText("hi");
        label.setIcon(icon);


        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(0,0,250,250);

        JPanel blue = new JPanel();
        blue.setBackground(Color.blue);
        blue.setBounds(250, 0,250,250);


        JPanel green = new JPanel();
        blue.setBackground(Color.green);
        blue.setBounds(0,250,500,250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        panel.add(label);
        frame.add(blue);
        frame.add(panel);
        frame.add(green);
    }



}



public class BroCodeLessons {
    public static void main (String args[]) {

        GUI obj = new GUI();
        obj.panel();

//        FileHandling obj = new FileHandling();
//        try {
//            FileHandling.methodAudioPlayer();
//        } catch (UnsupportedAudioFileException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (LineUnavailableException e) {
//            e.printStackTrace();
//        }


//        Fish fish = new Fish();
//        fish.flee();
//        fish.flee();
//

//      Hero hero1 = new Hero("Batman",42,"$$$");
//     Person person = new Person();
//     students obj = new students();


//      hero1.
//       inheritance.
//        Motorcar  MotorObject = new Motorcar();
//
//
//        Bicycle BicycleObject = new Bicycle();
//        BicycleObject.stop();
//
//        System.out.print(MotorObject.doors);
//        System.out.println(BicycleObject.methodOfABicycle());
//

        /**
         * calling static method and variables using a class.
         */
//        Friend friend1 = new Friend("SpongeBob");
//        Friend friend2 = new Friend("patrick");
//        Friend friend3 = new Friend("SquidWard");
//        System.out.println(Friend.NUMBER_OF_FRIENDS);
//
//        Friend.displayFriends();
//

//           Garage garage = new Garage();
//
//             CarOne car1 = new CarOne("Chevrolet");
//             CarOne car2 = new CarOne("Tesla");
//
//             CarOne car = new CarOne("BmW");
//             garage.park(car);
//             garage.park(car1);
//             garage.park(car2);

        /*
        carToString obj = new carToString();

        System.out.println(obj.toString()) ; //explicit calling of the method.
        System.out.println(obj); //implicit calling.


         */
//        diceRoller obj = new diceRoller();




















        /*


            constructor overloading.
        constructorOverLoading obj2 =
                new constructorOverLoading("thicc crust","tomato","mozzarella","pepperoni");

        constructorOverLoading obj3 =
                new constructorOverLoading("thicc crust","tomato","mozzarella");
        constructorOverLoading obj4 =
                new constructorOverLoading("thicc crust","tomato");

                System.out.println("Here are the ingredient of your pizza:");
                System.out.println(obj2.BREAD);
                System.out.println(obj2.sauce);
                System.out.println(obj2.cheese);
                System.out.println(obj2.topping);


         */




//        Basics o = new Basics();
//        o.methodFinal();
//
//        Human human = new Human("Mordecai\t",20,70);
//        Human human2 = new Human("Ruby," ,16,20.3);
//        human.eat();
//        human2.drink();
       // System.out.println();
//        System.out.println(human.name);
//        System.out.println(human2.name);
//
//
//        Car obj = new Car();
//        Car obj2 = new Car();
//
//        System.out.println(obj.make);
//        System.out.println(obj.model);
//
//        System.out.println(obj2.model);
//        System.out.println(obj2.make);
//        obj.drive();

//      System.out.println(Basics.add(1,1,1,1));
//      System.out.println(Basics.add(1,1));
//      System.out.println(Basics.add(1,1));


       // System.out.println("the sum of the returned value is:\t"+o.methodThatReturnsSomething(5,6)) ;

//        Basics.Hellomethods();
    }

}
