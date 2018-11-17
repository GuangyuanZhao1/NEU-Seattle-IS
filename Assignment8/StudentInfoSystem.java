import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentInfoSystem extends JFrame{
	
	private JFrame frame = new JFrame();
	private JTextField idTextField, nameTextField, genderTextField;
	private JLabel idLabel, nameLabel, genderLabel;
	private JButton addButton;
	private JTable table;
    private JScrollPane scrollPane;
	private Font font;
	private StudentsTableModel model;
	public StudentInfoSystem() {
		model = new StudentsTableModel();
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}
	
    private void createComponents() {
    	font = new Font("TimesRoman", Font.PLAIN, 36);
    	idTextField = new JTextField(5);
    	idTextField.setText("ID");
    	idTextField.setFont(font);
    	nameTextField = new JTextField(5);
    	nameTextField.setText("NAME");
    	nameTextField.setFont(font);
    	genderTextField = new JTextField(5);
    	genderTextField.setText("GENDER");
    	genderTextField.setFont(font);
    	addButton = new JButton("ADD");
    	idLabel = new JLabel("ID");
    	nameLabel = new JLabel("NAME");
    	genderLabel = new JLabel("GENDER");
		table = new JTable(model);
		scrollPane = new JScrollPane(table);
	}
	
	private void addComponents() {
		Container c = getContentPane();
		JPanel panel = new JPanel();
		panel.add(idLabel);
		panel.add(idTextField);
		panel.add(nameLabel);
		panel.add(nameTextField);
		panel.add(genderLabel);
		panel.add(genderTextField);
		panel.add(addButton);
		
		
		
		c.add(panel);
		c.add(scrollPane);
	}
	
	private void setLayout() {
		
		GridLayout gl = new GridLayout(4, 4);
		Container c = this.getContentPane();
		c.setLayout(gl);
	}
	
	private void addBehaviors() {
        addButton.addActionListener(new AddListener());
    }
	
	private void display() {
		setSize(600, 600);
		setVisible(true);

	}
	
   class AddListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String id = idTextField.getText();
			String name = nameTextField.getText();
			String gender = genderTextField.getText();
			Students students = new Students();
			Student s = new Student(id, name, gender);
			students.addStudent(s);
			model.addStudent(s);
			table.updateUI();
		}
	}
	
	public String getID() {
		return idTextField.getText();
	}
	
	public String getName() {
		return nameTextField.getText();
	}
	
	public String getGender() {
		return genderTextField.getText();
	}
	
	class Students {
        private Collection<Student> students = new ArrayList<Student>();

        public Collection<Student> getStudents() {
            return students;
        }

        public void addStudent(Student s) {
            students.add(s);
        }

        public int getNumberOfStudents() {
            return getStudents().size();
        }
    }
	
	class Student {
		private String id, name, gender;

		public Student(String id, String name, String gender){
			this.id = id;
			this.name = name;
			this.gender = gender;
			
		}
		public void setID(String id) {
			this.id = id;
		}

		public String getID() {
			return id;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public String getGender() {
			return gender;
		}
    }
	
	class StudentsTableModel implements TableModel{
		Students students = new Students();
		public StudentsTableModel(Students students) {
			this.students = students;
		}
		
		public StudentsTableModel() {
		 }
		 
		public void addStudent(Student s) {
		    students.addStudent(s);
		}
		 
		 @Override
		public int getRowCount() {
		    return students.getNumberOfStudents();
	    }

		 @Override
		public int getColumnCount() {
		    return 3;
		}

		 @Override
		public String getColumnName(int columnIndex) {
		  if (columnIndex == 0) {
		     return "ID";
		  }
		  if (columnIndex == 1) {
		     return "Name";
		  }
		  if (columnIndex == 2)
		     return "Gender";
		     return null;
		 }

		 @Override
		 public Class<?> getColumnClass(int columnIndex) {
		    return String.class;
		 }

		 @Override
		 public boolean isCellEditable(int rowIndex, int columnIndex) {
		    return false;
		 }

		 @Override
		 public Object getValueAt(int rowIndex, int columnIndex) {
		     Collection<Student> s = students.getStudents();
		     int row = -1;
		     for (Student student : s) {
		        row++;
		        if (row == rowIndex) {
		        if (columnIndex == 0) {
		           return student.getID() + "";
		        }
		        if (columnIndex == 1) {
		           return student.getName();
		        }
		        if (columnIndex == 2) {
		           return student.getGender();
		        }
		        }
		        }
		        return null;
	  	 }

		 @Override
		 public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		  
		 }

		 @Override
		 public void addTableModelListener(TableModelListener l) {
		  
		 }

		 @Override
		 public void removeTableModelListener(TableModelListener l) {
		  
		 }
		}
	
	
	public static void main(String[] args) {
		StudentInfoSystem sis = new StudentInfoSystem();

	}

}
