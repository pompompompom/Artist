package yipengy.com.artist.ui;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

import yipengy.com.artist.R;

/**
 * Fragment to display video screen.
 */
public class VideoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_videos, container, false);

        final VideoView videoView1 = (VideoView) v.findViewById(R.id.video1);
        videoView1.setVideoURI(Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.nature));

        Button play1 = (Button) v.findViewById(R.id.play1);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView1.start();
            }
        });

        final VideoView videoView2 = (VideoView) v.findViewById(R.id.video2);
        videoView2.setVideoURI(Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.rabbit));

        Button play2 = (Button) v.findViewById(R.id.play2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView2.start();
            }
        });


        return v;
    }
}
