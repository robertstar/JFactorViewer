/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test_udp2;

import java.io.*;
import java.net.*;
import java.util.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import org.jfree.chart.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.BorderFactory;

import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JScrollPane;  
import javax.swing.JFrame;  
import javax.swing.JPanel; 

import java.awt.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;


import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYAreaRenderer;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.labels.AbstractXYItemLabelGenerator;
import org.jfree.chart.labels.StandardXYToolTipGenerator;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.MovingAverage;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.NumberFormat;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.text.NumberFormat;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.util.*;
import org.apache.commons.lang3.*;

import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;

import org.jfree.chart.annotations.AbstractAnnotation;
import org.jfree.chart.annotations.XYLineAnnotation;

/**
 *
 * @author master
 */
public class Test_UDP2 {

    /**
     * @param args the command line arguments
     */
    
    private static DatagramSocket socket;
    //private List<String> listQuotes = new ArrayList<String>();
    private Random random;
    
    static byte[] buf = new byte[5000];
    static boolean listen = true;
    static int x = 0;
    static int p = 0;
    static int time = 0;
    
    static double[] re1 = new double[2048];
    static double[] im1 = new double[2048];
    static double[] out1 = new double[4096];
    
    static double[] re2 = new double[2048];
    static double[] im2 = new double[2048];
    static double[] out2 = new double[4096];
    
    static double[] re3 = new double[2048];
    static double[] im3 = new double[2048];
    static double[] out3 = new double[4096];
    
    static double[] re4 = new double[2048];
    static double[] im4 = new double[2048];
    static double[] out4 = new double[4096];
    
    static double[] re5 = new double[2048];
    static double[] im5 = new double[2048];
    static double[] out5 = new double[4096];
    
    static double[] re6 = new double[2048];
    static double[] im6 = new double[2048];
    static double[] out6 = new double[4096];
    
    static double[] re7 = new double[2048];
    static double[] im7 = new double[2048];
    static double[] out7 = new double[4096];
    
    static double[] re8 = new double[2048];
    static double[] im8 = new double[2048];
    static double[] out8 = new double[4096];
    
    static double[] re9 = new double[2048];
    static double[] im9 = new double[2048];
    static double[] out9 = new double[4096];
    
    static double[] re10 = new double[2048];
    static double[] im10 = new double[2048];
    static double[] out10 = new double[4096];
    
    static double[] re11 = new double[2048];
    static double[] im11 = new double[2048];
    static double[] out11 = new double[4096];
    
    static double[] re12 = new double[2048];
    static double[] im12 = new double[2048];
    static double[] out12 = new double[4096];
    
    static double[] re13 = new double[2048];
    static double[] im13 = new double[2048];
    static double[] out13 = new double[4096];
    
    static double[] re14 = new double[2048];
    static double[] im14 = new double[2048];
    static double[] out14 = new double[4096];
    
    static double[] re15 = new double[2048];
    static double[] im15 = new double[2048];
    static double[] out15 = new double[4096];
    
    static double[] re16 = new double[2048];
    static double[] im16 = new double[2048];
    static double[] out16 = new double[4096];
    
    
    
//    static double[][] re  = new double[12][2048];
//    static double[][] im  = new double[12][2048];
//    static double[][] out = new double[12][4096];
    
    static double inc=-10000;
    
    
    static short lsb, msb;
    //static int ch1, ch2;
    
    static int[] ch = new int[85];
    static byte[] buffer_t = new byte[696320+1];
    
    static boolean play_stop=false;
    
    
    

    /*static List<XYSeries>           series_I     = new ArrayList<XYSeries>();
    static List<XYSeries>           series_Q     = new ArrayList<XYSeries>();
    static List<XYSeries>           series_fft   = new ArrayList<XYSeries>();
    
    static List<XYSeriesCollection> dataset_IQ   = new ArrayList<XYSeriesCollection>();
    static List<XYSeriesCollection> dataset_FFT  = new ArrayList<XYSeriesCollection>();
    static ChartPanel[] cp = new ChartPanel[85];*/
    
    static JFormattedTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    static JButton   send_apo;
    static long v1=-1,v2=-1,v3=-1,v4=-1,v5=-1,v6=-1,v7=-1;
    
    static Thread send;
    
    static ImageIcon start_ico,stop_ico,sett_ico, oscillo_ico, fft_ico;

    public Test_UDP2(int port) throws SocketException {
        socket = new DatagramSocket(port);
        random = new Random();
        listen = true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //String quoteFile = args[0];
        //int port = Integer.parseInt(args[1]);

        
        // create and configure the window
        JFrame window = new JFrame();
        window.setTitle("FactorViewer");
        window.setSize(1200, 800);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a drop-down box and connect button, then place them at the top of the window
        //JComboBox<String> portList = new JComboBox<String>();
        
        //***************************************************************************************************************//
        JButton connectButton = new JButton("");
        //ImageIcon start_ico = new ImageIcon(Class.class.getResource("/images/Play_48x48.png"));
        //ImageIcon stop_ico = new ImageIcon(Class.class.getResource("/images/Stop_48x48.png"));
        
        
        start_ico = new ImageIcon(Test_UDP2.class.getResource("/images/Play_48x48.png"));
        stop_ico = new ImageIcon(Test_UDP2.class.getResource("/images/Stop_48x48.png"));
        
        
        
        
        connectButton.setIcon(start_ico);
        connectButton.setOpaque(false);
        connectButton.setContentAreaFilled(false);
        connectButton.setBorderPainted(true);
        connectButton.setFocusPainted(false);
        connectButton.setToolTipText("Пуск");
        
        JButton settingsButton = new JButton("");
        //ImageIcon sett_ico = new ImageIcon(Class.class.getResource("/images/Settings_48x48.png"));
        
        sett_ico = new ImageIcon(Test_UDP2.class.getResource("/images/Settings_48x48.png"));
        settingsButton.setIcon(sett_ico);
        
        settingsButton.setOpaque(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.setBorderPainted(true);
        settingsButton.setFocusPainted(false);
        settingsButton.setToolTipText("Настройки");
        
        JToolBar toolBar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
        toolBar.add(connectButton);
        toolBar.add(settingsButton);
        toolBar.setFloatable(false); 
        //window.getContentPane().add(toolBar,BorderLayout.NORTH);
        //window.setUndecorated(true);
        //window.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        //window.setBackground(Color.gray);
        

        
        //***************************************************************************************************************//
        //GridLayout layout0  = new GridLayout(1, 0, 10, 10);
        //GridLayout layout1  = new GridLayout(0, 1, 10, 10);
        //JPanel mainPanel    = new JPanel();
        //mainPanel.setLayout(new FlowLayout());
        //mainPanel.setLayout(layout0);
        //mainPanel.setPreferredSize(new Dimension(200, 400));     
        //final JPanel content = new JPanel();
        //content.setLayout(new FlowLayout());
        //content.setLayout(layout1);
        //content.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        //content.setPreferredSize(new Dimension(200, 400));
        
        
        window.setIconImage(new ImageIcon(Test_UDP2.class.getResource("/images/icon3.png")).getImage());
        //UIManager.put("TabbedPane.selected", Color.red);
        
        String fontName = "Lucida Sans";
        StandardChartTheme theme = (StandardChartTheme)org.jfree.chart.StandardChartTheme.createJFreeTheme();
        //theme.setTitlePaint( Color.decode( "#4572a7" ) );
        
        theme.setTitlePaint( Color.PINK );
        
        theme.setExtraLargeFont( new Font(fontName,Font.PLAIN, 14) ); //title
        theme.setLargeFont( new Font(fontName,Font.BOLD, 11)); //axis-title
        theme.setRegularFont( new Font(fontName,Font.PLAIN, 8));
        
        //theme.setRangeGridlinePaint( Color.decode("#C0C0C0"));
        //theme.setPlotBackgroundPaint( Color.gray );
        //theme.setChartBackgroundPaint( Color.gray);
        //theme.setPlotBackgroundPaint( window.getBackground() );
        
        theme.setChartBackgroundPaint( window.getBackground());
        theme.setLegendBackgroundPaint(window.getBackground());
        
        //theme.setGridBandPaint( Color.red );
        //theme.setAxisLabelPaint( Color.decode("#666666")  );
        

//COMMENT 06.12.19 1045 *************            
//        final XYSeriesCollection scope_IQ_ds = new XYSeriesCollection();
//        final JFreeChart chart_scope = ChartFactory.createXYLineChart("", "","", scope_IQ_ds);
//        theme.apply(chart_scope);
//        chart_scope.setTextAntiAlias(true);
//        chart_scope.setAntiAlias(true);
//
//        final XYPlot xyPlot_scope = chart_scope.getXYPlot();
//        NumberAxis domain_scope = (NumberAxis) xyPlot_scope.getDomainAxis();
//        domain_scope.setRange(0, 2048);
//
//        NumberAxis range_scope = (NumberAxis) xyPlot_scope.getRangeAxis();
//        range_scope.setRange(-5, 5);
        
//        final ChartPanel cp1 = new ChartPanel(chart_scope) {
//            @Override public void restoreAutoRangeBounds() {
//            // Empty body: do not reset X zoom
//            }
//        };
//        cp1.setPreferredSize(new Dimension(600, 200));
//        cp1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//        cp1.setRangeZoomable(false);//f
//        cp1.setMouseWheelEnabled(true);
//        cp1.setInitialDelay(0);

        
        
//COMMENT 06.12.19 1045 *************        
//        final XYSeriesCollection fft_ds = new XYSeriesCollection();
//        final JFreeChart chart_fft = ChartFactory.createXYLineChart("", "","", fft_ds);//fft_ds
//        theme.apply(chart_fft);
//        final XYPlot xyPlot_fft = chart_fft.getXYPlot();
//        final NumberAxis domain_fft = (NumberAxis) xyPlot_fft.getDomainAxis();
//        final NumberAxis range_fft = (NumberAxis) xyPlot_fft.getRangeAxis();
//        domain_fft.setRange(-10500, 10500);
//        range_fft.setRange(-200, 50);
        
        
        
        
        //**************************************************************************************************//
        //*Spectrum                                                                                        *//
        //**************************************************************************************************//
        final XYSeries series1 = new XYSeries("Test");
        for (int i = 0; i < 2048; i++) {
            series1.add(i, null);
        }
        XYDataset data1 = new XYSeriesCollection(series1);
        XYItemRenderer renderer1    = new StandardXYItemRenderer();
        StandardXYToolTipGenerator generator = new StandardXYToolTipGenerator(
            "{1} = {2}", new DecimalFormat("0Hz"), new DecimalFormat("0dB"));
        renderer1.setDefaultToolTipGenerator(generator);
        UIManager.put("StandardXYToolTipGenerator", Color.red);
        
        ValueAxis xAxis = null;
        ValueAxis yAxis = null;
    
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-1");
        xAxis.setRange(-10000, 10000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s1 = new XYPlot(data1, xAxis, yAxis , renderer1);
        fft_s1.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        
        /*Установим метку запуска*/
        Stroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        /*Добавление вертикальной линии*/
        XYLineAnnotation la = new XYLineAnnotation(0,40, 0,-300,stroke,Color.BLACK);
        fft_s1.addAnnotation(la);
        
        
        

        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-2");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s2 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s2.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-3");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s3 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s3.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-4");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s4 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s4.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-5");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s5 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s5.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-6");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s6 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s6.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-7");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s7 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s7.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-8");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s8 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s8.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-9");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s9 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s9.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-10");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s10 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s10.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-11");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s11 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s11.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
                
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-12");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s12 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s12.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-13");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s13 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s13.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-14");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s14 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s14.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-15");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s15 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s15.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
                
        xAxis = new DateAxis("");
        yAxis = new NumberAxis("Канал-16");
        xAxis.setRange(-5000, 5000);
        yAxis.setRange(-180, 50);
        XYPlot fft_s16 = new XYPlot(data1, xAxis, yAxis, renderer1);
        fft_s16.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        // parent plot...
        CombinedDomainXYPlot plot = new CombinedDomainXYPlot(new NumberAxis(""));
        plot.setGap(15.0);

        // add the subplots...
        plot.add(fft_s1, 2);
        plot.add(fft_s2, 2);
        plot.add(fft_s3, 2);
        plot.add(fft_s4, 2);
        plot.add(fft_s5, 2);
        plot.add(fft_s6, 2);
        plot.add(fft_s7, 2);
        plot.add(fft_s8, 2);
        plot.add(fft_s9, 2);
        plot.add(fft_s10, 2);
        plot.add(fft_s11, 2);
        plot.add(fft_s12, 2);
        plot.add(fft_s13, 2);
        plot.add(fft_s14, 2);
        plot.add(fft_s15, 2);
        plot.add(fft_s16, 2);
        
