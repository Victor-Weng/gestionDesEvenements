package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculeController {

    @FXML
    private TextField txtDeuxieme;

    @FXML
    private Button btnAddition;

    @FXML
    private Button btnSoustraction;

    @FXML
    private TextField txtPremiere;

    @FXML
    private Label lblResultat;

    int PremNombre;
	int DeuxiemeNombre;
	int Somme;
	int Soustraire;

    @FXML
    void Addition()
    {
    		try
    			{
    		PremNombre = Integer.parseInt(txtPremiere.getText());
    		DeuxiemeNombre = Integer.parseInt(txtDeuxieme.getText());
    			} catch (NumberFormatException e)
    			{
    				Alert alert=new Alert(AlertType.ERROR);
    				alert.setHeaderText("Attention - Erreur");
    				alert.setTitle("Erreur");
    				alert.setContentText("Tu dois ecrire un nombre");
    				alert.show();
    			}
			Somme = PremNombre + DeuxiemeNombre;
			lblResultat.setText(Integer.toString(Somme));
    }

    @FXML
    void Soustraction()
    {
    		try
    			{
    		PremNombre = Integer.parseInt(txtPremiere.getText());
    		DeuxiemeNombre = Integer.parseInt(txtDeuxieme.getText());
    			} catch (NumberFormatException e)
    			{
    				Alert alert=new Alert(AlertType.ERROR);
    				alert.setHeaderText("Attention - Erreur");
    				alert.setTitle("Erreur");
    				alert.setContentText("Tu dois ecrire un nombre");
    				alert.show();
    			}
    		Soustraire = PremNombre - DeuxiemeNombre;
    		lblResultat.setText(Integer.toString(Soustraire));

    }




}
