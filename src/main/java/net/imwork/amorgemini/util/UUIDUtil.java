package net.imwork.amorgemini.util;

/**
 * Created by lvbr on 2017/3/11.
 */
import java.security.SecureRandom;
import java.util.UUID;
/**
 * 封装各种生成唯一性ID算法的工具类.
 *
 * @author
 */
public final class UUIDUtil {
    private static SecureRandom random = new SecureRandom();
    private static UUIDUtil instance = new UUIDUtil();
    private UUIDUtil()
    {
    }
    /**
     * 返回实例
     * @return
     */
    public static UUIDUtil getInstance()
    {
        return instance;
    }
    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割
     * @return 不带-分割的32位字符串
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间有-分割.
     * @return
     */
    public static String uuid2() {
        return UUID.randomUUID().toString();
    }


    public static void main(String[] args){
        System.out.println(UUIDUtil.uuid2());
        System.out.println(UUIDUtil.uuid());
        //输出结果
        //af39aa77-76b7-430e-96b1-a3efee50a18d
        //4a400cc26169452190c98cf2004d38b8
    }
}