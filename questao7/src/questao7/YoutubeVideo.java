package questao7;

public class YoutubeVideo {

	    private final int[] bits;

	    public YoutubeVideo() {
	       bits = new int[] {
	              80, 97, 114, 97, 98, 233, 110, 115, 44,
	              32, 118, 99, 32, 99, 111, 110, 115, 101,
	              103, 117, 105, 117, 46
	        };
	    }

	    public int[] getBits() {
	       return bits;
	    }
	    
	    @Override
	    public String getContent() {
	        String conteudo = "";
	        for(int i = 0; i < bits.length; i++) {
	            conteudo += (char)bits[i];
	        }
	        return conteudo;
	    }
}
