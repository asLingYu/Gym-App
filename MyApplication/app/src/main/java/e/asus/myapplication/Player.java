package e.asus.myapplication;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;

public class Player extends AppCompatActivity {
    private VideoView videoview ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //网络视频

        videoview = (VideoView)this.findViewById(R.id.video_view );

        //设置视频控制器
        videoview.setMediaController(new MediaController(this));

        //播放完成回调
        videoview.setOnCompletionListener( new MyPlayerOnCompletionListener());

        //设置视频路径
        //videoView.setVideoURI(uri);
        videoview.setVideoPath("http://flashmedia.eastday.com/newdate/news/2016-11/shznews1125-19.mp4");

        //开始播放视频
        videoview.start();

    }

    class MyPlayerOnCompletionListener implements MediaPlayer.OnCompletionListener {

        @Override
        public void onCompletion(MediaPlayer mp) {
            Toast.makeText(Player.this, "播放完成了", Toast.LENGTH_SHORT).show();
        }
    }

}