//                /*Установим метку запуска*/
//        Stroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
//        /*Добавление вертикальной линии*/
//        XYLineAnnotation la = new XYLineAnnotation(50,40, 50,-300,stroke,Color.BLACK);
//        plot.addAnnotation(la);
//        
        

        
        plot.setOrientation(PlotOrientation.VERTICAL);
        
        final JFreeChart chart = new JFreeChart("", plot);
        chart.removeLegend();
        theme.apply(chart);

        final ChartPanel cp3 = new ChartPanel(chart) {
            @Override public void restoreAutoRangeBounds() {
            // Empty body: do not reset X zoom
            }
        };
        cp3.setPreferredSize(new java.awt.Dimension(800, 16*100));
        cp3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        cp3.setRangeZoomable(false);
        cp3.setMouseWheelEnabled(true);
        cp3.setInitialDelay(0);
        cp3.setMaximumDrawHeight(5000);
        cp3.setMaximumDrawWidth(5000);

        
        
        //**************************************************************************************************//
        //*Oscillo                                                                                         *//
        //**************************************************************************************************//
        final XYSeries series_s1 = new XYSeries("1");
        //final XYSeries series_s2 = new XYSeries("2");
        for (int i = 0; i < 2048; i++) {
            series_s1.add(i, null);
            //series_s2.add(i, null);
        }

        final XYSeriesCollection collection = new XYSeriesCollection();
        collection.addSeries(series_s1);
        //collection.addSeries(series_s2);
        
        XYDataset data2 = collection;
        XYItemRenderer renderer2    = new StandardXYItemRenderer();
        /*StandardXYToolTipGenerator generator = new StandardXYToolTipGenerator(
            "{1} = {2}", new DecimalFormat("0Hz"), new DecimalFormat("0dB"));
        renderer1.setDefaultToolTipGenerator(generator);*/
        
        ValueAxis xAxis2 = null;
        ValueAxis yAxis2 = null;
    
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-1");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s1 = new XYPlot(data2, xAxis2, yAxis2 , renderer2);
        scope_s1.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-2");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s2 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s2.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-3");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s3 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s3.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-4");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s4 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s4.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-5");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s5 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s5.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-6");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s6 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s6.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-7");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s7 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s7.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-8");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s8 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s8.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-9");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s9 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s9.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-10");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s10 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s10.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-11");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s11 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s11.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
                
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-12");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s12 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s12.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-13");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s13 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s13.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-14");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s14 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s14.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-15");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s15 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s15.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
                
        xAxis2 = new DateAxis("");
        yAxis2 = new NumberAxis("Канал-16");
        xAxis2.setRange(0, 2048);
        yAxis2.setRange(-5, 5);
        XYPlot scope_s16 = new XYPlot(data2, xAxis2, yAxis2, renderer2);
        scope_s16.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        
        // parent plot...
        CombinedDomainXYPlot plot2 = new CombinedDomainXYPlot(new NumberAxis(""));
        plot2.setGap(15.0);

        // add the subplots...
        plot2.add(scope_s1, 2);
        plot2.add(scope_s2, 2);
        plot2.add(scope_s3, 2);
        plot2.add(scope_s4, 2);
        plot2.add(scope_s5, 2);
        plot2.add(scope_s6, 2);
        plot2.add(scope_s7, 2);
        plot2.add(scope_s8, 2);
        plot2.add(scope_s9, 2);
        plot2.add(scope_s10, 2);
        plot2.add(scope_s11, 2);
        plot2.add(scope_s12, 2);
        plot2.add(scope_s13, 2);
        plot2.add(scope_s14, 2);
        plot2.add(scope_s15, 2);
        plot2.add(scope_s16, 2);
        
        plot2.setOrientation(PlotOrientation.VERTICAL);
        
        final JFreeChart chart2 = new JFreeChart("", plot2);
        chart2.removeLegend();
        theme.apply(chart2);

        final ChartPanel cp2 = new ChartPanel(chart2) {
            @Override public void restoreAutoRangeBounds() {
            // Empty body: do not reset X zoom
            }
        };
        cp2.setPreferredSize(new java.awt.Dimension(800, 16*100));
        cp2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        cp2.setRangeZoomable(false);
        cp2.setMouseWheelEnabled(true);
        cp2.setInitialDelay(0);
        cp2.setMaximumDrawHeight(5000);
        cp2.setMaximumDrawWidth(5000);
        
        
        
        
        
        
        
        
        
        
        
        
        
        //**************************************************************************************************//
        JCheckBox ch1 = new JCheckBox("ch1");
        JCheckBox ch2 = new JCheckBox("ch2");
        JCheckBox ch3 = new JCheckBox("ch3");
        JCheckBox ch4 = new JCheckBox("ch4");
        JCheckBox ch5 = new JCheckBox("ch5");
        JCheckBox ch6 = new JCheckBox("ch6");
        
        //content.add(chbox1);
        
        Box topBox = Box.createVerticalBox();
        ButtonGroup topGroup = new ButtonGroup();
        topGroup.add(ch1);
        topGroup.add(ch2);
        topGroup.add(ch3);
        
        topBox.add(ch1);
        topBox.add(ch2);
        topBox.add(ch3);
        topBox.setBorder(BorderFactory.createTitledBorder("Каналы"));

        
        
        
        
        //**************************************************************************************************//
        JPanel comm = new JPanel();
        comm.setLayout(new BoxLayout(comm, BoxLayout.Y_AXIS));
        GridLayout comtx_l  = new GridLayout(2, 7, 10, 10);
        JPanel comtx = new JPanel(comtx_l); //new GridBagLayout()

        Border raisedbevel = BorderFactory.createRaisedBevelBorder();
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        Border bc = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);

        //Add a title to the red-outlined frame.
        Border bc2 = BorderFactory.createTitledBorder(
                          bc, "АПО",
                          TitledBorder.CENTER,
                          TitledBorder.TOP);
        comtx.setBorder(bc2);

        //comtx.setBorder(blackline);
        comtx.setPreferredSize(new Dimension(50, 100));

            
        //**************************************************************************************************************//    
        //String str;    
        MaskFormatter mask = null;
        try {
            //mask = new MaskFormatter("(###) ###-####");
            mask = new MaskFormatter("HH");
            mask.setPlaceholderCharacter('_');
            //str = mask.valueToString(31);
        } catch (ParseException e) {
            //str="";
            e.printStackTrace();
        }
        
        ToolTipManager.sharedInstance().setDismissDelay(30000);
        tf1 = new JFormattedTextField(mask){
                public JToolTip createToolTip() {
                  JToolTip tip = super.createToolTip();
                  tip.setBackground(Color.YELLOW);
                  tip.setForeground(Color.black);
                  tip.setAutoscrolls(true);
                  return tip;
                }
        };

        try {
            //mask = new MaskFormatter("(###) ###-####");
            mask = new MaskFormatter("HH");
            mask.setPlaceholderCharacter('_');
            //str = mask.valueToString(0);
        } catch (ParseException e) {
            //str="";
            e.printStackTrace();
        }
        tf2 = new JFormattedTextField(mask){
                public JToolTip createToolTip() {
                  JToolTip tip = super.createToolTip();
                  tip.setBackground(Color.YELLOW);
                  tip.setForeground(Color.black);
                  tip.setAutoscrolls(true);
                  return tip;
                }
        };
        
        try {
            //mask = new MaskFormatter("(###) ###-####");
            mask = new MaskFormatter("HH-HH-HH-HH");
            mask.setPlaceholderCharacter('_');
            //str = mask.valueToString(00);
        } catch (ParseException e) {
            //str="";
            e.printStackTrace();
        }
        tf3 = new JFormattedTextField(mask){
                public JToolTip createToolTip() {
                  JToolTip tip = super.createToolTip();
                  tip.setBackground(Color.YELLOW);
                  tip.setForeground(Color.black);
                  tip.setAutoscrolls(true);
                  return tip;
                }
        };
        tf4 = new JFormattedTextField(mask){
                public JToolTip createToolTip() {
                  JToolTip tip = super.createToolTip();
                  tip.setBackground(Color.YELLOW);
                  tip.setForeground(Color.black);
                  tip.setAutoscrolls(true);
                  return tip;
                }
        };
        tf5 = new JFormattedTextField(mask){
                public JToolTip createToolTip() {
                  JToolTip tip = super.createToolTip();
                  tip.setBackground(Color.YELLOW);
                  tip.setForeground(Color.black);
                  tip.setAutoscrolls(true);
                  return tip;
                }
        };
        tf6 = new JFormattedTextField(mask){
                public JToolTip createToolTip() {
                  JToolTip tip = super.createToolTip();
                  tip.setBackground(Color.YELLOW);
                  tip.setForeground(Color.black);
                  tip.setAutoscrolls(true);
                  return tip;
                }
        };

        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(false);
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(100000);
        formatter.setCommitsOnValidEdit(true);
        
        tf7 = new JFormattedTextField(formatter){
                public JToolTip createToolTip() {
                  JToolTip tip = super.createToolTip();
                  tip.setBackground(Color.YELLOW);
                  tip.setForeground(Color.black);
                  tip.setAutoscrolls(true);
                  return tip;
                }
        };
 
        send_apo = new JButton("Отправить");
        send_apo.setEnabled(false);
        send_apo.addActionListener(new ActionListener(){
            @Override public void actionPerformed(ActionEvent arg0) {
                if( (v1!=-1) && (v2!=-1) && (v3!=-1) && (v4!=-1) && (v5!=-1) && (v6!=-1)){
                    //get value and send to UDP
                    
                    byte[] buff = new byte[50];
                    byte[] apo1 = hexStringToByteArray(tf1.getText());
                    byte[] apo2 = hexStringToByteArray(tf2.getText());
                    byte[] apo3 = hexStringToByteArray(tf3.getText().replace("-",""));
                    byte[] apo4 = hexStringToByteArray(tf4.getText().replace("-",""));
                    byte[] apo5 = hexStringToByteArray(tf5.getText().replace("-",""));
                    byte[] apo6 = hexStringToByteArray(tf6.getText().replace("-",""));
                    
                    //System.out.println(Arrays.toString(apo3)); 
                    
//                    Collections.reverse(Arrays.asList(apo3)); 
//                    Collections.reverse(Arrays.asList(apo4)); 
//                    Collections.reverse(Arrays.asList(apo5)); 
//                    Collections.reverse(Arrays.asList(apo6));

                    
                    ArrayUtils.reverse(apo3);
                    ArrayUtils.reverse(apo4);
                    ArrayUtils.reverse(apo5);
                    ArrayUtils.reverse(apo6);
                    
                    //System.out.println(Arrays.asList(apo3)); 
                    //System.out.println(Arrays.toString(apo3)); 
   
                    System.arraycopy(apo1, 0, buff, 0,  1);
                    System.arraycopy(apo2, 0, buff, 1,  1);
                    System.arraycopy(apo3, 0, buff, 2,  4);
                    System.arraycopy(apo4, 0, buff, 6,  4);
                    System.arraycopy(apo5, 0, buff, 10, 4);
                    System.arraycopy(apo6, 0, buff, 14, 4);

                    send = new Thread("send_thread") {
			public void run() {
                            
                            InetAddress addr = null;
                            try{
                                addr = InetAddress.getByName("192.168.5.2");
                            }catch(UnknownHostException ex){
                              System.out.println(ex.toString()); 
                            }
                            
                            DatagramPacket dgpack = new DatagramPacket(buff, 18, addr, 25900);
                            try{
                                socket.send(dgpack);
                            }catch (IOException e) {
                                System.out.println(e.getMessage());
                            }
			}
                    };
                    send.start();
                    System.out.println("UDP: !!! " + apo1);
                }
            }
        });
        
        tf1.getDocument().addDocumentListener(new APOListener());
        tf2.getDocument().addDocumentListener(new APOListener());
        tf3.getDocument().addDocumentListener(new APOListener());
        tf4.getDocument().addDocumentListener(new APOListener());
        tf5.getDocument().addDocumentListener(new APOListener());
        tf6.getDocument().addDocumentListener(new APOListener());
        tf7.getDocument().addDocumentListener(new DDSListener());
        
        tf1.setEnabled(false);
        tf2.setEnabled(false);
        tf3.setEnabled(false);
        tf4.setEnabled(false);
        tf5.setEnabled(false);
        tf6.setEnabled(false);
        tf7.setEnabled(false);
        

        

        tf1.setToolTipText("<html><body>" 
                            + "<pre>КОМАНДА УПРАВЛЕНИЯ:     код <br>"
                            + " «Работа»             - 31 <br>"       
                            + " «Контроль»           - 32 <br>"     
                            + " «Сброс»              - 33 <br>"  
                            + " «Стоп»               - 34 </pre>"     
                            + "</body></html>");
        
        tf2.setToolTipText("<html><body>" 
                            + "<pre>РЕЗЕРВ: </pre>"
                            + "</body></html>");
        
        tf3.setToolTipText("<html><body>" 
                            + "<pre>УСИЛЕНИЕ И ОСЛАБЛЕНИЕ:                 биты <br>"
                            + " «Усиление (начальное состояние)»    - [31] <br>"     
                            + " «Усиление (во время передачи)»      - [30] <br>"        
                            + " «Управление ослаблением»            - [29:0] </pre>"      
                            + "</body></html>");
        
        tf4.setToolTipText("<html><body>" 
                            + "<pre>КОД ДЛИТЕЛЬНОСТИ ОЦИФРОВКИ: <br>"
                            + "</body></html>");
        
        tf5.setToolTipText("<html><body>" 
                            + "<pre>КОД ЧАСТОТЫ: <br>"
                            + "</body></html>");
        
        tf6.setToolTipText("<html><body>" 
                            + "<pre>КОД ПЕРИОДА ВАРУ: <br>"
                            + "</body></html>");
        
        tf7.setToolTipText("<html><body>" 
                            + "<pre>ЧАСТОТА (ГЦ): <br>"
                            + "</body></html>");
        
        

