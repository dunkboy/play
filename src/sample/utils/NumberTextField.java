package sample.utils;

import javafx.scene.control.TextField;

/**
 * <p>Title: NumberTextField</p>
 * <p>Description: NumberTextField</p>
 * <p>Copyright:Copyright(c) sefon 2017</p>
 * <p>Company: 成都四方伟业软件股份有限公司</p>
 * <p>CreateTime: 2017/8/4 14:53</p>
 *
 * @author cb
 * @version 1.0
 **/
public class NumberTextField extends TextField
{

    @Override
    public void replaceText(int start, int end, String text)
    {
        if (validate(text))
        {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text)
    {
        if (validate(text))
        {
            super.replaceSelection(text);
        }
    }

    private boolean validate(String text)
    {
        return text.matches("[0-9]*");
    }
}
