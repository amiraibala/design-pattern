package tp2;
public static  void main(String[] args) {
	Robot r1 = new Robot("Robot");
	Robot r2 = new Robot("");
	Robot r3 = new Robot("");
	r2.setBehaviour(new DefensiveBehaviour());
	r3.setBehaviour(new NormalBehaviour());
	r1.performeMoveCommand();
	//affiche: Big Robot shows an agressive Behaviour: if find another robot attack it
	r2.performeMoveCommand();
	//affiche: Moon Robot shows a defensive Behaviour: if find another robot run from it
	r3.performeMoveCommand();
	//affiche: Go Robot shows a normal Behaviour: if find another robot ignore it}
}
}