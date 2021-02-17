package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

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

    @FXML
    private Button btnMultiplication;

    @FXML
    private Button btnDivision;


    double PremNombre;
	double DeuxiemeNombre;
	double Somme;
	double Soustraire;
	double Multiplication;
	double Division;
	DecimalFormat nformat = new DecimalFormat("#0.00");

    @FXML
    void Addition()
    {
    		try
    			{
    		PremNombre = Double.parseDouble(txtPremiere.getText());
    		DeuxiemeNombre = Double.parseDouble(txtDeuxieme.getText());
    			} catch (NumberFormatException e)
    			{
    				Alert alert=new Alert(AlertType.ERROR);
    				alert.setHeaderText("Attention - Erreur");
    				alert.setTitle("Erreur");
    				alert.setContentText("Tu dois ecrire un nombre");
    				alert.show();
    			}
			Somme = PremNombre + DeuxiemeNombre;
			lblResultat.setText(String.format("%.2f",Somme));
    }

    @FXML
    void Soustraction()
    {
    		try
    			{
    			PremNombre = Double.parseDouble(txtPremiere.getText());
        		DeuxiemeNombre = Double.parseDouble(txtDeuxieme.getText());
    			} catch (NumberFormatException e)
    			{
    				Alert alert=new Alert(AlertType.ERROR);
    				alert.setHeaderText("Attention - Erreur");
    				alert.setTitle("Erreur");
    				alert.setContentText("Tu dois ecrire un nombre");
    				alert.show();
    			}
    		Soustraire = PremNombre - DeuxiemeNombre;
    		lblResultat.setText(String.format("%.2f",Soustraire));

    }

    @FXML
    void Multiplication()
    {
    		try
    			{
    			PremNombre = Double.parseDouble(txtPremiere.getText());
        		DeuxiemeNombre = Double.parseDouble(txtDeuxieme.getText());
    			} catch (NumberFormatException e)
    			{
    				Alert alert=new Alert(AlertType.ERROR);
    				alert.setHeaderText("Attention - Erreur");
    				alert.setTitle("Erreur");
    				alert.setContentText("Tu dois ecrire un nombre");
    				alert.show();
    			}
    		Multiplication = PremNombre*DeuxiemeNombre;
    		lblResultat.setText(String.format("%.2f",Multiplication));

    }

    @FXML
    void Division()
    {
    		try
    			{
    			PremNombre = Double.parseDouble(txtPremiere.getText());
        		DeuxiemeNombre = Double.parseDouble(txtDeuxieme.getText());
    			} catch (NumberFormatException e)
    			{
    				Alert alert=new Alert(AlertType.ERROR);
    				alert.setHeaderText("Attention - Erreur");
    				alert.setTitle("Erreur");
    				alert.setContentText("Tu dois ecrire un nombre");
    				alert.show();
    			}
    		Division = PremNombre/DeuxiemeNombre;
    		lblResultat.setText(String.format("%.2f",Division));

    }




}
