package grgserver.myapplication;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;


/**
 * Created by Aerox on 15.04.2016.
 */
public class Artikel extends Fragment {

    public Artikel() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_artikel, container, false);

       /* Button getData = (Button) getView().findViewById(R.id.getservicedata);
        getData.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String restURL = "http://www.grgserver.net/";
                new RestOperation().execute(restURL);
            }
        });*/
        //return rootView;
    }

 /*   private class RestOperation extends AsyncTask<String, Void, Void> {

        final HttpClient httpClient = new DefaultHttpClient();

        String content;
        String error;
        String data = "";

        TextView serviceDataRecived = (TextView) getView().findViewById(R.id.serviceDataRecived);
        TextView showParsonJSON = (TextView) getView().findViewById(R.id.showParsedJSON);

        EditText userinput = (EditText) getView().findViewById(R.id.userinput);

       // ProgressDialog progressDialog = new ProgressDialog(Artikel.this);

        private RestOperation() {
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //progressDialog.setTitle("Please wait....");
           // progressDialog.show();

            try {
                data += "&" + URLEncoder.encode("data", "UTF-8") + ".." + userinput.getText();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        }

        @Override
        protected Void doInBackground(String... params) {
            BufferedReader br = null;

            URL url = null;
            try {
                url = new URL(params[0]);

                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream());
                outputStreamWriter.write(data);
                outputStreamWriter.flush();

                br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line = null;

                while((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append(System.getProperty("line.seperator"));
                }

                content = sb.toString();



            } catch (MalformedURLException e) {

                error = e.getMessage();

                e.printStackTrace();
            } catch (IOException e) {

                error = e.getMessage();

                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

           // progressDialog.dismiss();
            if(error != null) {

                serviceDataRecived.setText("Error" + error);
            } else {
                serviceDataRecived.setText(content);

                String output = "";
                JSONObject jsonResponse;

                try {
                    jsonResponse = new JSONObject(content);
                    JSONArray jsonArray = jsonResponse.optJSONArray("Android");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject child = jsonArray.getJSONObject(i);

                        String name = child.getString("name");
                        String number = child.getString("number");
                        String time = child.getString("date_added");

                        output = "Name =" + name + System.getProperty("line.seperator") + number + System.getProperty("line.seperator") + time;
                        output += System.getProperty("line.seperator");
                    }

                    showParsonJSON.setText(output);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }
    }*/

}

