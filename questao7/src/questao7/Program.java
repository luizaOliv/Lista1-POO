package questao7;

import questao7.VideoPlayer;

public class Program {

	public static void main(String[] args) {
        FaceVideo faceVideo = new FaceVideo(); 
        YoutubeVideo youtubeVideo = new YoutubeVideo(); 
        VideoPlayer videoPlayer1 = new VideoPlayer(faceVideo);
        videoPlayer1.play();
        videoPlayer1.setVideo(faceVideo);
        videoPlayer1.play();
        VideoPlayer videoPlayer2 = new VideoPlayer(youtubeVideo);
        videoPlayer2.play();
        videoPlayer2.setVideo(youtubeVideo);
        videoPlayer2.play();
	}

}
