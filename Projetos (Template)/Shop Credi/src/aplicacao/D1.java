/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import Principal.Function;
import java.util.*;
/**
 *
 * @author gabriel.girardi
 */
public class D1 implements Function{
        
    private String A1;
    private String A2;
    private String A3;    
    
    public boolean equals(D1 d1)
       {
        return(this.A1.equals(d1.A1) && this.A2.equals(d1.A2) && this.A3.equals(d1.A3));
        }
        
    public String getA1() {
        return A1;
    }

    public void setA1(String A1) {
        this.A1 = A1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String A2) {
        this.A2 = A2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }

    public D1(String A1, String A2, String A3) {
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
    }

    @Override
    public void cadDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lerDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
