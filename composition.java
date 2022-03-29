
package composition;

public class Composition {

    
    public static void main(String[] args) {
        /*Composition sahiplik ilişkisi var  farklı sınıflardaki objeleri farklı sınıflarda iç içe 
        kullanabilirsin.*/
        
        araba araba1=new araba();
        araba1.araba("bmw","kırmızı", 4);
        
        gemi gemi1 = new gemi();
        gemi1.gemi("bilmiyom", "motor", 1);
        Tasıt taasıt1=new Tasıt();
        taasıt1.Tasıt(araba1, gemi1);
        taasıt1.getGemi().gemi_bilgileri();
        
    }
    
}
