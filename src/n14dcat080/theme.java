package n14dcat080;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class theme extends javax.swing.JFrame {

    
    private static String AddrFile = "";
    private static String Tenfile = "";
    private final XuLy s = new XuLy();
    private Object message;
    public theme() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jb1 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jt = new javax.swing.JTextField();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        jp1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Link");

        jb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb1.setText("<Chưa có hình được chọn>");

        button1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button1.setText("Open");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tin nhắn mật");

        Button2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button2.setText("Mã hóa");
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button2MouseClicked(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button3.setText("Giải mã");
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button3MouseClicked(evt);
            }
        });

        jp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jp1.setText("Hình được chọn");
        jp1.setToolTipText("");
        jp1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button3)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button1)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button2)
                    .addComponent(Button3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setDialogTitle("Chọn ảnh cần Mã Hóa/Giải mã");
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setAcceptAllFileFilterUsed(false);
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        
        fc.setFileFilter(imageFilter);
        //In response to a button click:
        
        fc.addChoosableFileFilter(imageFilter);
        int returnVal = fc.showOpenDialog(this);
        
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            AddrFile = fc.getSelectedFile().getAbsolutePath();
            if(!fc.getSelectedFile().isFile()) {
                showMessage("Chưa có hình được chọn", "Warning");
                return;
            }
            Tenfile = AddrFile.substring(AddrFile.lastIndexOf('\\') + 1);
            jb1.setText(Tenfile);
            try {
                BufferedImage buffImage = ImageIO.read(new File(AddrFile));
                if(buffImage.getWidth() > 300)
                {
                    buffImage = resize(buffImage, 300, buffImage.getHeight()*200/buffImage.getWidth());
                }
                jp1.setIcon(new ImageIcon(buffImage));
                jp1.setText("");
                jp1.updateUI();
            }
            catch(IOException e) {
                showMessage(e.getMessage(), "ERROR!!!");
            }
            
        }
    }//GEN-LAST:event_button1MouseClicked

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseClicked
        // TODO add your handling code here:
        if(AddrFile.equals("")) {
    		showMessage("Chưa có hình được chọn", "Warning!!!");
    		return;
    	}
    	//Get secret string that input by user and checking if it's empty
        String secret = jt.getText().trim();
        if(secret.equals("")) {
            message = "Vui lòng nhập tin mật ";
        	showMessage((String) message, "Warning");
        	return;
        }
        //Determine the maximum characters for hiding base on image width & height
        try {
        	BufferedImage bi = ImageIO.read(new File(AddrFile));
        	int maxChars = getMaxHiddenChars(bi.getWidth(), bi.getHeight());
        	if(secret.length() > maxChars) {
                        message = "Ký tự tối đa " + maxChars;
        		showMessage((String) message, "Warning!!!");
        		return;
        	}
        	
        }
        catch(IOException ioe) {
        	showMessage(ioe.getMessage(), "Error");
        }
        //Select file to save
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chỉ ra file cần lưu");   
         
        int userSelection = fileChooser.showSaveDialog(this);
        String destFilePath = "";
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            destFilePath = fileToSave.getAbsolutePath();
        }
        //Using Encode method to hide secret into image
        if(s.Encode(AddrFile, secret, destFilePath)) {
        	jt.setText("");
                message ="Tin mật được giấu thành công";
        	showMessage((String) message, "Tin nhắn mật");
        }
    }//GEN-LAST:event_Button2MouseClicked

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked
        // TODO add your handling code here:
        jt.setText("");
        if(AddrFile.equals("")) {
            message = "Chưa có hình được chọn";
            showMessage((String) message, "Warning!!!");
            return;
        }

        String secret = s.Decode(AddrFile);
        jt.setText(secret); //Show secret
    }//GEN-LAST:event_Button3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new theme().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jb1;
    private javax.swing.JLabel jp1;
    private javax.swing.JTextField jt;
    // End of variables declaration//GEN-END:variables

    private void showMessage(String massage, String title) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }

    private int getMaxHiddenChars(int width, int height) {
        return ((width * height * 3) / 8) - 1;
    }
}