//        tf1.setText("31");
//        tf2.setText("00");
//        tf3.setText("1A-CF-FC-1D");
//        tf4.setText("00-00-03-E8");
//        tf5.setText("00-00-00-00");
//        tf6.setText("00-00-00-00");
//        tf7.setText("0");
         

        
        comtx.add(tf1);
        comtx.add(tf2);
        comtx.add(tf3);
        comtx.add(tf4);
        comtx.add(tf5);
        comtx.add(tf6);
        comtx.add(send_apo);
        comtx.add(new JLabel(""));
        comtx.add(new JLabel(""));
        comtx.add(new JLabel(""));
        comtx.add(new JLabel(""));
        comtx.add(tf7);
        comtx.add(new JLabel(""));
        comtx.add(new JLabel(""));
            

        JPanel p1 = new JPanel();
        p1.add(new JButton("11111"));
        JPanel p2 = new JPanel();
        p2.add(new JButton("222222"));
        JPanel p3 = new JPanel();
        p3.add(new JButton("3333"));
        JPanel p4 = new JPanel();
        p4.setPreferredSize(new Dimension(50, 400));
        comtx.setPreferredSize(new Dimension(50, 50));
        comm.add(comtx);
        
        //JPanel mainPanel    = new JPanel();
        //mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        //mainPanel.setLayout(new GridLayout(2, 1));
        //tabbedPane.setPreferredSize(new Dimension(2000, 2000));
        //mainPanel.add(comtx); 
        //mainPanel.add(tabbedPane); 
        //JPanel panelT = new JPanel();
        //panelT.add(cp3);
        //window.setContentPane(cp3);
        

        
        
        
        
        
        
        //**************************************************************************************************//
        JPanel controlPane = new JPanel();
        JPanel chartsPane = new JPanel();

        controlPane.setLayout(new BoxLayout(controlPane, BoxLayout.PAGE_AXIS));
        controlPane.setPreferredSize(new Dimension(200, 90));
//        controlPane.add(new JScrollPane(new JTextArea()));
//        controlPane.add(new JButton("Button1"));
//        controlPane.add(new JButton("Button2"));
        controlPane.add(comtx);
