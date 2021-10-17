package ua.goit.controller.command;

import ua.goit.view.View;

public final  class AddDoubleValue {
       private static double value = 0;
       private final static String WRONG_NUMBER = "Try again. Enter the correct number: ";

       private  AddDoubleValue() {
       }

       public static double  addValue(View view, String message){
              while (true){
                     try {
                            view.write(message);
                            value = Double.parseDouble(view.read());
                            break;
                     }catch (NumberFormatException e){
                            view.write(WRONG_NUMBER);
                     }
              }
              return value;
       }
}
