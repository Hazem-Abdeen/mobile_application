package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.btResult)
        val edtxt1:EditText=findViewById(R.id.ednum1)
        val edtxt2:EditText=findViewById(R.id.ednum2)
        val resultTv:TextView=findViewById(R.id.textResult)
        var flag:String="sum"
        val spinnerVal:Spinner=findViewById(R.id.spinnerV)
        var options= arrayOf("sum","multiply")
        spinnerVal.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        spinnerVal.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
              flag=options.get(p2)
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not yet")
            }
        }
        //ctrl+o
        button.setOnClickListener{view->
            var x:Int=edtxt1.text.toString().toInt();
            var y:Int=edtxt2.text.toString().toInt();
            if(flag=="sum")
                resultTv.text=sum(x,y).toString();
            else
                resultTv.text=multiply(x,y).toString();
        }
    }
}
public fun sum(a:Int,b:Int):Int{
    return a+b;
}
public fun multiply(a:Int,b:Int):Int{
    return a*b;
}