//        buttonPane.setLayout(new FlowLayout(FlowLayout.LEFT));
//        buttonPane.setPreferredSize(new Dimension(100, 40));
//        buttonPane.add(new JButton("Button1"));
//        buttonPane.add(new JButton("Button2"));
        //chartsPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        chartsPane.setPreferredSize(new Dimension(400, 400));
        //buttonPane.add(new JButton("Button1"));
        //buttonPane.add(new JButton("Button2"));
        




        //**************************************************************************************************//
        JTabbedPane tabbedPane = new JTabbedPane();
        //tabbedPane.setPreferredSize(new Dimension(2000, 2000));
        //tabbedPane.setTabLayoutPolicy(JTabbedPane.HORIZONTAL);
        //tabbedPane.setPreferredSize(new Dimension(800, 800));
        //tabbedPane.setLayout(new BoxLayout(controlPane, BoxLayout.PAGE_AXIS));

        oscillo_ico = new ImageIcon(new ImageIcon(Test_UDP2.class.getResource("/images/oscillo.png")).getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT));
        fft_ico = new ImageIcon(new ImageIcon(Test_UDP2.class.getResource("/images/bars.png")).getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT));
        
        
        JPanel pnl_fft = new JPanel();
        pnl_fft.setLayout(new GridLayout(1, 0));
        pnl_fft.add(cp3);
        
        JScrollPane scrollPane_fft = new JScrollPane(pnl_fft,   ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane_fft.getVerticalScrollBar().setUnitIncrement(25);
        scrollPane_fft.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane_fft.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        
        //Spectrum
        JPanel pnl2 = new JPanel();//new FlowLayout()
        pnl2.setLayout(new GridLayout(1, 0));
        pnl2.add(scrollPane_fft);

        
        
        
        //Oscillo
        JPanel pnl_scope = new JPanel();//new FlowLayout()
        pnl_scope.setLayout(new GridLayout(1, 0));
        pnl_scope.add(cp2);
        
        JScrollPane scrollPane_scope = new JScrollPane(pnl_scope,   ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane_scope.getVerticalScrollBar().setUnitIncrement(25);
        scrollPane_scope.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane_scope.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        
        //Spectrum
        JPanel pnl1 = new JPanel();//new FlowLayout()
        pnl1.setLayout(new GridLayout(1, 0));
        pnl1.add(scrollPane_scope);

  
        tabbedPane.addTab("Канал",  oscillo_ico, pnl1);
        tabbedPane.addTab("Спектр", fft_ico,     pnl2);

        //chartsPane.add(tabbedPane,BorderLayout.CENTER);//tabbedPane
        
        

        
        window.getContentPane().add(toolBar,BorderLayout.NORTH);
        window.getContentPane().add(controlPane,BorderLayout.SOUTH);
        window.getContentPane().add(tabbedPane,BorderLayout.CENTER);
        
        
        
//        window.add(controlPane, BorderLayout.NORTH);
//        window.add(chartsPane, BorderLayout.CENTER);
        

        //window.add(mainPanel); // add acrollpane to frame
        //***************************************************************************************************************//

        
        //***************************************************************************************************************//
        // configure the connect button and use another thread to listen for data
        connectButton.addActionListener(new ActionListener(){
            @Override public void actionPerformed(ActionEvent arg0) {

                play_stop=!play_stop;
                if(play_stop){
                    connectButton.setIcon(stop_ico);
                    connectButton.setToolTipText("Стоп");
                    
                    tf1.setEnabled(true);
                    tf2.setEnabled(true);
                    tf3.setEnabled(true);
                    tf4.setEnabled(true);
                    tf5.setEnabled(true);
                    tf6.setEnabled(true);
                    tf7.setEnabled(true);

                    x=0;
                    p=0;
                    int port = 25701;
                    try {
                        Test_UDP2 server = new Test_UDP2(port);
                    } catch (SocketException ex) {
                        System.out.println("Socket error: " + ex.getMessage());
                    } catch (IOException ex) {
                        System.out.println("I/O error: " + ex.getMessage());
                    }

                    // create a new thread that listens for incoming text and populates the graph
                    Thread thread = new Thread(){
                        @Override public void run() {           
                            while(listen) {
                                try {
                                        DatagramPacket request = new DatagramPacket(buf, buf.length);
                                        //InetAddress address = request.getAddress();
                                        //int port = request.getPort();
                                        //request = new DatagramPacket(buf, buf.length, address, port);

                                        socket.receive(request);
                                        byte[] data = request.getData();
                                        //System.out.println("DATA:" + byteToHexString(data));
                                        //String line = scanner.nextLine();
                                        //int number = Integer.parseInt(line);


                                        if(x<50){
//                                            System.arraycopy(data, 30, buffer_t, p, 1360);
//                                            x++;
//                                            p+=1360;

                                            /*System.arraycopy(data, 4, buffer_t, p, 1408);
                                            x++;
                                            p+=1408;*/
                                            
                                            System.arraycopy(data, 4, buffer_t, p, 1408);
                                            x++;
                                            p+=1408;
                                            
                                            /*System.arraycopy(data, 12, buffer_t, p, 800);
                                            x++;
                                            p+=800;*/
                                        }
                                        else{
                                            x=0;
                                            p=0;
                                            
                                            
                                            //long startTime = System.currentTimeMillis();
                                            
                                            
                                            //***********************************************************************************//
                                            final XYSeries scope1_I = new XYSeries("1");
                                            //final XYSeries scope1_Q = new XYSeries("2");
                                            final XYSeriesCollection scope1_ds = new XYSeriesCollection();

                                            final XYSeriesCollection scope2_ds = new XYSeriesCollection();
                                            final XYSeries scope2_I = new XYSeries("1");
                                            //final XYSeries scope2_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope3_ds = new XYSeriesCollection();
                                            final XYSeries scope3_I = new XYSeries("1");
                                            //final XYSeries scope3_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope4_ds = new XYSeriesCollection();
                                            final XYSeries scope4_I = new XYSeries("1");
                                            //final XYSeries scope4_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope5_ds = new XYSeriesCollection();
                                            final XYSeries scope5_I = new XYSeries("1");
                                            //final XYSeries scope5_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope6_ds = new XYSeriesCollection();
                                            final XYSeries scope6_I = new XYSeries("1");
                                            //final XYSeries scope6_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope7_ds = new XYSeriesCollection();
                                            final XYSeries scope7_I = new XYSeries("1");
                                            //final XYSeries scope7_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope8_ds = new XYSeriesCollection();
                                            final XYSeries scope8_I = new XYSeries("1");
                                            //final XYSeries scope8_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope9_ds = new XYSeriesCollection();
                                            final XYSeries scope9_I = new XYSeries("1");
                                            //final XYSeries scope9_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope10_ds = new XYSeriesCollection();
                                            final XYSeries scope10_I = new XYSeries("1");
                                            //final XYSeries scope10_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope11_ds = new XYSeriesCollection();
                                            final XYSeries scope11_I = new XYSeries("1");
                                            //final XYSeries scope11_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope12_ds = new XYSeriesCollection();
                                            final XYSeries scope12_I = new XYSeries("1");
                                            //final XYSeries scope12_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope13_ds = new XYSeriesCollection();
                                            final XYSeries scope13_I = new XYSeries("1");
                                            //final XYSeries scope9_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope14_ds = new XYSeriesCollection();
                                            final XYSeries scope14_I = new XYSeries("1");
                                            //final XYSeries scope10_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope15_ds = new XYSeriesCollection();
                                            final XYSeries scope15_I = new XYSeries("1");
                                            //final XYSeries scope11_Q = new XYSeries("2");
                                            
                                            final XYSeriesCollection scope16_ds = new XYSeriesCollection();
                                            final XYSeries scope16_I = new XYSeries("1");
                                            //final XYSeries scope12_Q = new XYSeries("2");
                                            
                                            //***********************************************************************************//
                                            final XYSeriesCollection fft1_ds = new XYSeriesCollection();
                                            final XYSeries fft1_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft2_ds = new XYSeriesCollection();
                                            final XYSeries fft2_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft3_ds = new XYSeriesCollection();
                                            final XYSeries fft3_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft4_ds = new XYSeriesCollection();
                                            final XYSeries fft4_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft5_ds = new XYSeriesCollection();
                                            final XYSeries fft5_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft6_ds = new XYSeriesCollection();
                                            final XYSeries fft6_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft7_ds = new XYSeriesCollection();
                                            final XYSeries fft7_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft8_ds = new XYSeriesCollection();
                                            final XYSeries fft8_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft9_ds = new XYSeriesCollection();
                                            final XYSeries fft9_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft10_ds = new XYSeriesCollection();
                                            final XYSeries fft10_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft11_ds = new XYSeriesCollection();
                                            final XYSeries fft11_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft12_ds = new XYSeriesCollection();
                                            final XYSeries fft12_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft13_ds = new XYSeriesCollection();
                                            final XYSeries fft13_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft14_ds = new XYSeriesCollection();
                                            final XYSeries fft14_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft15_ds = new XYSeriesCollection();
                                            final XYSeries fft15_s = new XYSeries("");
                                            
                                            final XYSeriesCollection fft16_ds = new XYSeriesCollection();
                                            final XYSeries fft16_s = new XYSeries("");

                                            //***********************************************************************************//
                                            //for(int j=0, k=0; j<65536; j+=340, k++){
                                            for(int j=0, k=0; j<65536; j+=32, k++){
                                            //for(int j=0, k=0; j<65536; j+=170, k++){
            
                                                ch[0]  = ((buffer_t[j+1] <<8)) | (buffer_t[j]   &0x00FF);
                                                ch[1]  = ((buffer_t[j+3] <<8)) | (buffer_t[j+2] &0x00FF);
                                                
                                                ch[2]  = ((buffer_t[j+5] <<8)) | (buffer_t[j+4] &0x00FF);
                                                ch[3]  = ((buffer_t[j+7] <<8)) | (buffer_t[j+6] &0x00FF);
                                                
                                                
                                                //System.out.println("ch[0]  = " + ch[0] + "  k=" + k +  "\r");
                                                
                                                ch[4]  = ((buffer_t[j+9] <<8)) | (buffer_t[j+8] &0x00FF);
                                                ch[5]  = ((buffer_t[j+11]<<8)) | (buffer_t[j+10]&0x00FF);
                                                
                                                ch[6]  = ((buffer_t[j+13]<<8)) | (buffer_t[j+12]&0x00FF);
                                                ch[7]  = ((buffer_t[j+15]<<8)) | (buffer_t[j+14]&0x00FF);
                                                
                                                ch[8]  = ((buffer_t[j+17]<<8)) | (buffer_t[j+16]&0x00FF);
                                                ch[9]  = ((buffer_t[j+19]<<8)) | (buffer_t[j+18]&0x00FF);
                                                
                                                ch[10] = ((buffer_t[j+21]<<8)) | (buffer_t[j+20]&0x00FF);
                                                ch[11] = ((buffer_t[j+23]<<8)) | (buffer_t[j+22]&0x00FF);
                                                
                                                ch[12] = ((buffer_t[j+25]<<8)) | (buffer_t[j+24]&0x00FF);
                                                ch[13] = ((buffer_t[j+27]<<8)) | (buffer_t[j+26]&0x00FF);
                                                
                                                ch[14] = ((buffer_t[j+29]<<8)) | (buffer_t[j+28]&0x00FF);
                                                ch[15] = ((buffer_t[j+31]<<8)) | (buffer_t[j+30]&0x00FF);
//                                                
//                                                ch[16] = ((buffer_t[j+33]<<8)) | (buffer_t[j+32]&0x00FF);
                                                //ch[17] = ((buffer_t[j+35]<<8)) | (buffer_t[j+34]&0x00FF);
                                                
                                                //ch[18] = ((buffer_t[j+37]<<8)) | (buffer_t[j+36]&0x00FF);
                                                //ch[19] = ((buffer_t[j+39]<<8)) | (buffer_t[j+38]&0x00FF);
                                                
                                                //ch[20] = ((buffer_t[j+41]<<8)) | (buffer_t[j+40]&0x00FF);
                                                //ch[21] = ((buffer_t[j+43]<<8)) | (buffer_t[j+42]&0x00FF);
                                                
                                                //ch[22] = ((buffer_t[j+45]<<8)) | (buffer_t[j+44]&0x00FF);
                                                //ch[23] = ((buffer_t[j+47]<<8)) | (buffer_t[j+46]&0x00FF);
              

                                                scope1_I.add(k, ch[0]*0.000152);//I
                                                //scope1_Q.add(k, ch[1]*0.000152);//Q
                                                
                                                scope2_I.add(k, ch[1]*0.000152);
                                                //scope2_Q.add(k, ch[3]*0.000152);
                                                
                                                scope3_I.add(k, ch[2]*0.000152);
                                                //scope3_Q.add(k, ch[5]*0.000152);
                                                
                                                scope4_I.add(k, ch[3]*0.000152);
                                                //scope4_Q.add(k, ch[7]*0.000152);
                                                
                                                scope5_I.add(k, ch[4]*0.000152);
                                                //scope5_Q.add(k, ch[9]*0.000152);
                                                
                                                scope6_I.add(k, ch[5]*0.000152);
                                                //scope6_Q.add(k, ch[11]*0.000152);
                                                
                                                scope7_I.add(k, ch[6]*0.000152);
                                                //scope7_Q.add(k, ch[13]*0.000152);
                                                
                                                scope8_I.add(k, ch[7]*0.000152);
                                                //scope8_Q.add(k, ch[15]*0.000152);
                                                
                                                scope9_I.add(k, ch[8]*0.000152);
                                                //scope9_Q.add(k, ch[17]*0.000152);
                                                
                                                scope10_I.add(k, ch[9]*0.000152);
                                                //scope10_Q.add(k, ch[19]*0.000152);
                                                
                                                scope11_I.add(k, ch[10]*0.000152);
                                                //scope11_Q.add(k, ch[21]*0.000152);
                                                
                                                scope12_I.add(k, ch[11]*0.000152);
                                                //scope12_Q.add(k, ch[23]*0.000152);
                                                
                                                scope13_I.add(k, ch[12]*0.000152);
                                                //scope9_Q.add(k, ch[17]*0.000152);
                                                
                                                scope14_I.add(k, ch[13]*0.000152);
                                                //scope10_Q.add(k, ch[19]*0.000152);
                                                
                                                scope15_I.add(k, ch[14]*0.000152);
                                                //scope11_Q.add(k, ch[21]*0.000152);
                                                
                                                scope16_I.add(k, ch[15]*0.000152);
                                                //scope12_Q.add(k, ch[23]*0.000152);
                                                
                                                
                                                //***********************************************************************************//
                                                double multiplier = 0.5 * (1.0 - Math.cos(2.0 * Math.PI * k / (2048 - 1)));
                                                
                                                re1[k]=(double)ch[0];
                                                re1[k] *= multiplier * 0.000152;
                                                im1[k]=0 ;

                                                re2[k]=(double)ch[1];
                                                re2[k] *= multiplier * 0.000152;
                                                im2[k]=0;
                                                
                                                re3[k]=(double)ch[2];
                                                re3[k] *= multiplier * 0.000152;
                                                im3[k]=0;
                                                
                                                re4[k]=(double)ch[3];
                                                re4[k] *= multiplier * 0.000152;
                                                im4[k]=0;
                                                
                                                re5[k]=(double)ch[4];
                                                re5[k] *= multiplier * 0.000152;
                                                im5[k]=0;
                                                
                                                re6[k]=(double)ch[5];
                                                re6[k] *= multiplier * 0.000152;
                                                im6[k]=0;
                                                //im6[k] *= multiplier * 0.000152;
                                                
                                                re7[k]=(double)ch[6];
                                                re7[k] *= multiplier * 0.000152;
                                                im7[k]=0;
                                                //im7[k] *= multiplier * 0.000152;
                                                
                                                re8[k]=(double)ch[7];
                                                re8[k] *= multiplier * 0.000152;
                                                im8[k]=0;
                                                //im8[k] *= multiplier * 0.000152;
                                                
                                                re9[k]=(double)ch[8];
                                                re9[k] *= multiplier * 0.000152;
                                                im9[k]=0;
                                                //im9[k] *= multiplier * 0.000152;
                                                
                                                re10[k]=(double)ch[9];
                                                re10[k] *= multiplier * 0.000152;
                                                im10[k]=0;
                                                //im10[k] *= multiplier * 0.000152;
                                                
                                                re11[k]=(double)ch[10];
                                                re11[k] *= multiplier * 0.000152;
                                                im11[k]=0;
                                                //im11[k] *= multiplier * 0.000152;
                                                
                                                re12[k]=(double)ch[11];
                                                re12[k] *= multiplier * 0.000152;
                                                im12[k]=0;
                                                //im12[k] *= multiplier * 0.000152;
                                                
                                                
                                                re13[k]=(double)ch[12];
                                                re13[k] *= multiplier * 0.000152;
                                                im13[k]=0;
                                                
                                                re14[k]=(double)ch[13];
                                                re14[k] *= multiplier * 0.000152;
                                                im14[k]=0;
                                                
                                                re15[k]=(double)ch[14];
                                                re15[k] *= multiplier * 0.000152;
                                                im15[k]=0;
                                                
                                                re16[k]=(double)ch[15];
                                                re16[k] *= multiplier * 0.000152;
                                                im16[k]=0;
                                            }
          
                                            scope1_ds.addSeries(scope1_I);
                                            //scope1_ds.addSeries(scope1_Q);
                
                                            scope2_ds.addSeries(scope2_I);
                                            //scope2_ds.addSeries(scope2_Q);
                                            
                                            scope3_ds.addSeries(scope3_I);
                                            //scope3_ds.addSeries(scope3_Q);
                                            
                                            scope4_ds.addSeries(scope4_I);
                                            //scope4_ds.addSeries(scope4_Q);
                                            
                                            scope5_ds.addSeries(scope5_I);
                                            //scope5_ds.addSeries(scope5_Q);
                                            
                                            scope6_ds.addSeries(scope6_I);
                                            //scope6_ds.addSeries(scope6_Q);
                                            
                                            scope7_ds.addSeries(scope7_I);
                                            //scope7_ds.addSeries(scope7_Q);
                                            
                                            scope8_ds.addSeries(scope8_I);
                                            //scope8_ds.addSeries(scope8_Q);
                                            
                                            scope9_ds.addSeries(scope9_I);
                                            //scope9_ds.addSeries(scope9_Q);
                                            
                                            scope10_ds.addSeries(scope10_I);
                                            //scope10_ds.addSeries(scope10_Q);
                                            
                                            scope11_ds.addSeries(scope11_I);
                                            //scope11_ds.addSeries(scope11_Q);
                                            
                                            scope12_ds.addSeries(scope12_I);
                                            //scope12_ds.addSeries(scope12_Q);
                      
                                            
                                            scope13_ds.addSeries(scope13_I);
                                            scope14_ds.addSeries(scope14_I);
                                            scope15_ds.addSeries(scope15_I);
                                            scope16_ds.addSeries(scope16_I);

                                            boolean direct=true;
                                            
                                            //long startTime = System.currentTimeMillis();
                                            out1 = fft(re1, im1, direct);
                                            out2 = fft(re2, im2, direct);
                                            out3 = fft(re3, im3, direct);
                                            out4 = fft(re4, im4, direct);
                                            out5 = fft(re5, im5, direct);
                                            out6 = fft(re6, im6, direct);
                                            out7 = fft(re7, im7, direct);
                                            out8 = fft(re8, im8, direct);
                                            out9 = fft(re9, im9, direct);
                                            out10 = fft(re10, im10, direct);
                                            out11 = fft(re11, im11, direct);
                                            out12 = fft(re12, im12, direct);
                                            
                                            out13 = fft(re13, im13, direct);
                                            out14 = fft(re14, im14, direct);
                                            out15 = fft(re15, im15, direct);
                                            out16 = fft(re16, im16, direct);
                                            
                                            //long endTime = System.currentTimeMillis();
                                            //System.out.println("That took " + (endTime - startTime) + " milliseconds");
                                            
                                            
                                            
                                            
//                                            //DC Removal
//                                            double mean_l=0;
//                                            double mean_r=0;
//                                            
//                                            for(int i=0, k=0; i<1024; i++){ 
//                                                mean_l+= out4[2048+k];
//                                                mean_r+= out4[k];
//                                                k+=2;
//                                            }
//                                            
//                                            mean_l /= 1024;
//                                            mean_r /= 1024;
//                                            
//                                            
//                                            for(int i=0, k=0; i<1024; i++){ 
//                                                out4[2048+k]-=mean_l;
//                                                out4[k]-=mean_r;
//                                                k+=2;
//                                            }
                                            
                                            
                                            

                                            double It, Qt, var1,var2,var3,var4,var5,var6,var7,var8,var9,var10,var11,var12,var13,var14,var15,var16;
                                            //inc=-5000.0;
                                            
                                            //inc=-20000.0;
                                            inc=-5000.0;
                                            for(int i=0, k=0, m=0; i<2048; i++){ 
                                              if(i<1024){
                                                  
                                                  
//                                                    if(i==1023){
//                                                        Qt = Math.sqrt( Math.pow(0, 2) + Math.pow(0, 2));
//                                                        var1  = 20 * Math.log10(Math.abs(Qt/1024));
//                                                    }
//                                                    else{
                                                        Qt = Math.sqrt( Math.pow(out1[2048+k], 2) + Math.pow(out1[2048+k+1], 2));
                                                        var1  = 20 * Math.log10(Math.abs(Qt/32));
//                                                    }
                   
                                                    
                                                    Qt = Math.sqrt( Math.pow(out2[2048+k], 2) + Math.pow(out2[2048+k+1], 2));
                                                    var2  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out3[2048+k], 2) + Math.pow(out3[2048+k+1], 2));
                                                    var3  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out4[2048+k], 2) + Math.pow(out4[2048+k+1], 2));
                                                    var4  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out5[2048+k], 2) + Math.pow(out5[2048+k+1], 2));
                                                    var5  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out6[2048+k], 2) + Math.pow(out6[2048+k+1], 2));
                                                    var6  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out7[2048+k], 2) + Math.pow(out7[2048+k+1], 2));
                                                    var7  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out8[2048+k], 2) + Math.pow(out8[2048+k+1], 2));
                                                    var8  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out9[2048+k], 2) + Math.pow(out9[2048+k+1], 2));
                                                    var9  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out10[2048+k], 2) + Math.pow(out10[2048+k+1], 2));
                                                    var10  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out11[2048+k], 2) + Math.pow(out11[2048+k+1], 2));
                                                    var11  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out12[2048+k], 2) + Math.pow(out12[2048+k+1], 2));
                                                    var12  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out13[2048+k], 2) + Math.pow(out13[2048+k+1], 2));
                                                    var13  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out14[2048+k], 2) + Math.pow(out14[2048+k+1], 2));
                                                    var14  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out15[2048+k], 2) + Math.pow(out15[2048+k+1], 2));
                                                    var15  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    Qt = Math.sqrt( Math.pow(out16[2048+k], 2) + Math.pow(out16[2048+k+1], 2));
                                                    var16  = 20 * Math.log10(Math.abs(Qt/32));
                                                    
                                                    k+=2;
                                              }
                                              else{
                                                    
//                                                    if(i==1024){
//                                                        It = 0;
//                                                        var1  = 20 * Math.log10(Math.abs(It/1024));
//                                                    }
//                                                    else{
                                                  
                                                        It = Math.sqrt( Math.pow(out1[m], 2) + Math.pow(out1[m+1], 2));
                                                        var1  = 20 * Math.log10(Math.abs(It/32));
//                                                    }
                                                    
                                                    It = Math.sqrt( Math.pow(out2[m], 2) + Math.pow(out2[m+1], 2));
                                                    var2  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out3[m], 2) + Math.pow(out3[m+1], 2));
                                                    var3  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out4[m], 2) + Math.pow(out4[m+1], 2));
                                                    var4  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out5[m], 2) + Math.pow(out5[m+1], 2));
                                                    var5  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out6[m], 2) + Math.pow(out6[m+1], 2));
                                                    var6  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out7[m], 2) + Math.pow(out7[m+1], 2));
                                                    var7  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out8[m], 2) + Math.pow(out8[m+1], 2));
                                                    var8  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out9[m], 2) + Math.pow(out9[m+1], 2));
                                                    var9  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out10[m], 2) + Math.pow(out10[m+1], 2));
                                                    var10  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out11[m], 2) + Math.pow(out11[m+1], 2));
                                                    var11  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out12[m], 2) + Math.pow(out12[m+1], 2));
                                                    var12  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out13[m], 2) + Math.pow(out13[m+1], 2));
                                                    var13  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out14[m], 2) + Math.pow(out14[m+1], 2));
                                                    var14  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out15[m], 2) + Math.pow(out15[m+1], 2));
                                                    var15  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    It = Math.sqrt( Math.pow(out16[m], 2) + Math.pow(out16[m+1], 2));
                                                    var16  = 20 * Math.log10(Math.abs(It/32));
                                                    
                                                    m+=2;
                                              }
                                              //series_fft.updateByIndex(i, var);
                                              fft1_s.add(inc, var1);
                                              fft2_s.add(inc, var2);
                                              fft3_s.add(inc, var3);
                                              fft4_s.add(inc, var4);
                                              fft5_s.add(inc, var5);
                                              fft6_s.add(inc, var6);
                                              fft7_s.add(inc, var7);
                                              fft8_s.add(inc, var8);
                                              fft9_s.add(inc, var9);
                                              fft10_s.add(inc, var10);
                                              fft11_s.add(inc, var11);
                                              fft12_s.add(inc, var12);
                                              
                                              fft13_s.add(inc, var13);
                                              fft14_s.add(inc, var14);
                                              fft15_s.add(inc, var15);
                                              fft16_s.add(inc, var16);
                                              
                                              
                                              //inc+=9.765625;//4.8828125;//2.44140625;//9.765625;
                                              
                                              inc+=4.8828125;
                                              //inc+=19.53125;
                                              //inc+=97.65625;
                                            }
                                            fft1_ds.addSeries(fft1_s);
                                            fft2_ds.addSeries(fft2_s);
                                            fft3_ds.addSeries(fft3_s);
                                            fft4_ds.addSeries(fft4_s);
                                            fft5_ds.addSeries(fft5_s);
                                            fft6_ds.addSeries(fft6_s);
                                            fft7_ds.addSeries(fft7_s);
                                            fft8_ds.addSeries(fft8_s);
                                            fft9_ds.addSeries(fft9_s);
                                            fft10_ds.addSeries(fft10_s);
                                            fft11_ds.addSeries(fft11_s);
                                            fft12_ds.addSeries(fft12_s);
                                            
                                            fft13_ds.addSeries(fft13_s);
                                            fft14_ds.addSeries(fft14_s);
                                            fft15_ds.addSeries(fft15_s);
                                            fft16_ds.addSeries(fft16_s);
                              
                                            //**********************************************************************//
                                            final XYPlot scope_sub1 = (XYPlot)plot2.getSubplots().get(0);
                                            scope_sub1.setDataset(scope1_ds);
                                            
                                            final XYPlot scope_sub2 = (XYPlot)plot2.getSubplots().get(1);
                                            scope_sub2.setDataset(scope2_ds);
                                            
                                            final XYPlot scope_sub3 = (XYPlot)plot2.getSubplots().get(2);
                                            scope_sub3.setDataset(scope3_ds);
                                            
                                            final XYPlot scope_sub4 = (XYPlot)plot2.getSubplots().get(3);
                                            scope_sub4.setDataset(scope4_ds);
                                            
                                            final XYPlot scope_sub5 = (XYPlot)plot2.getSubplots().get(4);
                                            scope_sub5.setDataset(scope5_ds);
                                            
                                            final XYPlot scope_sub6 = (XYPlot)plot2.getSubplots().get(5);
                                            scope_sub6.setDataset(scope6_ds);
                                            
                                            final XYPlot scope_sub7 = (XYPlot)plot2.getSubplots().get(6);
                                            scope_sub7.setDataset(scope7_ds);
                                            
                                            final XYPlot scope_sub8 = (XYPlot)plot2.getSubplots().get(7);
                                            scope_sub8.setDataset(scope8_ds);
                                            
                                            final XYPlot scope_sub9 = (XYPlot)plot2.getSubplots().get(8);
                                            scope_sub9.setDataset(scope9_ds);
                                            
                                            final XYPlot scope_sub10 = (XYPlot)plot2.getSubplots().get(9);
                                            scope_sub10.setDataset(scope10_ds);
                                            
                                            final XYPlot scope_sub11 = (XYPlot)plot2.getSubplots().get(10);
                                            scope_sub11.setDataset(scope11_ds);
                                            
                                            final XYPlot scope_sub12 = (XYPlot)plot2.getSubplots().get(11);
                                            scope_sub12.setDataset(scope12_ds);
                                            
                                            final XYPlot scope_sub13 = (XYPlot)plot2.getSubplots().get(12);
                                            scope_sub13.setDataset(scope13_ds);
                                            
                                            final XYPlot scope_sub14 = (XYPlot)plot2.getSubplots().get(13);
                                            scope_sub14.setDataset(scope14_ds);
                                            
                                            final XYPlot scope_sub15 = (XYPlot)plot2.getSubplots().get(14);
                                            scope_sub15.setDataset(scope15_ds);
                                            
                                            final XYPlot scope_sub16 = (XYPlot)plot2.getSubplots().get(15);
                                            scope_sub16.setDataset(scope16_ds);
                                            
                                            
                                            
                                            //**********************************************************************//
                                            final XYPlot fft_sub1 = (XYPlot)plot.getSubplots().get(0);
                                            fft_sub1.setDataset(fft1_ds);
                                            
                                            final XYPlot fft_sub2 = (XYPlot)plot.getSubplots().get(1);
                                            fft_sub2.setDataset(fft2_ds);
                                            
                                            final XYPlot fft_sub3 = (XYPlot)plot.getSubplots().get(2);
                                            fft_sub3.setDataset(fft3_ds);
                                            
                                            final XYPlot fft_sub4 = (XYPlot)plot.getSubplots().get(3);
                                            fft_sub4.setDataset(fft4_ds);
                                            
                                            final XYPlot fft_sub5 = (XYPlot)plot.getSubplots().get(4);
                                            fft_sub5.setDataset(fft5_ds);
                                            
                                            final XYPlot fft_sub6 = (XYPlot)plot.getSubplots().get(5);
                                            fft_sub6.setDataset(fft6_ds);
                                            
                                            final XYPlot fft_sub7 = (XYPlot)plot.getSubplots().get(6);
                                            fft_sub7.setDataset(fft7_ds);
                                            
                                            final XYPlot fft_sub8 = (XYPlot)plot.getSubplots().get(7);
                                            fft_sub8.setDataset(fft8_ds);
                                            
                                            final XYPlot fft_sub9 = (XYPlot)plot.getSubplots().get(8);
                                            fft_sub9.setDataset(fft9_ds);
                                            
                                            final XYPlot fft_sub10 = (XYPlot)plot.getSubplots().get(9);
                                            fft_sub10.setDataset(fft10_ds);
                                            
                                            final XYPlot fft_sub11 = (XYPlot)plot.getSubplots().get(10);
                                            fft_sub11.setDataset(fft11_ds);
                                            
                                            final XYPlot fft_sub12 = (XYPlot)plot.getSubplots().get(11);
                                            fft_sub12.setDataset(fft12_ds);
                                            
                                            final XYPlot fft_sub13 = (XYPlot)plot.getSubplots().get(12);
                                            fft_sub13.setDataset(fft13_ds);
                                            
                                            final XYPlot fft_sub14 = (XYPlot)plot.getSubplots().get(13);
                                            fft_sub14.setDataset(fft14_ds);
                                            
                                            final XYPlot fft_sub15 = (XYPlot)plot.getSubplots().get(14);
                                            fft_sub15.setDataset(fft15_ds);
                                            
                                            final XYPlot fft_sub16 = (XYPlot)plot.getSubplots().get(15);
                                            fft_sub16.setDataset(fft16_ds);
                                            
                                            //long endTime = System.currentTimeMillis();
                                            //System.out.println("That took " + (endTime - startTime) + " milliseconds");
                          
                                        }

                                    } catch(Exception e) {listen = false; System.out.println("listen = false" + e);}
                                }socket.close();
                            }
                    };
                    thread.start();
                }
                else{
                    
                    tf1.setEnabled(false);
                    tf2.setEnabled(false);
                    tf3.setEnabled(false);
                    tf4.setEnabled(false);
                    tf5.setEnabled(false);
                    tf6.setEnabled(false);
                    tf7.setEnabled(false);
        
                    socket.close();
                    listen = false;
                    connectButton.setIcon(start_ico);
                    connectButton.setToolTipText("Пуск");
                    x = 0;
                    //xyPlot_scope.setDataset(null);
                    //xyPlot_fft.setDataset(null);  
                }
            }
        });
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    
    public static class APOListener implements DocumentListener {
        public void insertUpdate(DocumentEvent e) {

            //long v1,v2,v3,v4,v5,v6,v7;
            String s1,s2,s3,s4,s5,s6;
            
            try{
                s1 = tf1.getText();
                v1 = Long.valueOf(s1,16).longValue();  
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v1 = -1;
            }
            
            try{
                s2 = tf2.getText();
                v2 = Long.valueOf(s2,16).longValue();  
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v2 = -1;
            }
            
            try{
                s3 = tf3.getText();
                v3 = Long.valueOf(s3.replace("-",""),16).longValue();  
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v3 = -1;
            }
            
            try{
                s4 = tf4.getText();
                v4 = Long.valueOf(s4.replace("-",""),16).longValue();  
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v4 = -1;
            }
            
            try{
                s5 = tf5.getText();
                v5 = Long.valueOf(s5.replace("-",""),16).longValue();  
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v5 = -1;
            }
            
            try{
                s6 = tf6.getText();
                v6 = Long.valueOf(s6.replace("-",""),16).longValue();  
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v6 = -1;
            }
            
            if( (v1!=-1) && (v2!=-1) && (v3!=-1) && (v4!=-1) && (v5!=-1) && (v6!=-1) && play_stop){
                send_apo.setEnabled(true);
            }else{
                send_apo.setEnabled(false);
            }

//          System.out.println("val: " + value);
//          System.out.println("valHex: " + Long.toHexString(value));         
//          long value = Long.parseLong("4294967295")            
//          v1 = Long.valueOf(str.replace("-",""),16).longValue();            
//          send_apo.setEnabled(true);
//          send_apo.setEnabled(false);
        }
        public void removeUpdate(DocumentEvent e) {
        }
        public void changedUpdate(DocumentEvent e) {
        }
    }
    
    public static class DDSListener implements DocumentListener {
        //long v7;
        String s7;
        public void insertUpdate(DocumentEvent e) {
            try{
                s7 = tf7.getText();
                v7 = Long.valueOf(s7,10).longValue();
 
                //double dds_word = (v7/200000.0) * 16777216.0;
                double dds_word = (v7/125000000.0) * 4294967296.0;
                long rw = Math.round(dds_word);

                MaskFormatter mask = null;
                try {
                    mask = new MaskFormatter("HH-HH-HH-HH");
                    mask.setValueContainsLiteralCharacters(false);
                    mask.setPlaceholderCharacter('_');
                } catch (ParseException er) {
                    er.printStackTrace();
                }
                
                
                String str;
                try {
                    //str = mask.valueToString("1000");
                    str = mask.valueToString( getHexValString((int)rw,4) );//Integer.toHexString(1000)
                    tf5.setText(str);
                } catch (ParseException er) {
                    er.printStackTrace();
                    str = "";
                }
                 System.out.println("str: " + str);
                 //System.out.println("hex val of 260 in 4 bytes = " + getHexValString(1000,4));
                 
                
                System.out.println("ok: " + v7);
                System.out.println("dds_word: " + dds_word);
                System.out.println("rw: " + rw);
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v7 = -1;
            }
        }
        public void removeUpdate(DocumentEvent e) {
            try{
                s7 = tf7.getText();
                v7 = Long.valueOf(s7,10).longValue();
 
                double dds_word = (v7/200000.0) * 16777216.0;
                long rw = Math.round(dds_word);
                tf5.setText(Integer.toHexString((int)rw));
                
                System.out.println("ok: " + v7);
                System.out.println("dds_word: " + rw);   
            }catch (NumberFormatException err) {
                System.out.println("err: " + err);
                v7 = -1;
            }
        }
        public void changedUpdate(DocumentEvent e) {
        }
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                 + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    
    public static String getHexValString(Integer val, int bytePercision){
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(val));

        while(sb.length() < bytePercision*2){
            sb.insert(0,'0');// pad with leading zero
        }

        int l = sb.length(); // total string length before spaces
        int r = l/2; //num of rquired iterations

//        for (int i=1; i < r;  i++){
//            int x = l-(2*i); //space postion
//            sb.insert(x, '');
//        }
        return sb.toString().toUpperCase();         
    }
    
    public static String byteToHexString(byte bytes[]) {
        StringBuffer retString = new StringBuffer();
        for (int i = 0; i < bytes.length; ++i) {
          retString.append(Integer.toHexString(0x0100 + (bytes[i] & 0x00FF))
                           .substring(1));
        }
        return retString.toString();
    }
    
    /**
    * The Fast Fourier Transform (generic version, with NO optimizations).
    *
    * @param inputReal
    *            an array of length n, the real part
    * @param inputImag
    *            an array of length n, the imaginary part
    * @param DIRECT
    *            TRUE = direct transform, FALSE = inverse transform
    * @return a new array of length 2n
    */
    public static double[] fft(final double[] inputReal, double[] inputImag, boolean DIRECT) {
        // - n is the dimension of the problem
        // - nu is its logarithm in base e
        int n = inputReal.length;

        // If n is a power of 2, then ld is an integer (_without_ decimals)
        double ld = Math.log(n) / Math.log(2.0);

        // Here I check if n is a power of 2. If exist decimals in ld, I quit
        // from the function returning null.
        if (((int) ld) - ld != 0) {
            System.out.println("The number of elements is not a power of 2.");
            return null;
        }

        // Declaration and initialization of the variables
        // ld should be an integer, actually, so I don't lose any information in
        // the cast
        int nu = (int) ld;
        int n2 = n / 2;
        int nu1 = nu - 1;
        double[] xReal = new double[n];
        double[] xImag = new double[n];
        double tReal, tImag, p, arg, c, s;

        // Here I check if I'm going to do the direct transform or the inverse
        // transform.
        double constant;
        if (DIRECT)
            constant = -2 * Math.PI;
        else
            constant = 2 * Math.PI;

        // I don't want to overwrite the input arrays, so here I copy them. This
        // choice adds \Theta(2n) to the complexity.
        for (int i = 0; i < n; i++) {
            xReal[i] = inputReal[i];
            xImag[i] = inputImag[i];
        }

        // First phase - calculation
        int k = 0;
        for (int l = 1; l <= nu; l++) {
            while (k < n) {
                for (int i = 1; i <= n2; i++) {
                    p = bitreverseReference(k >> nu1, nu);
                    // direct FFT or inverse FFT
                    arg = constant * p / n;
                    c = Math.cos(arg);
                    s = Math.sin(arg);
                    tReal = xReal[k + n2] * c + xImag[k + n2] * s;
                    tImag = xImag[k + n2] * c - xReal[k + n2] * s;
                    xReal[k + n2] = xReal[k] - tReal;
                    xImag[k + n2] = xImag[k] - tImag;
                    xReal[k] += tReal;
                    xImag[k] += tImag;
                    k++;
                }
                k += n2;
            }
            k = 0;
            nu1--;
            n2 /= 2;
        }

        // Second phase - recombination
        k = 0;
        int r;
        while (k < n) {
            r = bitreverseReference(k, nu);
            if (r > k) {
                tReal = xReal[k];
                tImag = xImag[k];
                xReal[k] = xReal[r];
                xImag[k] = xImag[r];
                xReal[r] = tReal;
                xImag[r] = tImag;
            }
            k++;
        }

        // Here I have to mix xReal and xImag to have an array (yes, it should
        // be possible to do this stuff in the earlier parts of the code, but
        // it here to readibility).
        double[] newArray = new double[xReal.length * 2];
        double radice = 1 / Math.sqrt(n);
        for (int i = 0; i < newArray.length; i += 2) {
            int i2 = i / 2;
            // I used Stephen Wolfram Mathematica as a reference so I'm going
            // to normalize the output while I'm copying the elements.
            newArray[i] = xReal[i2] * radice;
            newArray[i + 1] = xImag[i2] * radice;
        }
        return newArray;
    }

    /**
     * The reference bitreverse function.
     */
    private static int bitreverseReference(int j, int nu) {
        int j2;
        int j1 = j;
        int k = 0;
        for (int i = 1; i <= nu; i++) {
            j2 = j1 / 2;
            k = 2 * k + j1 - 2 * j2;
            j1 = j2;
        }
        return k;
      }
    
}







        //content.add(cp1);
        

        
        
        //JCheckBox chbox1 = new JCheckBox("ch1");
        //content.add(chbox1);
        
        
        
