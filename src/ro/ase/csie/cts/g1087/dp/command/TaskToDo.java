package ro.ase.csie.cts.g1087.dp.command;

public class TaskToDo extends TaskAsincron { //Clasa CommandConcret

	InterfataModulJoc modulJoc = null; //are referinta catre obiectul care vrem sa execute functia (prin abstractizare) => modulAutoSave/ModulUpdateClient
	String info;
	int prioritate;

	public TaskToDo(InterfataModulJoc modulJoc, String info, int prioritate) {
		super();
		this.modulJoc = modulJoc; //setam modulul prin constructor !
		this.info = info;
		this.prioritate = prioritate;
	}

	@Override
	public void executaTask() {
		if (this.modulJoc != null) //daca avem o referinta catre un modul
			this.modulJoc.executaActiune(info); //apeleaza functia din modul (din clasa executanta)
		else
			throw new UnsupportedOperationException();

	}

}
