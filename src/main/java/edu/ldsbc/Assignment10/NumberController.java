package edu.ldsbc.Assignment10;

public class NumberController {

    private NumberHolderModel numberHolderModel;
    private NumberView numberView;

    public NumberController() {
        numberHolderModel = new NumberHolderModel();
        numberView = new NumberView();
    }
    public void pushNumber(int i) {
        numberHolderModel.push(i);
    }

    public int popNumber() {
        return numberHolderModel.pop();
    }

    public void displayQueue() {
        numberView.displayQueue(numberHolderModel.getNumberQueue());
    }

    public void reverseQueue() {
        numberHolderModel.reverseQueue();
    }

    public int[] getQueue() {
        return numberHolderModel.getNumberQueue();
    }
}
