package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.utils.DateUtils;
import sample.utils.ForbidInputTextField;
import sample.utils.NumberTextField;

import java.util.Date;

public class Controller
{

    @FXML
    private Button btn1;

    @FXML
    private ForbidInputTextField year1;

    @FXML
    private ForbidInputTextField month1;

    @FXML
    private ForbidInputTextField day1;

    @FXML
    private ForbidInputTextField hour1;

    @FXML
    private ForbidInputTextField min1;

    @FXML
    private ForbidInputTextField second1;

    @FXML
    private NumberTextField timestamp1;

    @FXML
    private Button btn2;

    @FXML
    private NumberTextField year2;

    @FXML
    private NumberTextField month2;

    @FXML
    private NumberTextField day2;

    @FXML
    private NumberTextField hour2;

    @FXML
    private NumberTextField min2;

    @FXML
    private NumberTextField second2;

    @FXML
    private ForbidInputTextField timestamp2;

    @FXML
    public void formatTimeStamp(ActionEvent event)
    {
        String timestamp = timestamp1.getText();

        if (timestamp.equals(""))
        {
            return;
        }
        Date inputTimeStamp = new Date(Long.parseLong(timestamp));

        String format = DateUtils.format(inputTimeStamp);
        String[] split = format.split("-");
        year1.setText(split[0]);
        month1.setText(split[1]);
        day1.setText(split[2]);
        hour1.setText(split[3]);
        min1.setText(split[4]);
        second1.setText(split[5]);
    }

    @FXML
    public void toTimeStamp(ActionEvent event)
    {
        String inputStringDate = year2.getText() + "-" + month2.getText() + "-" + day2.getText() + "-" + hour2.getText() + "-" + min2.getText() + "-" + second2.getText();
        try
        {
            Date date = DateUtils.parse(inputStringDate);
            timestamp2.setText(String.valueOf(date.getTime()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
