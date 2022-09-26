package questao7;

public class FaceVideo {
	private final boolean[] bitsFace;

    public FaceVideo() {
       bitsFace = new boolean[] {
              false, true, false, true, false, false, false, false, false, true, true, false, false, false, false,
              true, false, true, true, true, false, false, true, false, false, true, true, false, false, false, false,
              true, false, true, true, false, false, false, true, false, true, true, true, false, true, false, false,
              true, false, true, true, false, true, true, true, false, false, true, true, true, false, false, true,
              true, false, false, true, false, true, true, false, false, false, false, true, false, false, false,
              false, false, false, true, true, true, false, true, true, false, false, true, true, false, false, false,
              true, true, false, false, true, false, false, false, false, false, false, true, true, false, false,
              false, true, true, false, true, true, false, true, true, true, true, false, true, true, false, true,
              true, true, false, false, true, true, true, false, false, true, true, false, true, true, false, false,
              true, false, true, false, true, true, false, false, true, true, true, false, true, true, true, false,
              true, false, true, false, true, true, false, true, false, false, true, false, true, true, true, false,
              true, false, true, false, false, true, false, true, true, true, false
       };
    }

    public boolean[] getBitsFace() {
        return bitsFace;
    }
    
    @Override
    public String getContent() {
        String conteudo = "";
        String BinaryStringAtual = "";
        
        for(int i = 0; i < bitsFace.length; i++) {
            char BitAtual = bitsFace[i] ? '1' : '0';
            BinaryStringAtual += BitAtual;
            if(i % 8 == 0) {
                int asciiCode = Integer.parseInt(BinaryStringAtual, 2) / 2;
                conteudo += (char)asciiCode;
                BinaryStringAtual = "";
            }
        }
        return conteudo;
    }
}
