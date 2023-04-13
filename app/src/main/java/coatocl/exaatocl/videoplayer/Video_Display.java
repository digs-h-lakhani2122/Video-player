package coatocl.exaatocl.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Video_Display extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__display);

        video = findViewById(R.id.video);

        Bundle bundle =getIntent().getExtras();
        if(bundle!=null)
        {
            Uri uri =Uri.parse(bundle.getString("uri"));
            video.setVideoURI(uri);
            video.start();
        }
    }
}
