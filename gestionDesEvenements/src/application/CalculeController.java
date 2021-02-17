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
	String temphold;
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
			temphold = Double.toString(Somme);
			lblResultat.setText(String.format("%.2f",temphold));
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
    		temphold = Double.toString(Soustraire);
    		lblResultat.setText(String.format("%.2f",temphold));

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
    		temphold = Double.toString(Multiplication);
    		lblResultat.setText(String.format("%.2f",temphold));

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
    		temphold = Double.toString(Division);
    		lblResultat.setText(String.format("%.2f",temphold));

    }




}
