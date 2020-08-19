package in.javadomain.androidtoast;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button displayToastButton;
    EditText toastValueTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastValueTxt = (EditText) findViewById(R.id.txtToastValue);
        displayToastButton = (Button) findViewById(R.id.butDisplayToast);
           displayToastButton.setOnClickListener(new View.OnClickListener(){

            @Override
              public void onClick(View view){
                    System.out.println("Entered value is :::"+toastValueTxt);
                Toast.makeText(getApplicationContext(),toastValueTxt.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}