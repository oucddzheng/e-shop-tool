package situ;

import java.math.BigDecimal;

public class FormatMath {

    // 默认除法运算精度
    private static final int DEFAULT_DIV_SCALE = 10;

    /**
     * 提供精确的加法运算�??
     * 
     * @param v1
     * @param v2
     * @return 两个参数的和
     */
    public static BigDecimal add(Double v1, Double v2) {
        boolean f1 = v1 == null;
        boolean f2 = v2 == null;
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(Double.toString(v2));
        }
        if (f2) {
            return new BigDecimal(Double.toString(v1));
        }
        return new BigDecimal(Double.toString(v1)).add(new BigDecimal(Double.toString(v2)));
    }

    /**
     * 提供精确的加法运�?
     * 
     * @param v1
     * @param v2
     * @return 两个参数数学加和，以字符串格式返�?
     */
    public static BigDecimal add(String v1, String v2) {
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(v2);
        }
        if (f2) {
            return new BigDecimal(v1);
        }
        return new BigDecimal(v1).add(new BigDecimal(v2));
    }

    /**
     * 提供精确的加法运�?
     * 
     * @param v1
     * @param v2
     * @return 两个参数数学加和，以字符串格式返�?
     */
    public static BigDecimal add(BigDecimal v1, BigDecimal v2) {
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return v2;
        }
        if (f2) {
            return v1;
        }
        return v1.add(v2);
    }

    /**
     * 提供精确的减法运算�??
     * 
     * @param v1
     * @param v2
     * @return 两个参数的差
     */
    public static BigDecimal subtract(Double v1, Double v2) {
        boolean f1 = v1 == null;
        boolean f2 = v2 == null;
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(Double.toString(v2));
        }
        if (f2) {
            return new BigDecimal(Double.toString(v1));
        }
        return new BigDecimal(Double.toString(v1)).subtract(new BigDecimal(Double.toString(v2)));
    }

    /**
     * 提供精确的减法运�?
     * 
     * @param v1
     * @param v2
     * @return 两个参数数学差，以字符串格式返回
     */
    public static BigDecimal subtract(String v1, String v2) {
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(v2);
        }
        if (f2) {
            return new BigDecimal(v1);
        }
        return new BigDecimal(v1).subtract(new BigDecimal(v2));
    }

    /**
     * 提供精确的减法运�?
     * 
     * @param v1
     * @param v2
     * @return 两个参数数学差，以字符串格式返回
     */
    public static BigDecimal subtract(BigDecimal v1, BigDecimal v2) {
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return v2;
        }
        if (f2) {
            return v1;
        }
        return v1.subtract(v2);
    }

    /**
     * 提供精确的乘法运算�??
     * 
     * @param v1
     * @param v2
     * @return 两个参数的积
     */
    public static BigDecimal multiply(Double v1, Double v2) {
        boolean f1 = v1 == null;
        boolean f2 = v2 == null;
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(Double.toString(v2));
        }
        if (f2) {
            return new BigDecimal(Double.toString(v1));
        }
        return new BigDecimal(Double.toString(v1)).multiply(new BigDecimal(Double.toString(v2)));
    }

    /**
     * 提供精确的乘法运�?
     * 
     * @param v1
     * @param v2
     * @return 两个参数的数学积，以字符串格式返�?
     */
    public static BigDecimal multiply(String v1, String v2) {
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(v2);
        }
        if (f2) {
            return new BigDecimal(v1);
        }
        return new BigDecimal(v1).multiply(new BigDecimal(v2));
    }

    /**
     * 提供精确的乘法运�?
     * 
     * @param v1
     * @param v2
     * @return 两个参数的数学积，以字符串格式返�?
     */
    public static BigDecimal multiply(BigDecimal v1, BigDecimal v2) {
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return v2;
        }
        if (f2) {
            return v1;
        }
        return v1.multiply(v2);
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以�?10位，以后的数字四舍五�?,舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v1
     * @param v2
     * @return 两个参数的商
     */
    public static BigDecimal divide(Double v1, Double v2) {
        return divide(v1, v2, DEFAULT_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算�?�当发生除不尽的情况时，由scale参数�? 定精度，以后的数字四舍五入�?�舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v1
     * @param v2
     * @param scale
     *            表示�?要精确到小数点以后几位�??
     * @return 两个参数的商
     */
    public static BigDecimal divide(Double v1, Double v2, int scale) {
        return divide(v1, v2, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供（相对）精确的除法运算�?�当发生除不尽的情况时，由scale参数�? 定精度，以后的数字四舍五入�?�舍入模式采用用户指定舍入模�?
     * 
     * @param v1
     * @param v2
     * @param scale
     *            表示�?要精确到小数点以后几�?
     * @param round_mode
     *            表示用户指定的舍入模�?
     * @return 两个参数的商
     */
    public static BigDecimal divide(Double v1, Double v2, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        boolean f1 = v1 == null;
        boolean f2 = v2 == null;
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(Double.toString(v2));
        }
        if (f2) {
            return new BigDecimal(Double.toString(v1));
        }
        return new BigDecimal(Double.toString(v1)).divide(new BigDecimal(Double.toString(v2)), scale, round_mode);
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以�?10位，以后的数字四舍五�?,舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v1
     * @param v2
     * @return 两个参数的商，以字符串格式返�?
     */
    public static BigDecimal divide(String v1, String v2) {
        return divide(v1, v2, DEFAULT_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算�?�当发生除不尽的情况时，由scale参数�? 定精度，以后的数字四舍五入�?�舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v1
     * @param v2
     * @param scale
     *            表示�?要精确到小数点以后几�?
     * @return 两个参数的商，以字符串格式返�?
     */
    public static BigDecimal divide(String v1, String v2, int scale) {
        return divide(v1, v2, DEFAULT_DIV_SCALE, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供（相对）精确的除法运算�?�当发生除不尽的情况时，由scale参数�? 定精度，以后的数字四舍五入�?�舍入模式采用用户指定舍入模�?
     * 
     * @param v1
     * @param v2
     * @param scale
     *            表示�?要精确到小数点以后几�?
     * @param round_mode
     *            表示用户指定的舍入模�?
     * @return 两个参数的商，以字符串格式返�?
     */
    public static BigDecimal divide(String v1, String v2, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return new BigDecimal(v2);
        }
        if (f2) {
            return new BigDecimal(v1);
        }
        return new BigDecimal(v1).divide(new BigDecimal(v2), scale, round_mode);
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以�?10位，以后的数字四舍五�?,舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v1
     * @param v2
     * @return 两个参数的商，以字符串格式返�?
     */
    public static BigDecimal divide(BigDecimal v1, BigDecimal v2) {
        return divide(v1, v2, DEFAULT_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算�?�当发生除不尽的情况时，由scale参数�? 定精度，以后的数字四舍五入�?�舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v1
     * @param v2
     * @param scale
     *            表示�?要精确到小数点以后几�?
     * @return 两个参数的商，以字符串格式返�?
     */
    public static BigDecimal divide(BigDecimal v1, BigDecimal v2, int scale) {
        return divide(v1, v2, DEFAULT_DIV_SCALE, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供（相对）精确的除法运算�?�当发生除不尽的情况时，由scale参数�? 定精度，以后的数字四舍五入�?�舍入模式采用用户指定舍入模�?
     * 
     * @param v1
     * @param v2
     * @param scale
     *            表示�?要精确到小数点以后几�?
     * @param round_mode
     *            表示用户指定的舍入模�?
     * @return 两个参数的商，以字符串格式返�?
     */
    public static BigDecimal divide(BigDecimal v1, BigDecimal v2, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        boolean f1 = FormatEmpty.isEmpty(v1);
        boolean f2 = FormatEmpty.isEmpty(v2);
        if (f1 && f2) {
            return null;
        }
        if (f1) {
            return v2;
        }
        if (f2) {
            return v1;
        }
        return v1.divide(v2, scale, round_mode);
    }

    /**
     * 提供精确的小数位四舍五入处理,舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v
     *            �?要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static BigDecimal round(Double v, int scale) {
        return round(v, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供精确的小数位四舍五入处理
     * 
     * @param v
     *            �?要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @param round_mode
     *            指定的舍入模�?
     * @return 四舍五入后的结果
     */
    public static BigDecimal round(Double v, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        if (v == null) {
            return null;
        }
        return new BigDecimal(Double.toString(v)).setScale(scale, round_mode);
    }

    /**
     * 提供精确的小数位四舍五入处理,舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v
     *            �?要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @return 四舍五入后的结果，以字符串格式返�?
     */
    public static BigDecimal round(String v, int scale) {
        return round(v, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供精确的小数位四舍五入处理
     * 
     * @param v
     *            �?要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @param round_mode
     *            指定的舍入模�?
     * @return 四舍五入后的结果，以字符串格式返�?
     */
    public static BigDecimal round(String v, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        if (FormatEmpty.isEmpty(v)) {
            return null;
        }
        return new BigDecimal(v).setScale(scale, round_mode);
    }

    /**
     * 提供精确的小数位四舍五入处理,舍入模式采用ROUND_HALF_EVEN
     * 
     * @param v
     *            �?要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @return 四舍五入后的结果，以字符串格式返�?
     */
    public static BigDecimal round(BigDecimal v, int scale) {
        return round(v, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供精确的小数位四舍五入处理
     * 
     * @param v
     *            �?要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @param round_mode
     *            指定的舍入模�?
     * @return 四舍五入后的结果，以字符串格式返�?
     */
    public static BigDecimal round(BigDecimal v, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        if (FormatEmpty.isEmpty(v)) {
            return null;
        }
        return v.setScale(scale, round_mode);
    }

    public static Double valueDouble(BigDecimal v) {
        return v == null ? null : v.doubleValue();
    }

}
