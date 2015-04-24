
package com.example.student.project_seven;


        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;

        import android.app.Activity;
        import android.content.ContentValues;
        import android.content.Intent;
        import android.database.sqlite.SQLiteDatabase;
        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.SimpleAdapter;
        import android.widget.TextView;
        import android.widget.Toast;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.UnsupportedEncodingException;
        import java.net.HttpURLConnection;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.net.URLConnection;
        import android.app.Activity;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;

        import org.apache.http.HttpResponse;
        import org.apache.http.NameValuePair;
        import org.apache.http.client.ClientProtocolException;
        import org.apache.http.client.HttpClient;
        import org.apache.http.client.entity.UrlEncodedFormEntity;
        import org.apache.http.client.methods.HttpPost;
        import org.apache.http.impl.client.DefaultHttpClient;
        import org.apache.http.message.BasicNameValuePair;
        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.logging.Handler;

public class MainActivity extends Activity {

    //ArrayList<Map<String, String>> data;



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }






    public void okbutton (View v) {


        EditText branch = (EditText)findViewById(R.id.branch);
        EditText Ant = (EditText)findViewById(R.id.antdata);
        EditText A = (EditText)findViewById(R.id.adata);
        EditText K = (EditText)findViewById(R.id.kdata);

        //    InsertToDB();
        String b = branch.getText().toString();
        String ant = Ant.getText().toString();
        String a = A.getText().toString();
        String k = K.getText().toString();

        Intent  i = new Intent(this, localActivity.class);
        i.putExtra("B", b);
        i.putExtra("Ant", Integer.valueOf(ant));
        i.putExtra("A", Integer.valueOf(a));
        i.putExtra("K", Integer.valueOf(k));
        startActivity(i);




    }
   public boolean onCreateOptionsMenu(Menu menu){
       getMenuInflater().inflate(R.menu.menu_main, menu);
       return true;
   }

    public boolean omOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }








//
//class PostMessageTask extends AsyncTask<String, Void, Boolean> {
//    String line;
//    StringBuilder buffer = new StringBuilder();
//
//    @Override
//    protected Boolean doInBackground(String... params) {
//        String brP = params[0];
//        String fastP = params[1];
//        String thorP = params[2];
//        String takenP = params[3];
//        HttpClient h = new DefaultHttpClient();
//        HttpPost p = new HttpPost("http://ict.siit.tu.ac.th/~u5522773787/its333/post.php");
//
//        //////////////////////
//        List<NameValuePair> values = new ArrayList<NameValuePair>();
//        values.add(new BasicNameValuePair("branch", brP));
//        values.add(new BasicNameValuePair("F", fastP));
//        values.add(new BasicNameValuePair("A", thorP));
//        values.add(new BasicNameValuePair("K", takenP));
//        try {
//            p.setEntity(new UrlEncodedFormEntity(values));
//            HttpResponse response = h.execute(p);
//            BufferedReader reader = new BufferedReader(
//                    new InputStreamReader(response.getEntity().getContent()));
//            while ((line = reader.readLine()) != null) {
//                buffer.append(line);
//            }
//            return true;
//
//        } catch (UnsupportedEncodingException e) {
//            Log.e("Error", "Invalid encoding");
//        } catch (ClientProtocolException e) {
//            Log.e("Error", "Error in posting a message");
//        } catch (IOException e) {
//            Log.e("Error", "I/O Exception");
//        }
//        return false;
//    }
//
//    @Override
//    protected void onPostExecute(Boolean result) {
//        if (result) {
////                Toast t = Toast.makeText(project.this.getApplicationContext(),
////                        "Successfully post your status",
////                        Toast.LENGTH_SHORT);
////                t.show();
//            Log.e("PostMessageTask","Successfully Post");
//        } else {
//            Log.e("PostMessageTask","unable Post");
//        }
//    }

}