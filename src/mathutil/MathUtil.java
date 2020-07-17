

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mathutil;
import static com.dinh.util.MathUtil.computeFactorial;
/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5!= "+ computeFactorial(5));
        //đoạn code trên chính là test hàm bằng tay
        //tức là ta chuẩn bị data để test, chính là số 5 đầu vào.
        //ta gọi hàm cF(5)
        //ta chạy hàm, ta xem nó in ra số mấy (actual value)
        //trước đó ta phải tính bằng tay 5!, cái ta kì vọng hàm phải
        //trả về con số này, 120 là cái ta hy cọng hàm sẽ trả về cho 5! gọi là expected value.
        //Thu vien hotro test phan mem có tên: Unit, Testing,
        //ten riêng: JUnit, TEstNG, xUnit, MStTest, NUnit.phpUint,cppUnit,...
    }
    
}
