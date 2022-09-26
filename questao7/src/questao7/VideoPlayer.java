package questao7;

public class VideoPlayer {
	private Video video;

    public VideoPlayer(FaceVideo faceVideo) {
        this.video = faceVideo;
    }

    public void setVideo(FaceVideo faceVideo) {
        this.video = faceVideo;
    }

    public void play() {
        String conteudo = video.getContent();
        System.out.println(conteudo);
    }
}