//        final CombinedDomainXYPlot plot = new CombinedDomainXYPlot();
//        //this.datasets = new TimeSeriesCollection[SUBPLOT_COUNT];
//        
//        for (int i = 0; i < 3; i++) {
//            //final TimeSeries series = new TimeSeries("Random " + i, Millisecond.class);
//            //this.datasets[i] = new TimeSeriesCollection(series);
//            
//            final NumberAxis rangeAxis = new NumberAxis("Y" + i);
//            rangeAxis.setAutoRangeIncludesZero(false);
//            final XYPlot subplot = new XYPlot(
//                    //this.datasets[i], null, rangeAxis, new StandardXYItemRenderer()
//            );
//            subplot.setBackgroundPaint(Color.lightGray);
//            subplot.setDomainGridlinePaint(Color.white);
//            subplot.setRangeGridlinePaint(Color.white);
//            plot.add(subplot);
//        }

        //final JFreeChart chart_fft = new JFreeChart("Dynamic Data Demo 3", plot);
//        chart.getLegend().setAnchor(Legend.EAST);
//        chart.setBorderPaint(Color.black);
//        chart.setBorderVisible(true);
//        chart.setBackgroundPaint(Color.white);
//        
//        plot.setBackgroundPaint(Color.lightGray);
//        plot.setDomainGridlinePaint(Color.white);
//        plot.setRangeGridlinePaint(Color.white);

            
            
            
            
            //tf1.setPreferredSize(new Dimension(100, 100));
            //tf1.setBounds(50,100, 200,30);  
            
