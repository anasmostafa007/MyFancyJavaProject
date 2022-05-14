/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

/**
 *
 * @author Student
 */
public class Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 5;
        for(int j = 1; j <= 10; j++)
        {
            System.out.printf("%d * %d = %d \n", num, j, num * j);
        }
    }
    
}
