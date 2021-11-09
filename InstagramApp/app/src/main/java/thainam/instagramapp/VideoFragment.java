package thainam.instagramapp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VideoFragment extends Fragment {

    VideoView vv,vv1,vv2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragmen_video,container,false);
      vv = view.findViewById(R.id.video_view);
      vv1 = view.findViewById(R.id.video_view1);
      vv2 = view.findViewById(R.id.video_view2);
        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        vv.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.video3);
        MediaController med = new MediaController(getActivity());
        vv.setMediaController(med);
        med.setAnchorView(vv);

        // video 1
        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        vv1.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.video1);
        MediaController med1 = new MediaController(getActivity());
        vv1.setMediaController(med1);
        med.setAnchorView(vv1);



        /// video2
        vv2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        vv2.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.video2);
        MediaController med2 = new MediaController(getActivity());
        vv2.setMediaController(med2);
        med.setAnchorView(vv2);

        return view;
    }
}
