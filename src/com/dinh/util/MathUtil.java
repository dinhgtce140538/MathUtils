/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinh.util;

/**
 *
 * @author Admin
 */
//Class contains math, operatioin for help for other place, and using for everywhere, using static
public class MathUtil {

    //tinh n! = 1.2.3.4...n, kết quả tăng rất nhanh nên dễ tràng vì int chỉ chứa 2ty1 nên xai long, sẽ tính đc 15!
    public static long computeFactorial(int n) {
        //hàm sẽ ném về ngoại lệ nếu bạn đưa vào n cà chơn
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid argument. n must be >= 0 and <=15");
        }
        //Sử dụng đệ quy
        if (n == 0 || n == 1) {
            return 1;
        }//diểm dùng của đệ quy
        //bắt đầu đệ quy
        //không sử dụng else, vì else là mặc định, sử dụng else là dư, trong if có return thì k sử dụng else.
        return n * computeFactorial(n - 1);
    }
}
//nhờ jenkins xác nhận code có chỉnh sửa ổn không, như ngày xưa hay không
//Regression được thực thi bở jenkins, tét lại nững gì đã từng test
//để confirm chất lượng sau khi bị thây đổi