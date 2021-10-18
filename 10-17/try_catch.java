package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int [] nums = {1, 2, 3};
        System.out.println("Enter a number: ");
        try{
//          System.out.println(nums[5]);
            double num = keyboardInput.nextDouble();
            System.out.println(num);
        } catch (InputMismatchException e){ // catch (Exception e)
            System.out.println("Invalid Option!!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e){ // Catches Exception
            System.out.println(e);
        } catch (Error e){ // Catches Error
            System.out.println(e);
        } catch (Throwable e){ // Catches Exceptions & Errors
            System.out.println(e);
        }
    }
}
