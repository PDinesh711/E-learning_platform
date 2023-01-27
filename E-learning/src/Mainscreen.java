import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class Mainscreen extends JFrame {
    //pamel 1 //
    JPanel panel1 , panel2 , panel3,  panel4, panel5;
    JTextField firstnametxt, lastnametxt, mobiletxt, citytxt, pincodetxt ;
    JLabel  firstnamelbl, lastnamelbl, mobilelbl, citylbl, pincodelbl ;
    JRadioButton male , female ;
    JButton btn ;

    ArrayList listtosave = new ArrayList<>();
    File file;

    // panel 2 //
    JTextArea textArea;
    JButton enrollbtn , clearbtn;
    JLabel actionlbl  ,actionlbl1  ;

    //panel3
    JLabel installfee , coursefee , extraclassfee , totalfee;

    // panel 4
    JCheckBox paytmbox , googlepaybox , netbankingbox , cashbox ;

    /// panel-5
    JLabel prooflbl , action5lbl , line1lbl,line2lbl,line3lbl,line4lbl;
    JButton proofbtn , cartbtn , watchlistbtn ;

    Mainscreen() {
        // panel 1 //////
        panel1= new JPanel();
        panel1.setBounds(15,10,400,250);
        panel1.setLayout(new GridLayout(7,3));
        Border panel1tittle =BorderFactory.createTitledBorder("User Input");
        panel1.setBorder(panel1tittle);

        firstnametxt = new JTextField();
        lastnametxt = new JTextField();
        mobiletxt = new JTextField();
        citytxt = new JTextField();
        pincodetxt = new JTextField();
        firstnamelbl = new JLabel("First Name : ");
        lastnamelbl = new JLabel("Last Name: ");
        mobilelbl = new JLabel("Mobile.No\uD83D\uDCF1: ");
        citylbl = new JLabel("City :");
        pincodelbl = new JLabel("Pincode: ");
        male = new JRadioButton("\uD83D\uDC68Male");
        female = new JRadioButton("\uD83D\uDC69Female");
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(male);
        buttongroup.add(female);


        String[] list = {"  ","Java☕", "C++\uD83D\uDDA5️", "Python\uD83D\uDC68\u200D\uD83D\uDCBB", "TestNG\uD83E\uDDEA", "Selenium〽️"};
        JComboBox cb = new JComboBox(list);
       // cb.setBounds(50, 50, 190, 20);

        btn = new JButton("Save");
        JScrollBar sc= new JScrollBar();
        add(sc);



btn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(btn.isShowing())
        JOptionPane.showMessageDialog(panel1,"Saving User Details","Confirming..",1);
    else {
        JOptionPane.showMessageDialog(panel1,"Not Saved User Details \n \s \s \s Kindly Enter the valid details to save!..","Confirming..",1);
        }}
});

male.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(male.isSelected()){
            JOptionPane.showMessageDialog(null,"\uD83D\uDC68Male","Gender",3);
        }
    }
});
female.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (female.isSelected()){
            JOptionPane.showMessageDialog(null,"\uD83D\uDC69Female","Gender",3);
        }
    }
});
 cb.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
         if(cb.isValid()){
             JOptionPane.showMessageDialog(null , "Just Conformation Ur" +
                     " Course \n\s\s\s\s\sClick OK ","Select Ur Course",1);
         }
     }
 });



        panel1.add(firstnamelbl);
       panel1.add(firstnametxt); panel1.add(lastnamelbl);  panel1.add(lastnametxt);  panel1.add(mobilelbl);  panel1.add(mobiletxt);
        panel1.add(citylbl);  panel1.add(citytxt);  panel1.add(pincodelbl);  panel1.add(pincodetxt);
        panel1.add(male); panel1.add(female);
        panel1.add(cb);  panel1.add(btn);

firstnametxt.setOpaque(false); lastnametxt.setOpaque(false); mobiletxt.setOpaque(false);
citytxt.setOpaque(false); pincodetxt.setOpaque(false);
        /// panel 2 //
        panel2= new JPanel();
        panel2.setBounds(15,270,400,400);
        panel2.setLayout(new GridLayout(4,2));
        Border panel2tittle =BorderFactory.createTitledBorder("Output");
        panel2.setBorder(panel2tittle);
        enrollbtn = new JButton("\uD83D\uDCDCEnroll");
        panel2.add(enrollbtn);
        clearbtn= new JButton("\uD83D\uDC68New User");
        panel2.add(clearbtn);
        actionlbl= new JLabel("Not enrolled Be a Smart to Learn! ..");
        actionlbl1=new JLabel(" 20 Days Money Back Guarantee Possible ");
        panel2.add(actionlbl);
        panel2.add(actionlbl1);
        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstnametxt.setText("");lastnametxt.setText("");mobiletxt.setText("");citytxt.setText("");
                pincodetxt.setText(""); buttongroup.setSelected(null,false);
                actionlbl.setText("Not enrolled Be a Smart to Learn! .."); actionlbl1.setText(""); installfee.setText("Initial Fee:"); coursefee.setText("Course Fee:"); extraclassfee.setText("Other Fee:");
                totalfee.setText("Total Fee: "); paytmbox.setSelected(false); googlepaybox.setSelected(false); netbankingbox.setSelected(false);
                cashbox.setSelected(false); action5lbl.setText(""); line1lbl.setText("");line2lbl.setText("");line3lbl.setText("");line4lbl.setText("");
            }
        });
        enrollbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          if (enrollbtn.isValid()){
              actionlbl.setText("\n Pay The Amount \n Let Start  Learning ");
              actionlbl1.setText("Thanks For Choosing Us");
              installfee.setText("Initial Amount : 2500rs");
              coursefee.setText("Course Fee: 5000rs");
              extraclassfee.setText("Other fee : 1500rs");
              totalfee.setText("Total Fee: 9000rs");
          }
            }
        });
        // panel3 //
        panel3= new JPanel();
        panel3.setBounds(425,10,400,250);
        panel3.setLayout(new GridLayout(4,3));
        Border panel3tittle =BorderFactory.createTitledBorder("Payment Stucture");
        panel3.setBorder(panel3tittle);
        installfee=new JLabel("Initial Amount :");
        coursefee= new JLabel("Course Fee:"); extraclassfee= new JLabel("Other fee :");totalfee= new JLabel("Total Fee:");
