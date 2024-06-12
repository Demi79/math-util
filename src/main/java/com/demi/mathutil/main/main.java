/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demi.mathutil.main;

import com.demi.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author phand
 */
public class main {
    
    //this method is writen in local
    public static void SayHiFromLocal(){
       System.out.println("Hello");

    }
    
    //this method is writen directly in server to simulate
    // the work of another team member, he upload code 
    public static void SayHiFromServer(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {

        //Cách kiểm thử 2 - giống cách 1
        //Test case #1: Check if 0! returns 1
        int n = 0;
        long expectedResult = 1; //0! == 1
        long actualResult = MathUtility.getFactorial(n);
        String msg = "0!= | Expected: " + expectedResult + " Actual: " + actualResult;
        
        JOptionPane.showMessageDialog(null, msg);
    }
    //
//    public static void main(String[] args) {
//        //Đây là nơi test hàm
//        //Viết ra các test case : bộ data đầu vào và giá trị kì vọng
//        //lát hồi so sánh với giá trị thực tế mà hàm trả về!!!
//        //Test case #1: n = 0 | 0! = hi vọng == 1 | thực tế chờ hàm trả về
//        int n = 0;
//        long expectedValue = 1; //hi vọng 0! trả về 1
//        long actualValue; // chờ hàm trả về mấy khi tính 0!
//        actualValue = MathUtility.getFactorial(n);
//
//        //so sánh giữa expect vs actual coi có == nhau ko
//        System.out.println("0! | Expected: " + expectedValue + " Actual: " + actualValue);
//
//        //Test case #2: 1! ta hy vọng hàm trả 1 luôn!!!
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected: " + expectedValue + " Actual: " + actualValue);
//
//        //Test case #3: 5! ta hi vọng hàm trả về 120!!!
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue + " Actual: " + actualValue);
//    
//        //Test case #4: -1! ta hi vọng ném ra ngoại lệ!!!
//        //Do -1 ko tính được giai thừa, đưa data cà chớn, hàm sẽ ném ra ngoại lệ
//        n = -1;
//        //expectedValue = HÀM TUNG RA NGOẠI LỆ;
//        System.out.println("Check getF(-1) to see the exception!");
//        actualValue = MathUtility.getFactorial(n);
//        //Hi vọng ngoại lệ sẽ xuất hiện
//    }
//    


}