//            c2.gridx = 0;
//            c2.gridwidth = 1;
//            c2.gridy = 0;

//        c.gridx = 0;
//        c.gridwidth = 10;
//        c.gridy = 0;


        /*comm.add(p4);
        comm.add(p4);
        comm.add(p4);
        comm.add(p4);*/
        
        
        
//        JLabel headerLabel = new JLabel("My Amazing Swing Application");
//        c.gridx = 0;
//        c.gridwidth = 3;
//        c.gridy = 0;
//        comm.add(headerLabel, c);

//        JButton buttonA = new JButton("Button A");
//        c.gridx = 0;
//        c.gridwidth = 1;
//        c.gridy = 1;
//        comm.add(buttonA, c);
//
//        JButton buttonB = new JButton("Button B");
//        c.gridx = 1;
//        c.gridwidth = 1;
//        c.gridy = 1;
//        comm.add(buttonB, c);
//
//        JButton buttonC = new JButton("Button C");
//        c.gridx = 2;
//        c.gridwidth = 1;
//        c.gridy = 1;
//        comm.add(buttonC, c);
//
//        JSlider slider = new JSlider(0, 100);
//        c.gridx = 0;
//        c.gridwidth = 3;
//        c.gridy = 2;
//        comm.add(slider, c);
//
//        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 20, 20, 0, 100);
//        c.gridx = 0;
//        c.gridwidth = 3;
//        c.gridy = 3;
//        comm.add(scrollBar, c);

        
        //mainPanel.setLayout(new FlowLayout());
        //mainPanel.setLayout(layout0);




        
        //JCheckBox chbox1 = new JCheckBox("ch1");
        //content.add(chbox1);
        
        
