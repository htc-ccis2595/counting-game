package edu.htc;

public class Main {

    public static void main(String[] args) {

           counting_game();



    }

    public static void counting_game(){

        for(int i = 0; i < 31; i++){
            String output = "";
            if(i % 5 == 0){
                output = output + "beep ";

            };
            if(i % 8 == 0){
                output = output + "buzz ";

            };
            if(i % 12 == 0){
                output = output + "zap ";

            };
            if(output != "") {
                System.out.println(output);
            }
            else{
                System.out.println(i);
            }


        }

    }



}
