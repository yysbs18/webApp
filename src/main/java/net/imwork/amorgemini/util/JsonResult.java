package net.imwork.amorgemini.util;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lvbr on 2017/3/8.
 */
public class JsonResult {
    public static Map<String, Object> init(int code, String desc) {
        Map<String,Object> result=new TreeMap<String,Object>();
        result.put("error_code", code);
        result.put("error_msg", desc);
        return result;
    }
}
