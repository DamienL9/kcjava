package kcjava;

import controller.*;
import model.*;
import view.*;

public class MainClient {

	public static void main(String[] args) {
		View view = new View("Time Clock - Client");
		Model model = new Model();
		Controller controller = new Controller(model,view);
		controller.initController();
	}

}
