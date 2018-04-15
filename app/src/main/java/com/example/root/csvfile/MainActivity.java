package com.example.root.csvfile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        readUserdata();
    }

    private List<Userdata> userdata = new ArrayList<>();
    private void readUserdata() {

        InputStream is = getResources().openRawResource(R.raw.user);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = "";
        try {

            bufferedReader.readLine();

            while((line=bufferedReader.readLine())!=null){
                Log.d("MyActvity","Line: "+line);

                // split by ','
                String tokens[] = line.split(",");

                // read user data
                Userdata data = new Userdata();
                if(tokens[0].length()>0) {
                    data.setId(Integer.parseInt(tokens[0]));
                }else {
                    data.setId(0);
                }
                    data.setName(tokens[1]);
                if(tokens[2].length()>0) {
                    data.setContactno(Integer.parseInt(tokens[2]));
                }else {
                 data.setContactno(0);
                }
                    data.setAddress(tokens[3]);
                userdata.add(data);

                Log.d("MyActvity","Just Created"+data);
            }
        } catch (IOException e){
            Log.wtf("MyActvity","Error redaing data file"+line,e);
            e.printStackTrace();
        }

    }
}
