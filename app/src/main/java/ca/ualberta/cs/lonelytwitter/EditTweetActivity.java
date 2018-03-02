package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intentCase = getIntent();
        Bundle bundle;
        bundle = intentCase.getExtras();
        String message = bundle.getString("Tweet");
        EditText showTweet = (EditText) findViewById(R.id.editText);
        showTweet.setText(message);
    }
}
