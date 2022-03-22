package com.assignment;

public class ComboCreationLogic extends BasicCombo {

    @Override
    public Combo createCombo(String comboType) {
        if (comboType == "office") {
            return new OfficeCombo();
        } else if (comboType == "casual") {
            return new CasualCombo();
        } else if (comboType == "officeCasual") {
            return new CasualOfficeCombo();
        }
        return null;
    }
}
