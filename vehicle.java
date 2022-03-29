package composition;

//ben bu ttasıt sınıfına 1 tane araba öznesi 1 tane de gemi öznesi oluşturup onu çekiyorum get-set ile
public class Tasıt {
    private araba araba;
    private gemi gemi;

    
            
    //yapıcı metod
    public void Tasıt(araba araba , gemi gemi){
        this.gemi=gemi;
        this.araba=araba;
    }

    public araba getAraba() {
        return araba;
    }

    public gemi getGemi() {
        return gemi;
    }

    public void setAraba(araba araba) {
        this.araba = araba;
    }

    public void setGemi(gemi gemi) {
        this.gemi = gemi;
    }
    
}
