/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demi.mathutil.core;

/**
 *
 * @author phand
 */
public class MathUtility {
     //ta sẽ viết những hàm toán học cung cấp cho bên ngoài sử dụng 
    //giống như thư viện Math. của JDK
    //Các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi
    //thì sẽ được thiết kế là static!!!
    //static sẽ được gọi trực tiếp qua tên class
    
    //Hàm tính n! = 1.2.3.4...n
    //n 0...20; do 21! tràn kiểu long, ko có âm giai thừa
    //0! = 1
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //điểm dần của đệ quy
        
        return n * getFactorial(n-1);
        //n! = n * (n-1) // stack LIFO - Last in firset out
        //Using Recursion to demostrate regression test
    }
}

//Học về  REGRESSION TEST - Kiểm thử hồi quy
//Kiểm thử lại những thứ đã từng kiểm thử
//Tại sao phải làm những điều này
//Lý do: Code đang ổn thì sẽ luôn ổn nếu không ai đụng vào nó, nhưng nếu có fix bug, có sửa hàm, có tối ưu thuật toán
 //trong hàm, thì hàm cần phải được test lại, để xác nhận nó còn ngon, còn xanh đỏ hay không sau khi code được sửa

//Nếu có UNIT TEST CODE (JUNIT) việc test code lại cực nhanh
//Chỉ cần thấy màu xanh của các UNIT TEST CASE được run là đủ 
//Nhanh nữa: đưa unit test lên GitHub, cài CI SCRIPT (file yaml yml) vào mọi thứ tự động báo xanh đỏ luôn

//Kiểm thử lại những thứ đã kiểm thử được gọi là kiểm thử hồi quy - REGRESSION TEST
//Nên dùng tự động bằng cách xài Unit Test Framework
//Nhìn bằng mắt tưg hàm main() cách truyền thống là không nên

//5! = 1.2.3.4.5 = 1.2.3.4    .5
//                  4!        .5
// => 5! = 5.4!

//4! = 1.2.3.4 => 4!=4.3!
//....

// => N! = N * (N-1)!
//Công thức đệ quy - RECURSION - Gọi lại chính mình với quy mô nhỏ hơn
//Giống con búp bê người Nga



