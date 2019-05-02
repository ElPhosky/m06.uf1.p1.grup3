//package m06.uf1.audioplayer.Vista;
//
//import javazoom.jlgui.basicplayer.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.File;
//import java.util.*;
//import javax.swing.*;
//import javax.swing.event.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
//
//
//public class Vista extends JFrame{
//	
//	public static void main(String args[]){   
//		
//		new Vista(); 
//	}
//	public Vista(){
//		//--------------------------Parte 1 InterfaceGrafica del programa.
//	
//
//		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addContainerGap()
//                        .addComponent(BDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
//                        .addGap(33, 33, 33)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                            .addComponent(BAutoAgre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
//                            .addComponent(Bborrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
//                            .addComponent(Bsuprime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
//                .addGap(0, 46, Short.MAX_VALUE))
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGap(27, 27, 27)
//                .addComponent(Bsuprime)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(Bborrar)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(BAutoAgre)
//                .addGap(18, 18, 18)
//                .addComponent(BDestino)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        
//
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
//                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(jRadioAuto)
//                        .addGroup(jPanel2Layout.createSequentialGroup()
//                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                                .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
//                                .addComponent(Breproducir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addComponent(BPosicionDoble, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
//                            .addGap(48, 48, 48)
//                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                .addComponent(BParar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addComponent(BSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
//                                .addComponent(BAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
//                    .addGap(31, 31, 31))
//            );
//        jPanel2Layout.setVerticalGroup(
//                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(jPanel2Layout.createSequentialGroup()
//                    .addGap(26, 26, 26)
//                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(Breproducir)
//                        .addComponent(BParar))
//                    .addGap(18, 18, 18)
//                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                        .addComponent(BPosicionDoble)
//                        .addComponent(BSiguiente))
//                    .addGap(26, 26, 26)
//                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(BBuscar)
//                        .addComponent(BAnterior))
//                    .addGap(18, 18, 18)
//                    .addComponent(jRadioAuto)
//                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//            );
//
//        jScrollPane1.setViewportView(jListCanciones);
//
//     
//        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
//        jPanel3.setLayout(jPanel3Layout);
//        jPanel3Layout.setHorizontalGroup(
//            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel3Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
//                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addGroup(jPanel3Layout.createSequentialGroup()
//                        .addComponent(jCempieza, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(121, 121, 121)
//                        .addComponent(BBalanceR, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jCtermina, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel3Layout.createSequentialGroup()
//                        .addGap(72, 72, 72)
//                        .addComponent(jSliderBalan, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(18, 18, 18)
//                        .addComponent(jBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(0, 0, Short.MAX_VALUE)))
//                .addContainerGap())
//        );
//        jPanel3Layout.setVerticalGroup(
//            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel3Layout.createSequentialGroup()
//                .addGap(18, 18, 18)
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jCtermina)
//                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
//                        .addGap(3, 3, 3)
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(BBalanceR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jCempieza))))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jSliderBalan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jBalance))
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        
//
//        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
//        jPanel4.setLayout(jPanel4Layout);
//        jPanel4Layout.setHorizontalGroup(
//            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//            .addGroup(jPanel4Layout.createSequentialGroup()
//                .addContainerGap(35, Short.MAX_VALUE)
//                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addComponent(jalbum, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jtrack, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jtamabits, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jframesize, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jframeRat, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jframeBi, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jruta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addGap(23, 23, 23))
//        );
//        jPanel4Layout.setVerticalGroup(
//            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel4Layout.createSequentialGroup()
//                .addGap(12, 12, 12)
//                .addComponent(jCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jtrack)
//                .addGap(5, 5, 5)
//                .addComponent(jtamabits)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jframesize)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jframeRat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jframeBi)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jruta)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jgrupo)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jGenero)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jdate)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jalbum)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        jSliderE0.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSlider.setOrientation(javax.swing.JSlider.VERTICAL);    
//
//        jSliderE1.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE2.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE3.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE4.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE5.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE6.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE7.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE8.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        jSliderE9.setOrientation(javax.swing.JSlider.VERTICAL);
//
//        
//        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
//        jPanel5.setLayout(jPanel5Layout);
//        jPanel5Layout.setHorizontalGroup(
//            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel5Layout.createSequentialGroup()
//                .addGap(14, 14, 14)
//                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jvolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(BMute, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addGap(18, 18, 18)
//                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel5Layout.createSequentialGroup()
//                        .addGap(9, 9, 9)
//                        .addComponent(jLaE0, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLaE9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel5Layout.createSequentialGroup()
//                        .addComponent(jSliderE0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSliderE9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                        .addComponent(BresetE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel5Layout.createSequentialGroup()
//                        .addComponent(jProE0, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE14, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE15, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE16, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE17, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jProE18, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                .addContainerGap(19, Short.MAX_VALUE))
//        );
//        jPanel5Layout.setVerticalGroup(
//            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(jLaE0)
//                    .addComponent(jLaE2)
//                    .addComponent(jLaE4)
//                    .addComponent(jLaE6)
//                    .addComponent(jLaE8)
//                    .addComponent(jLaE1)
//                    .addComponent(jLaE3)
//                    .addComponent(jLaE5)
//                    .addComponent(jLaE7)
//                    .addComponent(jLaE9))
//                .addGap(2, 2, 2)
//                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(jPanel5Layout.createSequentialGroup()
//                            .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
//                            .addGap(18, 18, 18))
//                        .addGroup(jPanel5Layout.createSequentialGroup()
//                            .addGap(49, 49, 49)
//                            .addComponent(BresetE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
//                    .addGroup(jPanel5Layout.createSequentialGroup()
//                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(jSliderE0, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jSliderE9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(75, 75, 75)))
//                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel5Layout.createSequentialGroup()
//                        .addComponent(jvolumen)
//                        .addGap(18, 18, 18)
//                        .addComponent(BMute))
//                    .addComponent(jProE0, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jProE18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addGap(18, 18, 18))
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addGroup(layout.createSequentialGroup()
//                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(18, 18, 18)
//                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(18, 18, 18)
//                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                    .addGroup(layout.createSequentialGroup()
//                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(34, 34, 34)
//                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                .addContainerGap(53, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                .addGap(18, 18, 18)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                .addContainerGap(35, Short.MAX_VALUE))
//        );
//	        
//	        //-----------------------------------------Iconos de los Botones.
//		
//        	Breproducir.setText("Reproducir");
//        	BParar.setText("Parar");
//        	BPosicionDoble.setText("Pausar");
//        	//Bborrar.setIcon(new ImageIcon("C:/AMD/Iconos/borrar.png"));
//        	//Bsuprime.setIcon(new ImageIcon("C:/AMD/Iconos/delete.png"));
//        	//BAutoAgre.setIcon(new ImageIcon("C:/AMD/Iconos/autoAgre.png"));
//        	//BDestino.setIcon(new ImageIcon("C:/AMD/Iconos/explorar.png"));
//        	//BBuscar.setIcon(new ImageIcon("C:/AMD/Iconos/explora.png"));
//        	BSiguiente.setText("Siguiente");
//        	BAnterior.setText("Anterior");
//        	//BMute.setIcon(new ImageIcon("C:/AMD/Iconos/mute.png"));
//        	//BresetE.setIcon(new ImageIcon("C:/AMD/Iconos/reset.png"));
//        	//BBalanceR.setIcon(new ImageIcon("C:/AMD/Iconos/rojo.png"));
//                
////------------------------------------------Colores de fonodo de Panel, Slider, JLabel...
//        	
//	       	
//	       	
//	       	Color c2= new Color(24, 96, 124);
//	       	Breproducir.setBackground(c2);BParar.setBackground(c2);BPosicionDoble.setBackground(c2);Bborrar.setBackground(c2);Bsuprime.setBackground(c2);BAutoAgre.setBackground(c2);BDestino.setBackground(c2);BBuscar.setBackground(c2);BSiguiente.setBackground(c2);BAnterior.setBackground(c2);
//	       	jProgressBar.setBackground(c2);
//	       	
//	       	jProgressBar.setForeground(new Color(65, 159, 70));
//
//	       	jListCanciones.setBackground(Color.BLACK);
//	        jListCanciones.setForeground(Color.GRAY);
//	        jListCanciones.setSelectionForeground(Color.ORANGE);
//	        jListCanciones.setSelectionBackground(Color.BLUE);
//	        jListCanciones.setFont(new Font("MV BOLI", Font.BOLD, 12));
//	       
//	        Color c1= new Color(66, 147, 174);
//	        jRadioAuto.setBackground(c1);
//	        jScrollPane2.setBackground(c1);jPanel1.setBackground(c1);jPanel2.setBackground(c1);jPanel3.setBackground(c1);jPanel4.setBackground(c1);jPanel5.setBackground(c1);jSlider.setBackground(c1);jSliderBalan.setBackground(c1);jSliderE0.setBackground(c1);jSliderE1.setBackground(c1);jSliderE2.setBackground(c1);jSliderE3.setBackground(c1);jSliderE4.setBackground(c1);jSliderE5.setBackground(c1);jSliderE6.setBackground(c1);jSliderE7.setBackground(c1);jSliderE8.setBackground(c1);jSliderE9.setBackground(c1);
// 
//	        jvolumen.setFont(new Font("Comic Sans MS", Font.ITALIC, 9));jruta.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jCancion.setFont(new Font("Comic Sans MS", Font.BOLD, 14));jtrack.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jframesize.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jframeBi.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jgrupo.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jframeRat.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
//	    	jtamabits.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jBalance.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jGenero.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jdate.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jalbum.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jCempieza.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));jCtermina.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
//
//	        Color c=new Color(238, 215, 83);	        
//	        jRadioAuto.setForeground(c);jalbum.setForeground(c);jBalance.setForeground(c);jCancion.setForeground(c);jCempieza.setForeground(c);jCtermina.setForeground(c);jdate.setForeground(c);jtrack.setForeground(c);jframeBi.setForeground(c);jframeRat.setForeground(c);jframesize.setForeground(c);jGenero.setForeground(c);jgrupo.setForeground(c);jvolumen.setForeground(c);jtamabits.setForeground(c);jruta.setForeground(c);;
//	        jLaE0.setForeground(c);jLaE1.setForeground(c);jLaE2.setForeground(c);jLaE3.setForeground(c);jLaE4.setForeground(c);jLaE5.setForeground(c);jLaE6.setForeground(c);jLaE7.setForeground(c);jLaE8.setForeground(c);jLaE9.setForeground(c);
//	        jLaE0.setFont(new Font("", Font.ITALIC, 8));jLaE1.setFont(new Font("", Font.ITALIC, 8));jLaE2.setFont(new Font("", Font.ITALIC, 8));jLaE3.setFont(new Font("", Font.ITALIC, 8));jLaE4.setFont(new Font("", Font.ITALIC, 8));jLaE5.setFont(new Font("", Font.ITALIC, 8));jLaE6.setFont(new Font("", Font.ITALIC, 8));jLaE7.setFont(new Font("", Font.ITALIC, 8));jLaE8.setFont(new Font("", Font.ITALIC, 8));jLaE9.setFont(new Font("", Font.ITALIC, 8));
//	        
//	        
//	        Color Cp = new Color(97, 191, 228);
//	        jPanel1.setBorder(BorderFactory.createLineBorder(Cp,3));jPanel2.setBorder(BorderFactory.createLineBorder(Cp,3));jPanel3.setBorder(BorderFactory.createLineBorder(Cp,3));jPanel4.setBorder(BorderFactory.createLineBorder(Cp,3));jPanel5.setBorder(BorderFactory.createLineBorder(Cp,3));
//			
//	        
//	        jSlider.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
//	        jSliderBalan.setPaintTicks(true);jSliderBalan.setMajorTickSpacing(10);
//	        jSlider.setPaintTicks(true);jSlider.setMajorTickSpacing(5);
//	        
//	        BAnterior.setEnabled(false);
//	        BSiguiente.setEnabled(false);
//	        BPosicionDoble.setEnabled(false);
//	        
//	        
//	        jProE0.setBackground(c1);jProE1.setBackground(c1);jProE2.setBackground(c1);jProE3.setBackground(c1);jProE4.setBackground(c1);jProE5.setBackground(c1);jProE6.setBackground(c1);jProE7.setBackground(c1);jProE8.setBackground(c1);jProE9.setBackground(c1);jProE10.setBackground(c1);jProE11.setBackground(c1);jProE12.setBackground(c1);jProE13.setBackground(c1);jProE14.setBackground(c1);jProE15.setBackground(c1);jProE16.setBackground(c1);jProE17.setBackground(c1);jProE18.setBackground(c1);
//	        jProE0.setForeground(Color.GREEN);jProE1.setForeground(Color.GREEN);jProE2.setForeground(Color.GREEN);jProE3.setForeground(Color.GREEN);jProE4.setForeground(Color.GREEN);jProE5.setForeground(Color.GREEN);jProE6.setForeground(Color.GREEN);jProE7.setForeground(Color.GREEN);jProE8.setForeground(Color.GREEN);jProE9.setForeground(Color.BLUE);jProE10.setForeground(Color.BLUE);
//	        jProE11.setForeground(Color.BLUE);jProE12.setForeground(Color.BLUE);jProE13.setForeground(Color.BLUE);jProE14.setForeground(Color.BLUE);jProE15.setForeground(Color.BLUE);jProE16.setForeground(Color.BLUE);jProE17.setForeground(Color.BLUE);jProE18.setForeground(Color.BLUE);
//	        
//	        getContentPane().setBackground(new Color(180, 177, 189));
//	        setTitle("Reproductor Javazoom Mp3V1.3");       
//	        setBounds(50, 50, 800, 750);       
//	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
//	        setVisible(true);
//		
//		
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	}      
//	
//	String totalD,autor,cancion,selecc;
//	int taman,frameSize,bitrate,pista,desplazamiento=0;	
//	float frameRate,balance,E0,E1,E2,E3,E4,E5,E6,E7,E8,E9,flo=0.25f,ba=0f;	
//	boolean autoReproduce=true;
//	boolean	bloquear=false;											//Controla el bloqueo de la siguiente cancion para evitar saltos de cancion involuntarios.
//	boolean stop = true;											//Controla que cuando selecciones una canción si esta esta en modo autoreproducción esta no salte a la siguiente canción.			
//	boolean interrumpir=true;
//	
//	String ruta="C:/CancionesMp3";     
//	JFileChooser JFileCargar = new JFileChooser(ruta);       
//	FileNameExtensionFilter filtrado = new FileNameExtensionFilter("Solo Mp3","mp3");
//	
//	File archivo;
//
//	JButton BBuscar= new JButton();      							//Encargado de la busqueda selectiva de archivos   
//	JButton BParar = new JButton();      	
//	JButton Breproducir= new JButton();	
//	JButton Bborrar= new JButton();	
//	JButton BAutoAgre= new JButton();	
//	JButton BDestino= new JButton();								//Encargado de la busqueda del directorio Raiz o ruta.
//	JButton Bsuprime = new JButton();
//	JButton BSiguiente = new JButton();
//	JButton BAnterior = new JButton();
//	JButton BMute = new JButton();
//	JButton BresetE = new JButton();
//	JButton	BBalanceR = new JButton();
//	
//	JToggleButton BPosicionDoble = new JToggleButton();
//	
//	JPanel jPanel1 = new JPanel();	
//	JPanel jPanel2 = new JPanel();
//	JPanel jPanel3 = new JPanel();
//	JPanel jPanel4 = new JPanel();
//	JPanel jPanel5 = new JPanel();
//	
//	JLabel jvolumen= new JLabel(""+flo);
//	JLabel jruta= new JLabel("Ruta:  "+ ruta);
//	JLabel jCancion= new JLabel("Cancion:  ...");
//	JLabel jtrack= new JLabel("Pista Track:...");
//	JLabel jframesize = new JLabel("Frame Size:  ...");
//	JLabel jframeBi= new JLabel("Britrate:  ...");
//	JLabel jgrupo= new JLabel("Grupo:  ...");
//	JLabel jframeRat = new JLabel("Frame Rate:  ...");
//	JLabel jtamabits= new JLabel("Tamaño:  ...");
//	JLabel jBalance = new JLabel(""+balance);
//	JLabel jGenero = new JLabel("Genero:  ...");
//	JLabel jdate = new JLabel("Año:  ...");
//	JLabel jalbum = new JLabel("Album:  ...");
//	JLabel jCempieza = new JLabel("0:0");
//	JLabel jCtermina = new JLabel("0:0");
//	JLabel jLaE0 = new JLabel("0.0");
//	JLabel jLaE1 = new JLabel("0.0");
//	JLabel jLaE2 = new JLabel("0.0");
//	JLabel jLaE3 = new JLabel("0.0");
//	JLabel jLaE4 = new JLabel("0.0");
//	JLabel jLaE5 = new JLabel("0.0");
//	JLabel jLaE6 = new JLabel("0.0");
//	JLabel jLaE7 = new JLabel("0.0");
//	JLabel jLaE8 = new JLabel("0.0");
//	JLabel jLaE9 = new JLabel("0.0");
//	
//	
//	JRadioButton jRadioAuto = new JRadioButton("Auto. Repro.",true);
//
//	JList<String> jListCanciones = new JList<>();;
//	ArrayList<String> datos = new ArrayList<>();
//	String []lista;
//	String [] devuelve= new String [2000];
//	
//	JSlider jProgressBar = new JSlider(0,0);
//	JProgressBar jProE0 = new JProgressBar(1,-130,130);	
//	JProgressBar jProE1 = new JProgressBar(1,-130,130);
//	JProgressBar jProE2 = new JProgressBar(1,-130,130);
//	JProgressBar jProE3 = new JProgressBar(1,-130,130);
//	JProgressBar jProE4 = new JProgressBar(1,-130,130);
//	JProgressBar jProE5 = new JProgressBar(1,-130,130);
//	JProgressBar jProE6 = new JProgressBar(1,-130,130);
//	JProgressBar jProE7 = new JProgressBar(1,-130,130);
//	JProgressBar jProE8 = new JProgressBar(1,-130,130);
//	JProgressBar jProE9 = new JProgressBar(1,-130,130);
//	JProgressBar jProE10 = new JProgressBar(1,-130,130);
//	JProgressBar jProE11 = new JProgressBar(1,-130,130);
//	JProgressBar jProE12 = new JProgressBar(1,-130,130);
//	JProgressBar jProE13 = new JProgressBar(1,-130,130);
//	JProgressBar jProE14 = new JProgressBar(1,-130,130);
//	JProgressBar jProE15 = new JProgressBar(1,-130,130);
//	JProgressBar jProE16 = new JProgressBar(1,-130,130);
//	JProgressBar jProE17 = new JProgressBar(1,-130,130);
//	JProgressBar jProE18 = new JProgressBar(1,-130,130);
//	
//	JScrollPane jScrollPane1 = new JScrollPane();
//	JScrollPane jScrollPane2 = new JScrollPane();
//	
//	JSlider jSlider = new JSlider(0,100,25);
//	JSlider jSliderBalan = new JSlider(-100,100,0);
//	
//	JSlider jSliderE0 = new JSlider(-100,100,0);
//	JSlider jSliderE1 = new JSlider(-100,100,0);
//	JSlider jSliderE2 = new JSlider(-100,100,0);	
//	JSlider jSliderE3 = new JSlider(-100,100,0);
//	JSlider jSliderE4 = new JSlider(-100,100,0);
//	JSlider jSliderE5 = new JSlider(-100,100,0);
//	JSlider jSliderE6 = new JSlider(-100,100,0);
//	JSlider jSliderE7 = new JSlider(-100,100,0);
//	JSlider jSliderE8 = new JSlider(-100,100,0);
//	JSlider jSliderE9 = new JSlider(-100,100,0);
//  
//	BasicPlayer player = new BasicPlayer();	
//	
//}