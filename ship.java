
package composition;


public class gemi {
    private String model;
    private String motor;
    private int id;
    
    public void gemi(String model , String motor , int id){
        this.setModel(model);
        this.setMotor(motor);
        this.setId(id);
        
    }
    public void gemi_bilgileri(){
        System.out.println(this.model);
        System.out.println(this.motor);
        System.out.println(this.id);
            
    }

    /**
     * @return the model
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
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
}
