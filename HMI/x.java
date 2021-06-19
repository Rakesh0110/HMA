import java.awt.*; 
import javax.swing.*;    
public class x{    
    JFrame f;    
    x(){   

    f=new JFrame(); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    f.setTitle("Drone Interception and Jammer Application"); 

    String data[][]={};    
    String column[]={"BITE","Config","System Admin","Bands"};        
    JTable jt=new JTable(data,column);  
    jt.setBounds(0,0,2,0);          
    JScrollPane sp=new JScrollPane(jt);
    
    String[][] dat = {
        { "R31V-00386", "2455.0", "25.0" ,"2019-05"},
        { "R31V-00383", "86.13125", "37.5" ,"2019-05"},
        { "R31V-00384", "89.2875", "275.0" ,"2019-05"},
        { "R31V-00385", "86.5625", "50.0" ,"2019-05"},
        { "R31V-00380", "89.2875", "275.0" ,"2019-05"},
        { "R31V-00381", "86.5625", "50.0" ,"2019-05"},
        { "R31V-00382", "86.13125", "37.5" ,"2019-05"},
        { "R31V-00379", "2454.9875", "25.0" ,"2019-05"},
        { "R31V-00378", "86.13125", "37.5" ,"2019-05"},
        { "R31V-00370", "66.574998", "1003.125" ,"2019-03"}
    };

    String[] columnNames = { "Emission ID", "Freq/Fmin[MHz]", "BW[KHz]/Fmax...","FTN"};
    JTable j = new JTable(dat, columnNames);
    j.setBounds(0, 40, 200, 300);
	JScrollPane s = new JScrollPane(j);
    
    f.setLayout(new FlowLayout(FlowLayout.LEFT)); 
    
    f.add(sp);
    f.add(s);     
     
    f.setSize(500,700);    
    //f.setVisible(true);
    String da[][]={};    
    String col[]={"Postion","Scan","TTL", " "};        
    JTable t=new JTable(da,col);  
    t.setBounds(0,30,2,3);          
    JScrollPane spd=new JScrollPane(t);
    f.add(spd);

    JPanel panel1 = new JPanel();
    JButton CDM = new JButton("CDM");
        
    String C[]={"1","2","3","4","5"};        
    JComboBox cdm =new JComboBox(C);    
    cdm.setBounds(100,100,50,50);

    JButton CONNECT = new JButton("CONNECT");
        
    panel1.add(CDM);
    panel1.add(cdm);
    panel1.add(CONNECT);

    f.getContentPane().add(BorderLayout.NORTH,panel1);

        //Creating the panel at bottom and adding components
    JPanel panel2 = new JPanel(); // the panel is not visible in output

    JTextArea AZIMUT = new JTextArea("AZIMUTH");
    AZIMUT.setLineWrap(true);

    JTextArea myText = new JTextArea("          ");
    myText.setLineWrap(true);

    JTextArea deg = new JTextArea("deg");
    deg.setLineWrap(true);

    JTextArea myText1= new JTextArea("          ");
    myText.setLineWrap(true);

    JTextArea ELEVATIO= new JTextArea("ELEVATION");
    myText.setLineWrap(true);

    JTextArea deg1 = new JTextArea("deg1");
    deg1.setLineWrap(true);
        
    panel2.add(AZIMUT);
    panel2.add(myText);
    panel2.add(deg);
    panel2.add(myText1);
    panel2.add(ELEVATIO); 
    panel2.add(deg1);      
        //Adding Components to the frame.
    f.getContentPane().add(panel2);


    JPanel panel3 = new JPanel(); 
    JTextArea sd= new JTextArea("SPEED");
    myText.setLineWrap(true);

    String speed[]={"1000","2000","3000","4000","5000"};        
    JComboBox v=new JComboBox(speed);    
    v.setBounds(100,100,50,50);

    panel3.add(sd);
    panel3.add(v);

        //Adding Components to the frame.
    f.getContentPane().add(BorderLayout.SOUTH, panel3);
    f.setLayout(new FlowLayout(FlowLayout.LEFT)); 

    JPanel pa = new JPanel();
    JRadioButton r1=new JRadioButton("Position Mode");
    r1.setBounds(75,50,100,30); 
    pa.add(r1);
    f.getContentPane().add(BorderLayout.NORTH,pa);

        //Creating the panel at bottom and adding components
    JPanel panel = new JPanel(); 

    JCheckBox AZIMUTH = new JCheckBox("AZIMUTH");  
    AZIMUTH.setBounds(100,100, 50,50);  

    String A[]={"  ","1 ","2 ","3 ","4 "};        
    JComboBox cb=new JComboBox(A);    
    cb.setBounds(100,100,50,50);

    JCheckBox ELEVATION = new JCheckBox("ELEVATION");  
    ELEVATION.setBounds(100,100, 50,50);
        
    String E[]={"  ","1 ","2 ","3 ","4 "};        
    JComboBox c=new JComboBox(E);    
    c.setBounds(100,100,50,50);

    panel.add(AZIMUTH);
    panel.add(cb);
    panel.add(ELEVATION);
    panel.add(c);

        //Adding Components to the frame.
    f.getContentPane().add(panel);


    JPanel p = new JPanel(); // the panel is not visible in output

    JButton set = new JButton("SET");
    JButton stop = new JButton("STOP");
    JButton Jamming = new JButton("Jamming");

    p.add(set);
    p.add(stop);
    p.add(Jamming);

    //Adding Components to the frame.
    f.getContentPane().add(BorderLayout.SOUTH, p);
    f.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        
    f.setVisible(true);

    }  
 
	// Driver method
	public static void main(String[] args)
	{
		new x();
	}
}
//vs
