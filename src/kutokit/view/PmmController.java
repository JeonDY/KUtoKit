package kutokit.view;

import kutokit.MainApp;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class PmmController {

	private MainApp mainApp;
	private File selectedFile;
	@FXML private Label filename;
	@FXML private Pane AddFile;
	
	//constructor
	public PmmController() {
		
	}

	//set MainApp
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	@FXML
	public void AddFile() {
        FileChooser fc = new FileChooser();
        fc.setTitle("Add File");
        fc.setInitialDirectory(new File("C:/")); // default ���丮 ����
        
        // Ȯ���� ����
        ExtensionFilter txtType = new ExtensionFilter("text file", "*.txt", "*.doc");
        fc.getExtensionFilters().addAll(txtType);
         
	    selectedFile =  fc.showOpenDialog(null);
        if(selectedFile != null) {
	        //System.out.println(selectedFile);  // ������ ��� ���
	        //System.out.println(selectedFile.getName());
	        filename.setText(selectedFile.getName());
	         
	        // ������ InputStream���� �о��
	        try {
	            // ���� �о����
	            FileInputStream fis = new FileInputStream(selectedFile);
	            BufferedInputStream bis = new BufferedInputStream(fis);
	            //System.out.println(bis);  // ������ ���� ���
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
        }
    }
	
	@FXML
	public void ApplyFile() {
		if(selectedFile != null) {
			AddFile.getChildren().clear();
            
            /*
             * �Ľ� �ڵ� �߰�
             * 
             */
            
		}
	}
	
}
