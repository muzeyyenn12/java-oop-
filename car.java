
package composition;


public class araba {
    private String model;
    private String renk;
    private int teker_sayisi;
    
    //constuctor
    public void araba(String model , String renk ,int teker_sayisi){
        this.setModel(model);
        this.setRenk(renk);
        this.setTeker_sayisi(teker_sayisi);
    }

    /* get - set metodlarını kullanarak nesneleri çağırabilirsin.      
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the teker_sayisi
     */
    public int getTeker_sayisi() {
        return teker_sayisi;
    }

    /**
     * @param teker_sayisi the teker_sayisi to set
     */
    public void setTeker_sayisi(int teker_sayisi) {
        this.teker_sayisi = teker_sayisi;
    }
    
    
    
    
}
