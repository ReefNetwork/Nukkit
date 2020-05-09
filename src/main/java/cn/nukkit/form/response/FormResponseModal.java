package cn.nukkit.form.response;

public class FormResponseModal extends FormResponse {

    private final int clickedButtonId;
    private final String clickedButtonText;

    public FormResponseModal(int clickedButtonId, String clickedButtonText) {
        this.clickedButtonId = clickedButtonId;
        this.clickedButtonText = clickedButtonText;
    }

    private boolean getButtonBool() { return clickedButtonId == 0; }

    public int getClickedButtonId() {
        return clickedButtonId;
    }

    public String getClickedButtonText() {
        return clickedButtonText;
    }

}
