import java.util.ArrayList;

import PeriodicTable.*;
import javax.swing.*;

public class run {
	static ArrayList<Chemical> listOfChemicals = new ArrayList<>();
	public static final String[] elements = { "H", "He", "Li", "Be", "B", "C",
			"N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "Cl", "Ar" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// listOfChemicals.add(Hydrogen);
		init();
		String question = JOptionPane.showInputDialog("Enter chemical name:");
		if (find(question) != -1) {
			JOptionPane.showMessageDialog(null,
					listOfChemicals.get(find(question)).getFullName());
		}
	}

	public static void init() {

		addThisChemicalToList(1, 1, "H", "Hydrogen", 1);
		addThisChemicalToList(2, 1, "He", "Helium", 0);
		addThisChemicalToList(3, 1, "Li", "Lithium", 1);
		addThisChemicalToList(4, 1, "Be", "Beryllium", 2);
		addThisChemicalToList(5, 1, "B", "Boron", 3);
		addThisChemicalToList(6, 1, "C", "Carbon", 4);
		addThisChemicalToList(7, 1, "N", "Nitrogen", -3);
		addThisChemicalToList(8, 1, "O", "Oxygen", -2);
		addThisChemicalToList(9, 1, "F", "Fluorine", -1);
		addThisChemicalToList(10, 1, "Ne", "Neon", 0);
		addThisChemicalToList(11, 1, "Na", "Sodium", 1);
		addThisChemicalToList(12, 1, "Mg", "Magnesium", 2);
		addThisChemicalToList(13, 1, "Al", "Aluminium", 3);
		addThisChemicalToList(14, 1, "Si", "Silicon", 4);
		addThisChemicalToList(15, 1, "P", "Phosphorous", -3);
		addThisChemicalToList(16, 1, "S", "Sulphur", -2);
		addThisChemicalToList(17, 1, "Cl", "Chlorine", -1);
		addThisChemicalToList(18, 1, "Ar", "Argon", 0);
		addThisChemicalToList(19, 1, "K", "Potassium", 1);
		addThisChemicalToList(20, 1, "Ca", "Calcium", 2);
	}

	public static void addThisChemicalToList(int an, int aw, String cn,
			String fn, int pos) {
		Chemical X = new Chemical();
		X.setAll(an, aw, cn, fn, pos);
		listOfChemicals.add(X);
	}

	public static int find(String query) {
		for (int i = 0; i < listOfChemicals.size(); i++) {
			if ((listOfChemicals.get(i).getFullName().contains(query))
					|| listOfChemicals.get(i).getChemicalName().contains(query))
				return i;
		}
		return -1;
	}
}
