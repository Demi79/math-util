/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demi.mathutil.core.test;

import com.demi.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
//quy ước đặt tên package của Java
//tên miền dảo ngược, chữ thường 100%
//com.tên-cty.tên-dự-án.tên-module.tên-class-sẽ-dùng
//com.microsoft.sqlserver.jdbc

//C# viết chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sqlserver...

/**
 *
 * @author phand
 */
public class MathUtilityTest {
  //ở đây chứa các lệnh các hàm dùng để đi test cá hàm chính ở bên code chính
    //ở bên thư mục src phía trên coi hàm chạy ổn ko
    //ở đây ta làm các hàm ứng với các test case để test code chính ở bên
    //MathUtility. ví dụ  .getFactorial()
    
    //Test case là 1 bộ data đưa vào hàm, app để verify hàm, app có xử lí
    //đúng hay ko, nó đi kèm theo cách xài hàm, trình tự xài app + expected
    //value + status test case passed ha failed
    
    //Test case #1: Check getFactorial with n = 0, 0! hopes to see 1 returned
    @Test
    //tên hàm mang ý nghĩa của test case luôn
    public void testFactorialGivenRightArg0ReturnsWell(){
        int n = 0; //given right agrument
        long expectedValue = 1; //hi vọng n! 0! => 1
        long actualValue; //= ???; // đoán xem trả về mấy
        //nếu expected == actual, hàm ngon với case này
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
        //cách cũ là phải sout() từng cái 1 và dùng mắt để nhìn đúng sai
    }
    
    //Test case #2: Check getFactorial with n = 1, expected => 1
    @Test
    public void testFactorialGivenRightArg1ReturnsWell(){
        int n = 1;
        long expectedValue = 1;
        long actualValue; //=??? //chờ xem
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
    }
    
    //Test case #3: Check getFactorial with n = 2, expected => 2! = 2
    //                                      n = 3, expected => 3! = 6
    //                                          5              5! = 120 
    @Test
    public void testFactorialGivenRightArg235ReturnsWell(){
        int n = 2;
        long expectedValue = 2;
        long actualValue; //=??? //chờ xem
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue); //2
        
        assertEquals(6, MathUtility.getFactorial(3));
        
        assertEquals(120, MathUtility.getFactorial(5));
    }
    //TEST #4: CHECK IF GETFACTORIAL RETURNS EXCEPTION IF WE PASS N < 0
    @Test
    public void testFactorialGivenWrongArg_1ThrowException(){
            //Input n<0, n= -1
            //Exception result:Illega Argument Exception
            //nho quy uoc: mau xanh la ung voi tra ve nhu ki vong
            //mau do la : actual != ki vong
            //Ngoai le Exception ko la value, ta ko khai bao bien = ngoai le 
            // ko assertEquals (value value value)
        assertThrows(IllegalArgumentException.class,     
            () -> {MathUtility.getFactorial(-1);} ); 
    }
    
}
