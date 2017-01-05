package edu.grinnell.fancy;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by shelb on 1/4/2017.
 *
 * code used from https://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView
 */

public class User {
    public String name;
    public int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public User(JSONObject object) {
        try {
            this.name = object.getString("name");
            this.id = object.getInt("id");
        }
        catch(JSONException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> fromJSON(JSONArray jsonObjects) {
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0; i < jsonObjects.length(); i++) {
            try {
                users.add(new User(jsonObjects.getJSONObject(i)));
            }
            catch(JSONException e) {
                e.printStackTrace();
            }
        }
        return users;
    }
}
