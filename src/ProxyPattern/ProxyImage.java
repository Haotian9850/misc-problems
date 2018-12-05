package ProxyPattern;

public class ProxyImage implements Image {

    /*
    * 代理层
    * */

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(this.realImage == null){
            this.realImage = new RealImage(this.fileName);
        }
        realImage.display();
    }
}
