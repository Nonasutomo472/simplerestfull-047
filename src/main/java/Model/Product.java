/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author winarti nur utami
 */
// ini adalah kelas product 
public class Product {
     private String Id;
    private String Name;

    //ini adalah inisialisasi get id 
    public String getId() {
        return Id;
    }
    
    //ini  adalah inisialisasi string id
    public void setId(String Id) {
        this.Id = Id;
    }
    
    //ini adalah inisialisasi get name
    public String getName() {
        return Name;
    }
    // ini adalah inisialisasi set name
    public void setName(String Name) {
        this.Name = Name;
    }
    
}