//        GridLayout layout3  = new GridLayout(1, 0, 10, 10);
//        final JPanel content2 = new JPanel();
//        content2.setLayout(layout3);
//        content2.setLayout(new FlowLayout());
//        JCheckBox chbox1 = new JCheckBox("ch1");
//        content2.add(chbox1);
//        mainPanel.add(content2, BorderLayout.EAST);

//                    for(int i=0;i<2048;i++){
//                        scope_IQ1s.add(i, 0);
//                        scope_IQ2s.add(i, 0);
//                        //series_fft.add(i, 0);
//                    }

//                            inc=-10000;
//                            for(int i=0;i<2048;i++){
//                                //series_scope.add(i, 0);
//                                series_fft.add(inc, 0);
//                                inc+=9.765625;
//                            }



//        XYPlot xyPlot_scope = chart_scope.getXYPlot();
//        NumberAxis domain_scope = (NumberAxis) xyPlot_scope.getDomainAxis();
//        domain_scope.setRange(0, 2048);
//        
//        NumberAxis range_scope = (NumberAxis) xyPlot_scope.getRangeAxis();
//        range_scope.setRange(-5, 5);
        
        //xyPlot_scope.getRendererForDataset(xyPlot_scope.getDataset(0)).setSeriesPaint(0, Color.black); 
        
        
