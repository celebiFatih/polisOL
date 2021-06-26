
import java.awt.Desktop;
import java.io.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KullanıcıUI extends javax.swing.JFrame {

    

    public void pmyoOl(){
        int yas;
        double puan;
        double boy;
        double bmi;
        double kilo;
        kilo= Double.valueOf(txtKilo.getText());
        yas = Integer.valueOf(txtAge.getText());
        puan = Double.valueOf(txtTytPuan.getText());
        boy = Double.valueOf(txtBoy.getText());
        boy=boy/100;
        bmi = kilo/(boy*boy);
        
        if(yas<18 || yas>=26){
            lblSonuc.setText("Yaşınız uygun değil");
            
        }else if(bmi<18 || bmi>27){
            lblSonuc.setText("BKE uygun değil");
            
        }else if(cbKadin.isSelected() && boy<1.62){
            
            lblSonuc.setText("Boyunuz uygun değil");
            
        }else if(cbErkek.isSelected() && boy<1.67){
            
            lblSonuc.setText("Boyunuz uygun değil");
            
        }else if(cbLise.isSelected()!=true){
            lblSonuc.setText("Lise Mezunu Olmalısınız");
            
        }else if(cbSehitE.isSelected() && puan<150){
            
                lblSonuc.setText("Puanınız Yetersiz");
            
        }else if(cbSehitH.isSelected() && puan<250){
            
                lblSonuc.setText("Puanınız Yetersiz");
            
        }else{
            lblSonuc.setText("Polis Olmak İçin Daha Ne Bekliyorsun!");
        }
        
        
    }
    public void pomemOl(){
        int yas;
        double puan;
        double boy;
        double bmi;
        double kilo;
        kilo= Double.valueOf(txtKilo.getText());
        yas = Integer.valueOf(txtAge.getText());
        puan = Double.valueOf(txtPuanKpss.getText());
        boy = Double.valueOf(txtBoy.getText());
        boy=boy/100;
        bmi = kilo/(boy*boy);

        if(yas<18 || yas>30){
            lblSonuc.setText("Yaş Uygun Değil");
            
        }else if(bmi<18 || bmi>27){
            lblSonuc.setText("BKE uygun değil");
            
        }else if(cbErkek.isSelected() && boy<1.67){
                        
                lblSonuc.setText("Boyunuz En Az 167cm Olmalı");
            
        }else if(cbKadin.isSelected() && boy<1.62){
            
                lblSonuc.setText("Boyunuz En Az 162cm Olmalı");
            
        }else if(!cbOnLisans.isSelected() && !cbLisans.isSelected()){
            
                lblSonuc.setText("En Az Önlisans ya da Lisans Mezunu Olmalısınız");
            
        }else if(cbSehitE.isSelected() && cbLisans.isSelected() && puan<48){
            
                lblSonuc.setText("Puanınız Yetersiz");
            
        }else if(cbSehitE.isSelected() && cbOnLisans.isSelected() && puan<52){
            
                lblSonuc.setText("Puanınız Yetersiz");
            
        }else if(cbSehitH.isSelected() && cbLisans.isSelected() && puan<60){
            
                lblSonuc.setText("Puanınız Yetersiz");
            
        }else if(cbSehitH.isSelected() && cbOnLisans.isSelected() && puan<65){
            
            lblSonuc.setText("Puanınız Yetersiz");
            
        }else{
            lblSonuc.setText("Polis Olmak İçin Daha Ne Bekliyorsun!");
        }
    } 
    public void paemOl(){
        
        int yas;
        int gSuresi;
        double boy;
        double bmi;
        double kilo;
        double puan;
        
        yas = Integer.valueOf(txtAge.getText());
        kilo= Double.valueOf(txtKilo.getText());
        boy = Double.valueOf(txtBoy.getText());
        boy=boy/100;
        bmi = kilo/(boy*boy);
        gSuresi=Integer.valueOf(txtGorevS.getText());
        puan = Double.valueOf(txtPuanKpss.getText());
        
        if(bmi<18 || bmi>27){
            
            lblSonuc.setText("Beden Kitle Endeksi Uygun Değil");
            
        }else if(cbErkek.isSelected() && boy<1.67){
            
            lblSonuc.setText("Boyunuz En Az 167cm Olmalı");
            
        }else if(cbKadin.isSelected() && boy<1.62){
            
            lblSonuc.setText("Boyunuz En Az 162cm Olmalı");
            
        }else if(!cbLisans.isSelected()){
            
            lblSonuc.setText("En Az Lisans Mezunu Olmalısınız");
                
        }else if(cbEmnE.isSelected() && yas>=45){
            
            lblSonuc.setText("Yaşınız Uygun Değil");
                
        }else if(cbEmnE.isSelected() && gSuresi<2){
                
            lblSonuc.setText("Meslekte Fiilen 2 Yıl Görev Yapmış Olmalısınız");
            
        }else if(cbEmnH.isSelected() && (yas<18 || yas>30)){
            
            lblSonuc.setText("Yaşınız Uygun Değil");
            
        }else if(cbEmnH.isSelected() && cbErkek.isSelected() && cbSehitE.isSelected() && puan<63){
                
            
            lblSonuc.setText("Puanınız Yetersiz");
                
        }else if(cbEmnH.isSelected() && cbErkek.isSelected() && cbSehitH.isSelected() && puan<70){
                
            lblSonuc.setText("Puanınız Yetersiz");
                
        }else if(cbEmnH.isSelected() && cbKadin.isSelected() && cbSehitE.isSelected() && puan<67.5){
                
            lblSonuc.setText("Puanınız Yetersiz");
                
        }else if(cbEmnH.isSelected() && cbKadin.isSelected() && cbSehitH.isSelected() && puan<75){
                
            lblSonuc.setText("Puanınız Yetersiz");
                
            
        }else{
            lblSonuc.setText("Komiser Olmak İçin Daha Ne Bekliyorsun!");
        }
        
        
    }
    public void cmbOl(){
        int yas;       
        double boy;
        double bmi;
        double kilo;
        
        yas = Integer.valueOf(txtAge.getText());
        kilo= Double.valueOf(txtKilo.getText());
        boy = Double.valueOf(txtBoy.getText());
        boy=boy/100;
        bmi = kilo/(boy*boy);
        
        if(bmi<18 || bmi>27){
            lblSonuc.setText("Beden Kitle Endeksi Uygun Değil");  
            
        }else if(yas<18 || yas>31){
            lblSonuc.setText("Yaşınız Uygun Değil");
            
        }else if(cbErkek.isSelected() && boy<1.67){
      
            lblSonuc.setText("Boyunuz En Az 167cm Olmalı ");
            
        }else if(cbKadin.isSelected()){
            
            lblSonuc.setText("Üzgünüz, Henüz Kadın Adaylar ÇMB Olamaz");
            
        }else if(!cbIlk.isSelected() && !cbLise.isSelected() && !cbLisans.isSelected() && !cbOnLisans.isSelected() && !cbOrta.isSelected()){
            lblSonuc.setText("En Az İlk Okul Mezunu Olmalısınız");
            
        }else if(cbAskYapmadı.isSelected()){
            lblSonuc.setText("Askerliğinizi Yapmış Olmalısınız");
        }
        else{
            lblSonuc.setText("Polis Olmak İçin Daha Ne Bekliyorsun!");
        }
    }
    public KullanıcıUI() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbIlk = new javax.swing.JCheckBox();
        cbOrta = new javax.swing.JCheckBox();
        cbLise = new javax.swing.JCheckBox();
        cbLisans = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cbAskYaptı = new javax.swing.JCheckBox();
        cbAskYapmadı = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        cbEmnE = new javax.swing.JCheckBox();
        cbEmnH = new javax.swing.JCheckBox();
        lblMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGorevS = new javax.swing.JTextField();
        cbOnLisans = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtPuanKpss = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTytPuan = new javax.swing.JTextField();
        lblBoy = new javax.swing.JLabel();
        lblKilo = new javax.swing.JLabel();
        txtBoy = new javax.swing.JTextField();
        txtKilo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblBmi = new javax.swing.JLabel();
        btnBmi = new javax.swing.JButton();
        btnPmyo = new javax.swing.JButton();
        btnPaem = new javax.swing.JButton();
        btnPomem = new javax.swing.JButton();
        btnCmb = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbSehitE = new javax.swing.JCheckBox();
        cbSehitH = new javax.swing.JCheckBox();
        lblSonuc = new javax.swing.JLabel();
        cbErkek = new javax.swing.JCheckBox();
        cbKadin = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PolisOL!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setText("İsim");

        lblSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSurname.setText("Soyisim");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAge.setText("Yaş");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGender.setText("Cinsiyet");

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setToolTipText("");

        txtSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAge.setText("0");

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("Kaydet");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdate.setText("Güncelle");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setText("Sil");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mezuniyet Derecesi");

        cbIlk.setText("İlkokul");

        cbOrta.setText("Ortaokul");

        cbLise.setText("Lise");

        cbLisans.setText("Lisans");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Askerlik Durumu");

        cbAskYaptı.setText("Yaptı");

        cbAskYapmadı.setText("Yapmadı");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Emniyet Mensubu mu?");

        cbEmnE.setText("Evet");

        cbEmnH.setText("Hayır");

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setText("Hoşgeldiniz!");
        lblMessage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Görev Süresi");

        txtGorevS.setText("0");

        cbOnLisans.setText("Ön Lisans");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("KPSS Puanı");

        txtPuanKpss.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TYT Puanı");

        txtTytPuan.setText("0");

        lblBoy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBoy.setText("Boy(cm)");

        lblKilo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKilo.setText("Kilo(kg)");

        txtBoy.setText("0");

        txtKilo.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tercih");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblBmi.setMaximumSize(new java.awt.Dimension(1, 1));
        lblBmi.setMinimumSize(new java.awt.Dimension(1, 1));

        btnBmi.setText("BKE Hesapla");
        btnBmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBmiActionPerformed(evt);
            }
        });

        btnPmyo.setText("PMYO OL!");
        btnPmyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPmyoActionPerformed(evt);
            }
        });

        btnPaem.setText("PAEM OL!");
        btnPaem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaemActionPerformed(evt);
            }
        });

        btnPomem.setText("POMEM OL!");
        btnPomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPomemActionPerformed(evt);
            }
        });

        btnCmb.setText("ÇMB OL!");
        btnCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCmbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Şehit/Gazi Çocuğu Mu?");

        cbSehitE.setText("Evet");

        cbSehitH.setText("Hayır");

        lblSonuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSonuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSonuc.setText("SONUÇ");

        cbErkek.setText("Erkek");

        cbKadin.setText("Kadın");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("E-Devlet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Adli Sicil Sorgula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblSurname)
                                    .addComponent(lblAge)
                                    .addComponent(lblGender)
                                    .addComponent(lblBoy))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnUpdate))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(txtBoy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbErkek)
                                        .addGap(10, 10, 10)
                                        .addComponent(cbKadin))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKilo)
                                .addGap(28, 28, 28)
                                .addComponent(txtKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblBmi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBmi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPuanKpss, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGorevS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(txtTytPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPaem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnPmyo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPomem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCmb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lblSonuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(cbAskYaptı)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAskYapmadı))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbIlk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbOrta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbLise))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbEmnE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEmnH))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbSehitE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSehitH)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbOnLisans)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbLisans)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbIlk)
                            .addComponent(cbOrta)
                            .addComponent(cbLise)
                            .addComponent(cbOnLisans)
                            .addComponent(cbLisans))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbAskYaptı)
                            .addComponent(cbAskYapmadı))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbEmnE)
                            .addComponent(cbEmnH)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbSehitE)
                            .addComponent(cbSehitH)
                            .addComponent(jButton1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPmyo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPomem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPaem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCmb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtGorevS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPuanKpss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTytPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSurname)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(cbErkek)
                            .addComponent(cbKadin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBoy)
                            .addComponent(txtBoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKilo))
                        .addGap(18, 18, 18)
                        .addComponent(btnBmi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        File file = new File("user.txt");
        
        try{
            if(!file.exists()){
                file.createNewFile();
            }else{
                lblMessage.setText("Kaydınız Mevcut");
            }
        }catch(IOException ex){
            lblMessage.setText("Kayıt Yapılamadı!");
        }
        
        FileWriter fileWriter;
        BufferedWriter bWriter;
        String cinsiyet;
        if(cbErkek.isSelected()){
            cinsiyet=cbErkek.getText();
        }else if(cbKadin.isSelected()){
            cinsiyet=cbKadin.getText();
        }else{
            cinsiyet="";
        }
        try{
            fileWriter = new FileWriter(file,false);
            bWriter = new BufferedWriter(fileWriter);
            bWriter.write(txtName.getText().trim()+"\n"+txtSurname.getText().trim()+"\n"+txtAge.getText().trim()+"\n"+cinsiyet);
            
            lblMessage.setText("Hoşgeldin "+txtName.getText()+"!");
            bWriter.close();
        }catch(IOException ex){
            lblMessage.setText("Kayıt Oluşturulamadı!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        File file = new File("user.txt");
        if(file.exists()){
            file.delete();
            lblMessage.setText("Kaydınız Başarılı Bir Şekilde Silindi");
        }else{
            lblMessage.setText("Kayıt Bulunamadı!");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                 
        File file= new File("user.txt");
            if(!file.exists()) {
               lblMessage.setText("Henüz Kayıt Oluşturmadınız");
            }else{
            try {
                String cinsiyet;
                if(cbErkek.isSelected()){
                    cinsiyet=cbErkek.getText();
                }else if(cbKadin.isSelected()){
                    cinsiyet=cbKadin.getText();
                }else{
                    cinsiyet="";
                }
                BufferedWriter bWrite;
                bWrite = new BufferedWriter(new FileWriter(file));
                bWrite.write(txtName.getText().trim()+"\n"+txtSurname.getText().trim()+"\n"+txtAge.getText().trim()+"\n"+cinsiyet);
                bWrite.close();
            } catch (IOException ex) {
                lblMessage.setText("İşleminiz Gerçekleştirilemedi");
            }
            }
            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBmiActionPerformed
             
             double kilo;
             double boy;
             kilo = Double.valueOf(txtKilo.getText());
             boy = Integer.valueOf(txtBoy.getText());
             boy=boy/100;
             lblBmi.setText(String.valueOf(kilo/(boy*boy)));
    }//GEN-LAST:event_btnBmiActionPerformed

    private void btnPomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPomemActionPerformed
        pomemOl();
    }//GEN-LAST:event_btnPomemActionPerformed

    private void btnPmyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPmyoActionPerformed
        pmyoOl();
    }//GEN-LAST:event_btnPmyoActionPerformed

    private void btnPaemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaemActionPerformed
        paemOl();
    }//GEN-LAST:event_btnPaemActionPerformed

    private void btnCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCmbActionPerformed
        cmbOl();
    }//GEN-LAST:event_btnCmbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://www.turkiye.gov.tr/adli-sicil-kaydi"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(KullanıcıUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KullanıcıUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullanıcıUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullanıcıUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullanıcıUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullanıcıUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBmi;
    private javax.swing.JButton btnCmb;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPaem;
    private javax.swing.JButton btnPmyo;
    private javax.swing.JButton btnPomem;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbAskYapmadı;
    private javax.swing.JCheckBox cbAskYaptı;
    private javax.swing.JCheckBox cbEmnE;
    private javax.swing.JCheckBox cbEmnH;
    private javax.swing.JCheckBox cbErkek;
    private javax.swing.JCheckBox cbIlk;
    private javax.swing.JCheckBox cbKadin;
    private javax.swing.JCheckBox cbLisans;
    private javax.swing.JCheckBox cbLise;
    private javax.swing.JCheckBox cbOnLisans;
    private javax.swing.JCheckBox cbOrta;
    private javax.swing.JCheckBox cbSehitE;
    private javax.swing.JCheckBox cbSehitH;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBmi;
    private javax.swing.JLabel lblBoy;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblKilo;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBoy;
    private javax.swing.JTextField txtGorevS;
    private javax.swing.JTextField txtKilo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPuanKpss;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTytPuan;
    // End of variables declaration//GEN-END:variables
}
