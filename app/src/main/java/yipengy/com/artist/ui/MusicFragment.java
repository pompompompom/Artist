package yipengy.com.artist.ui;

import yipengy.com.artist.R;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Fragment to display songs screen
 */
public class MusicFragment extends Fragment {
    MediaPlayer mediaPlayer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_songs, container, false);

        Button pikapika = (Button) v.findViewById(R.id.song_pika);
        pikapika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.pikapika);
            }
        });
        Button pikapi = (Button) v.findViewById(R.id.song_pikapi);
        pikapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(R.raw.pikapi);
            }
        });
        return v;
    }

    private void playSound(int soundResId) {
        mediaPlayer = MediaPlayer.create(getContext(), soundResId);
        mediaPlayer.start();
    }

    @Override
    public void onStop() {
        // release the media player
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onStop();
    }
}
