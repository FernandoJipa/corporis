package Corporis;

import java.awt.Color;

import javax.swing.UIManager;

import RegrasDeNegocio.FillPainter;
import Telas.TelaAgendarAvaliacao;

public class Corporis {
	
	public static void rum(){
		try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // No Nimbus
        }
        UIManager.getLookAndFeelDefaults().put(
                "ScrollBar:ScrollBarThumb[Enabled].backgroundPainter",
                new FillPainter(new Color(127, 169, 191)));
        UIManager.getLookAndFeelDefaults().put(
                "ScrollBar:ScrollBarThumb[MouseOver].backgroundPainter",
                new FillPainter(new Color(127, 169, 191)));
        UIManager.getLookAndFeelDefaults().put(
                "ScrollBar:ScrollBarTrack[Enabled].backgroundPainter",
                new FillPainter(new Color(190, 212, 223)));

        UIManager.getLookAndFeelDefaults().put(
                "ScrollBar:\"ScrollBar.button\".size", 0);
        UIManager.getLookAndFeelDefaults().put(
                "ScrollBar.decrementButtonGap", 0);
        UIManager.getLookAndFeelDefaults().put(
                "ScrollBar.incrementButtonGap", 0); 

    }
	
	public static void main(String[] args) {
		rum();
		
		TelaAgendarAvaliacao taa = new TelaAgendarAvaliacao();
		taa.setVisible(true);
	}
}
