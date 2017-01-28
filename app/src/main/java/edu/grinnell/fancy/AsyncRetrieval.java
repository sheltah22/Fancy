package edu.grinnell.fancy;

import android.os.AsyncTask;
import android.util.JsonReader;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by shelb on 1/4/2017.
 *
 * code found at https://github.com/GrinnellAppDev/Android-Training-Wiki/blob/master/AsyncRetrieval.java#L3
 */

public class AsyncRetrieval extends AsyncTask<Void, Void, String> {

    private static final String URL = "http://www.cs.grinnell.edu/~pradhanp/android.json";
    public String body;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... voids) {
        Log.i("async", "starting background");

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(URL).build();

        Log.i("async", "built request");

        try {
            Response response = client.newCall(request).execute();
            body = response.body().string();
            Log.i("async", body);
        } catch (IOException e) {
            Log.i("async", "oh no");
            e.printStackTrace();
        }

        try {
            JSONObject obj = new JSONObject(body);
            obj.get("key");
            Log.i("async", obj.get("Larry Boateng Asante").toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Log.i("async", "returning");
        return body;
    }

    @Override
    protected void onPostExecute(String aString) {
        super.onPostExecute(aString);
    }


}
