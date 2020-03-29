package com.example.notefx;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Math;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView cal_screen;
    View layoutMain;
    Button[] btn = new Button[16];
    private StringBuilder build = new StringBuilder();
    private Boolean plus=false,minus=false,mul=false,div=false, div_zero = false, equal_fn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal_screen = findViewById(R.id.cal_screen);

        //declare 16 btn
        findViewById(R.id.btn_c).setOnClickListener(this);
        findViewById(R.id.btn_bs).setOnClickListener(this);
        findViewById(R.id.btn_ce).setOnClickListener(this);
        findViewById(R.id.btn_minus).setOnClickListener(this);
        findViewById(R.id.btn_mul).setOnClickListener(this);
        findViewById(R.id.btn_plus).setOnClickListener(this);
        findViewById(R.id.btn_decimal).setOnClickListener(this);
        findViewById(R.id.btn_dev).setOnClickListener(this);
        findViewById(R.id.btn_negative).setOnClickListener(this);
        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);
        findViewById(R.id.btn_equal).setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.btn_0){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(0);
            String res = build.toString();
            cal_screen.setText(res);

        }else
        if(id == R.id.btn_1){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(1);
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_2){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(2);
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_3){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(3);
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_4){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(4);
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_5){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(5);
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_6){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(6);
            String res = build.toString();
            cal_screen.setText(res);

        }else
        if(id == R.id.btn_7){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(7);
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_8){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(8);
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_9){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(9);
            String res = build.toString();
            cal_screen.setText(res);

        }else
        if(id == R.id.btn_negative){
            if(build.length() != 0) {
                String get_res_screen;
                if(equal_fn)
                    get_res_screen = cal_screen.getText().toString();
                else
                    get_res_screen = build.toString();
                int count_operator = 0;
                int index_operator = 0;
                for (int i = 0; i < get_res_screen.length(); i++) {
                    char c = get_res_screen.charAt(i);
                    if (c == '+' || c == '-' || c == '*' || c == '/') {
                        count_operator++;
                        index_operator = i;
                        if (c == '*' || c == '/')
                            index_operator = i + 1;
                    }
                }
                if (count_operator <= 1 && index_operator < 1) {
                    if (count_operator == 1) {
                        get_res_screen = get_res_screen.substring(index_operator);
                    }
                    double convert_res = Double.parseDouble(get_res_screen);
                    convert_res *= -1.0;
                    build.setLength(0);
                    build.append(convert_res);
                    String res = build.toString();
                    cal_screen.setText(res);

                } else if (count_operator == 2 || count_operator == 3 || (count_operator <= 1 && index_operator > 1)) {
                    String first_sub_str = get_res_screen.substring(0, index_operator);
                    String second_sub_str = get_res_screen.substring(index_operator);
                    double convert_res = Double.parseDouble(second_sub_str);
                    convert_res *= -1.0;
                    build.setLength(0);
                    build.append(first_sub_str);
                    if (convert_res > 0)
                        build.append("+");
                    build.append(convert_res);
                    String res = build.toString();
                    cal_screen.setText(res);
                }
            }


        }else
        if(id == R.id.btn_minus){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            equal_function();
            equal_fn = true;
            build.append("-");
            String res = build.toString();
            cal_screen.setText(res);
            minus = true;
        }else
        if(id == R.id.btn_mul){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            equal_function();
            equal_fn = true;
            build.append("*");
            String res = build.toString();
            cal_screen.setText(res);
            mul = true;

        }else
        if(id == R.id.btn_equal){
                equal_function();
                equal_fn = true;

        }else
        if(id == R.id.btn_plus){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            equal_fn = true;
            equal_function();
            build.append("+");
            String res = build.toString();
            cal_screen.setText(res);
            plus = true;
        }else
        if(id == R.id.btn_dev){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            equal_function();
            equal_fn = true;
            build.append("/");
            String res = build.toString();
            cal_screen.setText(res);
            div = true;

        }else
        if(id == R.id.btn_decimal){
            if(build.toString().equals("error")){
                build.setLength(0);
                div_zero = false;
            }
            build.append(".");
            String res = build.toString();
            cal_screen.setText(res);
        }else
        if(id == R.id.btn_c){
            build.setLength(0);
            String sub_str = build.toString();
            cal_screen.setText(sub_str);
        }else
        if(id == R.id.btn_ce){
            if(build.length() != 0) {
                String get_cal_screen = cal_screen.getText().toString();
                int count_operator = 0;
                int index_operator = 0;
                for(int i = 0; i < get_cal_screen.length(); i++){
                    char c = get_cal_screen.charAt(i);
                        if (c == '+' || c == '-' || c == '*' || c == '/') {
                            count_operator++;
                            index_operator = i;
                        }
                }
                build.setLength(index_operator+1);
                build.append(0);
                String sub_str = build.toString();
                cal_screen.setText(sub_str);
            }

        }else
        if(id == R.id.btn_bs) {
            if(build.length() != 0) {
                build.setLength(build.length() - 1);
                String sub_str = build.toString();
                cal_screen.setText(sub_str);
            }

        }
    }
    private void equal_function(){

        String get_cal_screen = (String) cal_screen.getText();

        if(plus){
            String[] str = get_cal_screen.split("\\+", 0);
            double[] res_int = new double[str.length];
            double sum = 0;

            if(!str[0].equals("") && str.length == 2){
                for(int i = 0; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                sum = res_int[0] + res_int[1];
            }
            else if(str[0].equals("") && str.length == 2){
                res_int[1] = Double.parseDouble(str[1]);
                sum =  0.0 + res_int[1];
            }else if(str[0].equals("") && str.length == 3){
                for(int i = 1; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                sum =  0.0 + res_int[1] + res_int[2];
            }
            sum = round(sum);
            build.setLength(0);
            build.append(sum);
            String str2 = build.toString();
            cal_screen.setText(str2);
            plus = false;
        }
        if(minus){
            minus = false;
            String[] str = get_cal_screen.split("-", 0);
            double[] res_int = new double[str.length];
            double sub = 0;
            if(!str[0].equals("") && str.length == 2 && !str[1].equals("")){
                for(int i = 0; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                sub = res_int[0] - res_int[1];
            }
            else if(str[0].equals("") && str.length == 2){
                res_int[1] = Double.parseDouble(str[1]);
                sub = 0.0 - res_int[1];
            }else if(str[0].equals("") && str.length == 3){
                for(int i = 1; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                sub = 0.0 - res_int[1] - res_int[2];
            }else{
                res_int[0] = Double.parseDouble(str[0]);
                sub = res_int[0];
            }
            sub = round(sub);
            build.setLength(0);
            build.append(sub);
            String str2 = build.toString();
            cal_screen.setText(str2);
        }
        if(mul){
            mul = false;
            String[] str = get_cal_screen.split("\\*", 0);
            double[] res_int = new double[str.length];
            double mul = 1.0;

            if(!str[0].equals("") && str.length == 2){
                for(int i = 0; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                mul = res_int[0] * res_int[1];
            }
            else if(str[0].equals("") && str.length == 2){
                res_int[1] = Double.parseDouble(str[1]);
                mul =  1.0 * res_int[1];
            }else if(str[0].equals("") && str.length == 3){
                for(int i = 1; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                mul =  1.0 * res_int[1] * res_int[2];
            }
            mul = round(mul);
            build.setLength(0);
            build.append(mul);
            String str2 = build.toString();
            cal_screen.setText(str2);
        }
        if(div){

            div = false;
            String[] str = get_cal_screen.split("/", 0);
            double[] res_int = new double[str.length];
            double div = 1;

            if(!str[0].equals("") && str.length == 2 && !str[1].equals("")){
                for(int i = 0; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                if( res_int[1] != 0.0)
                    div = res_int[0] / res_int[1];
                else{
                    div_zero = true;
                }
            }
            else if(str[0].equals("") && str.length == 2){
                res_int[1] = Double.parseDouble(str[1]);
                div =  res_int[1];
            }else if(str[0].equals("") && str.length == 3){
                for(int i = 1; i < str.length; i++){
                    res_int[i] = Double.parseDouble(str[i]);
                }
                if( res_int[2] != 0.0)
                    div = res_int[1] / res_int[2];
                else{
                    div_zero = true;
                }

            }else{
                res_int[0] = Double.parseDouble(str[0]);
                div = res_int[0];
            }
            div = round(div);
            build.setLength(0);
            if(!div_zero)
                build.append(div);
            else{
                build.append("error");
            }
            String str1 = build.toString();
            cal_screen.setText(str1);


        }

    }
    private  double round(double value) {
        long factor = (long) Math.pow(10, 3);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
