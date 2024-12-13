public class for_loop {
    /*
     * ava For Loop
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

SyntaxGet your own Java Server
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:

Example
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
     */
    //nested for loop
    public static void main(String[] args) {
    /*     for (int i=1;i<=2;i++){
          System.out.println("Outer"+i);
          for(int j=1;j<=3;j++){
            System.out.println("ineer"+j);
          }
        }*/
        // for each loop
        /*
         for (type variableName : arrayName) {
           // code block to be executed
          }
         */
        String[] cars = {"VOlvo","bmw","audi","benz"};
        for(String i : cars){
          System.out.println(i);
        }
    }
  }

