package yipengy.com.artist.ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import yipengy.com.artist.MainActivity;
import yipengy.com.artist.R;

/**
 * Created by mitayun on 3/30/16.
 */
public class MailFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mail, container, false);

        final EditText email = (EditText) v.findViewById(R.id.email);
        final EditText message = (EditText) v.findViewById(R.id.message);
        Button send = (Button) v.findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"mitayun@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Subscriber Request");
                i.putExtra(Intent.EXTRA_TEXT, email.getText().toString() + " would like to be added to the mailing list. Message is " + message.getText().toString());
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }
}
