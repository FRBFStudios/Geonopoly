package com.geoproject.gui;

import javax.swing.*;




import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel
        JLabel label = new JLabel("Hello, World!");
        frame.add(label);

        // JButton
        JButton button = new JButton("Click Me");
        frame.add(button);

        // JTextField
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // JTextArea
        JTextArea textArea = new JTextArea(5, 20);
        frame.add(new JScrollPane(textArea));

        // JComboBox
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        frame.add(comboBox);

        // JTable
        String[] columnNames = {"Column 1", "Column 2"};
        Object[][] data = {
            {"Data 1", "Data 2"},
            {"Data 3", "Data 4"}
        };
        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Check me");
        frame.add(checkBox);

        // JRadioButton
        JCheckBox radioButton1 = new JCheckBox("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);

        // JSlider
        JSlider slider = new JSlider(0, 100, 50);
        frame.add(slider);

        // JProgressBar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        frame.add(progressBar);

        // JMenuBar, JMenu, JMenuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JLabel("Content of Tab 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content of Tab 2"));
        frame.add(tabbedPane);

        frame.setVisible(true);
    }
}