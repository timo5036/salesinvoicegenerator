
package first_Project;


import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import Display.HeaderDisplay;
import Display.ItemDisplay;
import model.SalesInvoiceHeader;
import model.InvoiceHeaderTable;
import model.InvoiceItems;
import model.InvoiceItemsTable;
import java.awt.HeadlessException;


public class SalesInvoiceFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {
    public Invoice() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        SalesInvoiceTable = new javax.swing.JTable();
        SalesInvoiceTable.getSelectionModel().addListSelectionListener(this);
        CreateInvoiceButton = new javax.swing.JButton();
        CreateInvoiceButton.addActionListener(this);
        DeleteButton = new javax.swing.JButton();
        DeleteButton.addActionListener(this);
        InvoiceNum = new javax.swing.JLabel();
        InvoiceDate = new javax.swing.JLabel();
        CustomerName = new javax.swing.JLabel();
        InvoiceTotal = new javax.swing.JLabel();
        InvoiceDateTextfield = new javax.swing.JTextField();
        CustomerNameTextfield = new javax.swing.JTextField();
        InvoiceNumberLabel = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceItemTable = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        SaveButton.addActionListener(this);
        CancelButton = new javax.swing.JButton();
        CancelButton.addActionListener(this);
        FileMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadMenuItem = new javax.swing.JMenuItem();
        LoadMenuItem.addActionListener(this);
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        SalesInvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "       No.", "      Date", "      Customer ", "      Total"
            }
        ));
        SalesInvoiceTable.setToolTipText("");
        SalesInvoiceTable.setCellSelectionEnabled(true);
        SalesInvoiceTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalesInvoiceTable.setGridColor(new java.awt.Color(0, 0, 0));
        SalesInvoiceTable.setShowGrid(true);
        jScrollPane1.setViewportView(SalesInvoiceTable);

        CreateInvoiceButton.setText("Create New Invoice ");
        CreateInvoiceButton.setActionCommand("CreatenewInvoice ");
        CreateInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateInvoiceButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete Invoice");
        DeleteButton.setActionCommand("DeleteInvoice");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        InvoiceNum.setText("Invoice Number");

        InvoiceDate.setText("Invoice Date");

        CustomerName.setText("Customer Name");

        InvoiceTotal.setText("Invoice Total");

        InvoiceItemTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        InvoiceItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "  NO.", "  Item Name", "  Item Price", "  Item Count", "  Item Total"
            }
        ));
        InvoiceItemTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(InvoiceItemTable);

        SaveButton.setText("Save Item");
        SaveButton.setActionCommand("Saveitem");

        CancelButton.setText("Cancel Item");
        CancelButton.setActionCommand("Cancelitem");

        jMenu1.setText("File");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        LoadMenuItem.setText("Load File");
        LoadMenuItem.setActionCommand("LoadFile");
        jMenu1.add(LoadMenuItem);

        SaveMenuItem.setText("Save File");
        SaveMenuItem.setActionCommand("SaveFile");
        jMenu1.add(SaveMenuItem);

        FileMenuBar.add(jMenu1);

        setJMenuBar(FileMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateInvoiceButton)
                        .addGap(28, 28, 28)
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(SaveButton)
                        .addGap(50, 50, 50)
                        .addComponent(CancelButton)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustomerName)
                                    .addComponent(InvoiceDate)
                                    .addComponent(InvoiceNum)
                                    .addComponent(InvoiceTotal))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(InvoiceDateTextfield)
                                            .addComponent(CustomerNameTextfield)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(InvoiceTotalLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(InvoiceNumberLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(InvoiceNum))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(InvoiceNumberLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceDateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceTotal)
                            .addComponent(InvoiceTotalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton)
                    .addComponent(DeleteButton)
                    .addComponent(CreateInvoiceButton))
                .addGap(19, 19, 19))
        );

        pack();
    }

    private void CreateInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {
       
    }

 
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

   
        java.awt.EventQueue.invokeLater(() -> {
            new SalesInvoiceFrame().setVisible(true);
        });
    }

 
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CreateInvoiceButton;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JTextField CustomerNameTextfield;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JMenuBar FileMenuBar;
    private javax.swing.JLabel InvoiceDate;
    private javax.swing.JTextField InvoiceDateTextfield;
    private javax.swing.JTable InvoiceItemTable;
    private javax.swing.JLabel InvoiceNum;
    private javax.swing.JLabel InvoiceNumberLabel;
    private javax.swing.JLabel InvoiceTotal;
    private javax.swing.JLabel InvoiceTotalLabel;
    private javax.swing.JMenuItem LoadMenuItem;
    private javax.swing.JTable SalesInvoiceTable;
    private javax.swing.JButton SaveButton;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    

 
    private final List<SalesInvoiceHeader> salesinvoicesMenu = new ArrayList<>();
    private InvoiceHeaderTable HeaderTable;
    private InvoiceItemsTable  ItemsTable;
    private HeaderDisplay headerDisplay;
    private ItemDisplay itemDisplay;
    private final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");    
    


        
            
    private void InvoicesRunScreen() {
        
         for (SalesInvoiceHeader header : salesinvoicesMenu) {
              System.out.println(header);
         }
         System.out.println("************************************************************************");
    }
    
  
    

    
    public void actionPerformed(ActionEvent e) {  

       switch (e.getActionCommand()) {
       
        
        case "SaveFile" -> {                 
           
            SaveFile();
            }   
            
        case "LoadFile" ->                 
           {
               try {
                   LoadFile() ;
                   
               } catch (IOException | ParseException ex) {
                   Logger.getLogger(SalesInvoiceFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           
        case "CreatenewInvoice " -> {       
           
         CreateNewInvoice();
        
        }
            
        case "DeleteInvoice" -> {         
            
            DeleteChoosenInvoice();
           
        }
            
   
        
        
        case "Saveitem" -> {             
            
             SaveChoosenItem();
            
         }
        case "Cancelitem" -> {        
           
            CancelChoosenItem();
            
         }
        
    
        
         
         case "InvoiceCancel" -> InvoiceCancelFrame();    
         case "InvoiceOK" -> InvoiceOKFrame();            
        
    
         
         
         case "ItemCancel" -> ItemCancelFrame();       
         case "ItemOK"-> ItemOKFrame();               
         
    }
}

   
   
  
    private void SaveFile() {
        
      String invoices = "";
      String items = "";
      for (SalesInvoiceHeader header :salesinvoicesMenu) {
          invoices += header.getFILESASCSV();
          invoices += "\n";         
          for (InvoiceItems item : header.getItems()) {
              items += item.getFILESASCSV();
              items += "\n";
          }
      }
       JOptionPane.showMessageDialog(this, " insert the file to save Invoices Data  : ", "Invoice Header", JOptionPane.WARNING_MESSAGE); // TO Save Invoices FILE
       JFileChooser fileChooser = new JFileChooser();
       int result = fileChooser.showSaveDialog(this);
          if (result == JFileChooser.APPROVE_OPTION) {
               File headerFile = fileChooser.getSelectedFile();  
               try {
                   FileWriter hFW;  
                    hFW = new FileWriter(headerFile);
                    hFW.write(invoices);
                    hFW.flush();
                    hFW.close();
          
            System.out.println(" Bravo you saved invoices CSV file");             
                    
        JOptionPane.showMessageDialog(this, " insert the file to save Items Data  : ", "Invoice Items", JOptionPane.WARNING_MESSAGE);         
             result = fileChooser.showSaveDialog(this);   
             if (result == JFileChooser.APPROVE_OPTION) { 
                 
                 File itemsFile = fileChooser.getSelectedFile();    
                 FileWriter lFW = new FileWriter(itemsFile);
                    lFW.write(items);
                    lFW.flush();
                    lFW.close();
                    } 
            
             System.out.println("################################################");
            
             System.out.println(" Bravo you saved items CSV file");               
             
            }catch (HeadlessException | IOException | NumberFormatException  ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Folder/File path is not found", JOptionPane.ERROR_MESSAGE); 
          }
     }
    } 
    
    
    
    private void LoadFile() throws FileNotFoundException, IOException, ParseException {
          JOptionPane.showMessageDialog(this, " select the invoice header file please  : ", "Invoice Header", JOptionPane.WARNING_MESSAGE);
          JFileChooser openFile = new JFileChooser();
        int result = openFile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = openFile.getSelectedFile();
             try {
                FileReader headerFr = new FileReader(headerFile);          
                BufferedReader headerBr = new BufferedReader(headerFr);
                String headerItem = null;

                while ((headerItem = headerBr.readLine()) != null) {
                    String[] headerSegments = headerItem.split(",");   
                    String invoiceNumberStr = headerSegments[0];       
                    String invoiceDateStr = headerSegments[1];       
                    String customerName = headerSegments[2];         
                    
                    int invoiceNumber = Integer.parseInt(invoiceNumberStr);  
                    Date invoiceDate = df.parse(invoiceDateStr);           
                    
                    SalesInvoiceHeader inv = new SalesInvoiceHeader(invoiceNumber, invoiceDate, customerName);
                    salesinvoicesMenu.add(inv);
                }
                   
                headerBr.close();
                headerFr.close();
                System.out.println("check");
                
                
                JOptionPane.showMessageDialog(this, "Please select from items : ", "Invoice Items", JOptionPane.WARNING_MESSAGE);
                result = openFile.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File itemsFile = openFile.getSelectedFile();
                    BufferedReader itemsBr;
                    try (FileReader itemsFr = new FileReader(itemsFile)) {
                        itemsBr = new BufferedReader(itemsFr);
                        String itemsItem;
                        itemsItem = null;
                        while ((itemsItem = itemsBr.readLine()) != null) {
                            String[] itemParts = itemsItem.split(",");   
                            String invoiceNumberStr = itemParts[0];      
                            String itemName = itemParts[1];              
                            String itemPriceStr = itemParts[2];         
                            String itemCountStr = itemParts[3];        
                            
                            int invoiceNumber = Integer.parseInt(invoiceNumberStr);   
                            double itemPrice = Double.parseDouble(itemPriceStr);     
                            int itemCount = Integer.parseInt(itemCountStr);         
                            
                            SalesInvoiceHeader header = findInvoiceByNum(invoiceNumber);
                            InvoiceItems invItem = new InvoiceItems(itemName, itemPrice, itemCount, header);
                            header.getItems().add(invItem);
                        }
                    }
                    itemsBr.close();
                    
                    HeaderTable = new InvoiceHeaderTable(salesinvoicesMenu);
                    SalesInvoiceTable.setModel(HeaderTable);
                    SalesInvoiceTable.validate();
                }
                
               System.out.println("Check");
               
        }catch (HeadlessException | IOException | NumberFormatException | ParseException ex) {
         JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "File not found", JOptionPane.ERROR_MESSAGE); // Handling
        
        }
    }
        
        InvoicesRunScreen();            
 }
   

   
    
   
    public void valueChanged(ListSelectionEvent e) {
       
        System.out.println(" you choosed Invoice !");
        SalesInvoiceTableRowSelected();  
        
    }
    
       private void SalesInvoiceTableRowSelected() {
        
     int selectedRowIndex = SalesInvoiceTable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            SalesInvoiceHeader row = HeaderTable.getSalesinvoicesMenu().get(selectedRowIndex);  
            CustomerNameTextfield.setText(row.getCustomerName());
            InvoiceDateTextfield.setText(df.format(row.getInvoiceDate()));
            InvoiceNumberLabel.setText("" + row.getInvoiceNumber());
            InvoiceTotalLabel.setText("" + row.getInvoiceTotal());
            ArrayList<InvoiceItems> items = row.getItems();
            ItemsTable = new InvoiceItemsTable(items);
            InvoiceItemTable.setModel(ItemsTable);
            ItemsTable.fireTableDataChanged();     
    }

    
}
  
       
    private SalesInvoiceHeader findInvoiceByNum(int InvoiceNumber) {
        SalesInvoiceHeader header = null;
        for (SalesInvoiceHeader invoice : salesinvoicesMenu) {
            if (InvoiceNumber == invoice.getInvoiceNumber()) {
                header = invoice;
                break;
            }
        }
        return header;
        
    }


  
    
    private void InvoiceCancelFrame() {
        headerDisplay.setVisible(false);
        headerDisplay.dispose();
        headerDisplay = null;           
    }  

    
    private void InvoiceOKFrame() {
       
        String invoiceDateStr = headerDisplay.getInvoiceDateField().getText();
        String customerName= headerDisplay.getCustomerNameField().getText(); 
        headerDisplay.setVisible(false);
        headerDisplay.dispose();
        headerDisplay = null;
        try {
            Date invoiceDate;
            invoiceDate = df.parse(invoiceDateStr);
            int invoiceNumber = getNextInvoiceNumber();
            SalesInvoiceHeader sales = new SalesInvoiceHeader(invoiceNumber, invoiceDate, customerName);
            salesinvoicesMenu.add(sales);
            HeaderTable.fireTableDataChanged();                            
        
        
        } catch (ParseException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Wrong date format", JOptionPane.ERROR_MESSAGE); // Handling
        
        }
        
        InvoicesRunScreen();
    
   }
     
  
    
    private int getNextInvoiceNumber() {
        int high = 0;
        for (SalesInvoiceHeader header : salesinvoicesMenu) {
            if (header.getInvoiceNumber() > high) {
                high = header.getInvoiceNumber();
            }
        }
        return high + 1;
    }

  
    
    private void ItemOKFrame() {
        String itemName = itemDisplay.getItemNameField().getText();
        String itemCountStr = itemDisplay.getItemCountField().getText();
        String itemPriceStr = itemDisplay.getItemPriceField().getText();
        itemDisplay.setVisible(false);
        itemDisplay.dispose();
        itemDisplay = null;
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        int headerIndex = SalesInvoiceTable.getSelectedRow();
        SalesInvoiceHeader invoice = HeaderTable.getSalesinvoicesMenu().get(headerIndex);
        
        InvoiceItems invoiceitem = new InvoiceItems(itemName, itemPrice, itemCount, invoice);
        invoice.addInvItems(invoiceitem);
       
        ItemsTable.fireTableDataChanged();
        HeaderTable.fireTableDataChanged();
        InvoiceTotalLabel.setText(""+invoice.getInvoiceTotal());
       
        InvoicesRunScreen();
    }

    private void ItemCancelFrame() {
       itemDisplay.setVisible(false);
        itemDisplay.dispose();
        itemDisplay = null;
    }
    
 
    
    private void SaveChoosenItem() {
      
        itemDisplay = new ItemDisplay(this);
        itemDisplay.setVisible(true);
        
    }

    
     private void CancelChoosenItem() {
        int itemSelected = InvoiceItemTable.getSelectedRow();
        InvoiceItems item = ItemsTable.getItemsList().get(itemSelected);
        ItemsTable.getItemsList().remove(itemSelected);
        ItemsTable.fireTableDataChanged();
        HeaderTable.fireTableDataChanged();
        InvoiceTotalLabel.setText(""+item.getHeader().getInvoiceTotal());
    
           InvoicesRunScreen();
    }

     
       
    private void CreateNewInvoice() {       
        headerDisplay = new  HeaderDisplay(this);
        headerDisplay.setVisible(true);
    }
     

    
    private void DeleteChoosenInvoice() {
     int invoiceSelected = SalesInvoiceTable.getSelectedRow();
      SalesInvoiceHeader header = HeaderTable.getSalesinvoicesMenu().get(invoiceSelected);
      HeaderTable.getSalesinvoicesMenu().remove(invoiceSelected);
      HeaderTable.fireTableDataChanged(); 
        
      ItemsTable = new InvoiceItemsTable(new ArrayList<InvoiceItems>());
      InvoiceItemTable.setModel(ItemsTable);
      ItemsTable.fireTableDataChanged(); 
      
      
            CustomerNameTextfield.setText("");
            InvoiceDateTextfield.setText("");
            InvoiceNumberLabel.setText("");
            InvoiceTotalLabel.setText("");
      
            InvoicesRunScreen();
    }

    
    
          @dell
}

