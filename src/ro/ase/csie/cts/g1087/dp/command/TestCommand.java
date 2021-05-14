package ro.ase.csie.cts.g1087.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		TaskAsincron autoSave = new TaskToDo(new ModulAutoSave(), "Autosave", 5); //setam si modulul de executat
		TaskAsincron autoUpdate = new TaskToDo(new ModulUpdateClient(), "Update v2", 20); //setam modulul de executat
		
		//executie task-uri asincrone
		autoSave.executaTask();
		autoUpdate.executaTask();

	}

}
