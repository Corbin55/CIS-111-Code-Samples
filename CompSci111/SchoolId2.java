import javax.swing.JOptionPane;
public class SchoolId2
{
   public static void main (String[] args)
   {
      String firstInitialInput = JOptionPane.showInputDialog("Enter your first initial: ");
      char firstInitial = firstInitialInput.charAt(0);
      
      String lastName = JOptionPane.showInputDialog("Enter your last name: ");
      
      String studentsIdInput = JOptionPane.showInputDialog("Enter the last four digits of your student ID: ");
      int studentsId4Last = Integer.parseInt(studentsIdInput);
      
      JOptionPane.showMessageDialog(null, firstInitial + lastName + studentsId4Last);
   }
}