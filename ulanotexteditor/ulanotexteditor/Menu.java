



import java.awt.BorderLayout;
import java.awt.Color;
import java.io.*;
import java.io.File;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.DefaultEditorKit;

public class Menu extends JFrame implements ActionListener{
		private JMenuBar bdm;
		private JMenu options, edit, help;
		private JMenuItem neww,newFile, open,saveAs, print, exit, use, about ;
		private JTextArea campoTexto1;
		private JFileChooser chooser, chooser2;
                private JButton new1, newFil, open1, saveas, printer, out;


             public Menu(){
		super("Ulano TextEditor");
		this.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
                this.setSize (1025,600);

                //creacion de botones para el Toolbar
                 new1 = new JButton(new ImageIcon("new32.png"));
                 newFil = new JButton(new ImageIcon("newfile.png"));
                 open1 = new JButton(new ImageIcon("open32.png"));
                 saveas = new JButton(new ImageIcon("saveas32.png"));
                 printer = new JButton(new ImageIcon("printer32.png"));
                 out = new JButton(new ImageIcon("cls2.png"));

                JToolBar tools = new JToolBar("Tools", JToolBar.VERTICAL);
                new1.addActionListener(this);
                newFil.addActionListener(this);
                open1.addActionListener(this);
                saveas.addActionListener(this);
                printer.addActionListener(this);
                out.addActionListener(this);
                tools.add(new1);
                tools.add(newFil);
                tools.add(open1);
                tools.add(saveas);
                tools.add(printer);
                tools.add(out);

		bdm = new JMenuBar(); //creamos un objeto de JMenuBar
		setJMenuBar(bdm);//a este metodo le pasamos como parametro el objeto bdm, para que sea asociado con el JFrame

                
               
                //agregamos un area de texto
		campoTexto1 = new JTextArea(8,40);
		campoTexto1.setLineWrap(true);
		campoTexto1.setWrapStyleWord(true);
                campoTexto1.setBackground(Color.white);
		JScrollPane desplazar = new JScrollPane(); //agregamos una barra de desplazamiento
		desplazar.setViewportView(campoTexto1); //agregamos el textarea  al Scrollbar
                JPanel pane = new JPanel();
                BorderLayout bord = new BorderLayout();
                pane.setLayout(bord);
                pane.add("East", tools);
                pane.add("Center", desplazar);
                //setContentPane(pane);

		//creamos un nuevo file chooser
		chooser = new JFileChooser();
                chooser2 = new JFileChooser();
                chooser.setDialogTitle("Open File");
                chooser2.setDialogTitle("Save File As - Specify the file format");
                chooser.addChoosableFileFilter(new ImageFilter());
                

		options = new JMenu("File"); //creamos un objeto JMenu
		options.setMnemonic(KeyEvent.VK_F);
		bdm.add(options);//se agrega el objeto JMenu   A JMenubar
		edit = new JMenu("Edit");
		edit.setMnemonic(KeyEvent.VK_E);
		bdm.add(edit);
		help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		bdm.add(help);


		//Creamos los objetos de JMenuItem y los agregamos a  los objetos del tipo JMenu
		//Estos son para el menu Options
		neww = new JMenuItem("New");
		neww.setMnemonic(KeyEvent.VK_N);
		neww.setIcon(new ImageIcon(Menu.class.getResource("new.png")));
		neww.addActionListener(this);
		options.add(neww);

		newFile = new JMenuItem("NewFile");
		newFile.setIcon(new ImageIcon(Menu.class.getResource("new.png")));
		newFile.addActionListener(this);
		options.add(newFile);

		open = new JMenuItem("Open");
		open.setIcon(new ImageIcon(Menu.class.getResource("open.png")));
		open.addActionListener(this);
		options.add(open);
		
		saveAs = new JMenuItem("Save As");
		saveAs.setIcon(new ImageIcon(Menu.class.getResource("VistaFolder.png")));
		saveAs.addActionListener(this);
		options.add(saveAs);

		print = new JMenuItem("Print");
		print.setIcon(new ImageIcon(Menu.class.getResource("printer1.png")));
                print.addActionListener(this);
		options.add(print);

		exit = new JMenuItem("Exit");
		exit.setIcon(new ImageIcon(Menu.class.getResource("cls2.png")));
		exit.addActionListener(this);
		options.add(exit);

                
                //Estos son para el menu Edit
		 Action cut = campoTexto1.getActionMap().get(DefaultEditorKit.cutAction);
                 cut.putValue(Action.NAME, "Cut");
                 cut.putValue(Action.SMALL_ICON, new ImageIcon("cut.png"));
                 edit.add(cut);

                Action copy = campoTexto1.getActionMap().get(DefaultEditorKit.copyAction);
		copy.putValue(Action.NAME, "Copy");
                copy.putValue(Action.SMALL_ICON, new ImageIcon("copy.png"));
                edit.add(copy);
                  
                Action paste = campoTexto1.getActionMap().get(DefaultEditorKit.pasteAction);
                paste.putValue(Action.NAME, "Paste");
                paste.putValue(Action.SMALL_ICON, new ImageIcon("paste.png"));
                edit.add(paste);

                //Itemes para Help
                use =new JMenuItem ("Use");
                use.setIcon(new ImageIcon(Menu.class.getResource("")));
                use.addActionListener(this);
                help.add(use);

                about = new JMenuItem("About Ulano");
                about.setIcon(new ImageIcon(Menu.class.getResource("")));
                about.addActionListener(this);
                help.add(about);


                setContentPane(pane);
                add(desplazar);
                this.setVisible(true);
		
            }



