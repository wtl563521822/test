import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wtl
 * @description
 * @create 2018-03-27 11:04
 **/
public class Test {


    public static void main(String[] args) {
        System.err.println(createVoucherNum(1l));
        System.err.println(createVoucherNum(1l).length());
    }

    public static String createVoucherNum(Long voucherId) {
		// 哈哈哈

        // 当前时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSS");
        // 年月日时分秒毫秒
        String formDate = sdf.format(date);
        // 凭证id
        String id = voucherId + "";
        //获取7位随机数
        int ran = (int) ((Math.random() * 9 + 1) * 1000000);
        String code = formDate.substring(0, 12) + id + ran;
        return code.substring(0, 20);
    }


}
