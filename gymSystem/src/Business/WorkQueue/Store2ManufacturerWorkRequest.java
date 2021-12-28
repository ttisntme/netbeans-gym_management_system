/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class Store2ManufacturerWorkRequest extends WorkRequest{
    
    private String result;
    

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

    
    
    @Override
    public String toString() {
        return this.getMessage();
    }
    
}
