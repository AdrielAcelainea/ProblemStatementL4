package sg.edu.rp.c346.id22016845.problemstatementl4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText mobileNumber;
    EditText sizeGroup;
    RadioButton smokingArea;
    RadioButton nonSmoking;
    RadioGroup radioGroupsmoke;
    DatePicker dp;
    TimePicker tp;
    Button btnSubmit;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextText);
        mobileNumber=findViewById(R.id.editTextText2);
        sizeGroup=findViewById(R.id.editTextText3);
        smokingArea=findViewById(R.id.radioButton);
        nonSmoking=findViewById(R.id.radioButton2);
        radioGroupsmoke=findViewById(R.id.radioGroupSmoke);
        dp=findViewById(R.id.datePicker);
        dp.init(2020,6-1,1,null);
        tp=findViewById(R.id.timePicker);
        tp.setCurrentHour(7);
        tp.setCurrentMinute(30);
        btnSubmit=findViewById(R.id.button2);
        btnReset=findViewById(R.id.button);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioGroupsmoke.getCheckedRadioButtonId()==R.id.radioButton){
                    Toast.makeText(MainActivity.this,("Name: "+name.getText().toString() +"\n Mobile Phone: "+mobileNumber.getText().toString()+"\n Size of Group: "+sizeGroup.getText().toString()
                            +"\n Sitting Area: Smoking Area"+ "\n Booking Date: "+ dp.getYear()+(dp.getMonth()-1)+dp.getDayOfMonth()+"\n Booking Time: "+tp.getCurrentHour()+tp.getCurrentHour() ),Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,("Name: "+name.getText().toString() +"\n Mobile Phone: "+mobileNumber.getText().toString()+"\n Size of Group: "+sizeGroup.getText().toString()
                            +"\n Sitting Area: Non-Smoking Area"+ "\n Booking Date: "+ dp.getYear()+(dp.getMonth()-1)+dp.getDayOfMonth()+"\n Booking Time: "+tp.getCurrentHour()+tp.getCurrentHour() ),Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                mobileNumber.setText("");
                sizeGroup.setText("");
                dp.init(2020,6-1,1,null);
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);
            }
        });
    }
}