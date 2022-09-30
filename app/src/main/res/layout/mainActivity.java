package vahfat.android.simple.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
}
private enum Operator (none,add, minus,multiply,divide);
private double data0= 0 , data1=0;
private Operator optr = Operator.none;



@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
        }

@Override
public boolean onCreateOptionsMenu (Menu menu){
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
        }
public void btn00Click(view view) {
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    eText.setText (eText.getText()+"0");
        }

public void btn01Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"1");
        }

public void btn02Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"2");
        }

public void btn03Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"3");
        }

public void btn04Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"4");
        }

public void btn05Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"5");
        }

public void btn06Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"6");
        }

public void btn07Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"7");
        }

public void btn08Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"8");
        }

public void btn09Click(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+"9");
        }

public void btnAddClick(view view){
        optr = Operator.add;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText ("");
        }

public void btnMinusClick(view view){
        optr = Operator.minus;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText ("");
        }

public void btnMultiplyClick(view view){
        optr = Operator.multiply;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText ("");
        }

public void btnDivideClick(view view){
        optr = Operator.divide;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText ("");
        }

public void btnClearClick(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText ("");
        }

public void btnDotClick(view view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText (eText.getText()+".");
        }

public void btnResultClick (View view){
        if(optr!=Operator.none){
        EditText eText=(EditText)findViewById(R.id.resultEdit);
        data2=Double.parseDouble(eText.getText().toString());
        double result=0;
        if(optr==Operator.add){
        result=data1+data2;
        }
        else if(optr==Operator.minus){
        result=data1-data2;
        }
        else if(optr==Operator.multiply){
        result=data1*data2;
        }
        else if(optr==Operator.divide){
        result=data1/data2;
        }
        optr=Operator.none;
        data1=result;
        if((result-(int)result)!=0)
        eText.setText(String.valueOf(result));
        else
        eText.setText(String.(valueOf(int)result));
        }
}