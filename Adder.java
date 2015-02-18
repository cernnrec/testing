import javax.swing.JOptionPane;

public class Adder{
  public static void main(String[] args){
    String num1,num2,total;     
    int a,b;
    num1 = JOptionPane.showInputDialog("Enter first integer:");     
    num2 = JOptionPane.showInputDialog("Enter second integer:");
    a = Integer.parseInt( num1 );   
    b = Integer.parseInt( num2 );
    total = a + " + " + b + " = " + (a+b);
    JOptionPane.showMessageDialog(null, total, "Comparison Totals",JOptionPane.INFORMATION_MESSAGE);
  }
}
