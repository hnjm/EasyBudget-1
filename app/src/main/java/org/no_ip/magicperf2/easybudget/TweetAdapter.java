package org.no_ip.magicperf2.easybudget;

/**
 * Created by steve on 6/13/15.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.no_ip.magicperf2.easybudget.models.Tweet;

import java.util.List;

public class TweetAdapter extends ArrayAdapter<Tweet>{
    private static class ViewHolder {
        private TextView tittle;
        private TextView body;
    }
    private LayoutInflater inflater;
    private List<Tweet> tweets;
    ViewHolder viewHolder;

    public TweetAdapter(Activity activity, List<Tweet> items){
        super(activity, R.layout.row_tweet, items);
        tweets=items;
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View v = convertView;
        if (v == null) {
            v = inflater.inflate(R.layout.row_tweet, parent, false);
        }
        Tweet tweet = tweets.get(position);
        TextView tittle = (TextView) v.findViewById(R.id.tweetTitle);
        tittle.setText(tweet.getTitle());

        TextView body = (TextView) v.findViewById(R.id.tweetBody);
        tittle.setText(tweet.getBody());
        return v;
    }

}