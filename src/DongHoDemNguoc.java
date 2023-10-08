import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DongHoDemNguoc extends JFrame {
    int phut;
	int giay;
    Timer time;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Phut;
	private JTextField txt_Giây;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DongHoDemNguoc frame = new DongHoDemNguoc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DongHoDemNguoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_Phut = new JTextField();
		txt_Phut.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txt_Phut.setBounds(50, 63, 86, 34);
		contentPane.add(txt_Phut);
		txt_Phut.setColumns(10);
		
		txt_Giây = new JTextField();
		txt_Giây.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txt_Giây.setColumns(10);
		txt_Giây.setBounds(197, 63, 86, 34);
		contentPane.add(txt_Giây);
		
		JLabel jLabel_Phut = new JLabel("Phút");
		jLabel_Phut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_Phut.setBounds(51, 30, 65, 22);
		contentPane.add(jLabel_Phut);
		
		JLabel jLabel_Giây = new JLabel("Giây");
		jLabel_Giây.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_Giây.setBounds(198, 30, 65, 22);
		contentPane.add(jLabel_Giây);
		
		JButton jButton_Start = new JButton("Start");
		jButton_Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phut = Integer.parseInt(txt_Phut.getText());
				giay = Integer.parseInt(txt_Giây.getText());
		        time = new Timer(1000, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						giay --;
						jLabel_Phut.setText(""+ phut);
						jLabel_Giây.setText(""+ giay);
						
					}
				});
		        if (giay>0) {
					time.start();
				}
			}
		});
		jButton_Start.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jButton_Start.setBounds(342, 63, 89, 34);
		contentPane.add(jButton_Start);
		
		JButton jButton_Stop = new JButton("Stop");
		jButton_Stop.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jButton_Stop.setBounds(472, 63, 89, 34);
		contentPane.add(jButton_Stop);
		
		JLabel jLabel_phut1 = new JLabel("00");
		jLabel_phut1.setFont(new Font("Segoe UI", Font.BOLD, 36));
		jLabel_phut1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_phut1.setBounds(158, 214, 86, 48);
		contentPane.add(jLabel_phut1);
		
		JLabel jLabel_giay1 = new JLabel("00");
		jLabel_giay1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_giay1.setFont(new Font("Segoe UI", Font.BOLD, 36));
		jLabel_giay1.setBounds(267, 214, 80, 48);
		contentPane.add(jLabel_giay1);
		
		JLabel jLabal_haicham = new JLabel(":");
		jLabal_haicham.setFont(new Font("Segoe UI", Font.BOLD, 36));
		jLabal_haicham.setBounds(247, 221, 46, 34);
		contentPane.add(jLabal_haicham);
	}
}
