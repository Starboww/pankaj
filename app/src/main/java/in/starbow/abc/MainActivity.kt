package `in`.starbow.abc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     var editText = findViewById<EditText>(R.id.nameEd);
       var radioGroup = findViewById<RadioGroup>(R.id.radioBtn);
        var button = findViewById<Button>(R.id.button);
        var checkBox1= findViewById<CheckBox>(R.id.chk1)
        button.setOnClickListener(){
            var selectedRadioButtonID  = radioGroup.getCheckedRadioButtonId();
           var SelectedradioButton = findViewById<RadioButton>(selectedRadioButtonID)
           var radioSelect = SelectedradioButton.text.toString();
            var name = editText.text.toString();
            var checkText = ""
            if(checkBox1.isChecked)
            {
                checkText+="abc"
            }
            else
            {
                checkText+="def"
            }


            Toast.makeText(this,"Name:" +name+" Radio: "+radioSelect+" "+"CHeckedBox:"+checkText,Toast.LENGTH_LONG).show()

        }
    }
}