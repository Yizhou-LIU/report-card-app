package example.reportcardapp;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ReportCardActivity {

    public static  String name, grade;
    ReportCard rCard;

   private void setName() {
       rCard.setGrade(name);
    }

    private void setGrade() {
        rCard.setGrade(grade);
    }


    private String getName() {
        String mName = rCard.getName();
        return mName;
    }

    private String getGrade() {
        String mGrade = rCard.getGrade();
        return mGrade;
    }

}
