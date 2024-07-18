package funcoes.reprodutorMusical;

public class reprodutorMusical {
    private String music;
    
    public void tocar(){
        System.out.println("Tocando música");
    }
    public void pausar(){
        System.out.println("Música pausada");
    }
    public void setTrocarMusica(String music){
        this.music = music;
    }
    public String getTrocarMusica(){
        return music;
    }
}