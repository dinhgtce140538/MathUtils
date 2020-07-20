/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import com.dinh.util.MathUtil;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
   @Test
   public void testSuccessfulCases(){
       //đây là hàm dùng để test các đầu vào hợp leejcuar hàm cf()
       //ví dụ cd(5) cF(6),... mình sẽ gọi ở đây, coi actual cỉa chúng trả về có khớp với expected của mình không?
       //tuy nhiên k chơi trờ sout() tự luận kết quả
       //mà để cho .jar vằ add vào tự luận kết qua so snah
       //in ra xang đỏ cho mình xem.
       Assert.assertEquals(1, MathUtil.computeFactorial(0));
       Assert.assertEquals(1, MathUtil.computeFactorial(1));
       Assert.assertEquals(2, MathUtil.computeFactorial(2));
       Assert.assertEquals(6, MathUtil.computeFactorial(3));
       Assert.assertEquals(24, MathUtil.computeFactorial(4));
       Assert.assertEquals(120, MathUtil.computeFactorial(5));
       
   }
    
   @Test(expected = IllegalArgumentException.class)
   public void testFailedCases(){
       //hàm này dùng để test các trường hợp đưa data cà chớn.
       //ví dụ -5! cF(-5) tính thế mẹ nào được?
       // k tính được, chứ k đc trả về nói -1 nói rằng đầu vào vô lí.
       //vì xét cho cùn -1 vẫn là value.
       //tình hướng đầu vào cà chơn, ta sẽ tung ra ném ra ngoại lệ nào đó.
       //mà Exception nói chung thì không phải là 1 value
       //nó đạ diện cho 1 cái bất thường nào đó.
       //bất thường thì k thể so sánh được
       //vậy tình hướng ném ra ngoại lệ, ko là return, nên k xài được hàm
       //aserEquals(value, value)
       //ta xài chiếu kahcs, ta chỉ hứng ngoại lệ, coi nó có đúng ngoại lệ đó không?
       MathUtil.computeFactorial(-5);
   }
}
//màu xanh chỉ xảy ra nếu tất cả là màu xanh.
//màu đỏ là chỉ cần 1 thằng màu đỏ coi như toang cả đám.
//màu xanh là hàm phải chạy đúng cho tát cả cách trường hợp.
//màu đỏ xin lỗi bạn đã đúng gần hết, chỉ còn 1 case bị sai.
//tìm lại coi như có 1 chút error là error
//DÙ CODE ĐỎ HAY XANH DI MÌNH CHƠI KIỂU TEST AOO QUA JUNUT, DÙNG BẰNG MẮT
//THÌ: CLEAN AND BUILD LUÔN DƯỢC CHẠY.
//NHIỆN VỤ GỐC CỦA CLEAN ANDBUILD CODE K CÓ ERROR CÚ PHÁP, PHẢI RA .JAR .WAR

//mìn nâng cấp: code bạn còn màu đỏ, tức là chạy k như kì vọng
//TỚ DISABLE NUT CLEAN AND BUILD NHEN ĐỂ
//HOẶC CODE CỦA BANJPHAIR MÀU XANH, HOẶC BẠN XÁO MẸ NÓ MẤY PHẦN TEST ĐI THÌ MỚI RA .JAR .WAR NHÉ.

//NHỚ 2 CON SỐ ĐB CỦA CUỘC DỜI BẠN
//NETBEAN 8, 1005
//NETBEAN 10 TRỞ LÊN, 1204
//vào files, tên pj -> nbprojects -> build-impl.xml