//        XYPlot xyPlot_fft = chart_fft.getXYPlot();
//        NumberAxis domain_fft = (NumberAxis) xyPlot_fft.getDomainAxis();
//        domain_fft.setRange(-10500, 10500);
//        //domain_fft.setAutoRange(false);
//        
//        NumberAxis range_fft = (NumberAxis) xyPlot_fft.getRangeAxis();
//        range_fft.setRange(-200, 50);

        




       //content.setPreferredSize(new Dimension(800, 200));
        

        
        //xyPlot_scope.setDataset(scope_IQ_ds);
        

        
            
//        for(int i=0;i<85;i++){
//            
//            final XYSeries scope_Is = new XYSeries("Канал-I"+Integer.toString(i+1));
//            series_I.add(scope_Is);
//            
//            
//            System.out.println(scope_Is.getKey());
//            
//            final XYSeries scope_Qs = new XYSeries("Канал-Q"+Integer.toString(i+1));
//            series_Q.add(scope_Qs);
//            
//            final XYSeriesCollection scope_IQ_ds = new XYSeriesCollection();
//            scope_IQ_ds.addSeries(scope_Is);
//            scope_IQ_ds.addSeries(scope_Qs);
//            dataset_IQ.add(scope_IQ_ds);
//            
//            final JFreeChart chart_scope = ChartFactory.createXYLineChart("", "","", scope_IQ_ds);
//            /*for(int j=0;j<2048;j++){
//                scope_Is.add(j, 0);
//                scope_Qs.add(j, 0);
//            }*/
//            
//            
//            
//
//            
//            theme.apply( chart_scope );
//            chart_scope.setTextAntiAlias( true );
//            chart_scope.setAntiAlias( true );
//            
//            final XYPlot xyPlot_scope = chart_scope.getXYPlot();
//            NumberAxis domain_scope = (NumberAxis) xyPlot_scope.getDomainAxis();
//            domain_scope.setRange(0, 2048);
//        
//            NumberAxis range_scope = (NumberAxis) xyPlot_scope.getRangeAxis();
//            range_scope.setRange(-5, 5);
//            
//            
//
//            final ChartPanel cp1 = new ChartPanel(chart_scope) {
//                @Override public void restoreAutoRangeBounds() {
//                // Empty body: do not reset X zoom
//                }
//            };
//            cp1.setPreferredSize(new Dimension(600, 200));
//            cp1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//            cp1.setRangeZoomable(false);//f
//            cp1.setMouseWheelEnabled(true);
//            content.add(cp1);
//            
//            //content.add(new JButton("OK"));
//            //content.add(new JButton("OK"));
//        }       
        
        
        

        
//        //***************************************************************************************************************//
//        // create the line graph
//        XYSeries series_scope1 = new XYSeries("I");
//        XYSeries series_scope2 = new XYSeries("Q");
//        XYSeriesCollection dataset_scope = new XYSeriesCollection();
//
//        dataset_scope.addSeries(series_scope1);
//        dataset_scope.addSeries(series_scope2);
//       
//        
//        JFreeChart chart_scope = ChartFactory.createXYLineChart("", "","", dataset_scope);
//        ChartPanel chartPanel = new ChartPanel(chart_scope) {
//            @Override public void restoreAutoRangeBounds() {
//                // Empty body: do not reset X zoom
//            }
//        };
//        chartPanel.setPreferredSize(new Dimension(400, 300));
//        chartPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//        chartPanel.setRangeZoomable(false);//f
//        chartPanel.setMouseWheelEnabled(true);
//        
//        
//        String fontName = "Lucida Sans";
//        StandardChartTheme theme = (StandardChartTheme)org.jfree.chart.StandardChartTheme.createJFreeTheme();
//
//        theme.setTitlePaint( Color.decode( "#4572a7" ) );
//        theme.setExtraLargeFont( new Font(fontName,Font.PLAIN, 16) ); //title
//        theme.setLargeFont( new Font(fontName,Font.BOLD, 15)); //axis-title
//        theme.setRegularFont( new Font(fontName,Font.PLAIN, 11));
//        //theme.setRangeGridlinePaint( Color.decode("#C0C0C0"));
//        //theme.setPlotBackgroundPaint( Color.gray );
//        //theme.setChartBackgroundPaint( Color.gray);
//        
//        //theme.setPlotBackgroundPaint( window.getBackground() );
//        theme.setChartBackgroundPaint( window.getBackground());
//        
//        theme.setLegendBackgroundPaint(window.getBackground());
//        theme.setGridBandPaint( Color.red );
//        theme.setAxisLabelPaint( Color.decode("#666666")  );
//        theme.apply( chart_scope );
//        //chart_scope.getCategoryPlot().setOutlineVisible( false );
//        //chart_scope.getCategoryPlot().getRangeAxis().setAxisLineVisible( false );
//        //chart_scope.getCategoryPlot().getRangeAxis().setTickMarksVisible( false );
//        //chart_scope.getCategoryPlot().setRangeGridlineStroke( new BasicStroke() );
//        //chart_scope.getCategoryPlot().getRangeAxis().setTickLabelPaint( Color.decode("#666666") );
//        //chart_scope.getCategoryPlot().getDomainAxis().setTickLabelPaint( Color.decode("#666666") );
//        chart_scope.setTextAntiAlias( true );
//        chart_scope.setAntiAlias( true );
//        
//        
//        
//        
//        
//        // create fft graph
//        XYSeries series_fft = new XYSeries("IQ");
//        XYSeriesCollection dataset_fft = new XYSeriesCollection(series_fft);
//        JFreeChart chart_fft = ChartFactory.createXYLineChart("", "","", dataset_fft);
//        
//        
//
//        ChartPanel chartPanel2 = new ChartPanel(chart_fft) {
//            @Override public void restoreAutoRangeBounds() {
//                // Empty body: do not reset X zoom
//            }
//        };
//        chartPanel2.setPreferredSize(new Dimension(600, 300));
//        chartPanel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//        chartPanel2.setRangeZoomable(false);//f
//        chartPanel2.setMouseWheelEnabled(true);
//        theme.apply( chart_fft );
        
        

/*
    series_I
    series_Q
    series_fft
    dataset_IQ
    dataset_FFT
*/
