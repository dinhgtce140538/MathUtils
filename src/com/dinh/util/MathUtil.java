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
        long result = 1;
        for (int i = 1; i <=n; i++) {
            result*=i;
        }
        return result;
    }

}