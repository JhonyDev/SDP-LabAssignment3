package com.assignment;

public class Main {

    public static void main(String[] args) {
        BasicCombo comboPlan = new ComboCreationLogic();
        Combo officeCombo = comboPlan.createCombo("office");
        Combo casualCombo = comboPlan.createCombo("casual");
        Combo officeCasualCombo = comboPlan.createCombo("officeCasual");    }
}
