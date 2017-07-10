/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package villegas_task1;

/**
 *
 * @author 3rd Year Account
 */
public class OuterClass {
    int data = 5 ;
    class InnerClass{
        int data2 = 5;
        void method () {
            System.out.println(data);
            System.out.println(data2);
        }
    }
}