        @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==neww ){


			borradoNuevo();
			}

                   if(e.getSource()==new1){
                        borradoNuevo();

                      }

                                if(e.getSource() == open){

				      openFile();
                                 }


                                if(e.getSource()== open1 ){
                                        openFile();
                                }



                                                 if(e.getSource () == exit){

                                                                closeFile();


                                                    }


                                                    if(e.getSource()== out){
                                                        closeFile();

                                                    }



                                                                    if(e.getSource() == saveAs ){
                                                                          saveFile();
                                                                    }

                                                                    if(e.getSource()== saveas){
                                                                              saveFile();

                                                                     }






                                                                 if(e.getSource() == newFile){

                                                                            Menu editor = new Menu();

                                                                        }



                                                                    if (e.getSource()== newFil){
                                                                        
                                                                            Menu editor = new Menu();
                                                                    
                                                                      }




                                                                                 if(e.getSource()== print){
                                                                    
                                                                                        printFile();
                                                                                 }



                                                                                 if(e.getSource()==printer){
                                                                                            printFile();

                                                                                 }

                                                                                 if(e.getSource()== about){
                                                                                 
                                                                                    About.Panel();
                                                                                 }


                                                                                 if(e.getSource()==use){
                                                                                 JOptionPane.showMessageDialog(null, "This is a simple text editor, you only need to specify the file extension when you're saving a file","How to use it", JOptionPane.INFORMATION_MESSAGE);
                                                                                 }


	}



		void borradoNuevo(){
		int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to start a new white sheet?");

                if(opt == JOptionPane.YES_OPTION){
                    campoTexto1.setText("");
                 }
                }

			void openFile(){
				int returnVal = chooser.showOpenDialog(Menu.this);

						try{
						
                                                    if(returnVal == JFileChooser.APPROVE_OPTION){
							File open=chooser.getSelectedFile();
                                                        FileReader fr = new FileReader (open);
							BufferedReader reader = new BufferedReader(fr);
							
                                                        String text ="";
								while ((text=reader.readLine())!=null){
								 campoTexto1.append(text+ "\n");
									
								}
                                                                    reader.close();
							}
						} catch(Exception ex){}

			}



					void closeFile(){
						int imput = JOptionPane.showConfirmDialog(null, "Are you sure that you want to close  Ulano TextEditor?" );

							if(imput == JOptionPane.YES_OPTION){
								System.exit(0);

							}

					}

							void saveFile(){
								
								int returnVal = chooser2.showSaveDialog(Menu.this);

									try{
										if(returnVal == JFileChooser.APPROVE_OPTION){
										File file = chooser2.getSelectedFile();
										PrintWriter writer = new PrintWriter(file);
										writer.print(campoTexto1.getText());
										writer.close();
										}
									}catch(Exception exep){}
							}





                                                                                    void printFile(){
                                                                                    try{
                                                                                         campoTexto1.print();
                                                                                     }catch(Exception y){}

                                                                                    }


                 



}


class ImageFilter extends FileFilter{

        final static String txt = "txt";
        final static String java = "java";
    public boolean accept(File f){

        try{
       if(f.isDirectory()){
        return true;
        }

       
         String s = f.getName();
         int i = s.lastIndexOf(".");
       if(i > 0 && i<s.length()-1 ){

           String extension = s.substring(i+1).toLowerCase();
            if(txt.equals(extension)){
            return true;
            
           }else if(java.equals(extension)){
            return true;
        }else{
        return false;
        }

        }
    }catch(Exception exp){}
        

    return false;



 }

        public String getDescription(){
        return "Formatos .txt/.java";
        }

}



     














