package sample.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Title: DateUtils</p>
 * <p>Description: DateUtils</p>
 * <p>Copyright:Copyright(c) sefon 2017</p>
 * <p>Company: 成都四方伟业软件股份有限公司</p>
 * <p>CreateTime: 2017/8/4 14:35</p>
 *
 * @author cb
 * @version 1.0
 **/
public class DateUtils

{
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd-HH-mm-ss";

    public static String format(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT);
        return sdf.format(date);
    }

    public static String format(Date date, String format)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static Date parse(String source) throws Exception
    {
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT);
        return sdf.parse(source);
    }

    public static Date parse(String source, String format) throws Exception
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(source);
    }

}