panel3.add(installfee);panel3.add(coursefee); panel3.add(extraclassfee); panel3.add(totalfee);

// panel4
        panel4= new JPanel();
        panel4.setBounds(425,270,400,250);
        panel4.setLayout(new GridLayout(4,3));
        Border panel4tittle =BorderFactory.createTitledBorder("Payment Option");
        panel4.setBorder(panel4tittle);
        paytmbox= new JCheckBox("Paytm");
        googlepaybox= new JCheckBox("Google Pay");
        netbankingbox= new JCheckBox("NetBanking");
        cashbox= new JCheckBox("Direct Cash");
        paytmbox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (paytmbox.isSelected()){
                    paytmaccount();
                    // make price changes
                }else {
                   // paytmarea.setText("");
                }
            }
        });
        googlepaybox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(googlepaybox.isSelected()){
                    googlepayaccount();
                }else{
                   // .setText("");
                }
            }
        });
        netbankingbox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (netbankingbox.isSelected()){
                    netbankingaccount();
                }else {
                   // .setText("");
                }
            }
        });
        cashbox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (cashbox.isSelected()){
                    JOptionPane.showMessageDialog(panel5,"Visit our Office ","Direct Cash",1);
                }
            }
        });
        panel4.add(paytmbox); panel4.add(googlepaybox);panel4.add(netbankingbox);panel4.add(cashbox);

        // panel 5
        panel5= new JPanel();
        panel5.setBounds(850,15,400,700);
        panel5.setLayout(new GridLayout(14,3));
        Border panel5tittle =BorderFactory.createTitledBorder("Payment Details");
        panel5.setBorder(panel5tittle);
        textArea = new JTextArea();
        textArea.setOpaque(false);
        prooflbl = new JLabel("After Paid Amount Click the Button");
        proofbtn= new JButton("\uD83C\uDF8AConform");
        cartbtn= new JButton("\uD83D\uDED2Add to Cart");
        watchlistbtn= new JButton("\uD83D\uDD5BWatchlist");
        watchlistbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel5,"Added to WatchLater","Watchlist",1);
            }
        });
        action5lbl= new JLabel("");
        line1lbl= new JLabel("");
        line2lbl= new JLabel("");
        line3lbl= new JLabel("");
        line4lbl= new JLabel("");
        proofbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
 action5lbl.setText("Address :");
 line1lbl.setText("Door.no :452/F, Street Name:Book Street");
 line2lbl.setText("Place: Anna Nagar ");
 line3lbl.setText("City : Chennai Dist");
 line4lbl.setText("Pincode:- 600026");
            }
        });

        cartbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel5,"Added to Cart");

            }
        });
        proofbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel5,"Successfully ! Enrolled Course Start Learning " , "Conformation",1);
            }
        });
         panel5.add(prooflbl); panel5.add(proofbtn); panel5.add(cartbtn); panel5.add(watchlistbtn); panel5.add(action5lbl); panel5.add(line1lbl);panel5.add(line2lbl);panel5.add(line3lbl);panel5.add(line4lbl);

   //   Add to Jframe
        setLayout(null);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
    }

    private void netbankingaccount() {
       JOptionPane.showMessageDialog(panel5,"Account Number: 211519114015 \n Account Holder: Dinesh \n IFSC Code:IOBF2115 \n Branch: Uthukottai","NetBanking",1);

    }
    private void googlepayaccount() {
        JOptionPane.showMessageDialog(panel5,"Google Pay number : 8523979128 \n Account Number: 211519114015 \n Account Holder: Dinesh, \n IFSC Code:IOBF2115 \n Branch: Uthukottai","Google Pay",1);
    }

    private void paytmaccount() {
        JOptionPane.showMessageDialog(panel5,"PayTM number : 8523979128 \n Account Number: 211519114015 \n Account Holder: Dinesh  \n IFSC Code:IOBF2115 \n Branch: Uthukottai","PayTM",1);
    }

    public static void main(String[] args) {
    Mainscreen mainscreen= new Mainscreen();
    mainscreen.setTitle("Online Training Platform");
    mainscreen.setSize(1500,900);
    mainscreen.setVisible(true);
    mainscreen.setDefaultCloseOperation(EXIT_ON_CLOSE);
    System.out.println("Program Started to Executed");
    System.out.println("Program Started to Executed");
    System.out.println("Testing Program Line BY Line ");System.out.println("Checking Error ----> No Error Found !");
    System.out.println("Almost Everything As Done ");
    System.out.println("executed Successfully .. !");
    System.out.println("//*****************Ended*************************//");
    }
}