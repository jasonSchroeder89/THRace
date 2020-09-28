/**
 * EditRacersDialog - JDialog used to configure ThreadRunner object properties.
 * 
 * @author Jason Schroeder
 * @created 06/14/2017
 */

import java.util.ArrayList;

public class EditRacersDialog extends javax.swing.JDialog
{
    /* Class attributes */
    private ArrayList<ThreadRunner> racers;
    private int numRacers;
    
    private static ArrayList<ThreadRunner> sRacers;
    private static int sNumRacers;
    
    /* Class methods */
    
    /* Constructor */
    
    /**
     * Creates new form EditRacersDialog
     * @param parent
     * @param modal
     * @param racers
     * @param numRacers
     */
    
    public EditRacersDialog(java.awt.Frame parent, boolean modal, 
        ArrayList<ThreadRunner> racers, int numRacers)
    {
        super(parent, modal);
        initComponents();
        
        this.racers = racers;
        this.numRacers = numRacers;
        
        sRacers = this.racers;
        sNumRacers = this.numRacers;
        
        //Call method setComboBoxes() to set all ComboBoxes in Dialog
        setComboBoxes(r1RestComboBox, r1SpeedComboBox);
        setComboBoxes(r2RestComboBox, r2SpeedComboBox);
        setComboBoxes(r3RestComboBox, r3SpeedComboBox);
        setComboBoxes(r4RestComboBox, r4SpeedComboBox);
        setComboBoxes(r5RestComboBox, r5SpeedComboBox);
        setComboBoxes(r6RestComboBox, r6SpeedComboBox);
        setComboBoxes(r7RestComboBox, r7SpeedComboBox);
        setComboBoxes(r8RestComboBox, r8SpeedComboBox);
        setComboBoxes(r9RestComboBox, r9SpeedComboBox);
        
        //Set values in Dialog to value of ThreadRunner instance attributes
        r1NameTextField.setText(this.racers.get(0).getName());
        r1RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(0).getRestPercentage()));
        r1SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(0).getSpeed()));
        
        r2NameTextField.setText(this.racers.get(1).getName());
        r2RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(1).getRestPercentage()));
        r2SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(1).getSpeed()));
        
        r3NameTextField.setText(this.racers.get(2).getName());
        r3RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(2).getRestPercentage()));
        r3SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(2).getSpeed()));
        
        r4NameTextField.setText(this.racers.get(3).getName());
        r4RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(3).getRestPercentage()));
        r4SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(3).getSpeed()));
        
        r5NameTextField.setText(this.racers.get(4).getName());
        r5RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(4).getRestPercentage()));
        r5SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(4).getSpeed()));
        
        r6NameTextField.setText(this.racers.get(5).getName());
        r6RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(5).getRestPercentage()));
        r6SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(5).getSpeed()));
        
        r7NameTextField.setText(this.racers.get(6).getName());
        r7RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(6).getRestPercentage()));
        r7SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(6).getSpeed()));
        
        r8NameTextField.setText(this.racers.get(7).getName());
        r8RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(7).getRestPercentage()));
        r8SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(7).getSpeed()));
        
        r9NameTextField.setText(this.racers.get(8).getName());
        r9RestComboBox.setSelectedItem(
            Integer.toString(this.racers.get(8).getRestPercentage()));
        r9SpeedComboBox.setSelectedItem(
            Integer.toString(this.racers.get(8).getSpeed()));
        
        //Dynamically set visibility of widgets based on number of racers
        switch(this.numRacers)
        {
            case 2:
                r3Label.setVisible(false);
                r3NameLabel.setVisible(false);
                r3NameTextField.setVisible(false);
                r3RestLabel.setVisible(false);
                r3RestComboBox.setVisible(false);
                r3SpeedLabel.setVisible(false);
                r3SpeedComboBox.setVisible(false);
                r4Label.setVisible(false);
                r4NameLabel.setVisible(false);
                r4NameTextField.setVisible(false);
                r4RestLabel.setVisible(false);
                r4RestComboBox.setVisible(false);
                r4SpeedLabel.setVisible(false);
                r4SpeedComboBox.setVisible(false);
                r5Label.setVisible(false);
                r5NameLabel.setVisible(false);
                r5NameTextField.setVisible(false);
                r5RestLabel.setVisible(false);
                r5RestComboBox.setVisible(false);
                r5SpeedLabel.setVisible(false);
                r5SpeedComboBox.setVisible(false);
                r6Label.setVisible(false);
                r6NameLabel.setVisible(false);
                r6NameTextField.setVisible(false);
                r6RestLabel.setVisible(false);
                r6RestComboBox.setVisible(false);
                r6SpeedLabel.setVisible(false);
                r6SpeedComboBox.setVisible(false);
                r7Label.setVisible(false);
                r7NameLabel.setVisible(false);
                r7NameTextField.setVisible(false);
                r7RestLabel.setVisible(false);
                r7RestComboBox.setVisible(false);
                r7SpeedLabel.setVisible(false);
                r7SpeedComboBox.setVisible(false);
                r8Label.setVisible(false);
                r8NameLabel.setVisible(false);
                r8NameTextField.setVisible(false);
                r8RestLabel.setVisible(false);
                r8RestComboBox.setVisible(false);
                r8SpeedLabel.setVisible(false);
                r8SpeedComboBox.setVisible(false);
                r9Label.setVisible(false);
                r9NameLabel.setVisible(false);
                r9NameTextField.setVisible(false);
                r9RestLabel.setVisible(false);
                r9RestComboBox.setVisible(false);
                r9SpeedLabel.setVisible(false);
                r9SpeedComboBox.setVisible(false);
                break;
                
            case 3:
                r3Label.setVisible(true);
                r3NameLabel.setVisible(true);
                r3NameTextField.setVisible(true);
                r3RestLabel.setVisible(true);
                r3RestComboBox.setVisible(true);
                r3SpeedLabel.setVisible(true);
                r3SpeedComboBox.setVisible(true);
                r4Label.setVisible(false);
                r4NameLabel.setVisible(false);
                r4NameTextField.setVisible(false);
                r4RestLabel.setVisible(false);
                r4RestComboBox.setVisible(false);
                r4SpeedLabel.setVisible(false);
                r4SpeedComboBox.setVisible(false);
                r5Label.setVisible(false);
                r5NameLabel.setVisible(false);
                r5NameTextField.setVisible(false);
                r5RestLabel.setVisible(false);
                r5RestComboBox.setVisible(false);
                r5SpeedLabel.setVisible(false);
                r5SpeedComboBox.setVisible(false);
                r6Label.setVisible(false);
                r6NameLabel.setVisible(false);
                r6NameTextField.setVisible(false);
                r6RestLabel.setVisible(false);
                r6RestComboBox.setVisible(false);
                r6SpeedLabel.setVisible(false);
                r6SpeedComboBox.setVisible(false);
                r7Label.setVisible(false);
                r7NameLabel.setVisible(false);
                r7NameTextField.setVisible(false);
                r7RestLabel.setVisible(false);
                r7RestComboBox.setVisible(false);
                r7SpeedLabel.setVisible(false);
                r7SpeedComboBox.setVisible(false);
                r8Label.setVisible(false);
                r8NameLabel.setVisible(false);
                r8NameTextField.setVisible(false);
                r8RestLabel.setVisible(false);
                r8RestComboBox.setVisible(false);
                r8SpeedLabel.setVisible(false);
                r8SpeedComboBox.setVisible(false);
                r9Label.setVisible(false);
                r9NameLabel.setVisible(false);
                r9NameTextField.setVisible(false);
                r9RestLabel.setVisible(false);
                r9RestComboBox.setVisible(false);
                r9SpeedLabel.setVisible(false);
                r9SpeedComboBox.setVisible(false);
                break;
                
            case 4:
                r3Label.setVisible(true);
                r3NameLabel.setVisible(true);
                r3NameTextField.setVisible(true);
                r3RestLabel.setVisible(true);
                r3RestComboBox.setVisible(true);
                r3SpeedLabel.setVisible(true);
                r3SpeedComboBox.setVisible(true);
                r4Label.setVisible(true);
                r4NameLabel.setVisible(true);
                r4NameTextField.setVisible(true);
                r4RestLabel.setVisible(true);
                r4RestComboBox.setVisible(true);
                r4SpeedLabel.setVisible(true);
                r4SpeedComboBox.setVisible(true);
                r5Label.setVisible(false);
                r5NameLabel.setVisible(false);
                r5NameTextField.setVisible(false);
                r5RestLabel.setVisible(false);
                r5RestComboBox.setVisible(false);
                r5SpeedLabel.setVisible(false);
                r5SpeedComboBox.setVisible(false);
                r6Label.setVisible(false);
                r6NameLabel.setVisible(false);
                r6NameTextField.setVisible(false);
                r6RestLabel.setVisible(false);
                r6RestComboBox.setVisible(false);
                r6SpeedLabel.setVisible(false);
                r6SpeedComboBox.setVisible(false);
                r7Label.setVisible(false);
                r7NameLabel.setVisible(false);
                r7NameTextField.setVisible(false);
                r7RestLabel.setVisible(false);
                r7RestComboBox.setVisible(false);
                r7SpeedLabel.setVisible(false);
                r7SpeedComboBox.setVisible(false);
                r8Label.setVisible(false);
                r8NameLabel.setVisible(false);
                r8NameTextField.setVisible(false);
                r8RestLabel.setVisible(false);
                r8RestComboBox.setVisible(false);
                r8SpeedLabel.setVisible(false);
                r8SpeedComboBox.setVisible(false);
                r9Label.setVisible(false);
                r9NameLabel.setVisible(false);
                r9NameTextField.setVisible(false);
                r9RestLabel.setVisible(false);
                r9RestComboBox.setVisible(false);
                r9SpeedLabel.setVisible(false);
                r9SpeedComboBox.setVisible(false);
                break;
                
            case 5:
                r3Label.setVisible(true);
                r3NameLabel.setVisible(true);
                r3NameTextField.setVisible(true);
                r3RestLabel.setVisible(true);
                r3RestComboBox.setVisible(true);
                r3SpeedLabel.setVisible(true);
                r3SpeedComboBox.setVisible(true);
                r4Label.setVisible(true);
                r4NameLabel.setVisible(true);
                r4NameTextField.setVisible(true);
                r4RestLabel.setVisible(true);
                r4RestComboBox.setVisible(true);
                r4SpeedLabel.setVisible(true);
                r4SpeedComboBox.setVisible(true);
                r5Label.setVisible(true);
                r5NameLabel.setVisible(true);
                r5NameTextField.setVisible(true);
                r5RestLabel.setVisible(true);
                r5RestComboBox.setVisible(true);
                r5SpeedLabel.setVisible(true);
                r5SpeedComboBox.setVisible(true);
                r6Label.setVisible(false);
                r6NameLabel.setVisible(false);
                r6NameTextField.setVisible(false);
                r6RestLabel.setVisible(false);
                r6RestComboBox.setVisible(false);
                r6SpeedLabel.setVisible(false);
                r6SpeedComboBox.setVisible(false);
                r7Label.setVisible(false);
                r7NameLabel.setVisible(false);
                r7NameTextField.setVisible(false);
                r7RestLabel.setVisible(false);
                r7RestComboBox.setVisible(false);
                r7SpeedLabel.setVisible(false);
                r7SpeedComboBox.setVisible(false);
                r8Label.setVisible(false);
                r8NameLabel.setVisible(false);
                r8NameTextField.setVisible(false);
                r8RestLabel.setVisible(false);
                r8RestComboBox.setVisible(false);
                r8SpeedLabel.setVisible(false);
                r8SpeedComboBox.setVisible(false);
                r9Label.setVisible(false);
                r9NameLabel.setVisible(false);
                r9NameTextField.setVisible(false);
                r9RestLabel.setVisible(false);
                r9RestComboBox.setVisible(false);
                r9SpeedLabel.setVisible(false);
                r9SpeedComboBox.setVisible(false);
                break;
                
            case 6:
                r3Label.setVisible(true);
                r3NameLabel.setVisible(true);
                r3NameTextField.setVisible(true);
                r3RestLabel.setVisible(true);
                r3RestComboBox.setVisible(true);
                r3SpeedLabel.setVisible(true);
                r3SpeedComboBox.setVisible(true);
                r4Label.setVisible(true);
                r4NameLabel.setVisible(true);
                r4NameTextField.setVisible(true);
                r4RestLabel.setVisible(true);
                r4RestComboBox.setVisible(true);
                r4SpeedLabel.setVisible(true);
                r4SpeedComboBox.setVisible(true);
                r5Label.setVisible(true);
                r5NameLabel.setVisible(true);
                r5NameTextField.setVisible(true);
                r5RestLabel.setVisible(true);
                r5RestComboBox.setVisible(true);
                r5SpeedLabel.setVisible(true);
                r5SpeedComboBox.setVisible(true);
                r6Label.setVisible(true);
                r6NameLabel.setVisible(true);
                r6NameTextField.setVisible(true);
                r6RestLabel.setVisible(true);
                r6RestComboBox.setVisible(true);
                r6SpeedLabel.setVisible(true);
                r6SpeedComboBox.setVisible(true);
                r7Label.setVisible(false);
                r7NameLabel.setVisible(false);
                r7NameTextField.setVisible(false);
                r7RestLabel.setVisible(false);
                r7RestComboBox.setVisible(false);
                r7SpeedLabel.setVisible(false);
                r7SpeedComboBox.setVisible(false);
                r8Label.setVisible(false);
                r8NameLabel.setVisible(false);
                r8NameTextField.setVisible(false);
                r8RestLabel.setVisible(false);
                r8RestComboBox.setVisible(false);
                r8SpeedLabel.setVisible(false);
                r8SpeedComboBox.setVisible(false);
                r9Label.setVisible(false);
                r9NameLabel.setVisible(false);
                r9NameTextField.setVisible(false);
                r9RestLabel.setVisible(false);
                r9RestComboBox.setVisible(false);
                r9SpeedLabel.setVisible(false);
                r9SpeedComboBox.setVisible(false);
                break;
                
            case 7:
                r3Label.setVisible(true);
                r3NameLabel.setVisible(true);
                r3NameTextField.setVisible(true);
                r3RestLabel.setVisible(true);
                r3RestComboBox.setVisible(true);
                r3SpeedLabel.setVisible(true);
                r3SpeedComboBox.setVisible(true);
                r4Label.setVisible(true);
                r4NameLabel.setVisible(true);
                r4NameTextField.setVisible(true);
                r4RestLabel.setVisible(true);
                r4RestComboBox.setVisible(true);
                r4SpeedLabel.setVisible(true);
                r4SpeedComboBox.setVisible(true);
                r5Label.setVisible(true);
                r5NameLabel.setVisible(true);
                r5NameTextField.setVisible(true);
                r5RestLabel.setVisible(true);
                r5RestComboBox.setVisible(true);
                r5SpeedLabel.setVisible(true);
                r5SpeedComboBox.setVisible(true);
                r6Label.setVisible(true);
                r6NameLabel.setVisible(true);
                r6NameTextField.setVisible(true);
                r6RestLabel.setVisible(true);
                r6RestComboBox.setVisible(true);
                r6SpeedLabel.setVisible(true);
                r6SpeedComboBox.setVisible(true);
                r7Label.setVisible(true);
                r7NameLabel.setVisible(true);
                r7NameTextField.setVisible(true);
                r7RestLabel.setVisible(true);
                r7RestComboBox.setVisible(true);
                r7SpeedLabel.setVisible(true);
                r7SpeedComboBox.setVisible(true);
                r8Label.setVisible(false);
                r8NameLabel.setVisible(false);
                r8NameTextField.setVisible(false);
                r8RestLabel.setVisible(false);
                r8RestComboBox.setVisible(false);
                r8SpeedLabel.setVisible(false);
                r8SpeedComboBox.setVisible(false);
                r9Label.setVisible(false);
                r9NameLabel.setVisible(false);
                r9NameTextField.setVisible(false);
                r9RestLabel.setVisible(false);
                r9RestComboBox.setVisible(false);
                r9SpeedLabel.setVisible(false);
                r9SpeedComboBox.setVisible(false);
                break;
                
            case 8:
                r3Label.setVisible(true);
                r3NameLabel.setVisible(true);
                r3NameTextField.setVisible(true);
                r3RestLabel.setVisible(true);
                r3RestComboBox.setVisible(true);
                r3SpeedLabel.setVisible(true);
                r3SpeedComboBox.setVisible(true);
                r4Label.setVisible(true);
                r4NameLabel.setVisible(true);
                r4NameTextField.setVisible(true);
                r4RestLabel.setVisible(true);
                r4RestComboBox.setVisible(true);
                r4SpeedLabel.setVisible(true);
                r4SpeedComboBox.setVisible(true);
                r5Label.setVisible(true);
                r5NameLabel.setVisible(true);
                r5NameTextField.setVisible(true);
                r5RestLabel.setVisible(true);
                r5RestComboBox.setVisible(true);
                r5SpeedLabel.setVisible(true);
                r5SpeedComboBox.setVisible(true);
                r6Label.setVisible(true);
                r6NameLabel.setVisible(true);
                r6NameTextField.setVisible(true);
                r6RestLabel.setVisible(true);
                r6RestComboBox.setVisible(true);
                r6SpeedLabel.setVisible(true);
                r6SpeedComboBox.setVisible(true);
                r7Label.setVisible(true);
                r7NameLabel.setVisible(true);
                r7NameTextField.setVisible(true);
                r7RestLabel.setVisible(true);
                r7RestComboBox.setVisible(true);
                r7SpeedLabel.setVisible(true);
                r7SpeedComboBox.setVisible(true);
                r8Label.setVisible(true);
                r8NameLabel.setVisible(true);
                r8NameTextField.setVisible(true);
                r8RestLabel.setVisible(true);
                r8RestComboBox.setVisible(true);
                r8SpeedLabel.setVisible(true);
                r8SpeedComboBox.setVisible(true);
                r9Label.setVisible(false);
                r9NameLabel.setVisible(false);
                r9NameTextField.setVisible(false);
                r9RestLabel.setVisible(false);
                r9RestComboBox.setVisible(false);
                r9SpeedLabel.setVisible(false);
                r9SpeedComboBox.setVisible(false);
                break;
                
            case 9:
                r3Label.setVisible(true);
                r3NameLabel.setVisible(true);
                r3NameTextField.setVisible(true);
                r3RestLabel.setVisible(true);
                r3RestComboBox.setVisible(true);
                r3SpeedLabel.setVisible(true);
                r3SpeedComboBox.setVisible(true);
                r4Label.setVisible(true);
                r4NameLabel.setVisible(true);
                r4NameTextField.setVisible(true);
                r4RestLabel.setVisible(true);
                r4RestComboBox.setVisible(true);
                r4SpeedLabel.setVisible(true);
                r4SpeedComboBox.setVisible(true);
                r5Label.setVisible(true);
                r5NameLabel.setVisible(true);
                r5NameTextField.setVisible(true);
                r5RestLabel.setVisible(true);
                r5RestComboBox.setVisible(true);
                r5SpeedLabel.setVisible(true);
                r5SpeedComboBox.setVisible(true);
                r6Label.setVisible(true);
                r6NameLabel.setVisible(true);
                r6NameTextField.setVisible(true);
                r6RestLabel.setVisible(true);
                r6RestComboBox.setVisible(true);
                r6SpeedLabel.setVisible(true);
                r6SpeedComboBox.setVisible(true);
                r7Label.setVisible(true);
                r7NameLabel.setVisible(true);
                r7NameTextField.setVisible(true);
                r7RestLabel.setVisible(true);
                r7RestComboBox.setVisible(true);
                r7SpeedLabel.setVisible(true);
                r7SpeedComboBox.setVisible(true);
                r8Label.setVisible(true);
                r8NameLabel.setVisible(true);
                r8NameTextField.setVisible(true);
                r8RestLabel.setVisible(true);
                r8RestComboBox.setVisible(true);
                r8SpeedLabel.setVisible(true);
                r8SpeedComboBox.setVisible(true);
                r9Label.setVisible(true);
                r9NameLabel.setVisible(true);
                r9NameTextField.setVisible(true);
                r9RestLabel.setVisible(true);
                r9RestComboBox.setVisible(true);
                r9SpeedLabel.setVisible(true);
                r9SpeedComboBox.setVisible(true);
                break;
                
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. 
     * WARNING: Do NOT modify this code. The content of this method is always 
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        r1Label = new javax.swing.JLabel();
        r1NameLabel = new javax.swing.JLabel();
        r1NameTextField = new javax.swing.JTextField();
        r1RestLabel = new javax.swing.JLabel();
        r1RestComboBox = new javax.swing.JComboBox<>();
        r1SpeedLabel = new javax.swing.JLabel();
        r1SpeedComboBox = new javax.swing.JComboBox<>();
        r2Label = new javax.swing.JLabel();
        r2NameLabel = new javax.swing.JLabel();
        r2NameTextField = new javax.swing.JTextField();
        r2RestLabel = new javax.swing.JLabel();
        r2RestComboBox = new javax.swing.JComboBox<>();
        r2SpeedLabel = new javax.swing.JLabel();
        r2SpeedComboBox = new javax.swing.JComboBox<>();
        r3Label = new javax.swing.JLabel();
        r3NameLabel = new javax.swing.JLabel();
        r3NameTextField = new javax.swing.JTextField();
        r3RestLabel = new javax.swing.JLabel();
        r3RestComboBox = new javax.swing.JComboBox<>();
        r3SpeedLabel = new javax.swing.JLabel();
        r3SpeedComboBox = new javax.swing.JComboBox<>();
        r4Label = new javax.swing.JLabel();
        r4NameLabel = new javax.swing.JLabel();
        r4NameTextField = new javax.swing.JTextField();
        r4RestLabel = new javax.swing.JLabel();
        r4RestComboBox = new javax.swing.JComboBox<>();
        r4SpeedLabel = new javax.swing.JLabel();
        r4SpeedComboBox = new javax.swing.JComboBox<>();
        r5Label = new javax.swing.JLabel();
        r5NameLabel = new javax.swing.JLabel();
        r5NameTextField = new javax.swing.JTextField();
        r5RestLabel = new javax.swing.JLabel();
        r5RestComboBox = new javax.swing.JComboBox<>();
        r5SpeedLabel = new javax.swing.JLabel();
        r5SpeedComboBox = new javax.swing.JComboBox<>();
        r6Label = new javax.swing.JLabel();
        r6NameLabel = new javax.swing.JLabel();
        r6NameTextField = new javax.swing.JTextField();
        r6RestLabel = new javax.swing.JLabel();
        r6RestComboBox = new javax.swing.JComboBox<>();
        r6SpeedLabel = new javax.swing.JLabel();
        r6SpeedComboBox = new javax.swing.JComboBox<>();
        r7Label = new javax.swing.JLabel();
        r7NameLabel = new javax.swing.JLabel();
        r7NameTextField = new javax.swing.JTextField();
        r7RestLabel = new javax.swing.JLabel();
        r7RestComboBox = new javax.swing.JComboBox<>();
        r7SpeedLabel = new javax.swing.JLabel();
        r7SpeedComboBox = new javax.swing.JComboBox<>();
        r8Label = new javax.swing.JLabel();
        r8NameLabel = new javax.swing.JLabel();
        r8NameTextField = new javax.swing.JTextField();
        r8RestLabel = new javax.swing.JLabel();
        r8RestComboBox = new javax.swing.JComboBox<>();
        r8SpeedLabel = new javax.swing.JLabel();
        r8SpeedComboBox = new javax.swing.JComboBox<>();
        r9Label = new javax.swing.JLabel();
        r9NameLabel = new javax.swing.JLabel();
        r9NameTextField = new javax.swing.JTextField();
        r9RestLabel = new javax.swing.JLabel();
        r9RestComboBox = new javax.swing.JComboBox<>();
        r9SpeedLabel = new javax.swing.JLabel();
        r9SpeedComboBox = new javax.swing.JComboBox<>();
        closeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Racer Information");

        r1Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r1Label.setText("Racer 1:");

        r1NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r1NameLabel.setText("Name:");

        r1NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r1NameTextField.setText("jTextField1");

        r1RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r1RestLabel.setText("Rest Percentage:");

        r1SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r1SpeedLabel.setText("Speed (m):");

        r2Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r2Label.setText("Racer 2:");

        r2NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r2NameLabel.setText("Name:");

        r2NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r2NameTextField.setText("jTextField1");

        r2RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r2RestLabel.setText("Rest Percentage:");

        r2SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r2SpeedLabel.setText("Speed (m):");

        r3Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r3Label.setText("Racer 3:");

        r3NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r3NameLabel.setText("Name:");

        r3NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r3NameTextField.setText("jTextField1");

        r3RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r3RestLabel.setText("Rest Percentage:");

        r3SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r3SpeedLabel.setText("Speed (m):");

        r4Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r4Label.setText("Racer 4:");

        r4NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r4NameLabel.setText("Name:");

        r4NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r4NameTextField.setText("jTextField1");

        r4RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r4RestLabel.setText("Rest Percentage:");

        r4SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r4SpeedLabel.setText("Speed (m):");

        r5Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r5Label.setText("Racer 5:");

        r5NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r5NameLabel.setText("Name:");

        r5NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r5NameTextField.setText("jTextField1");

        r5RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r5RestLabel.setText("Rest Percentage:");

        r5SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r5SpeedLabel.setText("Speed (m):");

        r6Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r6Label.setText("Racer 6:");

        r6NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r6NameLabel.setText("Name:");

        r6NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r6NameTextField.setText("jTextField1");

        r6RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r6RestLabel.setText("Rest Percentage:");

        r6SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r6SpeedLabel.setText("Speed (m):");

        r7Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r7Label.setText("Racer 7:");

        r7NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r7NameLabel.setText("Name:");

        r7NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r7NameTextField.setText("jTextField1");

        r7RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r7RestLabel.setText("Rest Percentage:");

        r7SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r7SpeedLabel.setText("Speed (m):");

        r8Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r8Label.setText("Racer 8:");

        r8NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r8NameLabel.setText("Name:");

        r8NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r8NameTextField.setText("jTextField1");

        r8RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r8RestLabel.setText("Rest Percentage:");

        r8SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r8SpeedLabel.setText("Speed (m):");

        r9Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        r9Label.setText("Racer 9:");

        r9NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r9NameLabel.setText("Name:");

        r9NameTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r9NameTextField.setText("jTextField1");

        r9RestLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r9RestLabel.setText("Rest Percentage:");

        r9SpeedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        r9SpeedLabel.setText("Speed (m):");

        closeButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                closeButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        updateButton.setText("Update Data");
        updateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1Label)
                    .addComponent(r5Label)
                    .addComponent(r4Label)
                    .addComponent(r3Label)
                    .addComponent(r9Label)
                    .addComponent(r8Label)
                    .addComponent(r7Label)
                    .addComponent(r2Label)
                    .addComponent(r6Label)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r1NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r1RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r2NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r2RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r3NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r3RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r4NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r4RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r5NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r5RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r6NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r6NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r6RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r6RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r7NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r7NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r7RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r7RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r8NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r8NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r8RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r8RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r9NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r9NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(r9RestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r9RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r6SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r6SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r1SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r7SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r7SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r2SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r8SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r8SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r3SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r9SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r9SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r4SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r5SpeedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(r1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1NameLabel)
                    .addComponent(r1NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1RestLabel)
                    .addComponent(r1RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1SpeedLabel)
                    .addComponent(r1SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2NameLabel)
                    .addComponent(r2NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2RestLabel)
                    .addComponent(r2RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2SpeedLabel)
                    .addComponent(r2SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3NameLabel)
                    .addComponent(r3NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3RestLabel)
                    .addComponent(r3RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3SpeedLabel)
                    .addComponent(r3SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r4Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4NameLabel)
                    .addComponent(r4NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4RestLabel)
                    .addComponent(r4RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4SpeedLabel)
                    .addComponent(r4SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r5Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r5NameLabel)
                    .addComponent(r5NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5RestLabel)
                    .addComponent(r5RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5SpeedLabel)
                    .addComponent(r5SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r6Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6NameLabel)
                    .addComponent(r6NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6RestLabel)
                    .addComponent(r6RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6SpeedLabel)
                    .addComponent(r6SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r7Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7NameLabel)
                    .addComponent(r7NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7RestLabel)
                    .addComponent(r7RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7SpeedLabel)
                    .addComponent(r7SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r8Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r8NameLabel)
                    .addComponent(r8NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8RestLabel)
                    .addComponent(r8RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8SpeedLabel)
                    .addComponent(r8SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r9Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9NameLabel)
                    .addComponent(r9NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9RestLabel)
                    .addComponent(r9RestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9SpeedLabel)
                    .addComponent(r9SpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(updateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Event handlers */
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeButtonActionPerformed
    {//GEN-HEADEREND:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateButtonActionPerformed
    {//GEN-HEADEREND:event_updateButtonActionPerformed
        //Change ThreadRunner instance attributes based on changes to widgets
        racers.set(0, new ThreadRunner(r1NameTextField.getText(), 
            Integer.parseInt((String) r1RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r1SpeedComboBox.getSelectedItem())));
        racers.set(1, new ThreadRunner(r2NameTextField.getText(),
            Integer.parseInt((String) r2RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r2SpeedComboBox.getSelectedItem())));
        racers.set(2, new ThreadRunner(r3NameTextField.getText(),
            Integer.parseInt((String) r3RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r3SpeedComboBox.getSelectedItem())));
        racers.set(3, new ThreadRunner(r4NameTextField.getText(),
            Integer.parseInt((String) r4RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r4SpeedComboBox.getSelectedItem())));
        racers.set(4, new ThreadRunner(r5NameTextField.getText(),
            Integer.parseInt((String) r5RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r5SpeedComboBox.getSelectedItem())));
        racers.set(5, new ThreadRunner(r6NameTextField.getText(),
            Integer.parseInt((String) r6RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r6SpeedComboBox.getSelectedItem())));
        racers.set(6, new ThreadRunner(r7NameTextField.getText(),
            Integer.parseInt((String) r7RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r7SpeedComboBox.getSelectedItem())));
        racers.set(7, new ThreadRunner(r8NameTextField.getText(),
            Integer.parseInt((String) r8RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r8SpeedComboBox.getSelectedItem())));
        racers.set(8, new ThreadRunner(r9NameTextField.getText(),
            Integer.parseInt((String) r9RestComboBox.getSelectedItem()), 
            Integer.parseInt((String) r9SpeedComboBox.getSelectedItem())));      
    }//GEN-LAST:event_updateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EditRacersDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() ->
        {
            EditRacersDialog dialog = new EditRacersDialog(
                new javax.swing.JFrame(), true, sRacers, sNumRacers);
            dialog.addWindowListener(new java.awt.event.WindowAdapter()
            {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e)
                {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    
    //Public method that updates value of ThreadRaceFrame.racers
    public ArrayList<ThreadRunner> getModifiedList()
    {
        return racers;
    }
    
    //Private method that populates ComboBoxes
    private void setComboBoxes(javax.swing.JComboBox<String> rest, 
        javax.swing.JComboBox<String> speed)
    {
        for (int i = 0; i < 101; i++)
            rest.addItem(Integer.toString(i));
        
        for (int i = 1; i < 251; i++)
            speed.addItem(Integer.toString(i));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel r1Label;
    private javax.swing.JLabel r1NameLabel;
    private javax.swing.JTextField r1NameTextField;
    private javax.swing.JComboBox<String> r1RestComboBox;
    private javax.swing.JLabel r1RestLabel;
    private javax.swing.JComboBox<String> r1SpeedComboBox;
    private javax.swing.JLabel r1SpeedLabel;
    private javax.swing.JLabel r2Label;
    private javax.swing.JLabel r2NameLabel;
    private javax.swing.JTextField r2NameTextField;
    private javax.swing.JComboBox<String> r2RestComboBox;
    private javax.swing.JLabel r2RestLabel;
    private javax.swing.JComboBox<String> r2SpeedComboBox;
    private javax.swing.JLabel r2SpeedLabel;
    private javax.swing.JLabel r3Label;
    private javax.swing.JLabel r3NameLabel;
    private javax.swing.JTextField r3NameTextField;
    private javax.swing.JComboBox<String> r3RestComboBox;
    private javax.swing.JLabel r3RestLabel;
    private javax.swing.JComboBox<String> r3SpeedComboBox;
    private javax.swing.JLabel r3SpeedLabel;
    private javax.swing.JLabel r4Label;
    private javax.swing.JLabel r4NameLabel;
    private javax.swing.JTextField r4NameTextField;
    private javax.swing.JComboBox<String> r4RestComboBox;
    private javax.swing.JLabel r4RestLabel;
    private javax.swing.JComboBox<String> r4SpeedComboBox;
    private javax.swing.JLabel r4SpeedLabel;
    private javax.swing.JLabel r5Label;
    private javax.swing.JLabel r5NameLabel;
    private javax.swing.JTextField r5NameTextField;
    private javax.swing.JComboBox<String> r5RestComboBox;
    private javax.swing.JLabel r5RestLabel;
    private javax.swing.JComboBox<String> r5SpeedComboBox;
    private javax.swing.JLabel r5SpeedLabel;
    private javax.swing.JLabel r6Label;
    private javax.swing.JLabel r6NameLabel;
    private javax.swing.JTextField r6NameTextField;
    private javax.swing.JComboBox<String> r6RestComboBox;
    private javax.swing.JLabel r6RestLabel;
    private javax.swing.JComboBox<String> r6SpeedComboBox;
    private javax.swing.JLabel r6SpeedLabel;
    private javax.swing.JLabel r7Label;
    private javax.swing.JLabel r7NameLabel;
    private javax.swing.JTextField r7NameTextField;
    private javax.swing.JComboBox<String> r7RestComboBox;
    private javax.swing.JLabel r7RestLabel;
    private javax.swing.JComboBox<String> r7SpeedComboBox;
    private javax.swing.JLabel r7SpeedLabel;
    private javax.swing.JLabel r8Label;
    private javax.swing.JLabel r8NameLabel;
    private javax.swing.JTextField r8NameTextField;
    private javax.swing.JComboBox<String> r8RestComboBox;
    private javax.swing.JLabel r8RestLabel;
    private javax.swing.JComboBox<String> r8SpeedComboBox;
    private javax.swing.JLabel r8SpeedLabel;
    private javax.swing.JLabel r9Label;
    private javax.swing.JLabel r9NameLabel;
    private javax.swing.JTextField r9NameTextField;
    private javax.swing.JComboBox<String> r9RestComboBox;
    private javax.swing.JLabel r9RestLabel;
    private javax.swing.JComboBox<String> r9SpeedComboBox;
    private javax.swing.JLabel r9SpeedLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}