package edu.grinnell.fancy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shelb on 1/4/2017.
 *
 * code from https://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView#defining-the-adapter
 */

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvId = (TextView) convertView.findViewById(R.id.tvId);

        tvName.setText(user.name);
        tvId.setText(user.id);

        return convertView;
    }
}
